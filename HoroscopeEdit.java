package horoscopeEdit;

import java.util.Scanner;

public class HoroscopeEdit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int birthDay, birthMonth;

        System.out.print("What is your birth month: ");
        birthMonth = scanner.nextInt();

        System.out.print("What is your birth day: ");
        birthDay = scanner.nextInt();
        scanner.close();

        if (((birthMonth == 3) && (birthDay > 20)) || ((birthMonth == 4) && (birthDay < 21))) {
            System.out.println("Your horoscope is Aries");
        } else if (((birthMonth == 4) && (birthDay > 20)) || ((birthMonth == 5) && (birthDay < 22))) {
            System.out.println("Your horoscope is Taurus");
        } else if (((birthMonth == 5) && (birthDay > 21)) || ((birthMonth == 6) && (birthDay < 23))) {
            System.out.println("Your horoscope is Gemini");
        } else if (((birthMonth == 6) && (birthDay > 22)) || ((birthMonth == 7) && (birthDay < 23))) {
            System.out.println("Your horoscope is Cancer");
        } else if (((birthMonth == 7) && (birthDay > 22)) || ((birthMonth == 8) && (birthDay < 23))) {
            System.out.println("Your horoscope is Leo");
        } else if (((birthMonth == 8) && (birthDay > 22)) || ((birthMonth == 9) && (birthDay < 23))) {
            System.out.println("Your horoscope is Virgo");
        } else if (((birthMonth == 9) && (birthDay > 22)) || ((birthMonth == 10) && (birthDay < 23))) {
            System.out.println("Your horoscope is Libra");
        } else if (((birthMonth == 10) && (birthDay > 22)) || ((birthMonth == 11) && (birthDay < 22))) {
            System.out.println("Your horoscope is Scorpio");
        } else if (((birthMonth == 11) && (birthDay > 21)) || ((birthMonth == 12) && (birthDay < 22))) {
            System.out.println("Your horoscope is Sagittarius");
        } else if (((birthMonth == 12) && (birthDay > 21)) || ((birthMonth == 1) && (birthDay < 22))) {
            System.out.println("Your horoscope is Capricorn");
        } else if (((birthMonth == 1) && (birthDay > 21)) || ((birthMonth == 2) && (birthDay < 20))) {
            System.out.println("Your horoscope is Aquarius");
        } else {
            System.out.println("Your horoscope is Pisces");
        }
    }
}
