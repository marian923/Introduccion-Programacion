package co.edu.usta.array.bus.multiclass.logic;

public class Vehicle {
    private String serviceType;
    private String color;
    private String brand;
    private float width;
    private float height;
    private char [][] places;
    private int doorsNumber;
    private String plates;
    private int wheelsNumber;

    // setter and getter methods
    //set ->poner, establecer, colocar
    //get ->obtener
    public  void setServiceType(String serviceTypeValue){
        serviceType=serviceTypeValue;
    }
    public String getServiceType(){
        return serviceType;
    }
    public void setColor(String colors){
        color=colors;
    }
    public String getColor(){
        return color;
    }
    public void setBrand(String brands){
        brand=brands;
    }
    public String getBrand(){
        return brand;
    }
    public void setWidth(float width1){
        width=width1;
    }
    public float getWidth(){
        return  width;
    }
    public void setHeight(float height1){
        height=height1;
    }
    public float getHeight(){
        return height;
    }
    public void setDoorsNumbers(int DoorsNumber1){
        doorsNumber=DoorsNumber1;
    }
    public int getDoorsNumber(){
        return doorsNumber;
    }
    public void setWheelsNumber(int WheelsNumber1){
        wheelsNumber=WheelsNumber1;
    }
    public int getWheelsNumber(){
        return wheelsNumber;
    }

    public void setPlates(String plates1) {
        plates = plates1;
    }
    public String getPlates(){
        return plates;
    }
}
