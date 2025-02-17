import java.util.*;
class Question11{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);    
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        sc.close();
        if(a>b && a>c){
            System.out.println("Largest number is  "+a);
        }
        else if(b>a && b>c){
            System.out.println("Largest element is"+b);

}
        else{
            System.out.println("Largest number is "+c);

}
  

 }
}