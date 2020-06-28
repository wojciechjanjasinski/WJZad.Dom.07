package GuessNumber;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zgadnij proszę liczbę:");
        int userInputNumber = scanner.nextInt();

        while (!((userInputNumber > 100 && userInputNumber < 200) && userInputNumber % 3 == 0)) {
            System.out.println("Niestety Twoja liczba albo jest spoza oczekiwanego zakresu lub nie jest podzielna przez 3 bez reszty. Spróbuj proszę jeszcze raz:");
            userInputNumber = scanner.nextInt();

        }
        System.out.println("Brawo! Twoja liczba: " + userInputNumber + " jest poprawna ponieważ dzieli się przez 3 i wchodzi w zakres liczb od 100 do 200");
        scanner.close();
    }
}
