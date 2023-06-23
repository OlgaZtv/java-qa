package ru.yandex.lesson2.homework.hw2;

public class SerialInventory {
    private long serialKey;
    private long quantity;

    private Sku sku;
    private Lot lot;
    private Loc loc;

    public SerialInventory(long serialKey, long quantity, Sku sku, Lot lot, Loc loc) {
        this.serialKey = serialKey;
        this.quantity = quantity;
        this.sku = sku;
        this.lot = lot;
        this.loc = loc;
    }

    public long getSerialKey() {
        return serialKey;
    }

    public void setSerialKey(long serialKey) {
        this.serialKey = serialKey;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public Sku getSku() {
        return sku;
    }

    public void setSku(Sku sku) {
        this.sku = sku;
    }

    public Lot getLot() {
        return lot;
    }

    public void setLot(Lot lot) {
        this.lot = lot;
    }

    public Loc getLoc() {
        return loc;
    }

    public void setLoc(Loc loc) {
        this.loc = loc;
    }
}
