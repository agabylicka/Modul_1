package HelloWorld;

public class Car {

    private int weight;
    private String manufacturer;
    private String model;

    public Car(int weight, String manufacturer, String model) {
        this.weight = weight;
        this.manufacturer = manufacturer;
        this.model = model;
        System.out.println(weight);
        System.out.println(manufacturer);
        System.out.println(model);
    }
    
    public void print() {
        System.out.println(weight);
        System.out.println(manufacturer);
        System.out.println(model);
    }
    
    public int getWeight(){
        return weight;
    }
    public String getManufacturer(){
        return manufacturer;
    }
    public String getModel(){
        return model;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }
    public void setManufacturer(String manufacturer){
        this.manufacturer = manufacturer;
    }
    public void setModel(String model){
        this.model = model;
    }
}
