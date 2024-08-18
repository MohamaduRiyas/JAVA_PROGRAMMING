import java.util.*;

class Main{

    public static void main(String args[]){
    
        Scanner console = new Scanner(System.in);
        
        int elect = console.nextInt();
        float total,bill,sur;
        
        if(elect <= 50){
            total = elect * 0.50f;
            sur = total * 0.2f;
            bill = total + sur;
            System.out.println(bill);
        }
        else if(elect <=150){
            total = elect * 0.75f;
            sur = total * 0.2f;
            bill = total + sur;
            System.out.println(bill);
        }
        else if(elect <=250)
        {
            total = elect * 1.20f;
            sur = total * 0.2f;
            bill = total + sur;
            System.out.println(bill);
        }
        else if(elect >250)
        {
            total = elect * 1.50f;
            sur = total * 0.2f;
            bill = total + sur;
            System.out.println(bill);
        }
        
        
    }
}
