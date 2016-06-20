package com.hwangdang.vo;

import java.io.Serializable;

public class Category implements Serializable {

	private String categoryId;   //카테고리ID
	private String categoryName;   //세부 카테고리명 
	private int categoryIdRef;   // 참조아이디
	private String categoryType;    //카테고리 분류     
	
	public Category () { }

	public Category(String categoryId, String categoryName, int categoryIdRef, String categoryType) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.categoryIdRef = categoryIdRef;
		this.categoryType = categoryType;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public int getCategoryIdRef() {
		return categoryIdRef;
	}

	public void setCategoryIdRef(int categoryIdRef) {
		this.categoryIdRef = categoryIdRef;
	}

	public String getCategoryType() {
		return categoryType;
	}

	public void setCategoryType(String categoryType) {
		this.categoryType = categoryType;
	}

	@Override
	public String toString() {
		return "Category [categoryId=" + categoryId + ", categoryName=" + categoryName + ", categoryIdRef="
				+ categoryIdRef + ", categoryType=" + categoryType + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((categoryId == null) ? 0 : categoryId.hashCode());
		result = prime * result + categoryIdRef;
		result = prime * result + ((categoryName == null) ? 0 : categoryName.hashCode());
		result = prime * result + ((categoryType == null) ? 0 : categoryType.hashCode());
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
		Category other = (Category) obj;
		if (categoryId == null) {
			if (other.categoryId != null)
				return false;
		} else if (!categoryId.equals(other.categoryId))
			return false;
		if (categoryIdRef != other.categoryIdRef)
			return false;
		if (categoryName == null) {
			if (other.categoryName != null)
				return false;
		} else if (!categoryName.equals(other.categoryName))
			return false;
		if (categoryType == null) {
			if (other.categoryType != null)
				return false;
		} else if (!categoryType.equals(other.categoryType))
			return false;
		return true;
	} 
	
	
	
}
