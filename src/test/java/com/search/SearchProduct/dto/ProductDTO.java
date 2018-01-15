package com.search.SearchProduct.dto;

public class ProductDTO {

    private String productId;
    private String productName;
    private long price;
    private BrandDTO brandDetails;
    private String imageUrl;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public BrandDTO getBrandDetails() {
        return brandDetails;
    }

    public void setBrandDetails(BrandDTO brandDetails) {
        this.brandDetails = brandDetails;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
