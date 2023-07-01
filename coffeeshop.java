import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class coffeeshop implements ActionListener {
JFrame f;
JPanel p;
JRadioButton r1,r2,r3;
JCheckBox c1,c2,c3;
Label l1,l2,l3,l4;
JTextField t1,t2,t3;
Font ff,fff;
JButton b1,b2;

double a=0, b=0,c=0,d=0,e1=0 ;

coffeeshop(){
f=new JFrame();
f.setLayout(null);
p=new JPanel();
ff=new Font("Times new Roman", Font.BOLD,40);
fff=new Font("Times new Roman", Font.BOLD,25);
p.setLayout(null);
p.setBounds(10,10,590,590);
//p.setBackground(Color.pink);
f.add(p);

l1=new Label("COFFEE SHOP");
l1.setBounds(90,10,500,40);
p.add(l1);
l1.setFont(ff);


r1=new JRadioButton("Coffee  ($25)",false);
r1.setBounds(50,100,180,25);
r1.setFont(fff);
p.add(r1);
r2=new JRadioButton("Cappuccino  ($35)",false);
r2.setBounds(50,150,250,25);
r2.setFont(fff);
p.add(r2);
r3=new JRadioButton("Tea  ($20)",false);
r3.setBounds(50,200,160,25);
r3.setFont(fff);
p.add(r3);


ButtonGroup bg=new ButtonGroup();
bg.add(r1);
bg.add(r2);
bg.add(r3);


c1=new JCheckBox("Bagels  ($5)");
c1.setBounds(330,100,160,25);
c1.setFont(fff);
p.add(c1);

c2=new JCheckBox("Croissant  ($8)");
c2.setBounds(330,150,200,25);
c2.setFont(fff);
p.add(c2);

c3=new JCheckBox("Toast  ($6)");
c3.setBounds(330,200,160,25);
c3.setFont(fff);
p.add(c3);

b1=new JButton("Create Bill");
b1.setBounds(160,510,110,20);
p.add(b1);

b2=new JButton("Clear");
b2.setBounds(300,510,110,20);
p.add(b2);

b1.addActionListener(this);
b2.addActionListener(this);


l2=new Label("SubTotal");
l2.setBounds(150,340,150,25);
l2.setFont(fff);
p.add(l2);

l3=new Label("Tax");
l3.setBounds(150,390,150,25);
l3.setFont(fff);
p.add(l3);

l4=new Label("Total");
l4.setBounds(150,440,150,25);
l4.setFont(fff);
p.add(l4);

t1=new JTextField();
t1.setBounds(300,340,150,25);
t1.setFont(fff);
p.add(t1);

t2=new JTextField();
t2.setBounds(300,390,150,25);
t2.setFont(fff);
p.add(t2);

t3=new JTextField();
t3.setBounds(300,440,150,25);
t3.setFont(fff);
p.add(t3);


f.setSize(600,600);
f.setVisible(true);

}

public void actionPerformed(ActionEvent e){
if(e.getSource()==b1){
if(r1.isSelected()==true){
a=25;
}

if(r2.isSelected()==true){
a=35;
}

if(r3.isSelected()==true){
a=20.0;
}
System.out.println(a);

if(c1.isSelected()==true){
b=5.0;
}

if(c2.isSelected()==true){
b=b+8.0;
}


 if(c3.isSelected()==true){
b=b+6.0;
}
System.out.println(b);
 c=a+b;
 d=0.18*c;
 e1=c+d;
t1.setText(String.valueOf(c));
t2.setText(String.valueOf(d));
t3.setText(String.valueOf(e1));
}

if(e.getSource()==b2){
JOptionPane.showMessageDialog(null,"i am working");
r1.setSelected(false);
r2.setSelected(false);
r3.setSelected(false);
c1.setSelected(false);
c2.setSelected(false);
c3.setSelected(false);
t1.setText("");
t2.setText("");
t3.setText("");
}

}

public static void main(String[] args){
coffeeshop obj=new coffeeshop();
}

}