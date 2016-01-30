class Main {
    public static void main(String[] ach){
        //1 Parent.ps = 1;
        //2 Parent.s = 1; Parent.s = 2;
        //3 new Parent();
        //4 System.out.println("Create 1"); new Parent(); System.out.println("Create 2"); new Parent();
        //5 Child.s = 1;
        //6 Child.s = 1; // Child.s = 2;
        //7
        new Child();
        //8 System.out.println("Create 1"); new Child(); System.out.println("Create 2"); new Child();
        //System.out.println(Child.ps);
    }
}

class Parent {
    // Static context
    static int ps;
    static { System.out.println("Parent - Load Class - static Init Block");}

    // Instance context
    Parent(){ System.out.println("Parent - Create Object Instance - Constructor");}
    {System.out.println("Parent - Create Object Instance - Initialisation Block");}
}

class Child extends Parent{

    // Static context
    static int s;
    static { System.out.println("Child - Load Class - static Init Block");}

    // Instance context
    Child(){ System.out.println("Child - Create Object Instance - Constructor");}
    {System.out.println("Child - Create Object Instance - Initialisation Block");}
}
