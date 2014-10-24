import javax.swing.*;						
import java.awt.*;								
import java.awt.event.*;				

public class gui extends JFrame{				
	JButton b1, b2;								
	JLabel l1, l2, l3, l4, l5, l6;				
	JTextField t1, t2, t3, t4;				
	Float i, k, l, m, n;						
	String a, b;							
	eHandler handler = new eHandler();			
	
	public gui (String s) {						
		super (s);								

		l1 = new JLabel ("Ставка, рублей/час ");	
		t1 = new JTextField (10);					
		l2 = new JLabel ("Премия, % ");				
		t2 = new JTextField (10);					
		l3 = new JLabel ("Отработано, часов ");		
		t3 = new JTextField (10);					
		l4 = new JLabel ("Сверхурочно, часов ");	
		t4 = new JTextField (10);					
		b1 = new JButton ("Рассчитать");			
		b2 = new JButton ("Очистить");				
		l5 = new JLabel ("");						
		l6= new JLabel ("");						
		
		add(l1);						
		l1.setLocation(10, 10);			
		l1.setSize(170, 40);			
		add(t1);						
		t1.setLocation(190, 10);		
		t1.setSize(170, 40);			
		add(l2);						
		l2.setLocation(10, 60);			
		l2.setSize(170, 40);			
		add(t2);						
		t2.setLocation(190, 60);		
		t2.setSize(170, 40);			
		add(l3);						
		l3.setLocation(10, 110);		
		l3.setSize(170, 40);			
		add(t3);						
		t3.setLocation(190, 110);		
		t3.setSize(170, 40);			
		add(l4);						
		l4.setLocation(10, 160);		
		l4.setSize(170, 40);			
		add(t4);						
		t4.setLocation(190, 160);		
		t4.setSize(170, 40);			
		add(b1);						
		b1.setLocation(10, 210);		
		b1.setSize(170, 40);			
		add(b2);						
		b2.setLocation(190, 210);		
		b2.setSize(170, 40);			
		add(l5);						
		l5.setLocation(10, 260);		
		l5.setSize(360, 40);			
		b1.addActionListener(handler);	
		b2.addActionListener(handler);	
		add(l6);						
		l6.setLocation(30, 30);			
		l6.setSize(170, 40);			
		setVisible(true);				
		}

	public class eHandler implements ActionListener{		
		public void actionPerformed(ActionEvent e){			
			try{											
				if(e.getSource()==b1){						
							
					k = Float.parseFloat(t1.getText());		
					l = Float.parseFloat(t2.getText());		
					m = Float.parseFloat(t3.getText());		
					n = Float.parseFloat(t4.getText());		
									
						i = (k * (m + 2 * n)) * ( 1 + l / 100);		
					
						a = "В этом месяце зарплата составляет " + i + " рублей";	

						l5.setText(a);							
						l6.setText("");							
						
					}
					if(e.getSource()==b2){						
						t1.setText(null);						
						t2.setText(null);						
						t3.setText(null);						
						t4.setText(null);						
						l5.setText("");							
						}
				} catch (Exception ex){							
					a = "Исходные данные некорректны";			
					l5.setText(a);								
					l6.setText("");								
				}
			}
		}
	}