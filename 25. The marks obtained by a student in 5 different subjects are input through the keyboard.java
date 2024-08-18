import java.util.*;

class Main{

    public static void main(String args[]){
    
        Scanner console = new Scanner(System.in);
        
        int m1 = console.nextInt();
        int m2 = console.nextInt();
        int m3 = console.nextInt();
        int m4 = console.nextInt();
        int m5 = console.nextInt();
        
        int avg = (m1+m2+m3+m4+m5) / 5;
        
        if(avg >= 60)
        {
            System.out.println("First Division");
        }
        else if(avg >=50 && avg <=59)
        {
            System.out.println("Second Division");
        }
        else if(avg >=40 && avg <=49)
        {
            System.out.println("Third Division");
        }
        
        else{
            System.out.println("Fail");
        }
        
        
            
        console.close();
    }
}
