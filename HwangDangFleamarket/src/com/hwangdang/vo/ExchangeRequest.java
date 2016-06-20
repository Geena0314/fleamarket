package com.hwangdang.vo;

import java.io.Serializable;

/**
 *   구매자 교환신청 VO
 */
public class ExchangeRequest implements Serializable {

	private String exchangeTitle;  //교환요청 제목
	private String exchangeContent;   //교환요청 내용
	private String exchangeOption;   //교환옵션
	private String orderNo;   //주문번호 
	
	public ExchangeRequest() { }

	public ExchangeRequest(String exchangeTitle, String exchangeContent, String exchangeOption, String orderNo) {
		super();
		this.exchangeTitle = exchangeTitle;
		this.exchangeContent = exchangeContent;
		this.exchangeOption = exchangeOption;
		this.orderNo = orderNo;
	}

	public String getExchangeTitle() {
		return exchangeTitle;
	}

	public void setExchangeTitle(String exchangeTitle) {
		this.exchangeTitle = exchangeTitle;
	}

	public String getExchangeContent() {
		return exchangeContent;
	}

	public void setExchangeContent(String exchangeContent) {
		this.exchangeContent = exchangeContent;
	}

	public String getExchangeOption() {
		return exchangeOption;
	}

	public void setExchangeOption(String exchangeOption) {
		this.exchangeOption = exchangeOption;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	@Override
	public String toString() {
		return "ExchangeRequest [exchangeTitle=" + exchangeTitle + ", exchangeContent=" + exchangeContent
				+ ", exchangeOption=" + exchangeOption + ", orderNo=" + orderNo + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((exchangeContent == null) ? 0 : exchangeContent.hashCode());
		result = prime * result + ((exchangeOption == null) ? 0 : exchangeOption.hashCode());
		result = prime * result + ((exchangeTitle == null) ? 0 : exchangeTitle.hashCode());
		result = prime * result + ((orderNo == null) ? 0 : orderNo.hashCode());
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
		ExchangeRequest other = (ExchangeRequest) obj;
		if (exchangeContent == null) {
			if (other.exchangeContent != null)
				return false;
		} else if (!exchangeContent.equals(other.exchangeContent))
			return false;
		if (exchangeOption == null) {
			if (other.exchangeOption != null)
				return false;
		} else if (!exchangeOption.equals(other.exchangeOption))
			return false;
		if (exchangeTitle == null) {
			if (other.exchangeTitle != null)
				return false;
		} else if (!exchangeTitle.equals(other.exchangeTitle))
			return false;
		if (orderNo == null) {
			if (other.orderNo != null)
				return false;
		} else if (!orderNo.equals(other.orderNo))
			return false;
		return true;
	} 
	
	
	
}
