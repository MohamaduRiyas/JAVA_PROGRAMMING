import java.util.*;

class Main{

    public static void main(String args[]){
    
        Scanner console = new Scanner(System.in);
        
        int quantity = console.nextInt();
        double quanprice = console.nextDouble();
        double total = quantity * quanprice;
        
        if(quantity > 100)
        {
            total = total - (total*0.10);
        }
        
        System.out.println(total);
        
        
        console.close();
    }
}
