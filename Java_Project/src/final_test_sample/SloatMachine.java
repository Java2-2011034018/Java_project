import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class MyCounter2 extends JFrame implements ActionListener{
	private JLabel[] labels;
	private JButton button2;
	private int[] numbers;
	
	public MyCounter2(){
		setSize(500,300);
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		labels = new JLabel[3];
		numbers = new int[3];
		
		for(int i = 0; i < 3 ; i++){
			labels[i] = new JLabel("" + numbers[i]);
			labels[i].setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 100));
			labels[i].setLocation(100 + 100*i, 20);
			panel.add(labels[i]);
		}
		
		button2 = new JButton("½ºÇÉ");
		button2.setSize(250, 50);
		button2.setLocation(100, 150);
		panel.add(button2);
		button2.addActionListener(this);
		
		add(panel);
		setTitle("My Game");
		
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent event){
		for(int i = 0; i < 3; i++){
			numbers[i] = (int) (Math.random() * 10);
			labels[i].setText(" " + numbers[i]);
		}
	}
}

public class SloatMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new MyCounter2();

	}

}
