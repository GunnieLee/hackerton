import java.awt.*;
import javax.swing.*;

public class Exam {
	
	public static void main(String[] args) {
		//중간고사 밤위 그대로
		JFrame frame = new JFrame("practice"); //프레임 생성
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //꺼짐 옵션
		frame.setResizable(true); //크기 조정을 못하게 함.
		
		JPanel defPan = new JPanel();
		defPan.setPreferredSize(new Dimension(540,960));
		defPan.setBackground(Color.BLACK);
		
		CouponPanel pn = new CouponPanel();//생성
		
		defPan.add(pn);
		frame.getContentPane().add(defPan); //콘텐트페인에 애드한다.
		frame.pack(); //프레임의 크기를 알맞게 조정
		frame.setVisible(true); //보이게 ㄱㄱ
	} // main()
	

}
