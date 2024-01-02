package password_generator;
import java.util.*;
public class Password_generator { 
    public static void pass(int le,String co){
         char[] pass=new char[le];
        Random r=new Random();
        for(int i=0;i<le;i++){
            pass[i]=co.charAt(r.nextInt(co.length()));
        }
        System.out.println("your password is "+new String(pass));
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
      /*  String upper="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String low="abcdefghijklmnopqrstuvwxyz";
        String num="0123456789";
        String symbols="<>,.?/!@#$%^&*()_+=-{}[]";
        String com=upper+low+num+symbols;
        int len=4;*/
      Scanner s=new Scanner(System.in);
      System.out.println("enter a int ");
      int len=s.nextInt();
      System.out.println("enter a string ");
      String com=s.next();
      
      
      
        pass(len ,com);
       
    }
    
}
