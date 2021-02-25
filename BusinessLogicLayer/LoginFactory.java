package BusinessLogicLayer;

public class LoginFactory{

    Client client;

    public Client GetEntry(int SignUp){

        switch (SignUp) {
            case 1:
                client.getClientDetails();
                break;
            case 2:
                System.out.println("-Weddings \n -Birthdays \n -Funerals \n -Other events you may want.");
        
            default:
                break;
        }
        return client;

    }
}