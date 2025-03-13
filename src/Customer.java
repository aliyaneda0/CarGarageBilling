public class Customer {

    private String name ;
    private String mobNum;

    private Car car;

    public String getName() {
        return name;
    }

    public String getMobNum() {
        return mobNum;
    }

    public Car getCar() {
        return car;
    }

    public Customer(String name,String mobNum,Car car ){
         this.name= name;
         this.mobNum= mobNum;
         this.car= car;
    }
}

