package employee;

public class Vendor implements Ipay {
    private int quantity;
    private double pricePerItem;

    @Override
    public double getPaymentAmount() {
        return quantity * pricePerItem;
    }

    public Vendor(int quantity, double pricePerItem) {
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }
}
