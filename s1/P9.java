import java.util.*;
import java.util.Scanner;
class Amount{

static void withdraw(double total,double a,int op){
if(op==1)
{
double bal= total-a;
System.out.println("Balance amount : "+bal);

}
else if(op==2)
{
double bal= total+a;
System.out.println("Balance amount : "+bal);

}
else if(op==3)
{
System.out.println("Balance amount : "+total);

}
}
}
public class P9 extends Amount{

public static void main(String args[])
{
double amount,current;
P9 a1=new P9();

Scanner sc=new Scanner(System.in);
System.out.println("Enter the current amount in the bank: ");
current=sc.nextDouble();


System.out.println("1.Withdraw \n2.Deposit\n3.view balance");
System.out.println("choose the option: ");
int n=sc.nextInt();
if(n==1)
{
  System.out.println("Enter the amount you want to withdraw: ");
  amount=sc.nextDouble();
  withdraw(current,amount,n);
  
}
else if(n==2)
  {
    System.out.println("Enter the amount you want to deposit: ");
   amount=sc.nextDouble();
  withdraw(current,amount,n);
}
else if(n==3)
withdraw(current,0,n);
   

}
}

