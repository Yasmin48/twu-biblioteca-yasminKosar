package com.twu.biblioteca;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MenuTest {

    Menu menu = new Menu();
    User[] users = {
            new User("Yasmin","123 4567","password", "email@hotmail.com", "023 4567"),
            new User("Jade","456 1234","Password", "email@gmal.com", "123 4567")
    };


    @Test
    public void shouldReturnWelcomeMessage() {

        String actual = menu.welcomeMessage();
        String expected = "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";

        assertThat(actual, is(equalTo(expected)));
    }


}
