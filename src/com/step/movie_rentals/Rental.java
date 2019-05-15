package com.step.movie_rentals;

public class Rental {

    private Movie movie;

    private int daysRented;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public int addFrequentRenterPoints() {
        if ((this.movie.getMovieDetails() == MovieDetails.NEW_RELEASE) && daysRented > 1) {
            return 1;
        }
        return 0;
    }

    int getDaysRented() {
        return daysRented;
    }

    Movie getMovie() {
        return movie;
    }

    double calculateRent() {
        double rent = this.movie.getMovieDetails().getBaseRent();
        int baseDays = this.movie.getMovieDetails().getBaseDays();
        double finePerDay = this.movie.getMovieDetails().getFinePerDay();

        if (this.daysRented > baseDays) {
            rent += (this.daysRented - baseDays) * finePerDay;
        }

        return rent;
    }


}