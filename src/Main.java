import java.util.Scanner;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

    public static void main(String[] args) {
        BaseCustomerManager customerManager = new NeroCustomerManager();
        customerManager.save(new Customer(1, "Engin", "Demirog", "1986,1,6", "56389321984"));
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

    }
}
