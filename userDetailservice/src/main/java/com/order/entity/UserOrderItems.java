package com.order.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class UserOrderItems{
	@Id
     private Long orderId;
	private long itemprice;
	private Long itemQuantity;
	private String itemName;
    private Long restaurantId;
    private Long menuId;
    
    @ManyToOne
   	private UserDetail userdetail;
	

}
