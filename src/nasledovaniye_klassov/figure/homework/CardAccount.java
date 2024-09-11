package nasledovaniye_klassov.figure.homework;

public class CardAccount extends BankAccount{
    private static final double WITHDRAWL_FEE_PERCENT = 0.01;

    public CardAccount(double initialBalance){
        super(initialBalance);
    }
    @Override
    public void withdraw(double amount){
        double fee = amount * WITHDRAWL_FEE_PERCENT;
        double totalAmount = amount + fee;

        if(totalAmount <= balance){
            balance -= totalAmount;
            System.out.println("Withdrawn: " + amount + " (including fee: " + fee+ ")");
        }else{
            System.out.println("Insufficient balance to cover withdrawal and fees.");
        }
    }
}
