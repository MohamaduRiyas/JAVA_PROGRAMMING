import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        //System.out.println("Try programiz.pro");
        
        Scanner console = new Scanner(System.in);
        
       int n1 = console.nextInt();
       int n2 = console.nextInt();
       int n3 = console.nextInt();
       
       int sum = n1 + n2 + n3;
       
       if(sum == 180){
           System.out.println("Triangle is Valid");
       }
       
       else {
           System.out.println("Not Valid");
       }        
        
        
        console.close();
        
        
    }
}