import java.util.*;
class Question19{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);    
        int base=sc.nextInt();
        int exponent=sc.nextInt();
        sc.close();
        int result=1;
        for(int i=0;i<exponent;i++){
            result*=base;
        }
        System.out.println(result);  
   }
}