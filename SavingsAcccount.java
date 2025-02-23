//package CoreJava;
public class SavingsAcccount extends BankAccount{
    private int intrestRate;
    public SavingsAcccount(int accountNumber,int balance,int intrestRate){
        super(accountNumber,balance);
        this.intrestRate=intrestRate;
    }
    public void setIntrestRate(int rate){
        this.intrestRate=rate;
    }
    public int getIntrestRate(){
        return this.intrestRate;
    }
    public void applyInterest(){
        double intrestAmount=(getBalance()*getIntrestRate())/100.0;
        System.out.println("Balance After Adding intrest rate is equals to"+(getBalance()+intrestAmount));
    }
}
