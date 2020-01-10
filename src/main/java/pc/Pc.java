package pc;

public class Pc {
    private Cases cases;
    private MotherBoard motherBoard;
    private Monitor monitor;

    public Pc(Cases cases, MotherBoard motherBoard, Monitor monitor){
      this.cases = cases;
      this.motherBoard = motherBoard;
      this.monitor = monitor;
    }
    public Pc( ){

    }
    public void drawLogo(){
        monitor.drawPixelsAt(120, 60, "Silver");
    }
    public void powerUp(){
        cases.pressPowerButton();
        drawLogo();
        motherBoard.loadProgram("OSX 12" );
    }
    public void description(){
        System.out.println(cases + "" + motherBoard + monitor);
    }

    @Override
    public String toString() {
        return "Pc{" +
                "cases=" + cases +
                ", motherBoard=" + motherBoard +
                ", monitor=" + monitor +
                '}';
    }
}
