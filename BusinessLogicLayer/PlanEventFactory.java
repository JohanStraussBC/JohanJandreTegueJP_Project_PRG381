package BusinessLogicLayer;

public class PlanEventFactory {
    Event event;

    public Event PlanMenu(int choice){

        switch (choice) {
            case 1://wedding
                event = new Wedding();
                break;
        
            case 2://bifday
                
                break;
        
            case 3://funeral
                
                break;
        
            case 4://other
                
                break;
        
            default:
                break;
        }
        return event;
    }
}
