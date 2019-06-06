package com.twu.biblioteca;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MenuTest {

    Menu menu = new Menu();

    @Test
    public void shouldReturnWelcomeMessage() {

        String actual = menu.welcomeMessage();
        String expected = "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";

        assertThat(actual, is(equalTo(expected)));
    }
}
