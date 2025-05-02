package developer.ezandro.ui;

public class UserInputHandler {
    private UserInputHandler() {
    }

    public static int readValidOption(int option) {
        return isValidOption(option) ? option : -1;
    }

    public static void readValidAmount(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("The entered value cannot be less than or equal to 0.");
        }
    }

    private static boolean isValidOption(int option) {
        switch (option) {
            case 1,
                 2,
                 3,
                 4,
                 5,
                 6,
                 7 -> {
                return true;
            }
            default -> {
                return false;
            }
        }
    }
}