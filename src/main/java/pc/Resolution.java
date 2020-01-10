package pc;

public class Resolution {
    public int length;
    public int height;

    public Resolution(int length, int height) {
        this.length = length;
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Resolution{" +
                "length=" + length +
                ", height=" + height +
                '}';
    }
}
