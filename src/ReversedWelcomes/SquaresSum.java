package ReversedWelcomes;

import java.util.Scanner;

public class SquaresSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj proszę liczbę całkowitoliczową, która nada rozmiar tablicy liczb zmiennoprzecinkowych: ");
        double userTableGreatness = scanner.nextDouble();
        Double[] userTable = {userTableGreatness};

        for (int i=0; i<userTable[i]; i++) {
            System.out.println("Podaj proszę " + userTableGreatness + " liczb zmiennoprzecinkowych.");
            userTable[i] = scanner.nextDouble();
        }

        for (Double userNumbersSum: userTable){
            System.out.println(Math.sqrt(userNumbersSum));
        }

    }
}
// double sqrt = Math.sqrt(first); pierwiastek kwadratowy