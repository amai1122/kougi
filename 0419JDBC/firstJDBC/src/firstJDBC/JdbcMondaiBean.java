package firstJDBC;

public class JdbcMondaiBean {

	private String productId; // 商品ID
	private String productName; // 商品名
	private int categoryId; // カテゴリーID
	private int price; // 価格

	/**
	 * @return productId
	*/
	public String getProductId() {
		return productId;
	}

	/**
	 * @param productId セットする productId
	*/
	public void setProductId(String productId) {
		this.productId = productId;
	}

	/**
	 * @return productName
	*/
	public String getProductName() {
		return productName;
	}

	/**
	 * @param productName セットする productName
	*/
	public void setProductName(String productName) {
		this.productName = productName;
	}

	/**
	 * @return categoryId
	*/
	public int getCategoryId() {
		return categoryId;
	}

	/**
	 * @param categoryId セットする categoryId
	*/
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	/**
	 * @return price
	*/
	public int getPrice() {
		return price;
	}

	/**
	 * @param price セットする price
	*/
	public void setPrice(int price) {
		this.price = price;
	}

}
