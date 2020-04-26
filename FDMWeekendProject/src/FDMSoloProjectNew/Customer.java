package FDMSoloProjectNew;

public class Customer {

    /**
     * Fields below highlight blueprint of customer class to be used in this simple
     * banking management system.
     */

    private int id;
    private String firstName;
    private String lastName;
    private int accountID;
    private static int balance;


    /**
     *
     * @param id unique customer identifier - Every customer would be given an identifier.
     * @param firstName - customer first name.
     * @param lastName - customer last name.
     * @param accountID - unique account identifier.
     * @param balance - initial balance amount customer places within the account.
     */


    //A little validation for accountID and balance to ensure inputs complied with banking validation.
    public Customer(int id, String firstName, String lastName, int accountID, int balance) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;

        if(accountID > 99999){
            System.out.println("Invalid account number - Please try again");
        }else {
            this.accountID = accountID;
        }
        if(balance < 500){
            System.out.println("Minimum bank balance is £500 - Please enter valid amount");
        }else{
            this.balance = balance;
        }

    }
    /**
     *
     * @return below getters and setters are created to allow for field variables to be
     * set and obtained from the class. This also promotes one key design principle -
     * Encapsulation -
     * Protects and restricts access to the variable from different classes and accessible
     * only via methods.
     *
     */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public int getBalance() {
        return balance;
    }

    public static void depositAmount(int amount) {
        balance += amount;
    }
    public static void withdrawAmount(int amount){
        balance -= amount;
    }


    @Override
    public String toString() {
        return "Customer: " + firstName + " "+ lastName +
                " - ";
    }
}
