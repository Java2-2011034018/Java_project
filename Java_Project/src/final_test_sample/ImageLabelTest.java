package final_test_sample;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ImageLabelTest extends JFrame implements ActionListener {
	
	private JPanel panel;
	private JLabel label;
	private JButton button;
	
	public ImageLabelTest(){
		setTitle("�̹��� ���̺�");
		setSize(300,250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		label = new JLabel("�̹����� ���� �Ʒ� ��ư�� ��������");
		
		button = new JButton("�̹��� ���̺�");
		ImageIcon icon = new ImageIcon("icon.gif");
		button.setIcon(icon);
		button.addActionListener(this);
		panel.add(label);
		panel.add(button);
		
		add(panel);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ImageLabelTest t = new ImageLabelTest();

	}
	
	public void actionPerformed(ActionEvent e){
		ImageIcon apple = new ImageIcon("apple.gif");
		label.setIcon(apple);
		label.setText(null);
	}

}