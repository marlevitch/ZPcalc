import javax.swing.JFrame;								

public class zarplata1 {										
	public static void main(String[] args) {					
		gui r = new gui("Зарплатный калькулятор");				
		r.setVisible(true);										
		r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		r.setSize (380, 330);									
		r.setResizable(false);									
		r.setLocationRelativeTo(null);							
	}	
}
