package FDMSoloProjectNew;


/**
 *
 * Transaction class is responsible of storing transaction details; transactionID,
 * transactionTYPE and transactionAmount.
 *
 */
public class Transaction {

    private int id;
    private String type;
    private int amount;
    private double interestAmount;

    /**
     *
     * @param id - unique transaction identifier
     * @param type - ie withdrawal, deposit, payment.
     * @param amount - amount allocated to the transaction to/from the account
     */

    public Transaction(int id, String type, int amount, double interestAmount){
        this.id = id;
        this.type = type;
        this.amount = amount;
        this.interestAmount = interestAmount;
    }


    /**
     *
     * @return getters and setters in place to ensure hiding of transaction variables.
     */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    public double getInterestAmount(){
        return interestAmount;
    }
    public void setInterestAmount(){
        this.interestAmount = interestAmount;
    }


}
