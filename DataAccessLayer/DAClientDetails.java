package DataAccessLayer;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import BusinessLogicLayer.*;

public class DAClientDetails {

    public List<Client> getClientDetails() throws IOException {

       
        String[] clientDetails = new String[3];
        List<Client> clientList = new ArrayList<Client>();
        //Client client;

        String name = "";
        String surname = "";
        String cellNumber = "";

        Scanner scn = new Scanner(System.in);

        FileWriter fileWriter = new FileWriter("C:\\Users\\Johan Strauss\\Documents\\Uni\\3rd Year\\PRG381\\Assignments & Project\\Project\\ClientDetails.txt",true);
        BufferedWriter bwriter = new BufferedWriter(fileWriter);

        System.out.println("Enter name:");
        clientDetails[0] = scn.nextLine();
        name = clientDetails[0];

        System.out.println("Enter surname:");
        clientDetails[1] = scn.nextLine();
        surname = clientDetails[1];

        System.out.println("Enter cell number:");
        clientDetails[2] = scn.nextLine();
        cellNumber = clientDetails[2];

        String Combined = name + "," + surname + "," + cellNumber + " \n";

        clientList.add(new Client(clientDetails[0],clientDetails[1],clientDetails[2]));

        bwriter.write(Combined);
        
        bwriter.close();
        scn.close();
     

        return clientList;
    }
}
