package developer.ezandro.utils;

import developer.ezandro.domain.CurrencyCode;
import developer.ezandro.domain.CurrencyPair;

import java.util.Map;

public class CurrencyPairManager {
    private CurrencyPairManager() {
    }

    private static final Map<Integer, CurrencyPair> CURRENCY_PAIRS = Map.of(
            1, new CurrencyPair(CurrencyCode.USD, CurrencyCode.ARS),
            2, new CurrencyPair(CurrencyCode.ARS, CurrencyCode.USD),
            3, new CurrencyPair(CurrencyCode.USD, CurrencyCode.BRL),
            4, new CurrencyPair(CurrencyCode.BRL, CurrencyCode.USD),
            5, new CurrencyPair(CurrencyCode.USD, CurrencyCode.COP),
            6, new CurrencyPair(CurrencyCode.COP, CurrencyCode.USD)
    );

    public static CurrencyPair getCurrencyPair(int option) {
        return CURRENCY_PAIRS.get(option);
    }

    public static boolean isConversionOption(int option) {
        return CURRENCY_PAIRS.containsKey(option);
    }

    public static boolean isExitOption(int option) {
        return option == 7;
    }

    public static boolean isValidOption(int option) {
        return isConversionOption(option) || isExitOption(option);
    }
}