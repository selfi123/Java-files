import java.io.*;
import java.util.Scanner;
public class StringSubset {
   public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter the string : ");
      String s = sc.nextLine();
      int s_len = s.length();
      int temp = 0;
      System.out.println("The string entered is  " +s);
      String string_array[] = new String[s_len*(s_len+1)/2];
      for(int i = 0; i < s_len; i++) {
         for(int j = i; j < s_len; j++) {
            string_array[temp] = s.substring(i, j+1);
            temp++;
         }
      }
      System.out.println("The subsets of the string are: ");
      for(int i = 0; i < string_array.length; i++) {
         System.out.println(string_array[i]);
      }
   }
}