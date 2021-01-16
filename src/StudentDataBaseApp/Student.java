
package StudentDataBaseApp;

import java.util.Scanner;


public class Student {
   
    private String studentID;
    private String fristName;
    private String lastName;
    private String[] gradYear={"FristYear","SecondYear","ThirdTear","FourthYear"};
    private String courses="";
    private int totalBlance=0;
    private int costofCourse=600;
    private static int id=100;
    private byte Ngrad;
    // constructor  promot user :student name and year 
    public Student (){
    
    Scanner in =new Scanner(System.in);
        System.out.print("Enter frist Name : ");
        this.fristName=in.nextLine();
        System.out.print("Enter last Name : ");
        this.lastName=in.nextLine();
        System.out.print("1 - FristYear\n2 - SecondYear\n3 - ThirdTear\n4 - FourthYear\nEnter student class level: ");
         Ngrad=in.nextByte();
         //calling SETID for student 
         setStudenId();
         
     
    
    
    }
    //Generate ID
    private void setStudenId(){
    id++;
  
    this.studentID=Ngrad+"" +id;
    
    }
    
    
    //Enorll Course 
    public void Enorll(){
    
    do{
    
        System.out.print("Enter Course to enroll (Q to Quite ) " );
        Scanner in =new Scanner(System.in);
        String course=in.nextLine();
        if(!course.equals("Q"))
        {
        courses=courses+"\n"+course;
        totalBlance+=costofCourse;
  
        }
        else{break;}
        
    
    }
    while(1!=0);
       
    
    
    
    }
    //View balance 
    public void Viewblance(){
    
    
        System.out.println("Your Balance is "+totalBlance);
    
    
    }
    
    //pay tution
    public void Pay_tution(){
     System.out.print("Enter Your payment $ ");
    Scanner in =new Scanner(System.in);
    int pay=in.nextInt();
    totalBlance-=pay;
    System.out.println("Thank you payment $ "+pay);
    Viewblance();
    
    }
     
    //show status

    @Override
    public String toString() {
        return  "studentID " + studentID + "\nYour Name is : " + fristName + " " + lastName +
                "\ngradYear is " + gradYear[Ngrad] + "\nYour Courses is : " + courses + "\nYourBlance is : " + totalBlance ;
    }
    
    
    
    
    
}
