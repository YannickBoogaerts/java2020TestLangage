package testException;

public class Test1 {

    public static void main(String[] args) {
        System.out.println("Test1.main avant");;
        fct1(6);
        System.out.println("Test1.main après");;
    }

    private static void fct1(int i) {
        System.out.println("Test1.fct1 avant");
        try {
            fct2(i);
            System.out.println("Test1.fct1 après appel");
        } catch (IllegalArgumentException | MyException e){
            System.out.println("Test1.fct1 dans le catch");
 /*       } catch (MyException e) {
            e.printStackTrace();
*/        } finally {
            System.out.println("Test1.fct1 finally");
        }
        System.out.println("Test1.fct1 après");
    }

    private static void fct2(int i) throws MyException {
        System.out.println("Test1.fct2 avant");
        fct3(i);
        System.out.println("Test1.fct2 après");
    }

    private static void fct3(int i) throws MyException{
        System.out.println("Test1.fct3 avant");
        if(i == 5){
            throw new IllegalArgumentException("pas la valeur 5 svp");
        }else if(i == 6){
            throw new NullPointerException("c'est null");
        } else if(i == 7){
            throw new MyException("message");
        }
        System.out.println("Test1.fct3 après");
    }

}
