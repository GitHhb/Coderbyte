/**
 * Created by L on 12/28/2015.
 */
abstract public class Dog {
    String oogkleur = "rood";
    void blaffen(){
        System.out.println("woef");
    }
    public static void main(String[] args){
        Dog Fikkie = new KleineDog();
        Dog Karel = new KleineKeffer();
        Fikkie.blaffen();
        Karel.blaffen();
        System.out.println(Fikkie.oogkleur);
        System.out.println(Karel.oogkleur);
        First first = new Second();
        Second second = new Second();
        first.showMe();
        second.showMe();

    }
}

class KleineDog extends Dog{
    String oogkleur = "paars";
    void blaffen(){
        System.out.println("Kef");
    }

}
class KleineKeffer extends Dog{
    String oogkleur = "blauw";
    void blaffen(){
        System.out.println("Miauw");
    }
}

interface Snuffelen {
    int neus = 3;
    static void ruiken(){System.out.println("hoi");};
}
interface GoedSnuffelen extends Snuffelen{

}
class Snuffelaar implements GoedSnuffelen{
   public void ruiken(){
       Snuffelaar go = new Snuffelaar();
       System.out.println(go.neus);
   };
}

class First {
    static void showMe(){System.out.println("In First");}
}
class Second extends First{
    static void showMe(){System.out.println("In Second");}
}