import java.util.*;
class Dog{
void Dogsound(){
System.out.println("Bow bow");
}
}
class Cat extends Dog{
void Catsound(){
System.out.println("Meow Meow");

}
}
class Lion extends Cat{
void Lionsound(){
System.out.println("Roar Roar");
}
}
public class P11{
public static void main(String args[])
{
Lion l= new Lion();
l.Dogsound();
l.Catsound();
l.Lionsound();
}}
