# 💱 Currency Converter

This is a **console-based currency converter** developed in **Java** as part of the **ONE | TECH FOUNDATION - Back-End Java Specialization** by Oracle Next Education and Alura. The application converts currencies using **real-time exchange rates** retrieved from the **Exchange Rate API**, with a clean and modular architecture using object-oriented principles.

---

## 💡 Features

- ✅ Real-time currency conversion using Exchange Rate API  
- ✅ Bidirectional conversion between the following currencies:
  - USD ⇄ ARS (Argentine Peso)
  - USD ⇄ BRL (Brazilian Real)
  - USD ⇄ COP (Colombian Peso)
- ✅ Strong typing using `enum` (`CurrencyCode`) for supported currencies
- ✅ Modular code with clear separation of concerns (API, service, UI, domain, utils)
- ✅ Clean console interface with input validation and graceful error handling
- ✅ Secure use of API keys through environment variables

---

## 📋 Menu Options

```
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
```

---

## 🛠 Technologies Used

- ☕ Java 24  
- 🌍 Exchange Rate API  
- 📦 Gson 2.13.1  
- 🔐 Dotenv Java 3.2.0

---

## ⚙️ Setup

### Requirements

- JDK 24 installed  
- IntelliJ IDEA (recommended) or any Java-compatible IDE  

### Project Setup

1. **Clone the repository**  
2. **Add dependencies manually** if not using Maven/Gradle:
   - `gson-2.13.1.jar`
   - `dotenv-java-3.2.0.jar`  
   *(Project Structure > Modules > Dependencies)*
3. **Create a `.env` file** in the root of the project with your API key:

   ```
   EXCHANGE_API_KEY=your_api_key_here
   ```

---

## ▶️ Running the Application

- Run the `CurrencyConverter` class located in `developer.ezandro.main`
- Use the interactive menu to select a conversion
- Enter the amount to convert and receive the result in real-time

---

## 📶 Offline Handling

If the application is unable to reach the Exchange Rate API due to a lack of internet connection or API failure, it will gracefully notify the user with a friendly message:

```
Unable to retrieve the conversion result. Please try again later.
```

This ensures a better user experience even in failure scenarios.

---

## 🔐 Security Note

Your API key is stored securely using a `.env` file, accessed via the Dotenv library.  
**⚠️ Do not commit your `.env` file to version control.**

---

## 👨‍💻 Author

Developed by **Ezandro** as part of the  
**ONE | TECH FOUNDATION - Back-End Java Specialization**  
by **Oracle Next Education and Alura**