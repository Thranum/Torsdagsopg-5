import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Customer customer1 = new Customer("Bob1", "James1", "Gigaman1");
        Customer customer2 = new Customer("Bob2", "James2", "Gigaman2");

        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(customer1);
        customers.add(customer2);

        printCustomers(customers);

    }
public static void printCustomers(ArrayList <Customer> customers){

        for(Customer allCustomers : customers) {
            System.out.println(allCustomers);
        }
    }
}