package app;

import java.util.Scanner;

/**
 * EntradaDados
 */
public class EntradaDados {

    public static void main(String[] args) {

        String x;
        int y;
        double z;
        char w;

        Scanner sc = new Scanner(System.in);
        
        x = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble();
        w = sc.next().charAt(0);

        System.out.println("Voce digitou: " + x);
        System.out.println("Voce digitou: " + y);
        System.out.println("Voce digitou: %. 2f%n" + z);
        System.out.println("Voce digitou: " + w);

        sc.close();g
    }
}