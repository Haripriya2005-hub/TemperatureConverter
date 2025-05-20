package Basics.Prodigy_Internship;
import java.util.Scanner;
    public class TemperatureConverter {

        public static double celsiusToFahrenheit(double c) {
            return (c * 9 / 5) + 32;
        }

        public static double celsiusToKelvin(double c) {
            return c + 273.15;
        }

        public static double fahrenheitToCelsius(double f) {
            return (f - 32) * 5 / 9;
        }

        public static double fahrenheitToKelvin(double f) {
            return (f - 32) * 5 / 9 + 273.15;
        }

        public static double kelvinToCelsius(double k) {
            return k - 273.15;
        }

        public static double kelvinToFahrenheit(double k) {
            return (k - 273.15) * 9 / 5 + 32;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Temperature Conversion Program");
            System.out.print("Enter the temperature value: ");
            double temp = scanner.nextDouble();

            System.out.print("Enter the unit (C for Celsius, F for Fahrenheit, K for Kelvin): ");
            char unit = scanner.next().toUpperCase().charAt(0);

            switch (unit) {
                case 'C':
                    System.out.printf("%.2f°C is %.2f°F and %.2fK\n",
                            temp, celsiusToFahrenheit(temp), celsiusToKelvin(temp));
                    break;
                case 'F':
                    System.out.printf("%.2f°F is %.2f°C and %.2fK\n",
                            temp, fahrenheitToCelsius(temp), fahrenheitToKelvin(temp));
                    break;
                case 'K':
                    System.out.printf("%.2fK is %.2f°C and %.2f°F\n",
                            temp, kelvinToCelsius(temp), kelvinToFahrenheit(temp));
                    break;
                default:
                    System.out.println("Invalid unit. Please enter C, F, or K.");
            }

            scanner.close();
        }
    }


