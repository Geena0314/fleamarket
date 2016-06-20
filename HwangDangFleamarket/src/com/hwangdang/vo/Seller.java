package com.hwangdang.vo;

import java.io.Serializable;

/**
 *  판매자 VO  
 *
 */
public class Seller implements Serializable {

	private long sellerStoreNo;  // 스토어NO
	private  String sellerStoreName; //상호명
	private  String sellerTaxId;   // 사업자번호
	private String sellerIndustry;  //  업종
	private  String sellerSubIndustry; //업종소분류
	private  String sellerZipcode;   // 사업자우편번호
	private String sellerAddress;  //  판매자 주소
	private  String sellerSubAddress; //판매자 세부 주소
	private  String sellerStoreImage;   // 매장대표사진
	private String sellerProduct1;  //  판매물품1
	private String sellerProduct2;  //  판매물품2
	private String sellerProduct3;  //  판매물품3
	private String sellerIntroduction;  //  판매자소개
	private String memberId;  //  회원ID  : Foreign key 
	
	public Seller() {  }

	public Seller(long sellerStoreNo, String sellerStoreName, String sellerTaxId, String sellerIndustry,
			String sellerSubIndustry, String sellerZipcode, String sellerAddress, String sellerSubAddress,
			String sellerStoreImage, String sellerProduct1, String sellerProduct2, String sellerProduct3,
			String sellerIntroduction, String memberId) {
		super();
		this.sellerStoreNo = sellerStoreNo;
		this.sellerStoreName = sellerStoreName;
		this.sellerTaxId = sellerTaxId;
		this.sellerIndustry = sellerIndustry;
		this.sellerSubIndustry = sellerSubIndustry;
		this.sellerZipcode = sellerZipcode;
		this.sellerAddress = sellerAddress;
		this.sellerSubAddress = sellerSubAddress;
		this.sellerStoreImage = sellerStoreImage;
		this.sellerProduct1 = sellerProduct1;
		this.sellerProduct2 = sellerProduct2;
		this.sellerProduct3 = sellerProduct3;
		this.sellerIntroduction = sellerIntroduction;
		this.memberId = memberId;
	}

	public long getSellerStoreNo() {
		return sellerStoreNo;
	}

	public void setSellerStoreNo(long sellerStoreNo) {
		this.sellerStoreNo = sellerStoreNo;
	}

	public String getSellerStoreName() {
		return sellerStoreName;
	}

	public void setSellerStoreName(String sellerStoreName) {
		this.sellerStoreName = sellerStoreName;
	}

	public String getSellerTaxId() {
		return sellerTaxId;
	}

	public void setSellerTaxId(String sellerTaxId) {
		this.sellerTaxId = sellerTaxId;
	}

	public String getSellerIndustry() {
		return sellerIndustry;
	}

	public void setSellerIndustry(String sellerIndustry) {
		this.sellerIndustry = sellerIndustry;
	}

	public String getSellerSubIndustry() {
		return sellerSubIndustry;
	}

	public void setSellerSubIndustry(String sellerSubIndustry) {
		this.sellerSubIndustry = sellerSubIndustry;
	}

	public String getSellerZipcode() {
		return sellerZipcode;
	}

	public void setSellerZipcode(String sellerZipcode) {
		this.sellerZipcode = sellerZipcode;
	}

	public String getSellerAddress() {
		return sellerAddress;
	}

	public void setSellerAddress(String sellerAddress) {
		this.sellerAddress = sellerAddress;
	}

	public String getSellerSubAddress() {
		return sellerSubAddress;
	}

	public void setSellerSubAddress(String sellerSubAddress) {
		this.sellerSubAddress = sellerSubAddress;
	}

	public String getSellerStoreImage() {
		return sellerStoreImage;
	}

	public void setSellerStoreImage(String sellerStoreImage) {
		this.sellerStoreImage = sellerStoreImage;
	}

	public String getSellerProduct1() {
		return sellerProduct1;
	}

	public void setSellerProduct1(String sellerProduct1) {
		this.sellerProduct1 = sellerProduct1;
	}

	public String getSellerProduct2() {
		return sellerProduct2;
	}

	public void setSellerProduct2(String sellerProduct2) {
		this.sellerProduct2 = sellerProduct2;
	}

	public String getSellerProduct3() {
		return sellerProduct3;
	}

	public void setSellerProduct3(String sellerProduct3) {
		this.sellerProduct3 = sellerProduct3;
	}

	public String getSellerIntroduction() {
		return sellerIntroduction;
	}

	public void setSellerIntroduction(String sellerIntroduction) {
		this.sellerIntroduction = sellerIntroduction;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	@Override
	public String toString() {
		return "Seller [sellerStoreNo=" + sellerStoreNo + ", sellerStoreName=" + sellerStoreName + ", sellerTaxId="
				+ sellerTaxId + ", sellerIndustry=" + sellerIndustry + ", sellerSubIndustry=" + sellerSubIndustry
				+ ", sellerZipcode=" + sellerZipcode + ", sellerAddress=" + sellerAddress + ", sellerSubAddress="
				+ sellerSubAddress + ", sellerStoreImage=" + sellerStoreImage + ", sellerProduct1=" + sellerProduct1
				+ ", sellerProduct2=" + sellerProduct2 + ", sellerProduct3=" + sellerProduct3 + ", sellerIntroduction="
				+ sellerIntroduction + ", memberId=" + memberId + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((memberId == null) ? 0 : memberId.hashCode());
		result = prime * result + ((sellerAddress == null) ? 0 : sellerAddress.hashCode());
		result = prime * result + ((sellerIndustry == null) ? 0 : sellerIndustry.hashCode());
		result = prime * result + ((sellerIntroduction == null) ? 0 : sellerIntroduction.hashCode());
		result = prime * result + ((sellerProduct1 == null) ? 0 : sellerProduct1.hashCode());
		result = prime * result + ((sellerProduct2 == null) ? 0 : sellerProduct2.hashCode());
		result = prime * result + ((sellerProduct3 == null) ? 0 : sellerProduct3.hashCode());
		result = prime * result + ((sellerStoreImage == null) ? 0 : sellerStoreImage.hashCode());
		result = prime * result + ((sellerStoreName == null) ? 0 : sellerStoreName.hashCode());
		result = prime * result + (int) (sellerStoreNo ^ (sellerStoreNo >>> 32));
		result = prime * result + ((sellerSubAddress == null) ? 0 : sellerSubAddress.hashCode());
		result = prime * result + ((sellerSubIndustry == null) ? 0 : sellerSubIndustry.hashCode());
		result = prime * result + ((sellerTaxId == null) ? 0 : sellerTaxId.hashCode());
		result = prime * result + ((sellerZipcode == null) ? 0 : sellerZipcode.hashCode());
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
		Seller other = (Seller) obj;
		if (memberId == null) {
			if (other.memberId != null)
				return false;
		} else if (!memberId.equals(other.memberId))
			return false;
		if (sellerAddress == null) {
			if (other.sellerAddress != null)
				return false;
		} else if (!sellerAddress.equals(other.sellerAddress))
			return false;
		if (sellerIndustry == null) {
			if (other.sellerIndustry != null)
				return false;
		} else if (!sellerIndustry.equals(other.sellerIndustry))
			return false;
		if (sellerIntroduction == null) {
			if (other.sellerIntroduction != null)
				return false;
		} else if (!sellerIntroduction.equals(other.sellerIntroduction))
			return false;
		if (sellerProduct1 == null) {
			if (other.sellerProduct1 != null)
				return false;
		} else if (!sellerProduct1.equals(other.sellerProduct1))
			return false;
		if (sellerProduct2 == null) {
			if (other.sellerProduct2 != null)
				return false;
		} else if (!sellerProduct2.equals(other.sellerProduct2))
			return false;
		if (sellerProduct3 == null) {
			if (other.sellerProduct3 != null)
				return false;
		} else if (!sellerProduct3.equals(other.sellerProduct3))
			return false;
		if (sellerStoreImage == null) {
			if (other.sellerStoreImage != null)
				return false;
		} else if (!sellerStoreImage.equals(other.sellerStoreImage))
			return false;
		if (sellerStoreName == null) {
			if (other.sellerStoreName != null)
				return false;
		} else if (!sellerStoreName.equals(other.sellerStoreName))
			return false;
		if (sellerStoreNo != other.sellerStoreNo)
			return false;
		if (sellerSubAddress == null) {
			if (other.sellerSubAddress != null)
				return false;
		} else if (!sellerSubAddress.equals(other.sellerSubAddress))
			return false;
		if (sellerSubIndustry == null) {
			if (other.sellerSubIndustry != null)
				return false;
		} else if (!sellerSubIndustry.equals(other.sellerSubIndustry))
			return false;
		if (sellerTaxId == null) {
			if (other.sellerTaxId != null)
				return false;
		} else if (!sellerTaxId.equals(other.sellerTaxId))
			return false;
		if (sellerZipcode == null) {
			if (other.sellerZipcode != null)
				return false;
		} else if (!sellerZipcode.equals(other.sellerZipcode))
			return false;
		return true;
	} 
	
	
	
	
}

