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
class Lion extends Dog{
void Lionsound(){
System.out.println("Roar Roar");
}
}
public class P12{
public static void main(String args[])
{
Dog d=new Dog();
Cat c=new Cat();
Lion l= new Lion();
d.Dogsound();
c.Catsound();
c.Dogsound();
l.Lionsound();
l.Dogsound();
}}
