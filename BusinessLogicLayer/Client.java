package BusinessLogicLayer;
import java.util.*;

public class Client {
    
    void getClientDetails(){

        String name;
        String surname;
        String cellNumber;

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter name:");
        name = scn.nextLine();

        System.out.println("Enter surname:");
        surname = scn.nextLine();

        System.out.println("Enter cell number:");
        cellNumber = scn.nextLine();
    }
}
