class Main1 {
    public static void main(String[] gras){
        Class1 a = new Class1();
        Class2 b = new Class2();
        Class1 c = new Class2();
        //1 Class2 d = new Class1();
        //2a System.out.println(c.i1);
        //2b System.out.println(((Class2)c).i1);
        //2c System.out.println(((Class2)c).i2);
        //2d System.out.println(c.i1);
        //2e System.out.println(((Class2)c).i0);
        //2f ((Class2)c).name2();
        //3a c.common();
        //3b ((Class2)c).common();
        //4 Class2 d; d = c;
        //5 Class2 d; d = (Class2)c;

    }
}

class Class1 {
    int i0 = 11;
    int i1 = 1;
    void name1() {System.out.println("Method - Class1 - name1");}
    void common() {System.out.println("Method - Class1 - common");}
}

class Class2 extends Class1 {
    int i1 = 2;
    int i2 = 22;
    void name2() {System.out.println("Method - Class2 - name2");}
    void common() {System.out.println("Method - Class2 - common");}
}
