package initiation;

public class Date {
    // variable de classe
    private static int[] max_jour = new int[]{31,29,31,30,31,30,31,31,30,31,30,31};

    // variables d'instance
    private int jour = 1;
    private int mois = 1;
    private int an = 1900;

    public void incremente(int nbJour){
        this.jour = this.jour + nbJour;
    }

    public void afficher(){
        System.out.println(this.jour + "/"+ this.mois+"/"+this.an);
    }

    public static boolean isValid(int j, int m, int a){
        boolean valid = false;
        if(m > 0 && m <= 12){
            if(j>0 && j <= Date.max_jour[m - 1]){
                valid = true;
            }
        }
        return valid;
    }
}
