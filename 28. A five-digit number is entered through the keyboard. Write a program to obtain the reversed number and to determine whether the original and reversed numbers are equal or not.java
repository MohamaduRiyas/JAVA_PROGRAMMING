import java.util.*;

class Main{

    public static void main(String args[]){
    
        Scanner console = new Scanner(System.in);
        int num = console.nextInt();
        int sum =0,rem,a=num;
        
        while(num >0)
        {
            rem = num % 10;
            sum = (sum*10) + rem;
            num = num /10;
        }
        if(a == sum)
        {
            System.out.println("Equal");
        }else{
            System.out.println("Not Equal");
        }
        
    }
}
