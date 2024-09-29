import java.util.stream.Collectors;

public class Test1 {

    public static int getInteger(){
        try {

            int i=10/2;
            return i;
        }catch (Exception e){
            System.out.println("Exception");
            System.out.println(e.getMessage());

            return -1;
        }
        finally {

            //System.out.println("sdjsjdsad");
            return 7;
        }
    }
    public static void main(String[] args) {
       System.out.println("hello test");
      int x= getInteger();
      System.out.println(x);
       /*String str="bhupendrakumar";
       str.chars().mapToObj(s->(char)(s)).collect(Collectors.groupingBy(c->c,Collectors.counting())).entrySet().stream().filter(x->x.getValue()>=2).
               forEach(x->{System.out.println(x.getKey()+":"+x.getValue());});*/





    }

}
