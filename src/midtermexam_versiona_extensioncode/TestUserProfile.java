/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 *
 * @author jeich
 */
public class TestUserProfile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enter your user id: ");
        String userId = sc.nextLine();
        System.out.println("Please select youre favourite genre: \n"
                + "Comedy\nDrama\nAction\nMystery");
        String genre = sc.nextLine();
        
        UserProfile user = new UserProfile(userId, genre);
        user.setUserID(userId);
        user.setGenre(genre);
        
        System.out.println("Your info has been receieved, thank you.");
        
        
    }
}
