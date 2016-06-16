package sample_0602;

import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyPanel_ extends JPanel {
	BufferedImage img = null;
	int img_x = 100, img_y = 100;
	
	public MyPanel_(){
		try {
			img = ImageIO.read(new File("car.gif"));
		} catch (IOException e){
			System.out.println("no image");
			System.exit(1);
		}
		
		addKeyListener(new KeyAdapter(){       // Ű �����ʸ� ���� Ŭ������ �ۼ��ؼ� �гο� ���δ�.
			public void keyPressed(KeyEvent e){
				int keycode = e.getKeyCode();
				switch (keycode){
				case KeyEvent.VK_UP:
					img_y -= 10;
					break;
				case KeyEvent.VK_DOWN:
					img_y += 10;
					break;
				case KeyEvent.VK_LEFT:
					img_x -= 10;
					break;
				case KeyEvent.VK_RIGHT:
					img_x += 10;
					break;
				}
				repaint();
			}
			public void KeyReleased(KeyEvent arg0){}
			public void KeyTyped(KeyEvent arg0){}
		});
		
		this.requestFocus(); //Ű���� ��Ŀ���� ��û�ϰ� �г��� ��Ŀ���� ���� �� �ְ� �Ѵ�.
		setFocusable(true);
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawImage(img, img_x, img_y, null); //�ڵ��� �̹����� ȭ���� x, y ��ġ�� �׸���.
	}
}

public class CarGameTest extends JFrame {
	
	public CarGameTest(){
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new MyPanel_());
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CarGameTest s = new CarGameTest();

	}

}

