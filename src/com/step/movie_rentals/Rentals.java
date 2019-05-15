package com.step.movie_rentals;

import java.util.ArrayList;
import java.util.List;

class Rentals {
    private List<Rental> rentalsList = new ArrayList<>();
    private static final String NEW_LINE = "\n";
    private static final String TAB = "\t";

    void addRental(Rental rental) {
        rentalsList.add(rental);
    }

    int calculateFrequentRenterPoints() {
        int frequentRenterPoints = 0;
        for (Rental rental : this.rentalsList) {
            frequentRenterPoints++;

            frequentRenterPoints += rental.addFrequentRenterPoints();
        }
        return frequentRenterPoints;
    }

    double calculateTotalAmount() {
        double totalAmount = 0;
        for (Rental rental : this.rentalsList) {
            totalAmount += rental.calculateRent();
        }
        return totalAmount;
    }

    String getRentalStatement() {
        StringBuilder result = new StringBuilder();
        for (Rental rental : this.rentalsList) {
            double thisAmount = rental.calculateRent();
            result.append(TAB);
            result.append(rental.getMovie().getTitle());
            result.append(TAB);
            result.append(thisAmount);
            result.append(NEW_LINE);
        }
        return result.toString();
    }

}
