package GuessNumber;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInputNumber;

        do {
            System.out.println("Zgadnij proszę liczbę:");
            userInputNumber = scanner.nextInt();
            if (userInputNumber < 100) {
                System.out.println("Liczba: " + userInputNumber + " podana przez Ciebie jest zbyt mała. Spróbuj proszę zgadnąć jeszcze raz.");
                userInputNumber = scanner.nextInt();
            }
            if (userInputNumber > 200) {
                System.out.println("Liczba: " + userInputNumber + " podana przez Ciebie jest zbyt duża. Spróbuj proszę zgadnąć jeszcze raz.");
                userInputNumber = scanner.nextInt();
            }
            if (userInputNumber % 3 != 0) {
                System.out.println("Liczba: " + userInputNumber + " podana przez Ciebie nie dzieli się przez 3. Spróbuj proszę zgadnąć jeszcze raz.");
                userInputNumber = scanner.nextInt();
            }
        } while (!((userInputNumber > 100 && userInputNumber < 200) && userInputNumber % 3 == 0));

        System.out.println("Brawo! Twoja liczba: " + userInputNumber + " jest poprawna ponieważ dzieli się przez 3 i wchodzi w zakres liczb od 100 do 200.");
        scanner.close();
    }
}
