
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
		
		TodaySale salePanel;
		
		
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
			setTitle("세종쿠폰라이프");
			setLayout(new BorderLayout());
			setSize(540,960);
			setLocation((int)width/2-270,(int)height/2-500);
			
			header = new JPanel();
			header.setLayout(new BorderLayout());
			logoLabel = new JLabel("세종쿠폰라이프");
			
			
			tap1Panel = new JPanel();
			tap1Panel.setLayout(new GridLayout(1,4));
			todayBtn = new JButton("오늘의 할인");
			allBtn = new JButton("모든 상점");
			myCouponsBtn = new JButton("내 쿠폰함");
			settingsBtn = new JButton("설정");
			tap1Panel.setPreferredSize(new Dimension(540, 40));
			todayBtn.setPreferredSize(new Dimension(135, 40));
			allBtn.setPreferredSize(new Dimension(135, 40));
			myCouponsBtn.setPreferredSize(new Dimension(135, 40));
			settingsBtn.setPreferredSize(new Dimension(135, 40));
			todayBtn.setBackground(Color.WHITE);
			allBtn.setBackground(Color.WHITE);
			myCouponsBtn.setBackground(Color.WHITE);
			settingsBtn.setBackground(Color.WHITE);
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
			mealBtn = new JButton("식사");
			drinkBtn = new JButton("음주");
			convenienceBtn = new JButton("편의");
			playBtn = new JButton("오락");
			mealBtn.setPreferredSize(new Dimension(135, 40));
			drinkBtn.setPreferredSize(new Dimension(135, 40));
			convenienceBtn.setPreferredSize(new Dimension(135, 40));
			playBtn.setPreferredSize(new Dimension(135, 40));
			mealBtn.setBackground(Color.WHITE);
			drinkBtn.setBackground(Color.WHITE);
			convenienceBtn.setBackground(Color.WHITE);
			playBtn.setBackground(Color.WHITE);
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
			
			
			
			
			
			
			tap2Panel.setVisible(false);
			Font font = new Font("돋움", Font.PLAIN, 15);
			logoLabel.setFont(font);
			todayBtn.setFont(font);
			allBtn.setFont(font);
			myCouponsBtn.setFont(font);
			settingsBtn.setFont(font);
			mealBtn.setFont(font);
			drinkBtn.setFont(font);
			convenienceBtn.setFont(font);
			playBtn.setFont(font);
			tap2Panel.setFont(font);
			
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
				tap2(isTap2Show);
				showToday();
			}
			else if(e.getSource()==allBtn)
			{
				isTap2Show=true;
				tap2(isTap2Show);
				showAll();
			}
			else if(e.getSource()==myCouponsBtn)
			{
				isTap2Show=false;
				tap2(isTap2Show);
				showMyCoupons();
			}
			else if(e.getSource()==settingsBtn)
			{
				isTap2Show=false;
				tap2(isTap2Show);
				showSettings();
			}
		}
		
		public void tap2(boolean tap2)
		{
			if(tap2)
			{
				tap2Panel.setVisible(true);
			}
			else
			{
				tap2Panel.setVisible(false);
			}
		}
		public void showToday()
		{
			salePanel = new TodaySale();
			this.add(salePanel, BorderLayout.CENTER);
			setVisible(true);
			//revalidate();
			//repaint();
		}
		public void showAll()
		{
			
		}
		public void showMyCoupons()
		{
			
		}
		public void showSettings()
		{
			
			
		}
	}
	
	public static void main(String args[])
	{
		new MainPage();
	}
}
