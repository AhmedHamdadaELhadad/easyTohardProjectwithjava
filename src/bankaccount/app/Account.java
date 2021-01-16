package bankaccount.app;

public abstract class Account implements IRate {

    //List properites for  Saving and Checking Account 
    private String name;
    private String sSN;
    private double balance;
    protected String accountNumber;
    protected double rate;
    private static int index = 10101;

    // constructor to set base propreties and intilize properites 
    public Account(String name, String sSN, double intiDepsit) {

        this.name = name;
        this.sSN = sSN;
        balance = intiDepsit;

        ++index;
        //set account number 
        accountNumber = setAccountNumber();

        setRate();
    }

    //List common method 
    public abstract void setRate();

    public void compound() {
        double compondBlance = balance * (rate / 100);

        balance += compondBlance;
        System.out.println("Accrued Interest :$" + compondBlance);
        printBalance();
    }

    public void deposite(double amount) {
        balance += amount;
        System.out.println("Depositing : " + amount + "$");
        printBalance();
    }

    public void withdrow(double amount) {
        balance -= amount;
        System.out.println("Withdrowing :" + amount);
        printBalance();
    }

    public void transfer(String toWhere, double amount) {
        balance -= amount;
        System.out.println("Transfering " + amount + "$" + " to " + toWhere);
        printBalance();
    }

    public void printBalance() {

        System.out.println("Your Balance is now :" + balance + "$");
    }

    private String setAccountNumber() {
        String lasttwoSSN = sSN.substring(sSN.length() - 2);

        int uniqueID = index;
        int randamN = (int) (Math.random() * Math.pow(10, 3));

        return lasttwoSSN + uniqueID + randamN;

    }

    public void showInfo() {

        System.out.println("NAME: " + name + "\n"
                + "ACCOUNTNUMBER: " + accountNumber + "\n"
                + "BALANCE: " + balance
                + "\nRATE : " + rate + "%"
        );

    }
}
