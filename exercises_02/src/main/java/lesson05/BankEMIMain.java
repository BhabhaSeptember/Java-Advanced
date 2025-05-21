package lesson05;

public class BankEMIMain {

    public static void main(String[] args) {

        BankEMICalculator acct1 = new BankEMICalculator("jane", "aa1234", 1000);
        double EMIamt = acct1.getMonthlypayment();
        System.out.print("Account Monthly Payment: \nR" + EMIamt);
    }

}
