package Homework14_Advanced.Homework14_Advanced;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class Item {
    private Long id;
    private BigDecimal total;
    private Set<Cart> carts = new HashSet<>();
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public BigDecimal getTotal() {
		return total;
	}
	public void setTotal(BigDecimal total) {
		this.total = total;
	}
	public Set<Cart> getCarts() {
		return carts;
	}
	public void setCarts(Set<Cart> carts) {
		this.carts = carts;
	}
	
	@Override
	public String toString() {
		return "Item [id=" + id + "]";
	}
  
}

