package sample_0526_2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
class MyFrame extends JFrame{
	
	private JButton button;
	private JLabel label;
	
	public MyFrame(){
		this.setSize(300,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("�̺�Ʈ ����");
		
		JPanel panel = new JPanel();
		button = new JButton("��ư�� �����ÿ�");
		label = new JLabel("���� ��ư�� �������� �ʾҽ��ϴ�.");
		
		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(e.getSource() == button){
					label.setText("��ħ�� ��ư�� ���������ϴ�.");
				}
			}
		});
		
		panel.add(button);
		panel.add(label);
		
		this.add(panel);
		this.setVisible(true);
	}
}

public class ActionEventTest4 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyFrame t = new MyFrame();

	}

}