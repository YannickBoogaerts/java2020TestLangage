package javaLangage.primitif;

public class ConversionType {

    public static void main(String[] args) {
        {
            byte b = 100;
            int i = b;
            b = (byte) i;

            i = Byte.MAX_VALUE + 10;

            b = (byte) i;

            System.out.println(i);
            System.out.println(b);
        }
        {
            long l = Long.MAX_VALUE;
            for (int i = 0; i < 50; i++) {
                double d  = l;
                long l2 = (long) d;
                System.out.println(l + " - "+ l2);
                l -= 500;

            }
        }
    }
}
