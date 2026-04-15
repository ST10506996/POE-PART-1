/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lab_services_student
 */
import java.util.Scanner;
import login.Login;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Login login = new Login();

        System.out.print("Enter username: ");
        String username = input.nextLine();

        System.out.print("Enter password: ");
        String password = input.nextLine();

        System.out.print("Enter phone number: ");
        String phone = input.nextLine();

        // Register
        String result = login.registerUser(username, password, phone);
        System.out.println(result);

        // Login
        System.out.print("Login username: ");
        String loginUser = input.nextLine();

        System.out.print("Login password: ");
        String loginPass = input.nextLine();

        boolean success = login.loginUser(loginUser, loginPass);
        System.out.println(login.returnLoginStatus(success));
    }
}
