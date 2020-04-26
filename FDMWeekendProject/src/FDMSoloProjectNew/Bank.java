package FDMSoloProjectNew;

import java.util.List;

public class Bank {

    /**
     * Bank class shall contain number of customers on bank list alongside number of transactions
     * seen at the bank.
     *
     */

    private List<Customer> customerList;
    private List<Transaction> transactionList;
    private static int totalMoneyEarned;


    /**
     *
     *Bank object created and highlights customer base alongside transactions made/seen
     * within the bank.
     *
     * Also calculated is the banking fees 'total money earned' from banking transactions
     * made.
     *
     * TODO: Create interaction between deposits/withdrawals amounts and allocate into bank total money earned!!
     */

    public Bank (List<Customer> customerList, List<Transaction> transactionList){
        this.customerList = customerList;
        this.transactionList = transactionList;
        totalMoneyEarned = 0;
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void addCustomer(Customer customer) {
        customerList.add(customer);
    }

    public List<Transaction> getTransactionList() {
        return transactionList;
    }

    public void addTransaction(Transaction transaction) {
        transactionList.add(transaction);
    }

    public static int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public static void setTotalMoneyEarned(int totalMoneyEarned) {
        totalMoneyEarned += totalMoneyEarned;
    }
}
