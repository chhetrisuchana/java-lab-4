 package INTERFACE;
 import java.util.Scanner;
 public class email implements Messaging {
    Scanner input=new Scanner(System.in);
    public String getMessage(){
        System.out.println("enter your message ");
        
        String message=input.nextLine();
        //input.close();
        return message;
    }
    public String getRecipient(){
        System.out.println("enter your email address");
        //Scanner input =new Scanner(System.in);
        String email=input.nextLine();
        //input.close();
        return email;
    }
    public void print(){
        String M=getMessage();
        System.out.println(M);
        String G=getRecipient();
        System.out.println(G);
    }
    public void printConnection(){
        System.out.println("connection successful");
    }
}

