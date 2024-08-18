import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        //System.out.println("Try programiz.pro");
        
        Scanner console = new Scanner(System.in);
        
       int days = console.nextInt();
       int amt;
      
       
       if(days >0 && days <=5){
           amt = (int) 0.50 * days;
           System.out.println("Fine Is." + amt);
       }
       
       else if(days >=6 && days <=10)
       {
           amt = 1 * days;
           System.out.println("Fine Is ." + amt);
       }
       else if(days >= 10)
       {
           amt = 5 * days;
           System.out.println("Fine Is "+ amt);
           if(days > 30) {
           System.out.println("Membership is Cancelled");}
       
       }
       
       else{
           System.out.println("Invalid");
       }
             
        console.close();
        
        
    }
}