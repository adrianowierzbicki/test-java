package br.com.blz.testjava.dto;
import javax.validation.constraints.NotNull;

public class WarehouseDTO {

    @NotNull
    private String locality;

    @NotNull
    private Integer quantity;

    @NotNull
    private String type;

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
    
}
