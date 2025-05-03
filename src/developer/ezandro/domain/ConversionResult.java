package developer.ezandro.domain;

import developer.ezandro.utils.Message;

public record ConversionResult(double conversion_result) {
    public static void printConversionResult(double amount, String baseCurrency, double convertedAmount, String targetCurrency) {
        System.out.printf(Message.CONVERSION_RESULT_MESSAGE, amount, baseCurrency, convertedAmount, targetCurrency);
    }
}