package com.twu.biblioteca;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BookTest {

    String testTitle = "All About Love";
    String testAuthor = "Bell Hooks";
    int testYear = 2000;

    Book testBook = new Book(testTitle, testAuthor, testYear);

    @Test
    public void getsTitleOfBook(){
       assertThat(testBook.getTitle(), is(equalTo(testTitle)));
    }

    @Test
    public void getsAuthorOfBook() {
        assertThat(testBook.getAuthor(), is(equalTo(testAuthor)));
    }

    @Test
    public void getsYearOfBook(){
        assertThat(testBook.getYear(), is(equalTo(testYear)));
    }

    @Test
    public void testToStringMethod(){

        String expectedResult = "All About Love - Bell Hooks, 2000";

        assertThat(testBook.toString(), is(equalTo(expectedResult)));
    }
}

