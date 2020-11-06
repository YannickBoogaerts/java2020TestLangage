package initiation;

public class Ours extends Tama {

    private boolean hiberne = false;

    public void hiberner(){
        hiberne = true;
    }

    // virtuelle
    @Override
    public void dormir(){
        if(hiberne){
            System.out.println("groumf");
        }else{
            super.dormir();
        }
    }

    @Override
    public void manger(int qt) {

    }
    public void marcher(){
        System.out.println("je marche comme un ours");
    }

}
