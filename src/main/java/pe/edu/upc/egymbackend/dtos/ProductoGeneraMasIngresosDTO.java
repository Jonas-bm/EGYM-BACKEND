package pe.edu.upc.egymbackend.dtos;

import java.math.BigDecimal;

public class ProductoGeneraMasIngresosDTO {

    private String nameProduct;
    private BigDecimal totalAmount;

    public ProductoGeneraMasIngresosDTO(){
    }

    public ProductoGeneraMasIngresosDTO(String nameProduct, BigDecimal totalAmount) {
        this.nameProduct = nameProduct;
        this.totalAmount = totalAmount;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }
}
