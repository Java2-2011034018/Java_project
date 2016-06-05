import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class MyFrame5 extends JFrame {     // 정수의 제곱 계산하기 프로그램

	private JButton button;
	private JTextField text, result;

	public MyFrame5() {
		setSize(300, 130);
		setTitle("제곱 계산하기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ButtonListener listener = new ButtonListener(); //리스너 객체 생성

		JPanel panel = new JPanel();
		panel.add(new JLabel("숫자 입력: ")); // 레이블 객체 생성
		text = new JTextField(15);         // 커럼수가 15인 텍스트필드 생성
		text.addActionListener(listener);  // 텍스트 필드에 리스너 연결
		panel.add(text);

		panel.add(new JLabel("제곱한 값: "));
		result = new JTextField(15);       // 결과를 나타낼 텍스트필드
		result.setEditable(false);         // 편집 불가 설정
		panel.add(result);

		button = new JButton("OK");
		button.addActionListener(listener);
		panel.add(button);
		add(panel);
		setVisible(true);
	}

	private class ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == button || e.getSource() == text) { 
				String name = text.getText();
				int value = Integer.parseInt(name);
				result.setText(" " + value * value); // 텍스트 입력받아서 정수로 변화하고 제곱값 구해서 출력한다.
				text.requestFocus();                 // 텍스트 포커스를 text에 설정한다.
			}
		}
	}
}

public class TextFieldFrame {
	public static void main(String[] args) {
		new MyFrame5();
	}
}
