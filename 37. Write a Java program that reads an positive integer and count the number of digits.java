import java.util.*;

class Main{

    public static void main(String args[]){
    
        Scanner console = new Scanner(System.in);
        
        int n = console.nextInt();
        
        if(n<=0){
             System.out.println("Not Valid");
        }
        
        else{
        
        int count = 0;
        
        while(n > 0)
        {
            n = n / 10;
            count++;
        }
        
        
        System.out.println(count);
        
        }
        console.close();
    }
}
