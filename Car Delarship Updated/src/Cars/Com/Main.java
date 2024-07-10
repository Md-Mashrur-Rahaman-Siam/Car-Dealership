package Cars.Com;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Store store = new Store();

        boolean exit = false;

        while (!exit) {

            System.out.println("Welcome to Car Dealership Website.\n");
            System.out.println("Enter 1 for Add Car.\n");
            System.out.println("Enter 2 for Delete Car.\n");
            System.out.println("Enter 3 for Search&Sort.\n");
            System.out.println("Enter 4 for Car Buy.\n");
            System.out.println("Enter 5 for Search Client: .\n");
            System.out.println("Enter 6 for Exit.\n");
            System.out.println("Enter here: ");

            int choice;
            choice = sc.nextInt();
            sc.nextLine();

            switch(choice){

                case 1:

                    System.out.print("Enter car company: ");
                    String carCompany = sc.nextLine();
                    System.out.print("Enter model name: ");
                    String modelName = sc.nextLine();
                    System.out.print("Enter car type: ");
                    String carType = sc.nextLine();
                    System.out.print("Enter fuel type: ");
                    String fuelType = sc.nextLine();
                    System.out.print("Enter seat count: ");
                    int seatCount = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter features: ");
                    String features = sc.nextLine();
                    System.out.print("Enter price: ");
                    double price = sc.nextDouble();
                    System.out.println("Enter carsYear: ");
                    int carsYear = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter quantity: ");
                    int quantity = sc.nextInt();

                    Cars car = new Cars(carCompany, modelName, carType,fuelType,seatCount, features,price,carsYear,quantity);

                    store.addCar(car);
                    break;

                case 2:

                    System.out.print("Enter model name of the car to delete: ");
                    String modelToDelete = sc.nextLine();
                    store.deleteCar(modelToDelete);
                    break;

                case 3:
                   store.searchAndSort();
                    break;

                case 4:

                    System.out.println("Enter model name to buy: ");
                    String modelToBuy = sc.nextLine();
                    System.out.println("Enter client name: ");
                    String clientName = sc.nextLine();
                    System.out.println("Enter date of birth: ");
                    String dob = sc.nextLine();
                    System.out.println("Enter client ID: ");
                    String idOfClient = sc.nextLine();
                    System.out.println("Enter permanent address: ");
                    String permanentAddress = sc.nextLine();
                    System.out.println("Enter work company name: ");
                    String workCompanyName = sc.nextLine();
                    System.out.println("Enter phone number: ");
                    String phoneNumber = sc.nextLine();
                    System.out.println("Enter quantity to buy: ");
                    int quantityToBuy = sc.nextInt();
                    sc.nextLine();

                    store.buyCar(modelToBuy, clientName, dob, idOfClient, permanentAddress, workCompanyName, phoneNumber, quantityToBuy);

                    break;

                case 5:
                    System.out.println("Enter client name to search: ");
                    String clientNameToSearch = sc.nextLine();
                    store.searchClient(clientNameToSearch);
                    break;

                case 6:
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
