// Zeeslag van Felix
import java.util.*;

public class Spel{
    Veld zeeVeld = new Veld();
    Scanner scan = new Scanner(System.in);

    public static void main(String[] args){
        Spel zeeSlag = new Spel();
        zeeSlag.spelen();
    }
    void spelen(){
        System.out.println("De oorlog is begonnen!");
        while(zeeVeld.speelBoolean){
            String schotCoordinaat = scan.nextLine();
            if(valideerSchot(schotCoordinaat)){
                System.out.println(zeeVeld.schiet(schotCoordinaat));
            }
        }
        System.out.println("Bedankt voor het spelen");
    }
    boolean valideerSchot(String coords){
        if(coords.length()!= 2){
            System.out.println("Geen goede invoer. Voer een nummer A B C D of E in en 1 cijfer. Niet meer");
            return false;
        }else if(zeeVeld.geschotenSchoten.contains(coords)){
            System.out.println("Dit schot is al geweest");
            return false;
        }else{
            char x = coords.toLowerCase().charAt(1);
            char y = coords.toLowerCase().charAt(0);
            if((x=='0'||x=='1'||x=='2'||x=='3'||x=='4'||x=='5'||x=='6'||x=='7'||x=='8'||x=='9')&&(y=='a'||y=='b'||y=='c'||y=='d'||y=='e')){
                return true;
            }else{
                System.out.println("Geen goede invoer. ABCDE en 0123456789");
                return false;
            }
        }
    }
}
class Veld{
    Boot b1 = new Boot(3);
    Boot b2 = new Boot(3);
    Boot b3 = new Boot(2);
    Boot b4 = new Boot(4);

    boolean speelBoolean = true;

    Boot[] boten;
    ArrayList<String> geschotenSchoten = new ArrayList<String>();

    Veld(){
        b1.laadBoot("A3","A4","A5");
        b2.laadBoot("C2","C3","C4");
        b3.laadBoot("E3","E4");
        b4.laadBoot("A8","B8","C8","D8");
        boten = new Boot[]{b1, b2, b3, b4};
    }
    String schiet(String punt){
        String returnString = "";
        geschotenSchoten.add(punt);
        BOTENLOOP: for(Boot b : boten){
            for(int q = 0; q < b.lengte; q++){
                if(b.posities[q].equals(punt.toUpperCase())){
                    System.out.print("RAAK ");
                    returnString = "";
                    b.posities[q]= "BLOWN";
                    checkBootGezonken(b);
                    break BOTENLOOP;
                }else{
                    returnString = "MIS";
                }
            }
        }
        return returnString;
    }
    boolean checkBootGezonken(Boot boot){
        for(int j = 0; j < boot.posities.length ; j++){
            if(boot.posities[j] != "BLOWN"){
                return false;
            }
        }
        boot.status = "GEZONKEN";
        System.out.println("Schip Gezonken. ");
        checkAlleBotenGezonken();
        return true;
    }
    void checkAlleBotenGezonken(){
        for(Boot boot : boten){
            if(boot.status == "ALIVE"){
                System.out.print("Er zijn nog schepen over.");
                return;
            }
        }
        System.out.println("De oorlog is afgelopen na "+ geschotenSchoten.size() +" schoten");
        speelBoolean = false;
    }
//	int[][] veld = new int [][] {
//		{ 0, 0, 1, 1, 1, 0, 0, 1, 0, 0 },
//		{ 0, 0, 0, 0, 0, 0, 0, 1, 0, 0 },
//		{ 0, 1, 1, 1, 0, 0, 0, 1, 0, 0 },
//		{ 0, 0, 0, 0, 0, 0, 0, 1, 0, 0 },
//		{ 0, 0, 1, 1, 0, 0, 0, 0, 0, 0 },
//	};
}
class Boot{
    int lengte;
    String[] posities;
    String status = "ALIVE";

    Boot(int bootLengte){
        lengte = bootLengte;
        posities = new String[bootLengte];
    }
    void laadBoot(String... coordinaten){
        for(int x=0 ; x < coordinaten.length ; x++){
            posities[x]=coordinaten[x];
        }
    }
}