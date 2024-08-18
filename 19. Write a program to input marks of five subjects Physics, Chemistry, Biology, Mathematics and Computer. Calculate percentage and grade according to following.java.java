import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner console = new Scanner(System.in);
       
        int physics = console.nextInt();
        int chemistry = console.nextInt();
        int biology = console.nextInt();
        int maths = console.nextInt();
        int computer = console.nextInt();
        
        int total = physics + chemistry + biology + maths + computer;
        System.out.println("The total is " + total);
        
        
        float avg = total / 5;
        System.out.println("The average is "+ avg);
        
        if(avg >=90){
            System.out.println("Grade A");
        }else if(avg >= 80){
            System.out.println("Grade B");
        }else if(avg >= 70){
            System.out.println("Grade C");
        }else if(avg >= 60){
            System.out.println("Grade D");
        }else if(avg >= 40){
            System.out.println("Grade E");
        }else{
            System.out.println("Grade F");
        }
       
        
    }
}




//System.out.println