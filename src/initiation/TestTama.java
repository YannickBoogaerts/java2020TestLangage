package initiation;

public class TestTama {

    public static void main(String[] args) {
        Ours ours = new Ours();

        Tama t = new Ours();

        //Ours o = new Tama();
        //Tama o = new Tama();

        t.dormir();

        t.manger();
        t.manger(2);

        ours.dormir();

        Tama[] nurse = new Tama[3];

        nurse[0] = new Ours();
        nurse [1] = ours;
        nurse [2] = new Lapin();


        for( Tama ta : nurse){
            ta.dormir();
            ta.marcher();
        }
    }
}
