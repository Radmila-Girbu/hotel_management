package hotelManagementSystem;

public class PriceRate {
   private double price;
   private String startData;
   private String endData;

    public PriceRate(double price, String startData, String endData) {
        this.price = price;
        this.startData = startData;
        this.endData = endData;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getStartData() {
        return startData;
    }

    public void setStartData(String startData) {
        this.startData = startData;
    }

    public String getEndData() {
        return endData;
    }

    public void setEndData(String endData) {
        this.endData = endData;
    }
}
