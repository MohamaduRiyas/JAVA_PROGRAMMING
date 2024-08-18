import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        //System.out.println("Try programiz.pro");
        
        Scanner console = new Scanner(System.in);
        
       int n1 = console.nextInt();
       int n2 = console.nextInt();
       int n3 = console.nextInt();
       
       if(n1 == n2 && n2 == n3 && n3 == n1){
           System.out.println("All numbers are equal");
       }
       else if((n1 == n2) || (n2 == n3) || (n3 == n1))
       {
           System.out.println("Neither Equal");
       }
       else {
           System.out.println("Not Equal");
       }        
        
        
        console.close();
        
        
    }
}