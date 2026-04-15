/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */




/**
 *
 * @author lab_services_student
 */
import org.junit.Test;
import static org.junit.Assert.*;

public class LoginTest {

    Login login = new Login();

    @Test
    public void testCorrectUsername() {
        assertTrue(login.checkUserName("kyl_1"));
    }

    @Test
    public void testIncorrectUsername() {
        assertFalse(login.checkUserName("kyle!!!!"));
    }

    @Test
    public void testCorrectPassword() {
        assertTrue(login.checkPasswordComplexity("Ch&&sec@ke99!"));
    }

    @Test
    public void testIncorrectPassword() {
        assertFalse(login.checkPasswordComplexity("password"));
    }

    @Test
    public void testCorrectPhone() {
        assertTrue(login.checkCellPhoneNumber("+27838968976"));
    }

    @Test
    public void testIncorrectPhone() {
        assertFalse(login.checkCellPhoneNumber("08966553"));
    }

    @Test
    public void testRegisterSuccess() {
        String result = login.registerUser("kyl_1", "Ch&&sec@ke99!", "+27838968976");
        assertEquals("User successfully registered.", result);
    }

    @Test
    public void testRegisterUsernameFail() {
        String result = login.registerUser("wrong", "Ch&&sec@ke99!", "+27838968976");
        assertEquals("Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters in length.", result);
    }

    @Test
    public void testLoginSuccess() {
        login.registerUser("kyl_1", "Ch&&sec@ke99!", "+27838968976");
        assertTrue(login.loginUser("kyl_1", "Ch&&sec@ke99!"));
    }

    @Test
    public void testLoginFail() {
        login.registerUser("kyl_1", "Ch&&sec@ke99!", "+27838968976");
        assertFalse(login.loginUser("wrong", "1234"));
    }
}