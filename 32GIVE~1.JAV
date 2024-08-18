import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        
        Scanner console = new Scanner(System.in);
        
        float length = console.nextInt();
        
        float breadth = console.nextInt();
        
        float area = length * breadth;
        
        float perimeter = 2 * (length + breadth);
        
        if(area > perimeter)
        {
            System.out.println("Area is greater.");
        }
        
        else {
            System.out.println("Perimeter is greater.");
        }
        
        
        
        
    }
}