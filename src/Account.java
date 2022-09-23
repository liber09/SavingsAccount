public class Account {
double balance;
String name;

public Account(){
    balance = 0;
}
public Account(double balance){
    this.balance = balance;
}
public Account(String name, double balance){
    this.name = name;
    this.balance = balance;

}
public void withdraw(double amount){
    balance = balance - amount;
}
public void deposit(double amount){
    balance = balance + amount;
}
public String getName(){
    return name;
}
public void setName(String name){
    this.name = name;
}
public double getBalance(){
    return this.balance;
}
public String toString(){
    return "Kontot "+name+" har saldot "+String.format("%.2f",balance);
}
}
