public class Car extends Vehicle implements Drivable, Comparable<Car> {
    private String model;
    private int speed;

    Car() {
    }

    Car(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    // Setter
    public void setModel(String model) {
        this.model = model;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // Getter
    public String getModel() {
        return this.model;
    }

    public int getSpeed() {
        return this.speed;
    }

    @Override
    public void steer() {
        System.out.println("Turn Steering Wheel");
    }

    @Override
    public String howToDrive() {
        return "Step on the Gas padel";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Car otheCar = (Car) obj;
        return model.equals(otheCar.model);
    }

    @Override
    public int compareTo(Car otherCar){
        return Integer.compare(this.speed,  otherCar.speed)
    }

}
