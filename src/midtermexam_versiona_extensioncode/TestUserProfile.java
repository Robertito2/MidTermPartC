/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 *
 * @author robert
 */
public class TestUserProfile {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter you name");
        String name = keyboard.nextLine();
        System.out.println("Choose a genre from \"Comedy\", \"Drama\", \"Action\", \"Mystery\"");
        String genre = keyboard.next();
        System.out.println(name + " your profile has been created ");
    }
}
