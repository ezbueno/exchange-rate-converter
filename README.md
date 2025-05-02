# Currency Converter

This project is a console-based currency converter developed in Java as part of the **ONE | TECH FOUNDATION - Back-End Java Specialization** by Oracle Next Education and Alura. The application allows users to convert currencies using real-time exchange rates retrieved from the [Exchange Rate API](https://www.exchangerate-api.com/).

## 💡 Features

- Real-time exchange rates.
- Conversion between the following currencies:
  - USD ⇄ ARS (Argentine Peso)
  - USD ⇄ BRL (Brazilian Real)
  - USD ⇄ COP (Colombian Peso)
- Interactive console menu with input validation.
- Environment variable support for API key security.
- Modular and maintainable code using Java OOP principles.

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

## 🛠 Technologies Used

- Java 24
- [Exchange Rate API](https://www.exchangerate-api.com/)
- [Gson 2.13.1](https://mvnrepository.com/artifact/com.google.code.gson/gson)
- [Dotenv Java 3.2.0](https://mvnrepository.com/artifact/io.github.cdimascio/dotenv-java)

## ⚙️ Setup

### Requirements

- JDK 24 installed.
- IntelliJ IDEA (recommended) or another Java IDE.

### Project Setup

1. Clone the repository.
2. Place the required JARs (`gson-2.13.1.jar`, `dotenv-java-3.2.0.jar`) in your module dependencies:
   - `File > Project Structure > Modules > Dependencies`
3. Create a `.env` file in the root of the project and add your API key:

```
EXCHANGE_API_KEY=your_api_key_here
```

### Running the Application

1. Run the `CurrencyConverter` class.
2. Use the menu to select the desired currency conversion.
3. Enter the amount and receive the converted result in real-time.

## 🔐 Security Note

Your API key is stored securely in a `.env` file and accessed using the Dotenv library. Do **not** commit your `.env` file to source control.

## 👨‍💻 Author

Developed by Ezandro as part of the **ONE | TECH FOUNDATION - Back-End Java Specialization** by Oracle Next Education and Alura.
