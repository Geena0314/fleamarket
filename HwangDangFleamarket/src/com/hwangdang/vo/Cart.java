package com.hwangdang.vo;

import java.io.Serializable;

public class Cart implements Serializable{
	private int cartProductAmount;
	private String cartProductOption;
	private String productId;
	private String memberId;
	private Product product; //자식 테이블 cart가 부모 테이블 Product를 받음, Product가 없으니 오류 발생

	public Cart(){};
	
	public Cart(int cartProductAmount, String cartProductOption, String productId, String memberId, Product product) {
		super();
		this.cartProductAmount = cartProductAmount;
		this.cartProductOption = cartProductOption;
		this.productId = productId;
		this.memberId = memberId;
		this.product = product;
	}
	public Cart(int cartProductAmount, String cartProductOption, String productId, String memberId) {
		super();
		this.cartProductAmount = cartProductAmount;
		this.cartProductOption = cartProductOption;
		this.productId = productId;
		this.memberId = memberId;
	}
	public int getCartProductAmount() {
		return cartProductAmount;
	}
	public void setCartProductAmount(int cartProductAmount) {
		this.cartProductAmount = cartProductAmount;
	}
	public String getCartProductOption() {
		return cartProductOption;
	}
	public void setCartProductOption(String cartProductOption) {
		this.cartProductOption = cartProductOption;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cartProductAmount;
		result = prime * result + ((cartProductOption == null) ? 0 : cartProductOption.hashCode());
		result = prime * result + ((memberId == null) ? 0 : memberId.hashCode());
		result = prime * result + ((product == null) ? 0 : product.hashCode());
		result = prime * result + ((productId == null) ? 0 : productId.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cart other = (Cart) obj;
		if (cartProductAmount != other.cartProductAmount)
			return false;
		if (cartProductOption == null) {
			if (other.cartProductOption != null)
				return false;
		} else if (!cartProductOption.equals(other.cartProductOption))
			return false;
		if (memberId == null) {
			if (other.memberId != null)
				return false;
		} else if (!memberId.equals(other.memberId))
			return false;
		if (product == null) {
			if (other.product != null)
				return false;
		} else if (!product.equals(other.product))
			return false;
		if (productId == null) {
			if (other.productId != null)
				return false;
		} else if (!productId.equals(other.productId))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Cart [cartProductAmount=" + cartProductAmount + ", cartProductOption=" + cartProductOption
				+ ", productId=" + productId + ", memberId=" + memberId + ", product=" + product + "]";
	}
	
	
}
