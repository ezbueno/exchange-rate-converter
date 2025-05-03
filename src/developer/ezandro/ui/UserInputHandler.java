package developer.ezandro.ui;

import developer.ezandro.utils.CurrencyPairManager;
import developer.ezandro.utils.Message;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInputHandler {
    private UserInputHandler() {
    }

    public static int readValidOption(int option) {
        if (CurrencyPairManager.isValidOption(option)) {
            return option;
        }
        throw new IllegalArgumentException(Message.INVALID_OPTION_MESSAGE);
    }

    public static void readValidAmount(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException(Message.AMOUNT_MUST_BE_POSITIVE);
        }
    }

    public static int readOption(Scanner scanner) {
        while (true) {
            try {
                int option = scanner.nextInt();
                return UserInputHandler.readValidOption(option);
            } catch (InputMismatchException _) {
                System.out.print(Message.INVALID_OPTION_MESSAGE);
                scanner.nextLine();
            } catch (IllegalArgumentException _) {
                System.out.print(Message.INVALID_OPTION_MESSAGE);
            }
        }
    }

    public static double readAmount(Scanner scanner) {
        while (true) {
            try {
                System.out.println(Message.ENTER_AMOUNT);
                double amount = scanner.nextDouble();
                UserInputHandler.readValidAmount(amount);
                return amount;
            } catch (InputMismatchException _) {
                System.out.println(Message.INVALID_AMOUNT);
                scanner.nextLine();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}