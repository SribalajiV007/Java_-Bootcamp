package Oops_Concepts.Oops1;

 class Bank {
    int accountNumber;
    String accountHolder;
    double balance;

    Bank(int num, String name, double balance){
        accountNumber = num;
        accountHolder = name;
        this.balance = balance;
    }

     double getBalance(){
        System.out.print("Your Balance is: ");
        return balance;
    }

    void deposit(int amount){
        balance += amount;
        System.out.println("Amount deposited, Thank you");
    }

    void withdraw(int amount){
        if(balance >= amount){
            balance -= amount;
        }else{
            System.out.println("Sorry , Insuffient Balance");
        }
    }

    public static void main(String[]args){
        Bank SBI = new Bank(007012346,"Sri Balaji",77_00_237);

        SBI.deposit(7_00_000);
        System.out.println(SBI.getBalance());
        SBI.withdraw(5_00_000);
        System.out.println(SBI.getBalance());

    }
 }

