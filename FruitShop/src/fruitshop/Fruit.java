/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fruitshop;

/**
 *
 * @author Admin
 */
public class Fruit {
    public int Fruit_Id;
    public String Fruit_Name;
    public double Price;
    public int Quantity;
    public String Origin;

    public Fruit() {
    }

    public Fruit(int Fruit_Id, String Fruit_Name, double Price, int Quantity, String Origin) {
        this.Fruit_Id = Fruit_Id;
        this.Fruit_Name = Fruit_Name;
        this.Price = Price;
        this.Quantity = Quantity;
        this.Origin = Origin;
    }

    public int getFruit_Id() {
        return Fruit_Id;
    }

    public void setFruit_Id(int Fruit_Id) {
        this.Fruit_Id = Fruit_Id;
    }

    public String getFruit_Name() {
        return Fruit_Name;
    }

    public void setFruit_Name(String Fruit_Name) {
        this.Fruit_Name = Fruit_Name;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public String getOrigin() {
        return Origin;
    }

    public void setOrigin(String Origin) {
        this.Origin = Origin;
    }
     
    
}
