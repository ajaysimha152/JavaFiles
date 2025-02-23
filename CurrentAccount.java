public class CurrentAccount extends BankAccount {
    private int overdraftLimit;
    public CurrentAccount(int accountNumber,int balance,int overdraftLimit){
        super(accountNumber, balance);
    }
    @Override
    public void  withdraw(int amount){
        if(getBalance()+overdraftLimit>=amount){
            System.out.println("Withdral approver overdraft used="+(amount-getBalance()));
        }
        else{
            System.out.println("Overdraft limit Exceeded");
        }
    }
    
}
