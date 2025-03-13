import java.util.List;

public class Invoice {

    private Customer customer;

    private List<Service> serviceList;

    private double totalAmount;

     public void addService(Service service){

         serviceList.add(service);
         totalAmount += service.getServiceCost();
    }
}
