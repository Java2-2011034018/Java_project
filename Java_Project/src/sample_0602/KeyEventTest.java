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

public class KeyEventTest extends JFrame implements KeyListener { //인터페이스
	
	private JPanel panel;
	private JTextField field;
	private JTextArea area;
	
	public KeyEventTest(){
		
		panel = new JPanel(new GridLayout(0,2));
		panel.add(new JLabel("문자를 입력하시오: "));
		field = new JTextField(10);
		panel.add(field);
		area = new JTextArea(3, 30);
		add(panel, BorderLayout.NORTH);
		
		JScrollPane scrollPane = new JScrollPane(area);
		add(scrollPane, BorderLayout.CENTER);
		//add(area, BorderLayout.CENTER);
		
		field.addKeyListener(this); //현재 객체를 이벤트 리스너로 추가
		setTitle("KeyEvent Test");
		setSize(400, 200);
		setVisible(true);
	}
	
	public static void main(String[] args){
		new KeyEventTest();
	}
	
	public void keyTyped(KeyEvent e){ //키 입력되면 호출
		display(e, "Key Typed      ");
	}
	
	public void keyPressed(KeyEvent e){ //키 누르면 호출
		display(e, "Key Pressed    ");
	}
	
	public void keyReleased(KeyEvent e){ // 키에서 손을 떼는 순간 호출
		display(e, "Key Released   ");
	}

	protected void display(KeyEvent e, String s){
		char c = e.getKeyChar();
		int keyCode = e.getKeyCode();     // 눌려진 키의 유니코드값 얻음
		String modifiers = "Alt: " + e.isAltDown() + "Ctrl: " + e.isControlDown() + "Shift: " + e.isShiftDown();
		// isControlDown : 컨트롤 키가 눌려져 있으면 true 반환
		
		area.append(" " + s + "문자 " + c + "코드: " + keyCode + ") " + modifiers + "\n"); // append라 이전결과가 안지워짐
	}
}

/* key 입력 -> JTextField -> KeyListener -> addKeyListener
   JTextArea는 문자열 출력담당  */