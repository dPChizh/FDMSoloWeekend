package FDMSoloProjectNew;

import java.util.ArrayList;
import java.util.List;

/**
 * Here are listed customers and transactions used at a 'bank';
 *
 * TODO: Create user input interaction for user to select account and amount they would like to deposit/withdraw.
 *
 */

public class Main {

    public static void main(String[] args) {

        Customer dc = new Customer(1, "Darryl", "Chizh", 000001, 0);
        Customer bs = new Customer (2, "Ben", "Smith", 00002, 5000);
        Customer js = new Customer (3, "Jennifer", "Smith", 10001, 2000);
        Customer ds = new Customer (4, "Danielle" , "Size", 99999, 1200);

        List <Customer> customerList = new ArrayList<>();
        customerList.add(dc);
        customerList.add(bs);
        customerList.add(js);
        customerList.add(ds);

        Transaction tOne = new Transaction(1, "Deposit", 500, 0.005);
        Transaction tTwo = new Transaction(2, "Withdrawal", 800, 0.012);
        Transaction tThree = new Transaction(3, "Withdrawal", 50, 0.005);
        Transaction tFour = new Transaction(4, "Deposit", 5050, 0.005);

        List<Transaction> transactionList = new ArrayList<>();
        transactionList.add(tOne);
        transactionList.add(tTwo);
        transactionList.add(tThree);
        transactionList.add(tFour);

        Bank WhiteSavings = new Bank (customerList, transactionList);

        //customer1.depositAmount(1000);

        System.out.println(dc + " Successfully deposited and now remaining balance in account: £"
                + dc.getBalance());




    }
}
