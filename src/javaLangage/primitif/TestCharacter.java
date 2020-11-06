package javaLangage.primitif;

public class TestCharacter {

    public static void main(String[] args) {
        char c = 125;
        System.out.println((int)c);

        char c2 = 'a';
        c2 = (char)(c2 + 'b');

        System.out.println(c2);
        c2 ='\n';
    }
}
