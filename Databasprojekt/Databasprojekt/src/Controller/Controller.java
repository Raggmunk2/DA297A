package Controller;

import java.util.Scanner;
import Model.Customer;
import Repository.CustomerRepository;

import java.sql.SQLException;
import java.util.ArrayList;

public class Controller {

  Scanner scan = new Scanner(System.in);
  public Controller () throws SQLException {

   /*CustomerRepository customerRepository = new CustomerRepository();
    //lite test för att skapa en array med alla customers (studenter i nuläget)
    ArrayList<Customer> customers = customerRepository.getCustomers();
    System.out.println(customers.toString());

    Customer customer2 = customerRepository.getCustomer("Enric");
    System.out.println(customer2);

    //testa att skapa en customer med ett förnamn
    Customer customer = new Customer("Victor");
    customerRepository.createCustomer(customer);*/

    showUserOrAdmin();
  }
  public void showUserOrAdmin(){

    System.out.print("Welcome!\nWould you like to log in as a customer or an admin?\nCustomer: 0\nAdmin:1\n");
    int usertype = scan.nextInt();
    if(usertype == 0){
      System.out.println("Do you have an already existing account?\nYes: 0\nNo: 1");
      int account = scan.nextInt();
        if(account == 0){
          System.out.println("Please log in!\nUsername:");
          String cUserName = scan.nextLine();
          scan.nextLine();
          System.out.println("Password:");
          scan.nextLine();
          String cPassword = scan.nextLine();
        }
        else if(account == 1){
          createNewCusAccount();
        }
      cMenu();
    }
    if(usertype == 1){
      System.out.println("Please log in!\nUsername:\n");
      String aUserName = scan.nextLine();
      scan.nextLine();
      System.out.println("Password:\n");
      String aPassword = scan.nextLine();
      scan.nextLine();
      aMenu();
    }
  }

  private void createNewCusAccount() {
    Scanner scan = new Scanner(System.in);
    // skapa nytt customer-konto
    System.out.println("Please enter you information");
    System.out.println("Firstname:");
    String firstName = scan.nextLine();
    System.out.println("Lastname:");
    String lastName = scan.nextLine();
    System.out.println("Email:");
    String email = scan.nextLine();
    System.out.println("Address:");
    String address = scan.nextLine();
    System.out.println("City:");
    String city = scan.nextLine();
    System.out.println("Country:");
    String country = scan.nextLine();
    System.out.println("Phone number:");
    String telNo = scan.nextLine();
    System.out.println("You are now logged in");

    cMenu();
  }

  private void aMenu() {
    System.out.println("What would you like to do?\nSee Products: 1\nAdd Products: " +
            "2\nErase Products: 3\nSee Discounts: 4\nAdd Discounts: 5\nSee suppliers: 6" +
            "\nSee & accept Orders: 7\nSee Stock count: 8\n Go back to main menu: 0");
    int aChoice = scan.nextInt();
    switch (aChoice) {
      case 1:
        //see products
        break;
      case 2:
        //add products
        break;
      case 3:
        //erase products
        break;
      case 4:
        //see discounts
        break;
      case 5:
        //add discounts
        break;
      case 6:
        //see suppliers
        break;
      case 7:
        //see and accepts orders
        break;
      case 8:
        //see stock count
        break;
      case 0:
        showUserOrAdmin(); // go back to main menu
        break;
    }
  }

  private void cMenu() {
    System.out.println("What would you like to do?\nSee Products & description: 1\nMake a search: " +
            "2\nSee discounted Products: 3\nAdd products to shopping list: 4\nView shopping list & pay: 5\nSee orders: 6" +
            "\nErase Order: 7\nLog out: 0");
    int aChoice = scan.nextInt();


    switch (aChoice) {
      case 1:
        //see products & description
        break;
      case 2:
        //Make a search
          System.out.println("What would you like to search for?\nProduct by product id: 1\nProduct by name: 2\n" +
                  "Product by supplier: 3\nProduct by price: 4\nDiscounted products by date: 5\nGo back to the menu: 0");
        int searchChoice = scan.nextInt();

          switch (searchChoice){
            case 1:
              //see products by id
              break;
            case 2:
              // products by name
              break;
            case 3:
              //products by supplier
              break;
            case 4:
              //products by price
              break;
            case 5:
              //discounted products by date
              break;
            case 0:
              cMenu(); // back to the menu
              break;
          }

      case 3:
        //See discounted Products
        break;
      case 4:
        //Add products to shopping list
        break;
      case 5:
        //View shopping list
        break;
      case 6:
        //see orders
        break;
      case 7:
        //Erase Order
        break;
      case 0:
        System.out.println("Thank you! See you soon!");
        showUserOrAdmin(); // go back to main menu
        break;

    }
  }
}
