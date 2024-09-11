package nasledovaniye_klassov.figure.homework;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DepositAccount extends  BankAccount{
    private LocalDate lastDepositDate;

    public DepositAccount(double initialBalance){
        super(initialBalance);
        lastDepositDate = LocalDate.now();
    }

    @Override
    public void deposit(double amount){
        super.deposit(amount);
        lastDepositDate = LocalDate.now();
    }
    @Override
    public void withdraw(double amount){
        LocalDate currentDate = LocalDate.now();
        long daysSinceLastDeposit = ChronoUnit.DAYS.between(lastDepositDate,currentDate);

        if(daysSinceLastDeposit >= 30){
            super.withdraw(amount);
        }else{
            System.out.println("Cannot withdraw money within 30 days of the last deposit");
        }
    }
}
