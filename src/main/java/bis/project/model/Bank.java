package bis.project.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Bank {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	@Column(nullable=false, length=3)
	private int bankCode;
	
	@Column(nullable=false, length=50)
	private String name;
	
	@Column(nullable=false, length=8)
	private String swiftCode;
	
	@Column(nullable=false, length=18)
	private String billingAccount;
	
	@OneToMany(mappedBy="bank")
	private Set<BankAccount> accounts;
	
	public Bank() {}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getBankCode() {
		return bankCode;
	}

	public void setBankCode(int bankCode) {
		this.bankCode = bankCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSwiftCode() {
		return swiftCode;
	}

	public void setSwiftCode(String swiftCode) {
		this.swiftCode = swiftCode;
	}

	public String getBillingAccount() {
		return billingAccount;
	}

	public void setBillingAccount(String billingAccount) {
		this.billingAccount = billingAccount;
	}

	public Set<BankAccount> getAccounts() {
		return accounts;
	}

	public void setAccounts(Set<BankAccount> accounts) {
		this.accounts = accounts;
	}
}
