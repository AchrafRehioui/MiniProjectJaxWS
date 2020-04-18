package BusinessLogic;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement(name="account")
@XmlAccessorType(XmlAccessType.FIELD) // in case we won't to display attribute in SOAP response
public class Account implements Serializable {

	private Long code;
	private double balance;
	@XmlTransient
	private Date creationDate;
	
	
	public Long getCode() {
		return code;
	}
	public void setCode(Long code) {
		this.code = code;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public Account() {
		super();
	}
	public Account(Long code, double balance, Date creationDate) {
		super();
		this.code = code;
		this.balance = balance;
		this.creationDate = creationDate;
	}
	
	
}
