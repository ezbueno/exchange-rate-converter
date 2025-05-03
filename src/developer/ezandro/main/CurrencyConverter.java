package developer.ezandro.main;

import developer.ezandro.domain.ConversionResult;
import developer.ezandro.domain.CurrencyPair;
import developer.ezandro.service.CurrencyConverterService;
import developer.ezandro.ui.CurrencyMenu;
import developer.ezandro.ui.UserInputHandler;
import developer.ezandro.utils.CurrencyPairManager;
import developer.ezandro.utils.Message;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        CurrencyMenu currencyMenu = new CurrencyMenu();

        try (Scanner scanner = new Scanner(System.in)) {
            boolean running = true;

            while (running) {
                currencyMenu.showMenu();
                int option = UserInputHandler.readOption(scanner);

                if (CurrencyPairManager.isExitOption(option)) {
                    System.out.println(Message.THANK_YOU);
                    running = false;
                } else if (CurrencyPairManager.isConversionOption(option)) {
                    double amount = UserInputHandler.readAmount(scanner);
                    CurrencyPair pair = CurrencyPairManager.getCurrencyPair(option);

                    ConversionResult result = CurrencyConverterService.convertCurrency(
                            pair.base().name(),
                            pair.target().name(),
                            amount
                    );
                    ConversionResult.printConversionResult(
                            amount,
                            pair.base().name(),
                            result.conversion_result(),
                            pair.target().name()
                    );
                } else {
                    System.out.println(Message.INVALID_OPTION_SHORT);
                }
            }
        }
    }
}