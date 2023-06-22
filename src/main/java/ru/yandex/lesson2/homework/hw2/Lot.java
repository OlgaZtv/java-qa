package ru.yandex.lesson2.homework.hw2;

public class Lot {

    private long serialKey;
    private long quantity;

    Sku sku;

    public Lot(long serialKey, long quantity, Sku sku) {
        this.serialKey = serialKey;
        this.quantity = quantity;
        this.sku = sku;
    }

    public long getSerialKey() {
        return serialKey;
    }

    public void setSerialKey(long serialKey) {
        this.serialKey = serialKey;
    }

    public Sku getSku() {
        return sku;
    }

    public void setSku(Sku sku) {
        this.sku = sku;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }
}
