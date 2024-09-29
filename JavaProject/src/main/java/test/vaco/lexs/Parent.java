package test.vaco.lexs;

public class Parent {

    public Parent(){
        System.out.println("Parent constractor in parent class");
    }
    static {
        System.out.println("static block in parent class");
    }
    {
        System.out.println("instance block in parent class");
    }
    public void parentMethod(){
        System.out.println("parentMethod in parent class" );
    }
    public static void staticmethod(){
        System.out.println("staticmethod in parent class");
    }

}
