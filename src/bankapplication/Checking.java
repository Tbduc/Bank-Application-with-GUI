
package bankapplication;

/**
 *
 * @author Trung Bui Duc
 */
public class Checking extends Account {
    private static String accountType = "Checking ";
    
    Checking(double initialDeposit){
        this.setBalance(initialDeposit);
        this.checkInterest(0);
        this.setTransactionFee(5);
    };
    
    @Override
    public String toString() {
        return "Account Type: " + accountType + "Account\n" +
                "Account Number: " + this.getAccountNumber() + "\n" +
                "Balance: " + this.getBalance() + "\n" +
                "Interest rate: " + (this.getInterest() * 100) + "%\n";
    }
}