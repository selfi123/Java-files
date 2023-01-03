import java.io.*;
import java.util.Scanner;
public class Student4{
int id;
String name;

void display()
{
System.out.println(id+""+name);

}
public static void main(String arg[])
{
Student4 s1=new Student4();
Student4 s2=new Student4();
s1.display();
s2.display();

}
}