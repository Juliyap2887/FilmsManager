package ru.netology.domain;


public class ListFilms {
    private int id;
    private int productId;
    private String productName;
    private int productPrice;
    private int count;

    public ListFilms(int id, int productId, String productName, int productPrice, int count) {
        this.id = id;
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.count = count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}

