package hackerton;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {
	static boolean isTap2Show = false;
	
	static class MainPage extends JFrame implements ActionListener, KeyListener, WindowListener, ListSelectionListener
	{
		JPanel header;
		JLabel logoLabel;
		JPanel tap1Panel;
		JButton todayBtn;
		JButton allBtn;
		JButton myCouponsBtn;
		JButton settingsBtn;
		JPanel tap2Panel;
		JButton mealBtn;
		JButton drinkBtn;
		JButton convenienceBtn;
		JButton playBtn;
		JPanel content;
		
		
		MainPage()
		{
			Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
			double width = screenSize.getWidth();
			double height = screenSize.getHeight();
			
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			Image img = toolkit.getImage("icons/icon.png");
			this.setIconImage(img);
			
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.addWindowListener(this);
			setTitle("��������������");
			setLayout(new BorderLayout());
			setSize(540,960);
			setLocation((int)width/2-270,(int)height/2-500);
			
			header = new JPanel();
			header.setLayout(new BorderLayout());
			logoLabel = new JLabel("��������������");
			
			
			tap1Panel = new JPanel();
			tap1Panel.setLayout(new GridLayout(1,4));
			todayBtn = new JButton("������ ����");
			allBtn = new JButton("��� ����");
			myCouponsBtn = new JButton("�� ������");
			settingsBtn = new JButton("����");
			todayBtn.addActionListener(this);
			allBtn.addActionListener(this);
			myCouponsBtn.addActionListener(this);
			settingsBtn.addActionListener(this);
			
			tap1Panel.add(todayBtn);
			tap1Panel.add(allBtn);
			tap1Panel.add(myCouponsBtn);
			tap1Panel.add(settingsBtn);
			
			tap2Panel = new JPanel();
			tap2Panel.setLayout(new GridLayout(1,4));
			mealBtn = new JButton("�Ļ�");
			drinkBtn = new JButton("����");
			convenienceBtn = new JButton("����");
			playBtn = new JButton("����");
			mealBtn.addActionListener(this);
			drinkBtn.addActionListener(this);
			convenienceBtn.addActionListener(this);
			playBtn.addActionListener(this);
			tap2Panel.add(mealBtn);
			tap2Panel.add(drinkBtn);
			tap2Panel.add(convenienceBtn);
			tap2Panel.add(playBtn);
			
			content = new JPanel();
			
			
			
			
			header.add(logoLabel,BorderLayout.NORTH);
			header.add(tap1Panel, BorderLayout.CENTER);
			header.add(tap2Panel, BorderLayout.SOUTH);
			this.add(header, BorderLayout.NORTH);
			this.add(content, BorderLayout.CENTER);
			
			
			
			
			
			
			//tap2Panel.setVisible(false);
			setVisible(true);
		}

		@Override
		public void valueChanged(ListSelectionEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowActivated(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowClosed(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowClosing(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowDeactivated(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowDeiconified(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowIconified(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowOpened(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==todayBtn)
			{
				isTap2Show=false;
				tap2();
				showToday();
			}
			else if(e.getSource()==allBtn)
			{
				isTap2Show=true;
				tap2();
				showAll();
			}
			else if(e.getSource()==myCouponsBtn)
			{
				isTap2Show=false;
				tap2();
				showMyCoupons();
			}
			else if(e.getSource()==settingsBtn)
			{
				isTap2Show=false;
				tap2();
				showSettings();
			}
		}
	}
	
	public static void main(String args[])
	{
		new MainPage();
	}
}
