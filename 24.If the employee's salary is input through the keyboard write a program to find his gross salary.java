import java.util.*;

class Main{

    public static void main(String args[]){
    
        Scanner console = new Scanner(System.in);
        
        int salary = console.nextInt();
        float hra,da;
        
        if(salary < 1500)
        {
            hra = salary * 0.1f;
            da = salary * 0.9f;
        }
        else {
            hra = 500;
            da = salary * 0.98f;
        
        }
        System.out.println(salary+hra+da);
            
        console.close();
    }
}
