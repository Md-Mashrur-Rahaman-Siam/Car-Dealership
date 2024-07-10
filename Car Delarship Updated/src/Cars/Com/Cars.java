package Cars.Com;

public class Cars {

    private String carCompany;

    private String modelName;

    private String carType;

    private String fuelType;

    private int seatCount;

    private String features;

    private double price;

    private int carYear;

    private int quantity;

    public Cars(String carCompany, String modelName, String carType, String fuelType, int seatCount, String features, double price, int carYear, int quantity) {
        this.carCompany = carCompany;
        this.modelName = modelName;
        this.carType = carType;
        this.fuelType = fuelType;
        this.seatCount = seatCount;
        this.features = features;
        this.price = price;
        this.carYear = carYear;
        this.quantity = quantity;
    }

    public String getCarCompany() {
        return carCompany;
    }

    public void setCarCompany(String carCompany) {
        this.carCompany = carCompany;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }

    public String getFeatures() {
        return features;
    }

    public void setFeatures(String features) {
        this.features = features;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getCarYear() {
        return carYear;
    }

    public void setCarYear(int carYear) {
        this.carYear = carYear;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "carCompany='" + carCompany + '\'' +
                ", modelName='" + modelName + '\'' +
                ", carType='" + carType + '\'' +
                ", fuelType='" + fuelType + '\'' +
                ", seatCount=" + seatCount +
                ", features='" + features + '\'' +
                ", price=" + price +
                ", carYear=" + carYear +
                ", quantity=" + quantity +
                '}';
    }
}
