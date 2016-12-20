import java.awt.*;
import javax.swing.*;

public class CouponPanel extends JPanel{

	ImageIcon img;
	
	private boolean bHotDeal;		//	핫딜인가 아닌가?
	private boolean bIsPrice;		//	가격이 있는가?
	private int nOriginPrice;		//	원래 가격
	private int nSaledPrice;		//	할인 된 가격
	private int nDiscPercent;		//	할인 률
	private String title;			//	제목
	private String description;		//	설명
	
	private JButton btnCouponGetter;//	쿠폰받기 버튼
	private JButton btnMoreInfo;	//	땡땡땡, 더 많은 정보
	private JLabel	lblImage;		//	제품or 상품 이미지
	private JLabel	lblTitle;		//	제목
	private JLabel	lblDisc;		//	설명
	private JLabel	lblSale;		//	할인률 OR 가격정보

	
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
		
		lblTitle = new JLabel("상품 OR 가게 이름");
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("고딕",Font.BOLD,30));
		lblTitle.setBounds(180,20,320,30);
		lblTitle.setBackground(Color.CYAN);
		lblTitle.setOpaque(true);
		this.add(lblTitle);
		
		lblDisc = new JLabel("간단한 설명");
		lblDisc.setHorizontalAlignment(SwingConstants.CENTER);
		lblDisc.setFont(new Font("고딕",Font.BOLD,10));
		lblDisc.setBounds(180,60,320,10);
		lblDisc.setBackground(Color.GREEN);
		lblDisc.setOpaque(true);
		add(lblDisc);
		
		lblSale = new JLabel("할인률 OR 가격");
		lblSale.setHorizontalAlignment(SwingConstants.CENTER);
		lblSale.setFont(new Font("고딕",Font.BOLD,40));
		lblSale.setBounds(180,80,320,40);
		lblSale.setBackground(Color.MAGENTA);
		lblSale.setOpaque(true);
		add(lblSale);
		
		btnCouponGetter = new JButton("쿠폰 받기");
		btnCouponGetter.setBounds(180,130, 200, 30);
		add(btnCouponGetter);
		
		btnMoreInfo = new JButton("더 많은 정보");
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
		lblTitle.setFont(new Font("고딕",Font.BOLD,30));
		lblTitle.setBounds(180,20,320,30);
		lblTitle.setBackground(Color.CYAN);
		lblTitle.setOpaque(true);
		this.add(lblTitle);
		
		lblDisc = new JLabel(description);
		lblDisc.setHorizontalAlignment(SwingConstants.CENTER);
		lblDisc.setFont(new Font("고딕",Font.BOLD,10));
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
		lblSale.setFont(new Font("고딕",Font.BOLD,40));
		lblSale.setBounds(180,80,320,40);
		lblSale.setBackground(Color.MAGENTA);
		lblSale.setOpaque(true);
		add(lblSale);
		
		btnCouponGetter = new JButton("쿠폰 받기");
		btnCouponGetter.setBounds(180,130, 200, 30);
		add(btnCouponGetter);
		
		btnMoreInfo = new JButton("더 많은 정보");
		btnMoreInfo.setBounds(400, 130, 80, 30);
		add(btnMoreInfo);
	}
	
	
	
	
	
}
