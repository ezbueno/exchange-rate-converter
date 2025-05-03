package developer.ezandro.api;

import com.google.gson.Gson;
import developer.ezandro.domain.ConversionResult;
import developer.ezandro.utils.Message;
import io.github.cdimascio.dotenv.Dotenv;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CurrencyExchangeClient {
    private CurrencyExchangeClient() {
    }

    private static final Logger LOGGER = Logger.getLogger(CurrencyExchangeClient.class.getName());
    private static final Dotenv dotenv = Dotenv.load();
    private static final String API_KEY = dotenv.get("EXCHANGE_API_KEY");

    public static ConversionResult getExchangeRateForCurrency(String baseCurrencyCode, String targetCurrencyCode, double amount) {
        try (HttpClient client = HttpClient.newHttpClient()) {
            String url = "https://v6.exchangerate-api.com/v6/"
                    + API_KEY
                    + "/pair/"
                    + baseCurrencyCode
                    + "/"
                    + targetCurrencyCode
                    + "/"
                    + amount;

            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            Gson gson = new Gson();
            return gson.fromJson(response.body(), ConversionResult.class);

        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, Message.API_QUERY_ERROR, e);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            LOGGER.log(Level.SEVERE, Message.REQUEST_INTERRUPTED_ERROR, e);
        }
        return new ConversionResult(0);
    }
}