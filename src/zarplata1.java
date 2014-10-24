import javax.swing.JFrame;			//Импорт класса JFrame из библиотеки Swing					

public class zarplata1 {										// Создание класса
	public static void main(String[] args) {					// Создание метода
		gui r = new gui("Зарплатный калькулятор");				// Создание формы и её заголовок
		r.setVisible(true);										// Задать видимость
		r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		// Закрывать окно при нажатии кнопки закрыть
		r.setSize (380, 330);									// Задать размер окна
		r.setResizable(false);									// Запретить изменение размера
		r.setLocationRelativeTo(null);							// Задать расположение окна
	}	
}
