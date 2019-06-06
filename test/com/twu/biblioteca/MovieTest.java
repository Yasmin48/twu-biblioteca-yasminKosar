package com.twu.biblioteca;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MovieTest {

    String name = "Black Panther";
    String director = "Ryan Coogler";
    int year = 2018;
    double rating = 8.5;

    Movie movie = new Movie(name, director, year, rating);

    @Test
    public void shouldReturnName() {
        assertThat(movie.getName(), is(name));
    }

    @Test
    public void shouldReturnDirector() {
        assertThat(movie.getDirector(), is(equalTo(director)));
    }

    @Test
    public void shouldReturnYear() {
        assertThat(movie.getYear(), is(equalTo(year)));
    }

    @Test
    public void shouldReturnRating(){
        assertThat(movie.getRating(), is(equalTo(rating)));
    }

}
