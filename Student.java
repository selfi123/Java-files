import java.io.*;
import java.util.scanner;
public class Student
{
Scanner sc=new Scanner(System.in);
public static void main(String args[])
{


void accept(){
int enrol_no,m1,m2,m3,total=0;
String name;
enrol_no=sc.nextInt();
sc.nextString();
name=sc.nextString();
}
Student sc=new Student();
void condition(int m1,int m2,int m3)
{
if(m1<50 && m2<50 && m3<50)
    total=0;
else
    total=m1+m2+m3;
}
public void display()
{
sc.accept();
sc.condition(60,70,80);
System.out.println("Name: "+name);
System.out.println("Enroll-no: "+enrol_no);
System.out.println("Student got pass mark in 3 subjects, that is Total: "+total);
}
sc.display();
}
}