import java.awt.*;    
  
public class P19 extends Frame {    
  
   P19() {
      Label l1=new Label("Username ");
      Label l2= new Label("password");
      TextField t1=new TextField();
      TextField t2=new TextField();
        
  
      Button b = new Button("Login");  
  
      l1.setBounds(30,100,100,30);  
      l2.setBounds(30,130,100,30);  
      t1.setBounds(150,100,120,30);  
      t2.setBounds(150,130,120,30);  
      b.setBounds(160,160,80,30);  
      add(l1);
      add(l2);
      add(t1);
      add(t2);
      add(b);  
  
      setSize(300,300);  
  
      setTitle("Login Screen");   
          
      setLayout(null);   
  
      setVisible(true);  
}    
  
public static void main(String args[]) {   
  
P19 f = new P19();    
  
}  
  
}                 
