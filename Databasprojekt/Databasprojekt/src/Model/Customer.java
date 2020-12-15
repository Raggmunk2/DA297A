package Model;

public class Customer {

  private String username; //varchar10 (key)
  private String firstName; //varchar10
  private String lastName; //varchar30
  private String email; //varchar30
  private String phoneNumber; //varchar10

  public Customer(String firstName) {
    this.firstName = firstName;
  }

  public String getFirstName() {
    return firstName;
  }

  @Override
  public String toString() {
    return "Customer{" +
            "username='" + username + '\'' +
            ", firstName='" + firstName + '\'' +
            ", lastName='" + lastName + '\'' +
            ", email='" + email + '\'' +
            ", phoneNumber='" + phoneNumber + '\'' +
            '}';
  }
}
