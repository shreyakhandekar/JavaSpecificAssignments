package javaspecific;

import java.util.HashMap;

public class HashCode {
    public static void main(String[] args) {
        HashMap<Price, String> hm = new HashMap<Price, String>();
        hm.put(new Price("Banana", 20), "Banana");
        hm.put(new Price("Apple", 40), "Apple");
        hm.put(new Price("Orange", 30), "Orange");
        Price key = new Price("Banana", 20);
        System.out.println("Hashcode of key: " + key.hashCode());
        System.out.println("Value from Map: " + hm.get(key));
    }
}
class Price{
    private String item;
    private int price;

    public Price(String item, int price){
        this.item = item;
        this.price = price;
    }

    public int hashCode() {
        System.out.println("I am in hashcode");
        int hashcode = 0;
        hashcode = price * 20;
        hashcode += item.hashCode();
        return hashcode;
    }

    public boolean equals(Object obj) {
        System.out.println("I am in equals");
        if (obj instanceof Price) {
            Price p = (Price) obj;
            return (p.item.equals(this.item) && p.price == this.price);
        } else {
            return false;
        }
    }
    public String getItem() {
        return item;
    }
    public void setItem(String item) {
        this.item = item;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String toString(){
        return "item: "+item+"  price: "+price;
    }
}

