package sample_0602;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class KeyEventTest extends JFrame implements KeyListener { //�������̽�
	
	private JPanel panel;
	private JTextField field;
	private JTextArea area;
	
	public KeyEventTest(){
		
		panel = new JPanel(new GridLayout(0,2));
		panel.add(new JLabel("���ڸ� �Է��Ͻÿ�: "));
		field = new JTextField(10);
		panel.add(field);
		area = new JTextArea(3, 30);
		add(panel, BorderLayout.NORTH);
		
		JScrollPane scrollPane = new JScrollPane(area);
		add(scrollPane, BorderLayout.CENTER);
		//add(area, BorderLayout.CENTER);
		
		field.addKeyListener(this); //���� ��ü�� �̺�Ʈ �����ʷ� �߰�
		setTitle("KeyEvent Test");
		setSize(400, 200);
		setVisible(true);
	}
	
	public static void main(String[] args){
		new KeyEventTest();
	}
	
	public void keyTyped(KeyEvent e){ //Ű �ԷµǸ� ȣ��
		display(e, "Key Typed      ");
	}
	
	public void keyPressed(KeyEvent e){ //Ű ������ ȣ��
		display(e, "Key Pressed    ");
	}
	
	public void keyReleased(KeyEvent e){ // Ű���� ���� ���� ���� ȣ��
		display(e, "Key Released   ");
	}

	protected void display(KeyEvent e, String s){
		char c = e.getKeyChar();
		int keyCode = e.getKeyCode();     // ������ Ű�� �����ڵ尪 ����
		String modifiers = "Alt: " + e.isAltDown() + "Ctrl: " + e.isControlDown() + "Shift: " + e.isShiftDown();
		// isControlDown : ��Ʈ�� Ű�� ������ ������ true ��ȯ
		
		area.append(" " + s + "���� " + c + "�ڵ�: " + keyCode + ") " + modifiers + "\n"); // append�� ��������� ��������
	}
}

/* key �Է� -> JTextField -> KeyListener -> addKeyListener
   JTextArea�� ���ڿ� ��´��  */