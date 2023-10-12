package week5.PatikaStore;

import java.util.ArrayList;
import java.util.Scanner;

public class Phone extends Product {
    private int id;
    private int batteryPower;
    private String color;
    private int camera;
    private static ArrayList<Phone> phones = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public Phone(int id, String name, double price, double discountRate, int unitInStock, Brand brand, int storage, int ram, double screenSize, int camera, int batteryPower, String color) {
        super(name, price, discountRate, unitInStock, brand, storage, ram, screenSize);
        this.id = id;
        this.camera = camera;
        this.batteryPower = batteryPower;
        this.color = color;
    }


    static {
        phones.add(new Phone(1, "SAMSUNG GALAXY A51", 3199.0, 0.5, 5, new Brand("Samsung"), 128, 6, 6.5, 32, 4000, "Siyah"));
    }


    public static void phoneMenu() {
        boolean showMenu = true;
        while (showMenu) {
            System.out.println("-----Phone Menu-----");
            System.out.println("1 -> List Phones");
            System.out.println("2 -> Add a Phone");
            System.out.println("3 -> Delete a Phone");
            System.out.println("0 -> Exit");
            System.out.println("--------------------------------");
            System.out.print("Please make a choice: ");
            int select = input.nextInt();
            int select = input.nextInt();

            switch (select) {
                case 1:
                    printPhones();
                    break;
                case 2:
                    addPhone();
                    System.out.println("Product added successfully!");
                    break;
                case 3:
                    deletePhone();
                    phones.size();
                    System.out.println("Product deleted successfully!");
                    break;
                case 0:
                    showMenu = false;
                    break;
            }
        }
    }

    public static void printPhones() {
        System.out.println("1 -> List by ID");
        System.out.println("2 -> List by Brand");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.format("| %-3s | %-30s | %-10s    | %-10s | %-10s | %-10s | %-10s | %-10s | %-10s | %-10s |\n",
                        "ID", "Product Name", "Price", "Brand", "Storage", "Screen", "Camera", "Battery", "RAM", "Color");
                System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");

                for (Phone p : phones) {
                    System.out.format("| %-3d | %-30s | %-10.2f TL | %-10s | %-10d | %-10.1f | %-10d | %-10d | %-10d | %-10s |\n",
                            p.getId(), p.getName(), p.getPrice(), p.getBrand().getBrandName(),
                            p.getStorage(), p.getScreenSize(), p.getCamera(), p.getBatteryPower(), p.getRam(), p.getColor());
                }
                System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
        }
    }

    public static void addPhone() {
        System.out.print("Enter Product Name: ");
        String name = input.next() + input.nextLine();
        System.out.print("Enter Price: ");
        double price = input.nextDouble();
        System.out.print("Enter Discount: ");
        double discountRate = input.nextDouble();
        System.out.print("Enter Amount: ");
        int unitInStock = input.nextInt();
        System.out.println("-----Brands-----");
        Brand.printBrands();
        System.out.print("Choose a Brand from the list by number:");
        int selectedBrand = input.nextInt() - 1;
        while (!(selectedBrand >= 0 && selectedBrand < 9)) {
            System.out.println("Invalid entry!");
            System.out.print("Choose a Brand from the list by number:");
            selectedBrand = input.nextInt() - 1;
        }
        System.out.print("Enter Storage in GBs: ");
        int memory = input.nextInt();
        System.out.print("Enter RAM in GBs: ");
        int ram = input.nextInt();
        System.out.print("Enter Screen Size in inches: ");
        double screenSize = input.nextDouble();
        System.out.print("Enter Camera in pixels: ");
        int camera = input.nextInt();
        System.out.print("Enter Battery Power: ");
        int batteryPower = input.nextInt();
        System.out.print("Enter color: ");
        String color = input.next();

        int maxId = 0;
        for (Phone p : phones) {
            if (p.getId() > maxId) {
                maxId = p.getId();
            }
        }

        // Assign the new phone an ID one integer higher than the maximum ID
        int newPhoneId = maxId + 1;

        phones.add(new Phone(newPhoneId, name, price, discountRate, unitInStock, Brand.selectBrand(selectedBrand), memory, ram, screenSize, camera, batteryPower, color));
    }

    public static void deletePhone() {
        printPhones();
        System.out.println("Select phone by ID to delete: ");
        int selectId = input.nextInt() - 1;
        phones.remove(selectId);
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public static ArrayList<Phone> getPhones() {
        return phones;
    }

    public static void setPhones(ArrayList<Phone> phones) {
        Phone.phones = phones;
    }

    public int getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }

    public int getBatteryPower() {
        return batteryPower;
    }

    public void setBatteryPower(int batteryPower) {
        this.batteryPower = batteryPower;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}