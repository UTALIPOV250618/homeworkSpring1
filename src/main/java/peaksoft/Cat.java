package peaksoft;

public class Cat implements Animal {

    private  String brand;
    private String color;
    private  String catName;

    public Cat() {
    }

    public Cat(String brand, String color, String catName) {
        this.brand = brand;
        this.color = color;
        this.catName = catName;
    }

    @Override
    public void animalPlus() {

        System.out.println("Hey my names is Cat: "+getCatName());
    }

    @Override
    public void animalMinus() {
        System.out.println("Hey my names is CatColor: "+getColor());
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }





    @Override
    public String toString() {
        return "Cat{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", catName='" + catName + '\'' +
                '}';
    }
}
