package Repository;

import Controller.Driver;
import Model.Customer;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class CustomerRepository {

  //Jag la till lite test här för query, exempel få fram en lista av customer
  // och lägga dem i en array, och söka fram en enstaka
  //customer, samt skapa en customer härifrån. Här lägger vi till dina querys sen aida :) jag använde förra
  //databasen som test.

  Statement statement;

  public CustomerRepository() throws SQLException {
    Connection conn = Driver.getConnection();
    statement = conn.createStatement(); //en grej man måste göra för att kunna exekvera querys
  }

  public ArrayList<Customer> getCustomers() throws SQLException {
    String query = "SELECT Student.F_name from Student";

    ResultSet resultSet = statement.executeQuery(query);

    ArrayList<Customer> customers = new ArrayList<Customer>();

    while (resultSet.next()) {
      Customer customer = new Customer(resultSet.getString(1));
      customers.add(customer);
    }
    return customers;
  }

  public Customer getCustomer(String firstName) throws SQLException {
    String query = "SELECT Student.F_name from Student where F_name = '" +firstName +"'";
    ResultSet resultSet =  statement.executeQuery(query);

    if (resultSet.next() == true) {
      Customer customer = new Customer(resultSet.getString(1));
      return customer;
    }
    else {
      return null;
    }
  }

  public void createCustomer(Customer customer) throws SQLException {
    String query = "INSERT INTO Student (F_name) VALUES ('"+ customer.getFirstName()+"')";

    statement.executeQuery(query);

  }
}
