package ru.yandex.lesson2.homework.hw2;

public class SerialInventoryBuilder {

    private long serialKey;
    private long quantity;
    Sku sku;
    Lot lot;
    Loc loc;

    public static SerialInventoryBuilder builder() {
        return new SerialInventoryBuilder();
    }

    public SerialInventoryBuilder withSerialKey(long serialKey) {
        this.serialKey = serialKey;
        return this;
    }

    public SerialInventoryBuilder withQuantity(long quantity) {
        this.quantity = quantity;
        return this;
    }

    public SerialInventoryBuilder withSku (Sku sku) {
        this.sku = sku;
        return this;
    }

    public SerialInventoryBuilder withLot(Lot lot) {
        this.lot = lot;
        return this;
    }

    public SerialInventoryBuilder withLoc(Loc loc) {
        this.loc = loc;
        return this;
    }

    public SerialInventory build() {return new SerialInventory(serialKey, quantity, sku, lot, loc);}
}
