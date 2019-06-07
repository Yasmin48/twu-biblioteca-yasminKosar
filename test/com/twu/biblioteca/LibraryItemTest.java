package com.twu.biblioteca;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;

public class LibraryItemTest {

    String title = "Little Miss Sunshine";
    int year = 1981;
    boolean onLoan = false;

    LibraryItem item = new LibraryItem(title, year, onLoan);

    @Test
    public void shouldReturnName() {
        String expected = item.getTitle();
        assertThat(expected, is(equalTo(title)));
    }

    @Test
    public void shouldReturnYear(){
        int expected = item.getYear();
        assertThat(expected, is(equalTo(year)));
    }

    @Test
    public void shouldReturnOnLoan() {
        boolean expected = item.getOnLoan();
        assertThat(expected, is(equalTo(onLoan)));
    }

    @Test
    public void shouldSetOnLoan() {
        item.setOnLoan(true);
        assertThat(true, is(item.getOnLoan()));
    }
}


