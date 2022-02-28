package peaksoft;

public class Dog implements Animal {

    private  String brand;
    private String color;
    private String dogName;


    public Dog(String brand, String color, String dogName) {
        this.brand = brand;
        this.color = color;
        this.dogName = dogName;
    }

    public Dog() {
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

    public String getDogName() {
        return dogName;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    @Override
    public void animalPlus(){
        System.out.println("Hey my names is Dog: "+getDogName());

    }
    @Override
    public void animalMinus(){
        System.out.println("Hey my names is DogColor: "+getColor());

    }

    @Override
    public String toString() {
        return "Dog{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", dogName='" + dogName + '\'' +
                '}';
    }
}
