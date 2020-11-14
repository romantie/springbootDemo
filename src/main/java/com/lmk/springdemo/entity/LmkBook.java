package com.lmk.springdemo.entity;

public class LmkBook {

    int id;
    String name;
    int price;
    String file;

    public LmkBook() {
    }

    public LmkBook(int id, String name, int price, String file) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.file = file;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getFile() {
        return file;
    }
    @Override
    public String toString() {
        return "LmkBook{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", file='" + file + '\'' +
                '}';
    }
}
