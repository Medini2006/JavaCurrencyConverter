
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
        return amount * 129; // Conversion rate for USD to LKR
    }
}

// Subclass: GBPConverter
class GBPConverter extends CurrencyConverter {
    @Override
    public double convert(double amount) {
        return amount * 67; // Conversion rate for GBP to LKR
    }
}

// Subclass: EURConverter
class EURConverter extends CurrencyConverter {
    @Override
    public double convert(double amount) {
        return amount * 21; // Conversion rate for EUR to LKR
    }
}

// Main class
public class CurrencyConversionApp {
    public static void main(String[] args) {
        // Create objects for each currency converter
        CurrencyConverter usdConverter = new USDConverter();
        CurrencyConverter gbpConverter = new GBPConverter();
        CurrencyConverter eurConverter = new EURConverter();

        // Example conversions
        double amountUSD = 100; // 100 USD
        double amountGBP = 50;  // 50 GBP
        double amountEUR = 70;  // 70 EUR

        // Display results
        System.out.println("100 USD in LKR: " + usdConverter.convert(amountUSD));
        System.out.println("50 GBP in LKR: " + gbpConverter.convert(amountGBP));
        System.out.println("70 EUR in LKR: " + eurConverter.convert(amountEUR));
    }
}

