package Homework14_Advanced.Homework14_Advanced;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;

public class Cart {
    private Long id;
    private BigDecimal total;
    private String name;
    private Set<Item> items = new HashSet<>();
   
    public Set<Item> getItems1() {
        return items;
    }

    public void setItems1(Set<Item> items) {
        this.items = items;
    }
    
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Item> getItems() {
		return items;
	}
	public void setItems(Set<Item> items) {
		this.items = items;
	}
	@Override
	public String toString() {
		return "Cart [id=" + id + ", total=" + total + ", name=" + name + "]";
	}

    
}

