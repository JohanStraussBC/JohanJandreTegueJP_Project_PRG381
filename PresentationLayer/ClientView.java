package PresentationLayer;
import java.util.*;

import BusinessLogicLayer.Client;
import BusinessLogicLayer.LoginFactory;

public class ClientView {
    public static void main(String[] args) {

        LoginFactory factory = new LoginFactory(); 
        
        System.out.println("Welcome to Rachael's Event planning");
        Scanner scner = new Scanner(System.in);

        System.out.println("Dou you want to Sign Up?");

        System.out.println("Press: \n 1. Sign Up \n 2. List of Events we offer." );

        int choice = scner.nextInt();

        factory.GetEntry(choice);

        

        scner.close();

        
    }
}
