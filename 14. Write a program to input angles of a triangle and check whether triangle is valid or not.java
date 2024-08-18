import java.util.*;

class Main{
    public static void main(String args[]){
        
        
        Scanner console = new Scanner(System.in);
        
        int n = console.nextInt();
        int n1 = console.nextInt();
        int n2 = console.nextInt();
        
        int sum = 180;
        
        if(n+n1+n2 == 180 && n >0 && n1 > 0 && n2 > 0)
        {
            System.out.println("Valid Triangle");
        }
        
        else{
            System.out.println("Not Valid Triangle");
        }
    
        console.close();
         
    }
}