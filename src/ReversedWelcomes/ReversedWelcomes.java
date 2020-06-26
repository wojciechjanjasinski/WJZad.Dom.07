package ReversedWelcomes;

import java.util.Scanner;

public class ReversedWelcomes {
    public static void main(String[] args) {
        String[] names = new String[5];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Podaj proszę pięć imion jedno po drugim");
            names[i] = scanner.nextLine();
        }

        scanner.close();
        for (int i = 0; i < 5; i++) {
            System.out.println("Wprowadziłeś następujące imię: " + names[i]);
        }

        for (int i = names.length -1 ; i >= 0; i--) {
            System.out.println("Witaj " + names[i] + " !");
        }

    }
}
