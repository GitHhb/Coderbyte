//public class OCA_Constructor {
//}
class Vortex {
    private Vortex() { System.out.println("New Vortex Object created");}
    public void Vortex() { System.out.println("Vortex method called");}
    Vortex (int x) { System.out.println("Vortex method called with parameter" + x);}
    public static void main(String[] x) {
        Vortex y = new Vortex();
        Vortex yx = new Vortex();
        yx.Vortex();
        Vortex yxz = new Vortex(1);
        y.Vortex();
    }
}
