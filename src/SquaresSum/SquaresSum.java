package SquaresSum;

import java.util.Scanner;

public class SquaresSum {
    public static void main(String[] args) {
        double sum = 0.0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj proszę liczbę całkowitoliczową, która nada rozmiar tablicy liczb zmiennoprzecinkowych: ");
        int userTableGreatness = scanner.nextInt();
        Double[] userTable = new Double[userTableGreatness];

        for (int i = 0; i < userTableGreatness; i++) {
            System.out.println("Podaj proszę " + userTableGreatness + " liczb zmiennoprzecinkowych.");
            userTable[i] = scanner.nextDouble();
        }

        for (Double userNumbersInput : userTable) {
            System.out.println(Math.pow(sum += userNumbersInput, 2));
        }

    }
}