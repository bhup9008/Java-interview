package test.vaco.lexs;

public class Child extends Parent{
    public Child(){
        System.out.println("Child constractor");
    }
    static {
        System.out.println("static block in child class");
    }
    {
        System.out.println("instance block in child class");
    }


    @Override
    public void parentMethod() {
        System.out.println("Child class of child class");
    }

    public static void main(String[] args) {

        //Child c=new Child();
        //c.parentMethod();
       // Parent p=new Parent();
        //p.parentMethod();
        Parent parent= new Child();
        parent.parentMethod();
        parent.staticmethod();

    }

}
