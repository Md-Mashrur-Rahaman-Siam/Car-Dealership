package Cars.Com;


import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import  java.util.Scanner;
import java.util.Comparator;

public class Store {

    private ArrayList<Cars> cars;
    private List<ClientHistory> clientHistoryList = new ArrayList<>();

    public Store(){

        cars = new ArrayList<>();

        cars.add(new Cars("toyota", "Highlander", "Hybrid","Diesal",5, "N/A", 4600000.0,2024, 5));
        cars.add(new Cars("toyota", "bz4x", "EV","EV",5, "N/A", 5200000.0,2024, 5));
        cars.add(new Cars("toyota", "Camry", "EV","EV",4, "N/A", 3600000.0,2024, 5));
        cars.add(new Cars("toyota", "Corolla Hatchback", "Hybrid","Diesal",4, "N/A", 2600000.0,2024, 4));
        cars.add(new Cars("toyota", "Filder2022", "Hybrid","Diesal",4, "N/A", 1700000.0,2022, 10));
        cars.add(new Cars("toyota", "Axio2022", "Hybrid","Diesal",4, "N/A", 2200000.0,2022, 7));
        cars.add(new Cars("toyota", "Axio2024", "Hybrid","Diesal",4, "N/A", 2500000.0,2024, 5));
        cars.add(new Cars("toyota", "Premio2022", "Hybrid","Diesal",4, "N/A", 2900000.0,2022, 5));
        cars.add(new Cars("toyota", "Alion2022", "Hybrid","Diesal",4, "N/A", 3200000.0,2022, 5));
        cars.add(new Cars("toyota", "Alphard2015", "Minivans","Diesal",8, "N/A", 5000000.0,2015, 3));
        cars.add(new Cars("toyota", "Alphard2024", "MiniVans","Diesal",8, "N/A", 6500000.0,2024, 5));
        cars.add(new Cars("toyota", "Supra2010", "Sports","Diesal",2, "N/A", 15000000.0,2010, 1));
        cars.add(new Cars("Honda", "Prologue", "SUV","EV",5, "N/A", 6500000.0,2024, 2));
        cars.add(new Cars("Honda", "Odyssey", "Minivans","diesal",8, "N/A", 5000000.0,2024, 4));
        cars.add(new Cars("Honda", "Ridgeline", "Van","diesal",5, "N/A", 5700000.0,2024, 3));
        cars.add(new Cars("Honda", "Civic Sedan", "Cars","diesal",4, "N/A", 2500000.0,2024, 4));
        cars.add(new Cars("Honda", "Civic Hatchback", "Cars","diesal",4, "N/A", 2700000.0,2024, 5));
        cars.add(new Cars("Honda", "Accord Hybrid", "Hybrid","diesal",4, "N/A", 3700000.0,2024, 5));
    }

    public void addCar(Cars car){

        cars.add(car);
        System.out.println("Successful!");
    }

    public void deleteCar(String modelName) {

        boolean found = cars.removeIf(car -> car.getModelName().equalsIgnoreCase(modelName));

        if (found) {

            System.out.println("Car deleted successfully!");

        } else {
            System.out.println("Car not found!");
        }
    }


    public void buyCar(String modelName, String clientName, String dob, String idOfClient, String permanentAddress, String workCompanyName, String phoneNumber, int quantityToBuy) {

        for (Cars car : cars) {

            if (car.getModelName().equalsIgnoreCase(modelName)) {

                if (car.getQuantity() >= quantityToBuy) {

                    car.setQuantity(car.getQuantity() - quantityToBuy);

                    double totalPrice = car.getPrice() * quantityToBuy;

                    ClientHistory clientHistory = new ClientHistory(clientName, dob, idOfClient, permanentAddress, workCompanyName, phoneNumber, modelName, quantityToBuy, totalPrice);

                    clientHistoryList.add(clientHistory);

                    generateReceipt(clientHistory);

                    return;

                } else {

                    System.out.println("Insufficient stock for car model: " + modelName);
                }
                return;
            }
        }
        System.out.println("Car not found: " + modelName);
    }

    public void generateReceipt(ClientHistory clientHistory) {

        System.out.println("Receipt:");

        System.out.println("Client Name: " + clientHistory.clientName);

        System.out.println("Address: " + clientHistory.permanentAddress);

        System.out.println("Phone Number: " + clientHistory.phoneNumber);

        System.out.println("Car Model: " + clientHistory.carModel);

        System.out.println("Quantity: " + clientHistory.quantity);

        System.out.println("Total Price: " + clientHistory.price);
    }

    public void searchClient(String clientName) {

        for (ClientHistory clientHistory : clientHistoryList) {

            if (clientHistory.clientName.equalsIgnoreCase(clientName)) {

                System.out.println(clientHistory);
            }
        }
    }

    public void searchAndSort() {

        Scanner sc = new Scanner(System.in);


        System.out.println("Enter your budget: ");
        double budget = sc.nextDouble();
        sc.nextLine();

        System.out.println("Enter car type: ");
        String carType = sc.nextLine();

        System.out.println("Enter fuel type: ");
        String fuelType = sc.nextLine();

        System.out.println("Enter seat count: ");
        int seatCount = sc.nextInt();
        sc.nextLine();


        List<Cars> filteredCars = new ArrayList<>();

        for (Cars car : cars) {

            if (car.getPrice() <= budget && car.getCarType().equalsIgnoreCase(carType) &&
                    car.getFuelType().equalsIgnoreCase(fuelType) && car.getSeatCount() == seatCount) {

                filteredCars.add(car);

            }
        }


        Collections.sort(filteredCars, Comparator.comparingDouble(Cars::getPrice));


        System.out.println("Sorted cars by price:");

        for (Cars car : filteredCars) {

            System.out.println(car);
        }
    }
}
