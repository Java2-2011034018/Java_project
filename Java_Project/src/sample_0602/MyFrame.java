package sample_0602;

import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyPanel extends JPanel {
	BufferedImage img = null;
	int img_x = 0, img_y = 0;

	public MyPanel() {
		try {
			img = ImageIO.read(new File("orange.gif"));
		} catch (IOException e) {
			System.out.println("no image");
			System.exit(1);
		}

		addMouseListener(new MouseAdapter() {      //패널에 마우스 리스너 추가.(무명클래스)
			public void mousePressed(MouseEvent e) {  //자기가 쓸 것만 재정의 하면됨.
				img_x = e.getX();
				img_y = e.getY();
				repaint();
			}
		});
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(img, img_x, img_y, null);
	}
}

public class MyFrame extends JFrame {
	public MyFrame() {
		add(new MyPanel());
		setSize(300, 500);
		setVisible(true);
	}

	public static void main(String[] arg) {
		new MyFrame();
	}
}

/* 마우스 -> 패널에 붙임 -> 마우스리스너 or 마우스모션리스너 -> addMouseListener or addMouseMotionListener (패널에 붙임)
 * 
 * 어댑터클래스 : 클래스이므로 extends 써야함
 */

/* 어댑터 클래스

   인터페이스                          어댑터 클래스
ComponentListener     ComponentAdapter
ContainerListener     ContainerAdapter
FocusListener         FocusAdapter
KeyListener           KeyAdapter
MouseListener         MouseAdapter
MouseMotionListener   moseMotionAdapter
WindowListener        WindowAdapter             */

/* 키 이벤트 메소드

           메소드                                            설명
keyTyped(KeyEvent e)          사용자가 글자를 입력했을 경우에 호출
keyPressed(KeyEvent e)        사용자가 키를 눌렀을 경우에 호출
keyReleased(KeyEvent e)       사용자가 키에서 손을 떼었을 경우에 호출     */

/* 마우스리스너 인터페이스

               메소드                                                      설명
mouseClicked(MouseEvent e)           사용자가 컴포너느를 클릭한 경우에 호출된다.
mouseEntered(MouseEvent e)           마우스 커서가 컴포넌트로 들어가면 호출된다.
mouseExited(MouseEvent e)            마우스 커서가 컴포넌트에서 나가면 호출된다.
mousePressed(MouseEvent e)           마우스가 컴포넌트 위에서 눌려지면 호출된다.
mouseReleased(MouseEvent e)          마우스가 컴포넌트 위에서 떼어지면 호출된다.  */

/* 마우스모션리스너 인터페이스

              메소드                                         설명
mouseDragged(MouseEvent e)        마우스 드래그하면 호출된다.
mouseMoved(MouseEvent e)          마우스가 클릭되지 않고 이동하는 경우에 호출된다.         */