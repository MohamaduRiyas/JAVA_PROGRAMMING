import java.util.*;

class Main{

    public static void main(String args[]){
    
        Scanner console = new Scanner(System.in);
        
        int year = console.nextInt();
        int jyear = console.nextInt();
        int diff = year - jyear;
        
        if(diff > 3)
        {
            
            System.out.println("bonus od 2500");
        }
        else
        {
            
            System.out.println("Invalid Year");
        }
            
        console.close();
    }
}
