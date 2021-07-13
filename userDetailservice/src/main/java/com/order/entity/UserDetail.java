package com.order.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class UserDetail {
	 @Id
	  private Long userid;

	    private String firstName;
	    private String lastName;
	    private String phone;
	    private String address;
	    
	    private Long restaurantId;
	    
	    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	    List<UserDetail> menu=new ArrayList<>();
	    
}
