package de.dhbw.socialfunnel.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Networks {
	
	@Id
	@GeneratedValue
	@Column (unique= true)
	private int networkId;
	@Column
	private String networkName;
	@Column
	private String accessID;
	@ManyToOne
	@JoinColumn(name="userId")
	private User user;
	
	public Networks() {
		// TODO Auto-generated constructor stub
	}
	
	public Networks(String networkName, String accessID, User user) {
		// TODO Auto-generated constructor stub
		this.networkName = networkName;
		this.accessID = accessID;
		this.user = user;
	}

	public int getNetworkId() {
		return networkId;
	}

	public void setNetworkId(int networkId) {
		this.networkId = networkId;
	}

	public String getNetworkName() {
		return networkName;
	}

	public void setNetworkName(String networkName) {
		this.networkName = networkName;
	}

	public String getAccessID() {
		return accessID;
	}

	public void setAccessID(String accessID) {
		this.accessID = accessID;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
