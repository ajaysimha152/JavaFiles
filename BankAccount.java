//package CoreJava;
public class BankAccount{
    private int accountNumber;
    private int balance;
    public BankAccount(int accountNumber,int balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    public void deposit(int amount){
        if(amount>0){
            System.out.println(("Initial Ammout="+this.balance));
            this.balance+=amount;
            System.out.println("Amount After deposite="+this.balance);
        }
        else{
            System.out.println("Please enter the valied deposit Amount");
        }
    }
    public void withdraw(int amount){
        if(this.balance>=amount){
            balance-=amount;
        System.out.println("Amount withdraw is completed current Amout is="+this.balance);
        }
        else{
            System.out.println("Insuficient Balance");
        }
    }
    public int getBalance(){
        return this.balance;
    }
}

