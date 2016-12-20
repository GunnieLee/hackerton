
public class CouponData {

	private boolean bHotDeal;		//	핫딜인가 아닌가?
	private boolean bIsPrice;		//	가격이 있는가?
	private int nOriginPrice;		//	원래 가격
	private int nSaledPrice;		//	할인 된 가격
	private int nDiscPercent;		//	할인 률
	private String title;			//	제목
	private String description;		//	설명
	
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
