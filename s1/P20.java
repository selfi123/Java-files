import java.util.*;
import java.awt.event.*;
import javax.swing.*;
public class P20 implements ActionListener{

JFrame f=new JFrame();
JLabel l1=new JLabel("first number : ");
JLabel l2=new JLabel("second number : ");
JTextField t1=new JTextField();
JTextField t2=new JTextField();
JButton b=new JButton("next number");
P20(){

l1.setBounds(50,100,150,20);
l2.setBounds(50,130,150,20);
t1.setBounds(200,100,100,20);
t2.setBounds(200,130,100,20);
b.setBounds(125,190,150,20);

f.add(l1);
f.add(l2);
f.add(t1);
f.add(t2);
f.add(b);

b.addActionListener(this);
f.setLayout(null);
f.setVisible(true);
f.setSize(400,300);

}
public void actionPerformed(ActionEvent e)
{
int n=Integer.parseInt(t1.getText());
t2.setText(String.valueOf(n+1));
}
public static void main(String args[])
{
P20 p=new P20();
}
}
