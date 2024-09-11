package nasledovaniye_klassov.figure.homework;

public class BankAccount {
    protected double balance;

    public BankAccount(double initialBalance){
        this.balance = initialBalance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Widthdrawn:" + amount);
        }else{
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
    public double getBalance(){
        return balance;
    }
}

