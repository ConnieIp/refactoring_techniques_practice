package com.tws.refactoring.extract_variable;

public class PriceCalculator {
    double getPrice(int quantity, int itemPrice) {
        // Price consists of: base price - discount + shipping cost
        double basePrice = quantity * itemPrice;
        return basePrice -
                Math.max(0, quantity - 500) * itemPrice * 0.05 +
                Math.min(basePrice * 0.1, 100.0);
    }
}
