package car;

public class Car {
    private int windows;
    private int doors;

    public Car(int windows, int doors) {
        this.windows = windows;
        this.doors = doors;
    }
    public void setWindows(int windows){
        this.windows = windows;
        }

        private int Display(){
        return windows;
    }

        private int carFeatures(){
        return doors;
    }

        public void showThatCar(){
            System.out.println(Display());
            System.out.println(carFeatures());
        }

    @Override
    public String toString() {
        return "Car{" + "windows=" + windows + ", doors=" + doors +'}';
    }
}
