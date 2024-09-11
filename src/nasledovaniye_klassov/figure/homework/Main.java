package nasledovaniye_klassov.figure.homework;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(10000);
        bankAccount.deposit(500);
        bankAccount.withdraw(200);
        System.out.println("Balance: " + bankAccount.getBalance());

        DepositAccount depositAccount = new DepositAccount(15000);
        depositAccount.deposit(200);
        depositAccount.withdraw(1000);
        System.out.println("DepositAccount Balance: " + depositAccount.getBalance());

        CardAccount cardAccount = new CardAccount(2000);
        cardAccount.withdraw(100);
        System.out.println("CardAccount Balance: " + cardAccount.getBalance());
    }
}
