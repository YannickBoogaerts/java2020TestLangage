package javaConstructeur;

public class Test {

    public static void main(String[] args) {
        new Desc();
        Desc d =null;
        try {
             d = new Desc(null);
        }catch (Exception e){
            System.out.println("Test.main");
        }
    }
}
