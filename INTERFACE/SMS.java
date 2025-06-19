package INTERFACE;

import java.util.Scanner;
public class SMS implements Messaging {
Scanner input=new Scanner(System.in);
    public String getMessage(){
        System.out.println("enter the message to be displayed");
        
        String message=input.nextLine();
       // input.close();
        return message;

    }
    
    public String getRecipient(){
        System.out.println("enter your phone number");
        //Scanner ip =new Scanner(System.in);
        String phone=input.nextLine();
        //ip.close();
        return phone;
    }
    
    public void print(){
        String numb=getRecipient();
        System.out.println("your number is "+numb);
        String mesg=getMessage();
        System.out.println(mesg);

    }
    
    public void printConnection(){
        System.out.println("connection is successful");

    }

    
}


