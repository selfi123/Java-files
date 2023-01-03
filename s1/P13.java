interface Printable{  
void print();  
}  
class Sound{
void Dog(){
System.out.println("Bow Bow");
}
}

class P13 extends Sound implements Printable{  
public void print()
{
System.out.println("Hello");
}  

public static void main(String args[]){  
P13 obj = new P13();  
obj.print(); 
obj.Dog(); 
}  
}  
