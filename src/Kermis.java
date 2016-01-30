import java.util.Scanner;

public class Kermis {
    public static void main(String[] args){
        Attractie attr[] = new Attractie[] {
                //new Attractie("null", 0.00),       // dummy entry as 0 is not counted
                new Attractie("Botsauto", 2.50),      // 1
                new Attractie("Spin", 2.25),          // 2
                new Attractie("Spiegelpaleis", 2.75), // 3
                new Attractie("Spookhuis", 3.20),     // 4
                new Attractie("Hawaii", 2.90),        // 5
                new Attractie("Ladderklimmen", 5.00)};// 6
        Scanner input = new Scanner(System.in);
        String choice;
        System.out.println("Enter attraction number: ");
        while (true){
            switch (choice = input.nextLine()){
                case "0": break;
                case "o":
                    Attractie.showOmzetTot();
                    // toon omzet per attractie
                    for (Attractie a: attr) {
                        a.showOmzet();
                    }
                    break;
                case "k": Attractie.showTicketsTot();
                    // toon kaartjes per attractie
                    for (Attractie a: attr) {
                        a.showTickets();
                    }
                    break;
                default:
                    attr[Integer.parseInt(choice)-1].myName();
                    attr[Integer.parseInt(choice)-1].sellTicket(1);
            }
        }


    }
}

class Attractie {
 // Init - constructor
    Attractie(String s, double cost) {name = s; this.cost = cost;}
 // static vars
    static double omzetTot = 0; // Totaal omzet alle attracties
    static int ticketsTot = 0;  // Totaal # tickets verkocht alle attracties
 // instance vars
    String name = "undefined";  // naam van attractie
    double cost = 0;            // prijs van attractie
    double omzet = 0;              // omzet van attractie
    int tickets = 0;            // # tickets verkocht van attractie
 // instance methods
    void myName (){System.out.println("Attraction: " + name);}
    void sellTicket (int nrTickets){
        tickets += nrTickets; // update tickets of this instance
        ticketsTot += nrTickets; // update tickets Total sold
        omzet += cost * nrTickets; // update omzet
        omzetTot += cost * nrTickets; // update omzet Total
    }
    void showOmzet() {
        System.out.printf("omzet: %4.2f voor %s%n", omzet, name);
    }
    void showTickets(){
        System.out.printf("kaartjes: %2d voor %s%n", tickets, name);
    }
 // static methods
    static void showOmzetTot(){
        System.out.printf("Totaal omzet: %4.2f%n", omzetTot);
    }
    static void showTicketsTot(){
        System.out.printf("Totaal tickets: %d%n", ticketsTot);
    }

}

