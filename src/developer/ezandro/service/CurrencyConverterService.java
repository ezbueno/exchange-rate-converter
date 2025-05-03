package developer.ezandro.service;

import developer.ezandro.api.CurrencyExchangeClient;
import developer.ezandro.domain.ConversionResult;

public class CurrencyConverterService {
    private CurrencyConverterService() {
    }

    public static ConversionResult convertCurrency(String base, String target, double amount) {
        return CurrencyExchangeClient.getExchangeRateForCurrency(base, target, amount);
    }
}