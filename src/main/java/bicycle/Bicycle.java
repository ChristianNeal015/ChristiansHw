package bicycle;

public class Bicycle {
    public double cadence;
    public double gear;
    public double speed;

    public Bicycle(double cadence, double gear, double speed){
        this.cadence = cadence;
        this.gear = gear;
        if (speed < 0) {
            System.out.println("cannot set negative speed. Speed is 0.");
            this.speed = 0;
        } else {
            this.speed = speed;
        }
    }
    public void applyBrake(double x){
        if (x < 0){
            System.out.println("Not possible");
        } else if (speed > x){
            speed = speed - x;
        }else {
            speed = 0;
        }
    }
    public void speedUp(double y){
        if (y < 0){
            System.out.println("Not possible");
        } else{
            speed = speed + y;
        }
    }
}
