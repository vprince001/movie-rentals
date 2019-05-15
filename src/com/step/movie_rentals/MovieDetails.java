package com.step.movie_rentals;

class MovieDetails {
    static final MovieDetails REGULAR = new MovieDetails(2,2,1.5);
    static final MovieDetails NEW_RELEASE = new MovieDetails(0,0,3);
    static final MovieDetails CHILDREN = new MovieDetails(1.5,3,1.5);

    private final double baseRent;
    private final int baseDays;
    private final double finePerDay;

    private MovieDetails(double baseRent, int baseDays, double finePerDay) {
        this.baseRent = baseRent;
        this.baseDays = baseDays;
        this.finePerDay = finePerDay;
    }

    double getBaseRent() {
        return baseRent;
    }

        int getBaseDays() {
        return baseDays;
    }

    double getFinePerDay() {
        return finePerDay;
    }
}
