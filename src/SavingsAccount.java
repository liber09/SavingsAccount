public class SavingsAccount extends Account{
    private double interestRate;

    public SavingsAccount(double interestRate,double balance,String name) {
        super(name,balance);
        this.interestRate = interestRate;
    }
    public void addInterest(){
        double afterRate = balance * interestRate;
        balance = balance + afterRate;
    }
    public double getInterestRate(){
        return interestRate;
    }
}
