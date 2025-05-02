package developer.ezandro.ui;

public class CurrencyMenu {
    public void showMenu() {
        System.out.print("""
                ***********************************************
                * Hello! Welcome to the Currency Converter!   *
                *                                             *
                * 1) Dollar ==> Argentine Peso                *
                * 2) Argentine Peso ==> Dollar                *
                * 3) Dollar ==> Brazilian Real                *
                * 4) Brazilian Real ==> Dollar                *
                * 5) Dollar ==> Colombian Peso                *
                * 6) Colombian Peso ==> Dollar                *
                * 7) Exit                                     *
                ***********************************************
                Please choose a valid option:
                """);
    }
}