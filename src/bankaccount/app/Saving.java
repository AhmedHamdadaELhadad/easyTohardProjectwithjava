package bankaccount.app;

public class Saving extends Account {

    // List of same properties of saving 
    private int safetyDepositBOXID;
    private int safteyDepositBOKKEY;

    //  constructor to set some  Saving properties 
    public Saving(String name, String sSN, double intiDepsit) {
        super(name, sSN, intiDepsit);
        accountNumber = "1" + accountNumber;
    
        safetyDepositBOX();  
        
        
    }

    //List Sanving  method 
    
    @Override
    public void setRate() {
            rate=getRate()-.20;
    }
    
    
    
    private void safetyDepositBOX(){
    
        safetyDepositBOXID=(int)(Math.random()*Math.pow(10, 3));
    
        safteyDepositBOKKEY=(int)(Math.random()*Math.pow(10, 4));
    
    }
    
    
     public void showInfo(){
    
    super.showInfo();
        System.out.println("Your Saving Acoount Features "+
                "\nsafety Deposit BOX ID: "+safetyDepositBOXID +
                "\nsafety Deposit BOX KEY: "+safteyDepositBOKKEY 
                
                );
            }

}
