package javaConstructeur;

public class Desc extends Anc {

     private String name = null;

     public Desc(){
         this("toto");
     }


    public Desc(String name) {
         if(name == null){
             throw new NullPointerException("le nom est null");
         }
         this.name = name;
    }

    @Override
    public void test(){
        super.test();
    }


}
