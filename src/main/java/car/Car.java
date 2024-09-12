
package     car;


public class    Car {
    private String make;
    private String model;
    private int year;
    private String colour;
    private double price;
    
    public String getMake(){
        return make;
    }
    public void setMake(String make){
        this.make=make;
    }
    
    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model=model;
        
    }
    public int getyear(){
        return year;
    }
    public void setyear(int year){
        this.year=year;
    }
    public String getcolour(){
        return colour;
    }
    public void setcolour(String colour){
        this.colour=colour;
    }
    public double getPrice(){
        return price;
    }

 
    public void setPrice(double price){
        this.price=price;
    }

    
    public static void main(String[] args){
        Car car1=new Car();
        car1.setMake("Toyota");
        car1.setModel("camry");
        car1.setyear(2022);
        car1.setcolour("silver");
        car1.setPrice(25000.00);
        
        
        Car car2=new Car();
        car2.setMake("honda");
        car2.setModel("Accord");
        car2.setyear(2021);
        car2.setcolour("Red");
        car2.setPrice(28000.00);
        
        Car car3=new Car();
        car3.setMake("Ford");
        car3.setModel("Mustang");
        car3.setyear(2023);
        car3.setcolour("blue");
        car3.setPrice(35000.00);
        
        
       System.out.println("car 1:");
       System.out.println("make: " +car1.getMake());
        System.out.println("model: " +car1.getModel());
         System.out.println("year: " +car1.getyear());
          System.out.println("colour: " +car1.getcolour());
           System.out.println("price: " +car1.getPrice());
           
            System.out.println("car 2:");
       System.out.println("make: " +car2.getMake());
        System.out.println("model: " +car2.getModel());
         System.out.println("year: " +car2.getyear());
          System.out.println("colour: " +car2.getcolour());
           System.out.println("price: " +car2.getPrice());
           
            System.out.println("car 3:");
       System.out.println("make: " +car3.getMake());
        System.out.println("model: " +car3.getModel());
         System.out.println("year: " +car3.getyear());
          System.out.println("colour: " +car3.getcolour());
           System.out.println("price: " +car3.getPrice());
    }
    
   
}
