////////////////////////////////////////////////////////////////////
// [Marco] [Nardelotto] [1189563]
////////////////////////////////////////////////////////////////////
package it.unipd.tos.model;

public class MenuItem {

    private ItemType type;
    private String name;
    private double price;

    public enum ItemType{
        Panini, Fritti, Bevande;
    }

    public MenuItem(ItemType t, String n, double p) {
        this.type = t;
        this.name = n;
        this.price = p;
    }

    public ItemType getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }


}
