package com.twu.biblioteca;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class UserTest {

    String name = "Yasmin";
    String username = "yasminkosar";
    String password = "Password";

    User testUser = new User(name, username, password);

    @Test
    public void shouldReturnName() {
        assertThat(testUser.getName(), is(equalTo(name)));
    }

    @Test
    public void shouldReturnUsername() {
        assertThat(testUser.getUsername(), is(equalTo(username)));
    }

    @Test
    public void shouldReturnPassword() {
        assertThat(testUser.getPassword(), is(equalTo(password)));
    }
}

