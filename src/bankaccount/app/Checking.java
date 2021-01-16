package bankaccount.app;

public class Checking extends Account {

    //List properites for  Checking Account 
   private int debitCardNumber;
   private int debitCardPIN;

    //  constructor to set some  Checking  properties 
    public Checking(String name, String sSN, double intiDepsit) {
        super(name, sSN, intiDepsit);

        accountNumber = "2" + accountNumber;
        //calling set method 
        setDebitCard();

    }

    //List of  Checking  method 



    @Override
    public void setRate() {
       rate=getRate()*.15;
    }




    private void setDebitCard() {

        debitCardNumber = (int) (Math.random() * Math.pow(10, 12));
        debitCardPIN = (int) (Math.random() * Math.pow(10, 4));

    }

    public void showInfo() {

        super.showInfo();
        System.out.println("Your Checking Acoount Features "
                + "\nDebit Card Number: " + debitCardNumber + 
                "\nDebit Card PIN: " + debitCardPIN);
    }

}
