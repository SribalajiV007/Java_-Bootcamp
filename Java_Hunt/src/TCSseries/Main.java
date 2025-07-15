package TCSseries;

class Bank{
    double getBankInterestRate(){
        return 4.0;    // base interest rate
    }
}

class SBI extends Bank{
    double getBankInterestRate(){
        return 5.4;
    }
}

class HDFC extends Bank{
    double getBankInterestrate(){
        return 7.6;
    }
}
public class Main{
    public static void  main(String[]args){
        Bank b1 = new SBI();
        b1.getBankInterestRate();
        Bank b2 = new HDFC();

        System.out.println(b1.getBankInterestRate());
        System.out.println(b2.getBankInterestRate());
    }
}