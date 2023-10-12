package week5.PatikaStore;

import java.util.ArrayList;
import java.util.Scanner;

public class Notebook extends Product {
    static Scanner input = new Scanner(System.in);

    private int id;
    private static ArrayList<Notebook> notebooks = new ArrayList<>();

    public Notebook(int id, String name, double price, double discountRate, int unitInStock, Brand brand, int memory, int ram, double screenSize) {
        super(name, price, discountRate, unitInStock, brand, memory, ram, screenSize);
        this.id = id;
    }

    static {
        notebooks.add(new Notebook(1, "HUAWEI Matebook 14", 7000, 0.5, 5, new Brand("Huawei"), 512, 16, 14));
    }

    public static void notebookMenu() {
        boolean showMenu = true;
        while (showMenu) {
            System.out.println("----Laptop İşlemleri-----");
            System.out.println("1-Laptop Listele");
            System.out.println("2-Yeni Bir Laptop Ekle");
            System.out.println("3-Mevcut Bir Laptop Sil");
            System.out.println("0-Çıkış Yap");
            System.out.println("--------------------------------");
            System.out.print("Bir seçim yapınız : ");
            int select = input.nextInt();
            switch (select) {
                case 1:
                    printNotebook();
                    break;
                case 2:
                    addNotebook();
                    System.out.println("Ürün ekleme başarılı!");
                    break;
                case 3:
                    deleteNotebook();
                    notebooks.size();
                    System.out.println("Ürün silme başarılı!");
                    break;
                case 0:
                    showMenu = false;
                    break;
            }
        }
    }

    public static void printNotebook() {
        System.out.println("1: ID'ye göre listele");
        System.out.println("2: Markaya göre filtrele");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                System.out.println("-----------------------------------------------------------------------------------------------------------");
                System.out.format("| %-2s | %-30s | %-10s    | %-10s | %-10s | %-10s | %-10s |\n",
                        "ID", "Ürün Adı", "Fiyat", "Marka", "Depolama", "Ekran", "RAM");
                System.out.println("-----------------------------------------------------------------------------------------------------------");

                for (Notebook n : notebooks) {
                    System.out.format("| %-2d | %-30s | %-10.2f TL | %-10s | %-10d | %-10.1f | %-10d |\n",
                            n.getId(), n.getName(), n.getPrice(), n.getBrand().getBrandName(),
                            n.getMemory(), n.getScreenSize(), n.getRam());
                }

                System.out.println("-----------------------------------------------------------------------------------------------------------");
        }
    }

    public static void addNotebook() {
        System.out.print("Ürünün adını giriniz : ");
        String name = input.next() + input.nextLine();
        System.out.print("Ürünün fiyatını giriniz : ");
        double price = input.nextDouble();
        System.out.print("Ürünün indirim oranını giriniz : ");
        double discountRate = input.nextDouble();
        System.out.print("Ürünün stok adedini giriniz : ");
        int unitInStock = input.nextInt();
        System.out.println("----Markalar----");
        Brand.printBrands();
        System.out.print("Lütfen marka seçiniz : ");
        int selectedBrand = input.nextInt() - 1;
        System.out.print("Ürünün hafızasını(GB) giriniz : ");
        int memory = input.nextInt();
        System.out.print("Ürünün RAM'ini giriniz : ");
        int ram = input.nextInt();
        System.out.print("Ürünün ekran boyununu inç olarak giriniz : ");
        double screenSize = input.nextDouble();

        int maxId = 0;
        for (Notebook n : notebooks) {
            if (n.getId() > maxId) {
                maxId = n.getId();
            }
        }

        // Assign the new phone an ID one integer higher than the maximum ID
        int newNotebookId = maxId + 1;
        notebooks.add(new Notebook(newNotebookId, name, price, discountRate, unitInStock, Brand.selectBrand(selectedBrand), memory, ram, screenSize));
    }

    public static void deleteNotebook() {
        printNotebook();
        System.out.println("Hangi laptopu silmek istiyorsunuz : ");
        int selectId = input.nextInt() - 1;
        notebooks.remove(selectId);

    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public static ArrayList<Notebook> getNotebooks() {
        return notebooks;
    }

    public static void setNotebooks(ArrayList<Notebook> notebooks) {
        Notebook.notebooks = notebooks;
    }
}