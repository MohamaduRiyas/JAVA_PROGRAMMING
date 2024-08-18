import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        //System.out.println("Try programiz.pro");
        
        Scanner console = new Scanner(System.in);
        
       int time = console.nextInt();
       int amt;
      
       
       if(time >=2 && time <=3){
           
           System.out.println("Highly efficient");
       }
       
       else if(time >3 && time <=4)
       {
           
           System.out.println("Improve speed");
       }
       else if(time >4 && time <=5)
       {
           
           System.out.println("given training to improve his speed ");
        
       }
       
       else{
           System.out.println("The worker has to leave the company");
       }
               
        
        
        console.close();
        
        
    }
}