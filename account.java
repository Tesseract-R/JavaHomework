import java.util.Random;
import java.util.Date;

public class account {
    private int id;
    private double balance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated;

    public void accountCreate(){
        this.id = new Random().nextInt(100);
        this.dateCreated = new Date();
    }

    public void accountCreate(int number, double money){
        this.id = number;
        this.balance = money;
    }

    public int getId(){
        return this.id;
    }
    public double getBalance(){
        return this.balance;
    }
    public double getAnnualInterestRate(){
        return this.annualInterestRate;
    }
    public void changeId(int number){
        this.id = number;
    }
    public void changeBalance(double money){
        this.balance = money;
    }
    public  void changeAnnualInterestRate(double rate){
        this.annualInterestRate = rate;
    }

    public Date getDateCreated(){
        return this.dateCreated;
    }
    public double getMonthlyInterestRate(){
        return this.annualInterestRate / 12;
    }
    public void withdraw(double money){
        this.balance -= money;
    }
    public void deposit(double money){
        this.balance += money;
    }
}
