package initiation;

public abstract class Tama {
    private int sommeil =10;
    private int faim = 10;

    public void manger(){
        this.faim--;
    }

    // overloading : surcharge
    public void manger(int qt){
        this.faim = this.faim - qt;
    }

    public void dormir(){
        this.sommeil --;
    }


    public abstract void marcher();


}
