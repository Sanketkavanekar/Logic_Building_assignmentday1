import java.util.*;
class Question18{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);    
        int celsius=sc.nextInt();
        sc.close();
        float fahreneit=(celsius *9/5)+32;
        System.out.println(fahreneit+"F");
   }
}