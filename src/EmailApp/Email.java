package EmailApp;

import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName;
    private String department;
    private String password;
    private int defaultPasswordLangth = 15;
    private String email;
    private String campany = "speaxcompany.com";
    private String alternateEmail;
    private int mailboxCapacity = 50;

    //constructor for recieve frisname lastname
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        
        //calling setDeparment 
        this.department = setDepartment();
      

        // call set Randam Password
        this.password = randamPassword(defaultPasswordLangth);
        System.out.println("Your Password is :" + this.password);

        // make email 
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "." + "@" + department + "." + campany;
        

    }

    //Ask For Department
    public String setDepartment() {
        System.out.print("DEPARTMENT COOD\n1 for Sales\n2 for Devolpment\n3 for Accounting\n0 for none\nENTER Department Cood : ");
        Scanner in = new Scanner(System.in);
        int dpn = in.nextInt();
        if (dpn == 1) {
            return "Sales";
        } else if (dpn == 2) {
            return "Devolpment";
        } else if (dpn == 3) {
            return "Accounting";
        } else {
            return " ";
        }
    }

    //Generate a randam Password
    public String randamPassword(int capacity) {

        char[] password = new char[capacity];
        String randampassword = "ABCDEFGHIJKLMNOPQRSTUVWXYZ$@*&0236987412";

        for (int i = 0; i < capacity; ++i) {

            int randam = (int) (Math.random() * randampassword.length());
            password[i] = randampassword.charAt(randam);

        }
        return new String(password);
    }

    //set a mailboxCapacity
    public void setMailboxCapacity(int mailboxCapacity) {
        this.mailboxCapacity = mailboxCapacity;
    }
    //Set alternate email

    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }
    //Change password 

    public void ChangePassword(String password) {
        this.password = password;
    }

    public String getPassword() { return password;}

    public String getAlternateEmail() {return alternateEmail;}

    public int getMailboxCapacity() {  return mailboxCapacity;}

    public String show_Info() {

        return "DISPLAY NAME IS: " + firstName + " " + lastName + "\nCOMPANY EMAIL IS: " + email + "\nMAILBOXCAPCITY IS: " + mailboxCapacity + "MB";

    }

}
