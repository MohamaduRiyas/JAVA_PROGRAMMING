import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        //System.out.println("Try programiz.pro");
        
        Scanner console = new Scanner(System.in);
        
        float hardness = console.nextFloat();
        float carbon = console.nextFloat();
        float tensile = console.nextFloat();
        
        
        
        if(hardness > 50 && carbon < 0.7 && tensile > 5600){
            System.out.println("Grade:'10'");
        }
        else if(hardness > 50 && carbon < 0.7){
            System.out.println("Grade:'9'");
        }
        else if(carbon < 0.7 && tensile > 5600){
            System.out.println("Grade:'8'");
        }
        else if(hardness > 50 && tensile > 5600){
            System.out.println("Grade:'7'");
        }
        else if(hardness > 50 || carbon < 0.7 || tensile > 5600){
            System.out.println("Grade:'6'");
        }
        else {
            System.out.println("Grade:'5'");
        }
        
        
        
        
        
        
        
    }
}