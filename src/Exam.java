import java.awt.*;
import javax.swing.*;

public class Exam {
	
	public static void main(String[] args) {
		//�߰���� ���� �״��
		JFrame frame = new JFrame("practice"); //������ ����
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //���� �ɼ�
		frame.setResizable(true); //ũ�� ������ ���ϰ� ��.
		
		JPanel defPan = new JPanel();
		defPan.setPreferredSize(new Dimension(540,960));
		defPan.setBackground(Color.BLACK);
		
		CouponPanel pn = new CouponPanel();//����
		
		defPan.add(pn);
		frame.getContentPane().add(defPan); //����Ʈ���ο� �ֵ��Ѵ�.
		frame.pack(); //�������� ũ�⸦ �˸°� ����
		frame.setVisible(true); //���̰� ����
	} // main()
	

}
