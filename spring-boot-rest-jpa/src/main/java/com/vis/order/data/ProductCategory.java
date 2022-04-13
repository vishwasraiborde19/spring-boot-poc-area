package com.vis.order.data;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity(name = "products")
public class ProductCategory {

	@Getter @Setter @Column(name = "productname")    String productName;	
	@Id @Getter @Setter @Column(name = "productcode") String productCode;		
	@Getter @Setter @Column(name = "productline") String productLine;
	@Getter @Setter @Column(name = "productscale")String productScale;
	@Getter @Setter @Column(name = "productvendor") String productVendor;
	@Getter @Setter @Column(name = "productdescription")String productDescription;
	@Getter @Setter @Column(name = "quantityinstock")Integer quantityInStock;
	@Getter @Setter @Column(name = "buyprice")Double buyPrice;
	@Getter @Setter @Column(name = "msrp") Double MSRP;
	
	
	@Override
	public int hashCode() {
		return Objects.hash(productCode);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductCategory other = (ProductCategory) obj;
		return Objects.equals(productCode, other.productCode);
	}
	@Override
	public String toString() {
		return "ProductCategory [productName=" + productName + ", productCode=" + productCode + ", productLine="
		        + productLine + ", productScale=" + productScale + ", productVendor=" + productVendor
		        + ", productDescription=" + productDescription + ", quantityInStock=" + quantityInStock + ", buyPrice="
		        + buyPrice + ", MSRP=" + MSRP + "]";
	}
	
	
	

}
