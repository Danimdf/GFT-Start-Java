package one.digitalinnovation.basecamp;

public class Main {

    public static void main(String[] args) {
        System.out.println("PrePos: ");
        prePos();
        System.out.println("\nAritméticos: ");
        aritmet();
        System.out.println("\nAtribuição: ");
        atribuicao();
        System.out.println("\nPrecedência: ");
        precedencia();
    }

    private static void prePos () {
        int i = 10;

        int k = ++i;
        int j = i--;
        int x = i;


        System.out.println("k: " + k);
        System.out.println("j: " + j);
        System.out.println("x: " + x);

    }

    private static void aritmet() {
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        int e = 50;

        int r1 = a+b;
        int r2 = c-a;
        int r3 = d+b;
        int r4 = e/a;
        int r5 = c%b;
        int r6 = c-a+b;
        int r7 = d/b+a;
        int r8 = d*e;

        System.out.println("a+b" + r1);
        System.out.println("c-a" + r2);
        System.out.println("d+b" + r3);
        System.out.println("e/a" + r4);
        System.out.println("c%b" + r5);
        System.out.println("c-a+b" + r6);
        System.out.println("d/b+a" + r7);
        System.out.println("d*e" + r8);
    }
    
    private static void atribuicao() {
        int i = 1500;
        short j = 15;
        long l = 500L;
        int k = 35;
        float n = 3.5f;
        double d = n;

        System.out.println("d: " + d);

        i += 5;
        j -= 3;
        d /= 2.7d;
        l *= 3;
        k %= 2;

        System.out.println("i: " + i);
        System.out.println("i: " + j);
        System.out.println("i: " + d);
        System.out.println("i: " + l);
        System.out.println("i: " + k);

        i = k = j;

        System.out.println("k: " + k);
        System.out.println("i: " + i);
        System.out.println("j: " + j);

    }

    private static void precedencia() {

        int i = 10;
        int j = 20;
        int k = 30;

        int a = i++ + --j * k;

        System.out.println("i++ + --j * k: " + a);

        System.out.println("i: " + i);

        int b = k / --i % 3 + 1;

        System.out.println("k / --i % 3 + 1: " + b);

        System.out.println("i: " + i);

        int c = 2;

        c *= i += 5;

        System.out.println("c *= i += 5: " + c);

    }
}
