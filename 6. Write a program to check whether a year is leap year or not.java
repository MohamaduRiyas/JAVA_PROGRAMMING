import java.util.*;

class Main{
    public static void main(String args[]){
        
        
        Scanner console = new Scanner(System.in);
        
        int n1 = console.nextInt();
        
       if((n1 % 4 == 0 && n1 % 100 !=0) || (n1 %400 == 0))
       {
           System.out.println("Leap Year");
       }
       else
       {
           System.out.println("Not a Leap Year");
       }
        
        
        
        console.close();
         
    }
}