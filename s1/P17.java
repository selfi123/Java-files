import java.util.*;
import java.util.Scanner;
import java.util.Collection.*; 
public class P17{

public static void main(String args[])
{
ArrayList<String> list=new ArrayList<String>(3);
list.add("abhijith");
list.add("joyal");
list.add("appu");
Iterator<String> itr=list.iterator();
while(itr.hasNext())
 System.out.println(itr.next());
}
}

