class Vehicle 
{
    private String brand;
    private String model;
    private double price;

    public Vehicle(String brand, String model, double price)
     {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public String getBrand() 
    {
        return brand;
    }
    public String getModel() 
    {
        return model;
    }
    public double getPrice() 
    {
        return price;
    }

    public void setBrand(String brand)
    {
        this.brand = brand;
    }
    public void setModel(String model) 
    {
        this.model = model;
    }
    public void setPrice(double price) 
    {
        this.price = price;
    }

    public void displayVehicleDetails() 
    {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
    }
}
public class Solution
{
    public static void main(String[] args)
    {
    Vehicle v1 = new Vehicle("Maruti Suzuki","Swift", 1200000);
    Vehicle v2 = new Vehicle("Hyundai","Creta", 1500000);

    v1.setPrice(1250000);

    System.out.println("After Updating Price:");
    v1.displayVehicleDetails();
    }
}
