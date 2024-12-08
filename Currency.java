import java.util.Scanner;

// Base class: CurrencyConverter
class CurrencyConverter {
    public double convert(double amount) {
        return amount; // Default implementation (can be overridden)
    }
}

// Subclass: USDConverter
class USDConverter extends CurrencyConverter {
    @Override
    public double convert(double amount) {
        return amount * 290; // Conversion rate for USD to LKR
    }
}

// Subclass: GBPConverter
class GBPConverter extends CurrencyConverter {
    @Override
    public double convert(double amount) {
        return amount * 370; // Conversion rate for GBP to LKR
    }
}

// Subclass: EURConverter
class EURConverter extends CurrencyConverter {
    @Override
    public double convert(double amount) {
        return amount * 307; // Conversion rate for EUR to LKR
    }
}

// Main class
public class Currency {
    public static void main(String[] args) {
        // Create objects for each currency converter
        CurrencyConverter usdConverter = new USDConverter();
        CurrencyConverter gbpConverter = new GBPConverter();
        CurrencyConverter eurConverter = new EURConverter();

        // User input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the currency type (USD/GBP/EUR): ");
        String currencyType = scanner.nextLine().toUpperCase();

        System.out.println("Enter the amount to convert: ");
        double amount = scanner.nextDouble();

        // Variable to store converted amount
        double convertedAmount = 0;

        // Perform conversion based on currency type
        switch (currencyType) {
            case "USD":
                convertedAmount = usdConverter.convert(amount);
                break;
            case "GBP":
                convertedAmount = gbpConverter.convert(amount);
                break;
            case "EUR":
                convertedAmount = eurConverter.convert(amount);
                break;
            default:
                System.out.println("Invalid currency type!");
                scanner.close();
                return;
        }

        // Display the result
        System.out.println("Converted amount in LKR: " + convertedAmount);

        // Close scanner
        scanner.close();
    }
}

