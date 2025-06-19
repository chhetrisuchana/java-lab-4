package INTERFACE;
public class MessagingService {

   public static void main(String[] args) {
      Messaging var1 = new email();
      var1.print();
      var1.printConnection();
     Messaging var2 = new SMS();
      var2.print();
      var2.printConnection();
   }
}



