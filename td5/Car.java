package td5;

public class Car {
   private final String brand;
   private final long value;


   public Car(String brand, long value){
       this.brand = brand;
       if (value<0){ throw new IllegalArgumentException();}
       else{
           this.value = value;
       }
   }

    public String getBrand() {
        return brand;
    }

    public Car(long value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", value=" + value +
                '}';
    }
}
