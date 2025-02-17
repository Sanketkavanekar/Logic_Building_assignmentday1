import java.util.*;
class Question16{
    public static void main(String[] args){
        int count=0, a;
        Scanner sc=new Scanner(System.in);    
        a=sc.nextInt();
        sc.close();
        
        for(int i=1;i<=a;i++){
            if(a%i==0){
                count++;       
           }
        }
        if(count==2){
            System.out.println("number is prime");
          } 
        else{
            System.out.println("number is not prime");


  }

  }
         
}
 