package initiation;

public class TestDate {

    public static void main(String[] args) {
        boolean valid = Date.isValid(15,9,2000);

        System.out.println(valid);

        Date maDate = new Date();
        Date maDate2 = new Date();

        maDate.afficher();
        maDate2.afficher();

        maDate.incremente(10);

        maDate.afficher();
        maDate2.afficher();
    }
}
