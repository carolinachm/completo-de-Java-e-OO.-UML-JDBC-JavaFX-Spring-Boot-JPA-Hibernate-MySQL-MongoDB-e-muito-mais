package app;

import java.util.Scanner;

/**
 * EntradaDadosParte2
 */
public class EntradaDadosParte2 {

    public static void main(String[] args) {

        int x;
        String s1, s2, s3;

       Scanner scanner = new Scanner(System.in);

        x = scanner.nextInt();
        scanner.nextLine();
        s1 = scanner.nextLine();
        s2 = scanner.nextLine();
        s3 = scanner.nextLine();

        System.out.println("Dados digitados:");
        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

    }
}