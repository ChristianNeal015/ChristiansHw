package pc;

public class Monitor extends Pc {
    private int model;
    private int size;
    private String nativeResolution;
    private String manufacturer;


    public Monitor(int model, int size, String nativeResolution, String manufacturer) {
        this.model = model;
        this.size = size;
        this.nativeResolution = nativeResolution;
        this.manufacturer = manufacturer;
    }

    public Monitor(){

    }


    public int getModel() {
        return model;
    }

    public int getSize() {
        return size;
    }

    public String getNativeResolution() {
        return nativeResolution;
    }
    public void drawPixelsAt(int x, int y, String color) {
        System.out.println("Drawing pixel at " + x + "," + y + " " + " in color " + color);
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "model=" + model +
                ", size=" + size +
                ", nativeResolution='" + nativeResolution + '\'' +
                '}';
    }
}

