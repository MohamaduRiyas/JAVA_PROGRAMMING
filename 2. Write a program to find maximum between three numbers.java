import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner console = new Scanner(System.in);
        
        int a = console.nextInt();
        int b = console.nextInt();
        int c = console.nextInt();
        
        if(a > b && a > c){
            System.out.println("A is greater");
        }
        else if(b > c){
            System.out.println("B is greater");
        }
        else{
            System.out.println("C is greater");
        }
    }
}