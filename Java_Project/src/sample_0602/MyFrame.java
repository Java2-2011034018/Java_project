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

		addMouseListener(new MouseAdapter() {      //�гο� ���콺 ������ �߰�.(����Ŭ����)
			public void mousePressed(MouseEvent e) {  //�ڱⰡ �� �͸� ������ �ϸ��.
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

/* ���콺 -> �гο� ���� -> ���콺������ or ���콺��Ǹ����� -> addMouseListener or addMouseMotionListener (�гο� ����)
 * 
 * �����Ŭ���� : Ŭ�����̹Ƿ� extends �����
 */

/* ����� Ŭ����

   �������̽�                          ����� Ŭ����
ComponentListener     ComponentAdapter
ContainerListener     ContainerAdapter
FocusListener         FocusAdapter
KeyListener           KeyAdapter
MouseListener         MouseAdapter
MouseMotionListener   moseMotionAdapter
WindowListener        WindowAdapter             */

/* Ű �̺�Ʈ �޼ҵ�

           �޼ҵ�                                            ����
keyTyped(KeyEvent e)          ����ڰ� ���ڸ� �Է����� ��쿡 ȣ��
keyPressed(KeyEvent e)        ����ڰ� Ű�� ������ ��쿡 ȣ��
keyReleased(KeyEvent e)       ����ڰ� Ű���� ���� ������ ��쿡 ȣ��     */

/* ���콺������ �������̽�

               �޼ҵ�                                                      ����
mouseClicked(MouseEvent e)           ����ڰ� �����ʴ��� Ŭ���� ��쿡 ȣ��ȴ�.
mouseEntered(MouseEvent e)           ���콺 Ŀ���� ������Ʈ�� ���� ȣ��ȴ�.
mouseExited(MouseEvent e)            ���콺 Ŀ���� ������Ʈ���� ������ ȣ��ȴ�.
mousePressed(MouseEvent e)           ���콺�� ������Ʈ ������ �������� ȣ��ȴ�.
mouseReleased(MouseEvent e)          ���콺�� ������Ʈ ������ �������� ȣ��ȴ�.  */

/* ���콺��Ǹ����� �������̽�

              �޼ҵ�                                         ����
mouseDragged(MouseEvent e)        ���콺 �巡���ϸ� ȣ��ȴ�.
mouseMoved(MouseEvent e)          ���콺�� Ŭ������ �ʰ� �̵��ϴ� ��쿡 ȣ��ȴ�.         */