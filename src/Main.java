import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
     Account evasKonto = new Account("Evas konto",5000);
     Account pellesKonto = new Account("Pelles konto",10000);
     Account lisasKonto = new Account();
     Account arnesKonto = new Account(15000);


     System.out.println(lisasKonto);

    lisasKonto.setName("Lisas Konto");
    System.out.println(lisasKonto);

    pellesKonto.withdraw(5000);
    System.out.println(pellesKonto);

    pellesKonto.deposit(7895.31);
    System.out.println(pellesKonto);

    System.out.println(evasKonto+"\n"+pellesKonto+"\n"+lisasKonto+"\n"+arnesKonto);
    
    }
}