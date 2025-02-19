import java.util.*;
class Question20{
    public static void main(String[] args){
    int number;
    Scanner st=new Scanner(System.in);
    number=st.nextInt();
    int count=0;
    while(number>0){
        number=number/10;
        count++;

}
System.out.println("no of digits in number:"+count);
}}