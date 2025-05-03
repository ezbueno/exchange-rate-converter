package developer.ezandro.utils;

public class Message {
    private Message() {
    }

    public static final String INVALID_OPTION_SHORT = "Invalid option!";
    public static final String INVALID_OPTION_MESSAGE = "Invalid option!\nPlease choose a valid option:\n";
    public static final String ENTER_AMOUNT = "Enter the amount you want to convert:";
    public static final String AMOUNT_MUST_BE_POSITIVE = "The entered value cannot be less than or equal to 0.";
    public static final String INVALID_AMOUNT = "The entered value is invalid!";
    public static final String THANK_YOU = "Thank you for using the currency converter. See you next time!";
    public static final String CONVERSION_RESULT_MESSAGE = "Amount %.2f [%s] corresponds to the final amount of => %.2f [%s]%n";
    public static final String API_QUERY_ERROR = "Error when querying the exchange rate API. Check the internet connection.";
    public static final String REQUEST_INTERRUPTED_ERROR = "The request execution was interrupted. The operation has been canceled.";
    public static final String CONVERSION_FAILED = "Unable to retrieve the conversion result. Please try again later.";

    public static final String MENU_HEADER = """
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
            """;
}