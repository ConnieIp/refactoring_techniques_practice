package com.tws.refactoring.extract_variable;

public class PriceCalculator {
    private final double maxShippingCost = 100.0;

    double getPrice(int quantity, int itemPrice) {
        double basePrice = quantity * itemPrice;

        double discountedQuantity = Math.max(0, quantity - 500);
        double discount = discountedQuantity * itemPrice * 0.05;
        
        double shippingCost=Math.min(basePrice * 0.1, maxShippingCost);

        return basePrice - discount + shippingCost;
    }
}
