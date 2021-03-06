package com.example;

import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;
import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity
@Table (name="USER_DETAIL")

public class UserDetails {
	 	@Id
	    @Column(name="USER_ID")
	    @GeneratedValue(strategy=GenerationType.AUTO)
	    private int    userId;
	   
	    @Column(name="USER_NAME") 
	    private String userName;
	   
	    @ElementCollection
	    @JoinTable(name="USER_ADDRESS",
	            joinColumns=@JoinColumn(name="USER_ID"))
	    @GenericGenerator(strategy="increment", name = "increment-gen")
	    @CollectionId(columns = { @Column(name="ADDRESS_ID") },
	    generator = "increment-gen", type = @Type(type="long"))
	    private Collection<Address> lisOfAddresses = new ArrayList<Address>();
	   
	    public Collection<Address> getLisOfAddresses() {
	        return lisOfAddresses;
	    }
	    public void setLisOfAddresses(Collection<Address> lisOfAddresses) {
	        this.lisOfAddresses = lisOfAddresses;
	    }
	    public int getUserId() {
	        return userId;
	    }
	    public void setUserId(int userId) {
	        this.userId = userId;
	    }
	    public String getUserName() {
	        return userName;
	    }
	    public void setUserName(String userName) {
	        this.userName = userName;
	    }
	    public String toString()
	    {
	        return "[User Name: "+userName+"\n Office Address: "+lisOfAddresses+"]";
	    }
}
