import java.util.*;
public class P14 {
public static void main(String[ ] args){

    try {
      int n=5/0;     
    System.out.println("Rest of the code in try block");  
    } catch (ArithmeticException e) {
      System.out.println("Can't divide by zero");
    }
  
    }
}
