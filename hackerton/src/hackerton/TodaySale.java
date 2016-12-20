import java.awt.*;
import java.util.*;

import javax.swing.*;

public class TodaySale extends JPanel {

	public static ArrayList<CouponPanel> couponList;
	CouponPanel panel;
	ImageIcon img;
	
	public TodaySale() {
		// TODO Auto-generated constructor stub
		
		setPreferredSize(new Dimension (900,540));
		img = new ImageIcon();
		
		
		panel = new CouponPanel();
		panel.setBackground(Color.cyan);
		add(panel);
		
		couponList = new ArrayList<CouponPanel>();
		
		for (int i = 0; i <= 9; i++) {
			
			couponList.add(new CouponPanel(img, false, false,
					0,0,0,
					""+i+"¹øÂ°", "Test"));
		}
		
		
		
		for (CouponPanel savedCoupon : couponList) {
			add(savedCoupon);
		}
		
	}
}
