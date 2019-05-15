package com.step.movie_rentals;

class Movie {
	public void setMovieDetails(MovieDetails movieDetails) {
		this.movieDetails = movieDetails;
	}

	private MovieDetails movieDetails;
	private String title;


	Movie(String title, MovieDetails movieDetails) {
		this.title = title;
		this.movieDetails = movieDetails;
	}

	public MovieDetails getMovieDetails() {
		return movieDetails;
	}


	String getTitle() {
		return title;
	}
}

