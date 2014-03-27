import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class javagame extends JFrame {

	NewPaint p1 = new NewPaint();

	
	protected static JButton but1, but2, but3, but4, but5, but6, bu1, bu2, bu3,
			bu4, DONE;
	protected static JButton[] bu = new JButton[4];
	protected static JButton[] array = new JButton[50];
	protected static JLabel[] sonuc = new JLabel[10];

	protected static JPanel panel, panel1, panel2, panel3, panel4;


	static JFrame frame = new JFrame();

	int sayac = 0;

	ImageIcon ten = new ImageIcon("win.jpg");
	Image t1 = ten.getImage();

	ImageIcon gameover = new ImageIcon("gameover.jpg");
	Image g1 = gameover.getImage();

	ImageIcon image1 = new ImageIcon("a.png");
	ImageIcon image2 = new ImageIcon("b.png");
	ImageIcon image3 = new ImageIcon("c.png");
	ImageIcon image4 = new ImageIcon("d.png");
	ImageIcon image5 = new ImageIcon("e.png");
	ImageIcon image6 = new ImageIcon("f.png");
	
	int danone = 1;
	int ce = 0;

	public class ButtonListener2 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {

			array[danone].setIcon(bu1.getIcon());
			array[danone + 1].setIcon(bu2.getIcon());
			array[danone + 2].setIcon(bu3.getIcon());
			array[danone + 3].setIcon(bu4.getIcon());

			array[danone].setName(bu1.getName());
			array[danone + 1].setName(bu2.getName());
			array[danone + 2].setName(bu3.getName());
			array[danone + 3].setName(bu4.getName());

			danone += 5;

			bu1.setIcon(new ImageIcon("bordo.jpg"));
			bu2.setIcon(new ImageIcon("bordo.jpg"));
			bu3.setIcon(new ImageIcon("bordo.jpg"));
			bu4.setIcon(new ImageIcon("bordo.jpg"));

			check();
			ce++;

		}
	}


	public class ButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			switch (sayac % 4) {
			case 0:
				if (e.getSource() == but1) {
					bu1.setIcon(image1);
					bu1.setName("image1");
				}
				if (e.getSource() == but2) {

					bu1.setIcon(image2);
					bu1.setName("image2");

				}
				if (e.getSource() == but3) {
					bu1.setIcon(image3);
					bu1.setName("image3");

				}
				if (e.getSource() == but4) {
					bu1.setIcon(image4);
					bu1.setName("image4");

				}
				if (e.getSource() == but5) {
					bu1.setIcon(image5);
					bu1.setName("image5");

				}
				if (e.getSource() == but6) {
					bu1.setIcon(image6);
					bu1.setName("image6");
				}
				break;
			case 1:
				if (e.getSource() == but1) {
					bu2.setIcon(image1);
					bu2.setName("image1");

				}
				if (e.getSource() == but2) {
					bu2.setIcon(image2);
					bu2.setName("image2");

				}
				if (e.getSource() == but3) {
					bu2.setIcon(image3);
					bu2.setName("image3");

				}
				if (e.getSource() == but4) {
					bu2.setIcon(image4);
					bu2.setName("image4");

				}
				if (e.getSource() == but5) {
					bu2.setIcon(image5);
					bu2.setName("image5");

				}
				if (e.getSource() == but6) {
					bu2.setIcon(image6);
					bu2.setName("image6");

				}
				break;
			case 2:
				if (e.getSource() == but1) {
					bu3.setIcon(image1);
					bu3.setName("image1");

				}
				if (e.getSource() == but2) {
					bu3.setIcon(image2);
					bu3.setName("image2");

				}
				if (e.getSource() == but3) {
					bu3.setIcon(image3);
					bu3.setName("image3");

				}
				if (e.getSource() == but4) {
					bu3.setIcon(image4);
					bu3.setName("image4");

				}
				if (e.getSource() == but5) {
					bu3.setIcon(image5);
					bu3.setName("image5");

				}
				if (e.getSource() == but6) {
					bu3.setIcon(image6);
					bu3.setName("image6");

				}
				break;
			case 3:
				if (e.getSource() == but1) {
					bu4.setIcon(image1);
					bu4.setName("image1");

				}
				if (e.getSource() == but2) {
					bu4.setIcon(image2);
					bu4.setName("image2");

				}
				if (e.getSource() == but3) {
					bu4.setIcon(image3);
					bu4.setName("image3");

				}
				if (e.getSource() == but4) {
					bu4.setIcon(image4);
					bu4.setName("image4");

				}
				if (e.getSource() == but5) {
					bu4.setIcon(image5);
					bu4.setName("image5");

				}
				if (e.getSource() == but6) {
					bu4.setIcon(image6);
					bu4.setName("image6");

				}
				break;

			default:
				break;
			}
			sayac++;

		}

	}

	public javagame() {
		Image icon = Toolkit.getDefaultToolkit().getImage("karemsi.jpg");
		frame.setIconImage(icon);

		// oyunun þekli yukarda gözüküyo

		// KENDÝ TAHMÝN ETTÝÐÝ ARRAY

		int a[] = new int[4];

		for (int i = 0; i < 4;) {
			boolean d = true;
			a[i] = (int) (1 + Math.random() * 6);

			for (int j = 0; j < 4; j++) {
				if (i != j)
					if (a[i] == a[j])
						d = false;
			}
			if (d)
				i++;
		}

		for (int i = 0; i < 4; i++) {

			bu[i] = new JButton();

			switch (a[i]) {
			case 1:
				bu[i].setName("image1");
				break;
			case 2:
				bu[i].setName("image2");
				break;
			case 3:
				bu[i].setName("image3");
				break;
			case 4:
				bu[i].setName("image4");
				break;
			case 5:
				bu[i].setName("image5");
				break;
			case 6:
				bu[i].setName("image6");
				break;
			}
			System.out.println(bu[i].getName());
		}

		panel = new JPanel(new BorderLayout());
		panel1 = new JPanel();
		panel2 = new JPanel();
		panel3 = new JPanel();
		panel4 = new JPanel();

		panel.add(panel1, BorderLayout.LINE_START);
		panel.add(panel2, BorderLayout.PAGE_START);
		panel.add(panel3, BorderLayout.CENTER);
		panel.add(panel4, BorderLayout.LINE_END);



		but1 = new JButton(image1);
		but2 = new JButton(image2);
		but3 = new JButton(image3);
		but4 = new JButton(image4);
		but5 = new JButton(image5);
		but6 = new JButton(image6);

		DONE = new JButton(new ImageIcon("done.png"));


		bu1 = new JButton(new ImageIcon("bordo.jpg"));
		bu2 = new JButton(new ImageIcon("bordo.jpg"));
		bu3 = new JButton(new ImageIcon("bordo.jpg"));
		bu4 = new JButton(new ImageIcon("bordo.jpg"));




		panel1.add(but1);
		panel1.add(but2);
		panel1.add(but3);
		panel1.add(but4);
		panel1.add(but5);
		panel1.add(but6);
		panel1.add(DONE);
		

		panel2.add(bu1);
		panel2.add(bu2);
		panel2.add(bu3);
		panel2.add(bu4);

		Font font = new Font("Arial", Font.BOLD + Font.ITALIC, 15);

		for (int k = 0; k < 50; k++) {
			if (k % 5 == 0) {
				panel3.add(array[k] = new JButton("" + ((k / 5) + 1)));
				array[k].setBackground(Color.yellow);

			} else {
				panel3.add(array[k] = new JButton());
				array[k].setBackground(Color.red);
			}

			array[k].setForeground(Color.red);
			array[k].setPreferredSize(new Dimension(50, 50));
			array[k].setFont(font);

		}

		for (int k = 0; k < 10; k++) {

			panel4.add(sonuc[k] = new JLabel(new ImageIcon("yeþil.png")));

		}

		but1.setName("image1");
		but2.setName("image2");
		but3.setName("image3");
		but4.setName("image4");
		but5.setName("image5");
		but6.setName("image6");
		DONE.setName("DONE");
		

		ButtonListener listener = new ButtonListener();
		ButtonListener2 listener2 = new ButtonListener2();

		but1.addActionListener(listener);
		but2.addActionListener(listener);
		but3.addActionListener(listener);
		but4.addActionListener(listener);
		but5.addActionListener(listener);
		but6.addActionListener(listener);
		DONE.addActionListener(listener2);
		

		but1.setPreferredSize(new Dimension(50, 50));
		but2.setPreferredSize(new Dimension(50, 50));
		but3.setPreferredSize(new Dimension(50, 50));
		but4.setPreferredSize(new Dimension(50, 50));
		but5.setPreferredSize(new Dimension(50, 50));
		but6.setPreferredSize(new Dimension(50, 50));
		DONE.setPreferredSize(new Dimension(50, 50));
		

		bu1.setPreferredSize(new Dimension(50, 50));
		bu2.setPreferredSize(new Dimension(50, 50));
		bu3.setPreferredSize(new Dimension(50, 50));
		bu4.setPreferredSize(new Dimension(50, 50));

	}

	public static void main(String args[]) {
		new javagame();

		frame.setVisible(true);
		frame.setResizable(false);
		frame.setSize(450, 645);
		frame.setLocation(300, 50);
		frame.setTitle("Code Breaker");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.setBackground(Color.darkGray);

		panel1.setBackground(Color.BLACK);
		panel1.setPreferredSize(new Dimension(60, 80));

		panel2.setBackground(Color.orange);

		panel4.setPreferredSize(new Dimension(60, 80));

		panel4.setBackground(Color.black);
	}

	ImageIcon artý = new ImageIcon("artý.jpg");
	ImageIcon tik = new ImageIcon("tik.jpg");

	boolean win = false;
	boolean lose = false;

	public void check() {

		if (ce == 9) {
			lose = true;
		}
		

		sonuc[ce].setLayout(new GridLayout(2, 2));
		int m = 0;
		for (int i = 0; i < 4; i++) {

			if (bu[i].getName().equals(array[(i + 1) + (5 * ce)].getName())) {
				m++;
			}
			if (m == 4)
				win = true;
		}

		if (win) {
			frame.remove(panel);
			frame.add(p1);
		}

		else if (lose) {
			frame.remove(panel);
			frame.add(p1);
		}
		for (int i = 0; i < 4; i++) {

			if (bu[i].getName().equals(array[(i + 1) + (5 * ce)].getName())) {
				System.out.println("+");

				sonuc[ce].add(new JLabel(new ImageIcon("artý.jpg")));

			} else {
				for (int j = 0; j < 4; j++) {
					if (i == j)
						continue;
					if (array[(i + 1) + (5 * ce)].getName().equals(
							bu[j].getName())) {

						System.out.println("-");

						sonuc[ce].add(new JLabel(new ImageIcon("tik.jpg")));
					}
				}

			}
		}
	}

	class NewPaint extends JPanel {

		public void paintComponent(Graphics g) {
			super.paintComponent(g);

			if (win) {
				g.drawImage(t1, 0, 0, getWidth(), getHeight(), null);
			} else if (lose) {
				g.drawImage(g1, 0, 0, getWidth(), getHeight(), null);

			}

		}
	}

}
