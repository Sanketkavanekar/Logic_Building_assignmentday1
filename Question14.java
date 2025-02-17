import java.util.*;
class Question14{
public static int fib(int a){
        if(a<=1){
            return a;
            
         }
        return(fib(a-1)+fib(a-2));
       }
    




public static void main(String[] args){
    int a=10;
    System.out.println(fib(a));    
        
    }
  }