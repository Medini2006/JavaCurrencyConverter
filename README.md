# Simple Currency Conversion System in Java

## Description
This project is a **Currency Conversion System** implemented in Java, showcasing the concept of **Polymorphism**. It is designed to calculate the equivalent amount in **Sri Lankan Rupees (LKR)** for various currencies such as **USD, GBP, and EUR**. 

The program demonstrates **Object-Oriented Programming (OOP)** principles, including:
- Inheritance
- Polymorphism
- Encapsulation

## Features
- **Dynamic Currency Conversion**: Convert USD, GBP, or EUR to LKR.
- **Scalable Design**: Easily extendable to support additional currencies.
- **Clear Modular Structure**: Separate classes for each currency.

## Conversion Rates
The following conversion rates are used:
- **1 USD = 290 LKR**
- **1 GBP = 370 LKR**
- **1 EUR = 307 LKR**

## Project Files
- `CurrencyConverter.java` - Base class with the generic `convert` method.
- `USDConverter.java` - Subclass for USD to LKR conversion.
- `GBPConverter.java` - Subclass for GBP to LKR conversion.
- `EURConverter.java` - Subclass for EUR to LKR conversion.
- `CurrencyConversionApp.java` - Main class for user input and execution.

## Example Usage
1. **Input**:

Enter the currency type (USD/GBP/EUR): USD Enter the amount to convert: 100
2. **Output**:

Converted amount in LKR: 36000.0

## Installation
1. Clone the repository:
git clone https://github.com/medini2006/currency-conversion-system.git

2. Compile the files:
javac *.java

3. Run the program.
java CurrencyConversionApp.


## Technologies Used
- **Java**
- **Object-Oriented Programming**

## Future Enhancements
- Add support for additional currencies.
- Implement real-time conversion rates using an API.
- Develop a graphical user interface (GUI) for user interaction.

## Author
Created by **Medini Thrishala Thudahewage**. Feel free to reach out for collaboration or feedback!







