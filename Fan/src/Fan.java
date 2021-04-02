import java.util.Scanner;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    int speed;
    boolean on = false;

    public Fan() {
    }

    double radius = 5;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    String color = "Blue";
    void displayInfo(){
        if (this.isOn()) System.out.println("Speed: "+ this.speed +"\nColor: "+ this.color+"\nRadius: "+ this.radius+"\nFan is on!");
        else System.out.println("Speed: "+ this.speed +"\nColor: "+ this.color+"\nRadius: "+ this.radius+"\nFan is off!");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Fan fan1 = new Fan(3, true, 10, "Yellow");
        Fan fan2 = new Fan(2, false, 5, "Blue");
        fan1.displayInfo();
        fan2.displayInfo();
    }
}


