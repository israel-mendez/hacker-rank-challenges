class Car {
    public void topSpeed() {
        System.out.println("Top Speed of the vehicle is 100 kmph");
    }

    public void fuelType() {
        System.out.println("Car fuel type is Petrol");
    }
}

class SUV extends Car {
    @Override
    public void fuelType() {
        System.out.println("SUV fuel type is Diesel");
    }
}