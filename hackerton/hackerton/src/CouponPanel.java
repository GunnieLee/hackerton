import java.awt.*;
import javax.swing.*;

public class CouponPanel extends JPanel{

	ImageIcon img;
	
	private boolean bHotDeal;		//	�ֵ��ΰ� �ƴѰ�?
	private boolean bIsPrice;		//	������ �ִ°�?
	private int nOriginPrice;		//	���� ����
	private int nSaledPrice;		//	���� �� ����
	private int nDiscPercent;		//	���� ��
	private String title;			//	����
	private String description;		//	����
	
	private JButton btnCouponGetter;//	�����ޱ� ��ư
	private JButton btnMoreInfo;	//	������, �� ���� ����
	private JLabel	lblImage;		//	��ǰor ��ǰ �̹���
	private JLabel	lblTitle;		//	����
	private JLabel	lblDisc;		//	����
	private JLabel	lblSale;		//	���η� OR ��������

	
	public CouponPanel () {
		setPreferredSize(new Dimension (520,180));
		setBackground(Color.WHITE);
		setLayout(null);
		
		ImageIcon tmp = new ImageIcon();
		
		lblImage = new JLabel(img);
		lblImage.setBounds(20,20,140,140);
		lblImage.setBackground(Color.BLUE);
		lblImage.setOpaque(true);
		add(lblImage);
		
		lblTitle = new JLabel("��ǰ OR ���� �̸�");
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("���",Font.BOLD,30));
		lblTitle.setBounds(180,20,320,30);
		lblTitle.setBackground(Color.CYAN);
		lblTitle.setOpaque(true);
		this.add(lblTitle);
		
		lblDisc = new JLabel("������ ����");
		lblDisc.setHorizontalAlignment(SwingConstants.CENTER);
		lblDisc.setFont(new Font("���",Font.BOLD,10));
		lblDisc.setBounds(180,60,320,10);
		lblDisc.setBackground(Color.GREEN);
		lblDisc.setOpaque(true);
		add(lblDisc);
		
		lblSale = new JLabel("���η� OR ����");
		lblSale.setHorizontalAlignment(SwingConstants.CENTER);
		lblSale.setFont(new Font("���",Font.BOLD,40));
		lblSale.setBounds(180,80,320,40);
		lblSale.setBackground(Color.MAGENTA);
		lblSale.setOpaque(true);
		add(lblSale);
		
		btnCouponGetter = new JButton("���� �ޱ�");
		btnCouponGetter.setBounds(180,130, 200, 30);
		add(btnCouponGetter);
		
		btnMoreInfo = new JButton("�� ���� ����");
		btnMoreInfo.setBounds(400, 130, 80, 30);
		add(btnMoreInfo);
		
	}

	public CouponPanel(ImageIcon img, boolean bHotDeal, boolean bIsPrice, int nOriginPrice, int nSaledPrice,
			int nDiscPercent, String title, String description) {
		super();
		
		
		String saleStr;
		
		setPreferredSize(new Dimension (520,180));
		setBackground(Color.WHITE);
		setLayout(null);
		
		this.img = img;
		this.bHotDeal = bHotDeal;
		this.bIsPrice = bIsPrice;
		this.nOriginPrice = nOriginPrice;
		this.nSaledPrice = nSaledPrice;
		this.nDiscPercent = nDiscPercent;
		this.title = title;
		this.description = description;
		
		lblImage = new JLabel(img);
		lblImage.setBounds(20,20,140,140);
		lblImage.setBackground(Color.BLUE);
		lblImage.setOpaque(true);
		add(lblImage);
		
		lblTitle = new JLabel(title);
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("���",Font.BOLD,30));
		lblTitle.setBounds(180,20,320,30);
		lblTitle.setBackground(Color.CYAN);
		lblTitle.setOpaque(true);
		this.add(lblTitle);
		
		lblDisc = new JLabel(description);
		lblDisc.setHorizontalAlignment(SwingConstants.CENTER);
		lblDisc.setFont(new Font("���",Font.BOLD,10));
		lblDisc.setBounds(180,60,320,10);
		lblDisc.setBackground(Color.GREEN);
		lblDisc.setOpaque(true);
		add(lblDisc);
		
		if(bIsPrice) {
			saleStr = "" +nOriginPrice + " -> " + nSaledPrice;
		}
		else {
			saleStr = "" + nDiscPercent + " % OFF";
		}
		
		lblSale = new JLabel(saleStr);
		lblSale.setHorizontalAlignment(SwingConstants.CENTER);
		lblSale.setFont(new Font("���",Font.BOLD,40));
		lblSale.setBounds(180,80,320,40);
		lblSale.setBackground(Color.MAGENTA);
		lblSale.setOpaque(true);
		add(lblSale);
		
		btnCouponGetter = new JButton("���� �ޱ�");
		btnCouponGetter.setBounds(180,130, 200, 30);
		add(btnCouponGetter);
		
		btnMoreInfo = new JButton("�� ���� ����");
		btnMoreInfo.setBounds(400, 130, 80, 30);
		add(btnMoreInfo);
	}
	
	
	
	
	
}
