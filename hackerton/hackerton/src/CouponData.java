
public class CouponData {

	private boolean bHotDeal;		//	�ֵ��ΰ� �ƴѰ�?
	private boolean bIsPrice;		//	������ �ִ°�?
	private int nOriginPrice;		//	���� ����
	private int nSaledPrice;		//	���� �� ����
	private int nDiscPercent;		//	���� ��
	private String title;			//	����
	private String description;		//	����
	
	public CouponData(boolean bHotDeal, boolean bIsPrice, int nOriginPrice, int nSaledPrice, int nDiscPercent,
			String title, String description) {
		super();
		this.bHotDeal = bHotDeal;
		this.bIsPrice = bIsPrice;
		this.nOriginPrice = nOriginPrice;
		this.nSaledPrice = nSaledPrice;
		this.nDiscPercent = nDiscPercent;
		this.title = title;
		this.description = description;
	}

	public boolean isbHotDeal() {
		return bHotDeal;
	}

	public boolean isbIsPrice() {
		return bIsPrice;
	}

	public int getnOriginPrice() {
		return nOriginPrice;
	}

	public int getnSaledPrice() {
		return nSaledPrice;
	}

	public int getnDiscPercent() {
		return nDiscPercent;
	}

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}

	public void setbHotDeal(boolean bHotDeal) {
		this.bHotDeal = bHotDeal;
	}

	public void setbIsPrice(boolean bIsPrice) {
		this.bIsPrice = bIsPrice;
	}

	public void setnOriginPrice(int nOriginPrice) {
		this.nOriginPrice = nOriginPrice;
	}

	public void setnSaledPrice(int nSaledPrice) {
		this.nSaledPrice = nSaledPrice;
	}

	public void setnDiscPercent(int nDiscPercent) {
		this.nDiscPercent = nDiscPercent;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	
}
