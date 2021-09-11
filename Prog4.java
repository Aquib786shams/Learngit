import java.util.regex.*;
import java.util.*;

import java.util.Scanner;
class Prog4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your mail: ");
        String str = sc.nextLine(); //reads string.

        String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(str);
        try {
           
            if (matcher.matches()==true){
            System.out.println("VALID");
        }
            if( matcher.matches()==false)
            {boolean b=matcher.matches();
                throw new MyException2(b);// throwing exception if not valid
            }
        }catch(MyException2 e){
            System.out.println(e);

        }


    }
}


class MyException2 extends Exception{
    boolean str;
    MyException2(boolean str) {
        this.str=str;
    }
    public String toString(){
        return ("NOT VALID" ) ;
    }
}
hiiis