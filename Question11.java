import java.util.*;
class Question11{
    public static void main(String[] args){
    int number;
    Scanner st=new Scanner(System.in);
    number=st.nextInt();
    int result;
    while(number>0){
       result= number%10;     //appending remainder to result variable
       
       number=number/10;   //it will divide until quotient becomes less than n.
       System.out.print(result);
}
    
    


}




}