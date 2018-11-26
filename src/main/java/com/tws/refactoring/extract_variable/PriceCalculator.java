package com.tws.refactoring.extract_variable;

public class PriceCalculator {
    private final double maxShippingCost = 100.0;
    private final double shippingCostRate = 0.1;
    private final double discountRate = 0.05;
    private final double maxDiscountQuantity = 500;

    double getPrice(int quantity, int itemPrice) {
        double basePrice = quantity * itemPrice;

        double discountedQuantity = Math.max(0, quantity - maxDiscountQuantity);
        double discount = discountedQuantity * itemPrice * discountRate;

        double shippingCost=Math.min(basePrice * shippingCostRate, maxShippingCost);

        return basePrice - discount + shippingCost;
    }
}
