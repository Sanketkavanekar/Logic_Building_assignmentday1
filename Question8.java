import java.util.*;
class Question8{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);    
        int a=sc.nextInt();
        int b=sc.nextInt();
        sc.close();
        int temp=a;
        a=b;
        b=temp;
            System.out.println(": a = " + a + ", b = " + b);
   }
}