import java.util.*;
public class P7{
public static void main(String args[])
{
Student[] s=new Student[3];
s[0]= new Student("abhijith","Science",19);
s[1]= new Student("rohan","Commerce",20);
s[2]= new Student("appu","IT",18);

}
}
class Student
{
String name;
String course;
int age;
Student(String s,String c,int a)
{
this.name=s;
this.course=c;
this.age=a;
System.out.println("\nName : "+name+"\nCourse : "+course +"\nAge: "+age+"\n\n");

}
}

