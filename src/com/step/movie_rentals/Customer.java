package com.step.movie_rentals;

class Customer {

    private String name;
    private Rentals rentals;

    Customer(String name) {
        this.name = name;
        rentals = new Rentals();
    }

    void addRental(Rental rental) {
        rentals.addRental(rental);
    }

    private String getName() {
        return name;
    }

    String statement() {
        final String NEWLINE = "\n";
        int frequentRenterPoints = rentals.calculateFrequentRenterPoints();
        double totalAmount = rentals.calculateTotalAmount();

        String result = "Rental Record for " + getName() + NEWLINE;
        result += rentals.getRentalStatement();
        result += "Amount owed is " + totalAmount + NEWLINE;
        result += "You earned " + frequentRenterPoints + " frequent renter points";
        return result;
    }
}
