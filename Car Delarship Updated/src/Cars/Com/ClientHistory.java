package Cars.Com;

import java.util.Date;

public class ClientHistory {

    String clientName;
    String dob;
    String idOfClient;
    String permanentAddress;
    String workCompanyName;
    String phoneNumber;
    String carModel;
    int quantity;
    double price;

    public ClientHistory(String clientName, String dob, String idOfClient, String permanentAddress, String workCompanyName, String phoneNumber, String carModel, int quantity, double price) {
        this.clientName = clientName;
        this.dob = dob;
        this.idOfClient = idOfClient;
        this.permanentAddress = permanentAddress;
        this.workCompanyName = workCompanyName;
        this.phoneNumber = phoneNumber;
        this.carModel = carModel;
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public String toString() {
        return "ClientHistory{" +
                "clientName='" + clientName + '\'' +
                ", dob='" + dob + '\'' +
                ", idOfClient='" + idOfClient + '\'' +
                ", permanentAddress='" + permanentAddress + '\'' +
                ", workCompanyName='" + workCompanyName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", carModel='" + carModel + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }


}
