package com.twu.biblioteca;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class UserTest {

    String name = "Yasmin";
    String libraryNo = "123 4567";
    String password = "Password";
    String email = "yasmin@gmail.com";
    String phone = "123 4567";

    User testUser = new User(name, libraryNo, password, email, phone);

    @Test
    public void shouldReturnName() {
        assertThat(testUser.getName(), is(equalTo(name)));
    }

    @Test
    public void shouldReturnLibraryNo() {
        assertThat(testUser.getLibraryNo(), is(equalTo(libraryNo)));
    }

    @Test
    public void shouldReturnPassword() {
        assertThat(testUser.getPassword(), is(equalTo(password)));
    }

    @Test
    public void shouldReturnEmail() {
        assertThat(testUser.getEmail(), is(email));
    }

    @Test
    public void shouldReturnPhone(){
        assertThat(testUser.getPhone(), is(phone));
    }

    @Test
    public void shouldSetName() {
        testUser.setName("Jade");
        assertThat("Jade", is(equalTo(testUser.getName())));
    }

    @Test
    public void shouldSeLibraryNo() {
        testUser.setLibraryNo("libraryNo");
        assertThat("libraryNo", is(equalTo(testUser.getLibraryNo())));
    }

    @Test
    public void shouldSetPassword() {
        testUser.setPassword("wordpass");
        assertThat("wordpass", is(equalTo(testUser.getPassword())));
    }

    @Test
    public void shouldSetEmail() {
        testUser.setEmail("test@hotmail.com");
        assertThat("test@hotmail.com", is(equalTo(testUser.getEmail())));
    }

    @Test
    public void shouldSetPhone() {
        testUser.setPhone("098 1234");
        assertThat("098 1234", is(equalTo(testUser.getPhone())));
    }
}

