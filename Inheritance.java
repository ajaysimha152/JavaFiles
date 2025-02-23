public class Inheritance {
    public static void main(String[]args){
        SavingsAcccount saving =new SavingsAcccount(100, 10000, 5);
        CurrentAccount cur =new CurrentAccount(101, 5000, 10000);
        saving.deposit(5000);
        saving.applyInterest();
        cur.withdraw(12000);
        System.out.println("Final Savings Balance="+saving.getBalance());
    }
    
}
