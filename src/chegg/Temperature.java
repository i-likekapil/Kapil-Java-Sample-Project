package chegg;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a temperature in degrees Fahrenheit : ");
        double fah = scanner.nextDouble();
        System.out.printf("Fahrenheit to Celsius : %.2f\n", toCelcius(fah));
        System.out.print("Enter a temperature in degrees Celsius : ");
        double cel = scanner.nextDouble();
        System.out.printf("Celsius to Fahrenheit : %.2f\n", toFahren(cel));
    }

    public static double toFahren(double cel) {
        return (9 / 5 * cel) + 32;
    }

    public static double toCelcius(double fah) {
        return (fah - 32) * 5 / 9;
    }

}
