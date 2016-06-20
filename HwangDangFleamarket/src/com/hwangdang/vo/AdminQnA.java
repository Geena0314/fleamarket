package com.hwangdang.vo;

import java.io.Serializable;
import java.util.Date;

public class AdminQnA implements Serializable{
public AdminQnA(){};
private int adminQnaNo;
private String adminQnaTitle;
private String adminQuaContent;
private String adminQnaWriter;
private Date adminQnaDate;
private int adminQnaHit;
private String adminQnaPublished;

public AdminQnA(int adminQnaNo, String adminQnaTitle, String adminQuaContent, String adminQnaWriter, Date adminQnaDate,
		int adminQnaHit, String adminQnaPublished) {
	super();
	this.adminQnaNo = adminQnaNo;
	this.adminQnaTitle = adminQnaTitle;
	this.adminQuaContent = adminQuaContent;
	this.adminQnaWriter = adminQnaWriter;
	this.adminQnaDate = adminQnaDate;
	this.adminQnaHit = adminQnaHit;
	this.adminQnaPublished = adminQnaPublished;
}

public int getAdminQnaNo() {
	return adminQnaNo;
}

public void setAdminQnaNo(int adminQnaNo) {
	this.adminQnaNo = adminQnaNo;
}

public String getAdminQnaTitle() {
	return adminQnaTitle;
}

public void setAdminQnaTitle(String adminQnaTitle) {
	this.adminQnaTitle = adminQnaTitle;
}

public String getAdminQuaContent() {
	return adminQuaContent;
}

public void setAdminQuaContent(String adminQuaContent) {
	this.adminQuaContent = adminQuaContent;
}

public String getAdminQnaWriter() {
	return adminQnaWriter;
}

public void setAdminQnaWriter(String adminQnaWriter) {
	this.adminQnaWriter = adminQnaWriter;
}

public Date getAdminQnaDate() {
	return adminQnaDate;
}

public void setAdminQnaDate(Date adminQnaDate) {
	this.adminQnaDate = adminQnaDate;
}

public int getAdminQnaHit() {
	return adminQnaHit;
}

public void setAdminQnaHit(int adminQnaHit) {
	this.adminQnaHit = adminQnaHit;
}

public String getAdminQnaPublished() {
	return adminQnaPublished;
}

public void setAdminQnaPublished(String adminQnaPublished) {
	this.adminQnaPublished = adminQnaPublished;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((adminQnaDate == null) ? 0 : adminQnaDate.hashCode());
	result = prime * result + adminQnaHit;
	result = prime * result + adminQnaNo;
	result = prime * result + ((adminQnaPublished == null) ? 0 : adminQnaPublished.hashCode());
	result = prime * result + ((adminQnaTitle == null) ? 0 : adminQnaTitle.hashCode());
	result = prime * result + ((adminQnaWriter == null) ? 0 : adminQnaWriter.hashCode());
	result = prime * result + ((adminQuaContent == null) ? 0 : adminQuaContent.hashCode());
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
	AdminQnA other = (AdminQnA) obj;
	if (adminQnaDate == null) {
		if (other.adminQnaDate != null)
			return false;
	} else if (!adminQnaDate.equals(other.adminQnaDate))
		return false;
	if (adminQnaHit != other.adminQnaHit)
		return false;
	if (adminQnaNo != other.adminQnaNo)
		return false;
	if (adminQnaPublished == null) {
		if (other.adminQnaPublished != null)
			return false;
	} else if (!adminQnaPublished.equals(other.adminQnaPublished))
		return false;
	if (adminQnaTitle == null) {
		if (other.adminQnaTitle != null)
			return false;
	} else if (!adminQnaTitle.equals(other.adminQnaTitle))
		return false;
	if (adminQnaWriter == null) {
		if (other.adminQnaWriter != null)
			return false;
	} else if (!adminQnaWriter.equals(other.adminQnaWriter))
		return false;
	if (adminQuaContent == null) {
		if (other.adminQuaContent != null)
			return false;
	} else if (!adminQuaContent.equals(other.adminQuaContent))
		return false;
	return true;
}

@Override
public String toString() {
	return "AdminQnA [adminQnaNo=" + adminQnaNo + ", adminQnaTitle=" + adminQnaTitle + ", adminQuaContent="
			+ adminQuaContent + ", adminQnaWriter=" + adminQnaWriter + ", adminQnaDate=" + adminQnaDate
			+ ", adminQnaHit=" + adminQnaHit + ", adminQnaPublished=" + adminQnaPublished + "]";
}


}
