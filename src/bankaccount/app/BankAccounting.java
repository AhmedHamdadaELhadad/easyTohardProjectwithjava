
package bankaccount.app;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;


public class BankAccounting {
       public static void main(String[] args) throws IOException {
       String file="E:\\JAVA\\Java1\\JavaProject\\src\\3of java project\\NewBankAccounts.csv";
       /*Checking checking =new Checking("ahmed","12596371",12000);
       //Saving saving=new Saving("Mohmed","74859632",2130);
       
       
       checking.compound();
       
       checking.showInfo();
       
       System.out.println("****************************************************");
      // saving.showInfo();*/
       
       
       
       List <String []> dataCustomer=bankaccount.app.UTILS.ReadCsv.read(file);
       List<Account>listAccount=new LinkedList<Account>();
       for(String[] dataShow :dataCustomer)
       {
           
           
           String name=dataShow[0];
           String Ssn=dataShow[1];
           String accounType=dataShow[2];
           double despoite=Double.parseDouble(dataShow[3]);
           if(accounType.equals("Savings"))
           listAccount.add(new Saving(name,Ssn,despoite));
           else if (accounType.equals( "Checking" ))
                listAccount.add(new Checking(name,Ssn,despoite));
               else
               System.out.println("ERROR READING ACCOUNT TYPE");
       
       }
       
       
       for(Account showAccount:listAccount)
       {
          
           System.out.println("Information for customer ");
           showAccount.showInfo();
           System.out.println("******************************");
       }
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       }
}
