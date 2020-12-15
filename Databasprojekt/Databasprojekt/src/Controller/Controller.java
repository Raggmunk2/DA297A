package Controller;

import Model.Customer;
import Repository.CustomerRepository;

import java.sql.SQLException;
import java.util.ArrayList;

public class Controller {

  public Controller () throws SQLException {

    CustomerRepository customerRepository = new CustomerRepository();
    //lite test för att skapa en array med alla customers (studenter i nuläget)
    ArrayList<Customer> customers = customerRepository.getCustomers();
    System.out.println(customers.toString());

    Customer customer2 = customerRepository.getCustomer("Enric");
    System.out.println(customer2);

    //testa att skapa en customer med ett förnamn
    Customer customer = new Customer("Victor");
    customerRepository.createCustomer(customer);

  }
}
