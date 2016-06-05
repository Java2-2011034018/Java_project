import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

class MyFrame3 extends JFrame implements ActionListener {
	
	private JRadioButton small, medium, large;
	private JLabel text;
	private JPanel topPanel, sizePanel, resultPanel;
	
	public MyFrame3(){
		setTitle("���� ��ư �׽�Ʈ");
		setSize(300, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		topPanel = new JPanel();
		JLabel label = new JLabel("� ũ���� Ŀ�Ǹ� �ֹ��Ͻðڽ��ϱ�?");
		topPanel.add(label);
		add(topPanel, BorderLayout.NORTH);
		
		sizePanel = new JPanel();
		small = new JRadioButton("Small Size");     // ���� ��ư ����
		medium = new JRadioButton("Medium Size");
		large = new JRadioButton("Large Size");
		
		ButtonGroup size = new ButtonGroup();      //��ư �׷��� �����ϰ� ���⿡ ���� ��ư�� �߰�
		size.add(small);
		size.add(medium);
		size.add(large);
		
		small.addActionListener(this);           //��ư�� �׼� ������ ���
		medium.addActionListener(this);
		large.addActionListener(this);
		
		sizePanel.add(small);          // ��ư �׷��� �����ϰ� ���⿡ ������ư �߰�
		sizePanel.add(medium);
		sizePanel.add(large);
		
		add(sizePanel, BorderLayout.CENTER);
		
		resultPanel = new JPanel();
		text = new JLabel("ũ�Ⱑ ���õ��� �ʾҽ��ϴ�.");
		text.setForeground(Color.red);
		resultPanel.add(text);
		add(resultPanel, BorderLayout.SOUTH);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e){   //���� ��ư�� �������� ȣ���. ��� ���
		if(e.getSource() == small){
			text.setText("Small ũ�Ⱑ ���õǾ����ϴ�.");
		}
		if(e.getSource() == medium){
			text.setText("Medium ũ�Ⱑ ���õǾ����ϴ�.");
		}
		if(e.getSource() == large){
			text.setText("Large ũ�Ⱑ ���õǾ����ϴ�.");
		}
	}
}
	public class RadioButtonFrame{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new MyFrame3();

	}

}
