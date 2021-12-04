class Bank{
    double balance;
    Bank(){
        this.balance = 0;
    }
    Bank(double amount){
        this.balance  = this.balance + amount;
    }

    double getBalance(){
        return 0;
    }
}

class BankA extends Bank{
    BankA(){
       super();
    }
    BankA(double amount){
        this.balance = this.balance + amount;
    }

    double getBalance(){
        return balance;
    }
}

class BankB extends Bank{
    BankB(){
        super();
    }
    BankB(double amount){
        this.balance = this.balance + amount;
    }

    double getBalance(){
        return balance;
    }
}
class BankC extends Bank{
    BankC(){
        super();
    }

    BankC(double amount){
        this.balance = this.balance + amount;
    }

    double getBalance(){
        return balance;
    }
}
public class assignment8 {
    public static void main(String[] args) {
        Bank banka = new BankA(1000);
        Bank bankb = new BankB(1500);
        Bank bankc = new BankC(2000);

        System.out.println(banka.getBalance());
        System.out.println(bankb.getBalance());
        System.out.println(bankc.getBalance());
    }
}
