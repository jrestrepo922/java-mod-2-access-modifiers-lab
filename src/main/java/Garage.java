import java.util.ArrayList;
import java.util.List;

public class Garage {
    private List<Car> cars;

    public Garage() {
        this.cars = new ArrayList<Car>();
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    } 

    public void addCars(Car carToBeAdded){
        this.cars.add(carToBeAdded); 
        System.out.println("List of all cars");
        for (Car car : cars) {
            System.out.println("Brand: " + car.getBrand() + ", Model: " + car.getModel() + ", Year: " + car.getYear()); 
        }
    }
}
