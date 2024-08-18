import java.util.*;

class Main{

    public static void main(String args[]){
    
        Scanner console = new Scanner(System.in);
        
        int age = console.nextInt();
        char status = console.next().charAt(0);
        char gender = console.next().charAt(0);
        
        
        if(status == 'm' || status =='M'){
            System.out.println("Okayy");
        }
        else if((status =='u' && gender =='m' && age >= 30 )||(status =='U' && gender =='M' && age >= 30 ))
        {
             System.out.println("Okayy done");
        }
        else if((status =='u' && gender =='f' && age >= 25) ||(status =='U' && gender =='F' && age >= 25))
        {
             System.out.println("Okayy done uhh");
        }
        else{
             System.out.println("Invalid");
        }
        console.close();
    }
}
