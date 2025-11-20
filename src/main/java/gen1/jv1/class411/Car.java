package gen1.jv1.class411;


public class Car {
    private String brand;

    private Integer year;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String toString() {
        if (year == null) {
            throw new NullPointerException("The year is null");
        }
        if (brand == null) {
            throw new NullPointerException("The brand is null");
        }
        return "The car brand is: " + getBrand() + " the year is: " + getYear();
    }

    public static void main(String[] args) {
        // Car BMW 2020
        Car car = new Car();
        car.setBrand("BMW");
        car.setYear(2020);

        // Print the car
        System.out.println(car);
    }
}
