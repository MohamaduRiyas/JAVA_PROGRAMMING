import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        //System.out.println("Try programiz.pro");
        
        Scanner console = new Scanner(System.in);
        
       int n1 = console.nextInt();
       int n2 = console.nextInt();
       int n3 = console.nextInt();
       
       if(n1 > n2 && n2 > n3){
           System.out.println("Decreasing Order");
       }
       else if(n1 < n2 && n2 < n3)
       {
           System.out.println("Increasing Order");
       }
       else {
           System.out.println("Neither Increasing nor Decreasing");
       }        
        
        
        console.close();
        
        
    }
}