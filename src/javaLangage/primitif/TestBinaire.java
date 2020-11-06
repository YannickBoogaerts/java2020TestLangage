package javaLangage.primitif;

public class TestBinaire {

    public static void main(String[] args) {
        int a = 45;
        //System.out.println(Integer.toBinaryString(a));
        //System.out.println(Integer.toBinaryString(-a));

        int b = 0b101101;//45
        int c = 0b100111;//39

        //System.out.println( c & b);

        int possibilite = 0b100101010;

        System.out.println( (possibilite & (1<<4)) != 0);

        System.out.println(Integer.toBinaryString(possibilite));

        possibilite = possibilite | (1 << 6);

        System.out.println(Integer.toBinaryString(possibilite));

        System.out.println(Integer.toBinaryString(~possibilite));

        System.out.println(Integer.toBinaryString(possibilite ^ (1<<3)));

        int x = 25;
        int y = 48;
        int z = x ^ y;
        System.out.println(z);
        System.out.println(z ^ y);

        x = x ^ y;
        y = x ^ y;
        x = x ^ y;

        System.out.println( x);
        System.out.println( y);

    }
}
