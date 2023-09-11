package producthw;

public class ProductRunner {
    public static void main(String[] args) {
        Cosmetics cosmetics = new Cosmetics(12, "Toothpaste", "Contains toothpaste", 25, "Black", 75);
        Electronics electronics = new Electronics(1200, "TV", "You can watch TV", 10, "Samsung", 150, 100, 1, 5);
        Fridge fridge = new Fridge(600, "Fridge", "You can store your food", 15, "Samsung", 100, 50, 200, 50, -2);

        System.out.println("Name: " +cosmetics.getName());
        System.out.println("Price: " +cosmetics.getPrice());
        System.out.println("Quantity: " + cosmetics.getQuantity());

        System.out.println("\nName: " + electronics.getName());
        System.out.println("Type: " +electronics.getType());
        System.out.println("Length: " +electronics.getLength());

        System.out.println("\nName: " + fridge.getName());
        System.out.println("Description: " + fridge.getDescription());
        System.out.println("Temperature: " + fridge.getTemperature());

    }
}