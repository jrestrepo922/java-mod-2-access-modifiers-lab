public class Main {
    public static void main(String[] args) {
        Car rx8 = new Car("Mazda", "Rx8", 2008);
        Car rouge = new Car("Nissan", "Rouge", 2011); 
        Car altima = new Car("Nissan", "Altima", 2007);
        Garage garage = new Garage(); 
        garage.addCars(rx8);
        garage.addCars(rouge);
        garage.addCars(altima);

    }
}
