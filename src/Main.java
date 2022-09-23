import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
     Account evasKonto = new Account("Evas konto",5000);
     Account pellesKonto = new Account("Pelles konto",10000);
     Account lisasKonto = new Account();
     Account arnesKonto = new Account(15000);
     Account majasKonto = new SavingsAccount(0.25,78000,"majasKonto");


     System.out.println(lisasKonto);

    lisasKonto.setName("Lisas Konto");
    System.out.println(lisasKonto);

    pellesKonto.withdraw(5000);
    System.out.println(pellesKonto);

    pellesKonto.deposit(7895.31);
    System.out.println(pellesKonto);

    System.out.println(evasKonto+"\n"+pellesKonto+"\n"+lisasKonto+"\n"+arnesKonto);

    System.out.println(majasKonto);
    System.out.print("Efter ränta på "+ ((SavingsAccount) majasKonto).getInterestRate()+"% så är saldot nu ");
    ((SavingsAccount) majasKonto).addInterest();
    System.out.println(majasKonto.getBalance());

    ((SavingsAccount) majasKonto).transfer(pellesKonto,6000);
    System.out.println(pellesKonto);

    Account annasKonto = new SavingsAccount(0.01,100000,"Annas konto");
    System.out.println(annasKonto);
    ((SavingsAccount) majasKonto).transfer(annasKonto,100000);
    ((SavingsAccount) majasKonto).transfer(annasKonto,10000);
    System.out.println(annasKonto);
    }
}