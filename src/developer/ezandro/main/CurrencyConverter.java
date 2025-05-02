package developer.ezandro.main;

import developer.ezandro.api.CurrencyExchangeClient;
import developer.ezandro.domain.ConversionResult;
import developer.ezandro.ui.CurrencyMenu;
import developer.ezandro.ui.UserInputHandler;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        CurrencyMenu currencyMenu = new CurrencyMenu();
        int option = 0;
        String message = """
                Invalid option!
                Please choose a valid option:
                """;

        try (Scanner scanner = new Scanner(System.in)) {
            currencyMenu.showMenu();
            while (option != 7) {
                while (true) {
                    try {
                        option = scanner.nextInt();
                        option = UserInputHandler.readValidOption(option);

                        if (option != -1) {
                            break;
                        }

                        System.out.print(message);
                    } catch (InputMismatchException _) {
                        System.out.print(message);
                        scanner.nextLine();
                    }
                }

                switch (option) {
                    case 1 -> convertAndDisplay("USD", "ARS", scanner);
                    case 2 -> convertAndDisplay("ARS", "USD", scanner);
                    case 3 -> convertAndDisplay("USD", "BRL", scanner);
                    case 4 -> convertAndDisplay("BRL", "USD", scanner);
                    case 5 -> convertAndDisplay("USD", "COP", scanner);
                    case 6 -> convertAndDisplay("COP", "USD", scanner);
                    case 7 -> System.out.println("Thank you for using the currency converter. See you next time!");
                    default -> System.out.println("Invalid option.");
                }

                if (option != 7) {
                    currencyMenu.showMenu();
                }
            }
        }
    }

    private static void convertAndDisplay(String base, String target, Scanner scanner) {
        while (true) {
            try {
                System.out.println("Enter the amount you want to convert:");
                double amount = scanner.nextDouble();
                UserInputHandler.readValidAmount(amount);

                CurrencyExchangeClient client = new CurrencyExchangeClient();
                ConversionResult result = client.getExchangeRateForCurrency(base, target, amount);

                System.out.printf("Amount %.2f [%s] corresponds to the final amount of => %.2f [%s]%n",
                        amount, base, result.conversion_result(), target);
                break;
            } catch (InputMismatchException _) {
                System.out.println("The entered value is invalid!");
                scanner.nextLine();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}