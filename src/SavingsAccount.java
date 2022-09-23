public class SavingsAccount extends Account{
    private double interestRate; //the interestrate

    //Creates a object of type SavingsAccount
    public SavingsAccount(double interestRate,double balance,String name) {
        super(name,balance);
        this.interestRate = interestRate;
    }
    //Add interestRate to the balance
    public void addInterest(){
        double afterRate = balance * interestRate;
        balance = balance + afterRate;
    }
    //Return the interestRate
    public double getInterestRate(){
        return interestRate;
    }
    //Transfer money from one account to another account
    //takes the account and ammount as parameters
    //then prints the new balance on this account.
    public void transfer(Account transferToAccount,double amountToTransfer){
        if(this.balance >= amountToTransfer){
            transferToAccount.balance = transferToAccount.balance+amountToTransfer;
            this.balance = this.balance - amountToTransfer;
            System.out.println("Överföringen lyckades! Ditt nuvarande saldo är: "+this.balance);
        }
        else{
            System.out.println("Du har för lite pengar på kontot...");
        }


    }
}
