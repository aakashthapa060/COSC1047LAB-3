import java.sql.Date;

abstract class Vehicle {
    private String color;
    private Date dateMade;

    Vehicle() {
    }

    Vehicle(String color, Date dateMade) {
        this.color = color;
        this.dateMade = dateMade;
    }

    // Getter
    public String getColor() {
        return this.color;
    }

    public Date getDateMade() {
        return this.dateMade;
    }

    // Setter
    public void setColor(String color) {
        this.color = color;
    }

    public void setDateMade(Date dateMade) {
        this.dateMade = dateMade;
    }

    // Methods
    abstract void steer();
}

interface Drivable {
    String howToDrive();
}
