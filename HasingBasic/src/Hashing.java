import java.util.Scanner;

class Bike {
    private int id;
    private String bikeName;
    private int price;
    private double mileage;
    private String company;
    
    // Parameterized constructor
    public Bike(int id, String bikeName, int price, double mileage, String company) {
        this.id = id;
        this.bikeName = bikeName;
        this.price = price;
        this.mileage = mileage;
        this.company = company;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBikeName() {
        return bikeName;
    }

    public void setBikeName(String bikeName) {
        this.bikeName = bikeName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    // toString method for printing the bike details
    @Override
    public String toString() {
        return "Bike ID: " + id + ", Name: " + bikeName + ", Price: " + price + 
               ", Mileage: " + mileage + ", Company: " + company;
    }
}

class Hashing {
    // Static method to find the bike with the highest price
    public static Bike findBikeWithHighestPrice(Bike[] bikes) {
        if (bikes == null || bikes.length == 0) {
            return null;
        }
        
        Bike maxPriceBike = bikes[0];  // Start with the first bike
        for (int i = 1; i < bikes.length; i++) {
            if (bikes[i].getPrice() > maxPriceBike.getPrice()) {
                maxPriceBike = bikes[i];
            }
        }
        return maxPriceBike;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of bikes
        System.out.print("Enter number of bikes: ");
        int n = scanner.nextInt();
        Bike[] bikes = new Bike[n];

        // Input details for each bike
        for (int i = 0; i < n; i++) {
            System.out.print("Enter id for bike " + (i + 1) + ": ");
            int id = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character
            System.out.print("Enter name for bike " + (i + 1) + ": ");
            String bikeName = scanner.nextLine();
            System.out.print("Enter price for bike " + (i + 1) + ": ");
            int price = scanner.nextInt();
            System.out.print("Enter mileage for bike " + (i + 1) + ": ");
            double mileage = scanner.nextDouble();
            scanner.nextLine();  // Consume the newline character
            System.out.print("Enter company for bike " + (i + 1) + ": ");
            String company = scanner.nextLine();
            
            // Create and store the bike object
            bikes[i] = new Bike(id, bikeName, price, mileage, company);
        }

        // Find and print the bike with the highest price
        Bike highestPriceBike = findBikeWithHighestPrice(bikes);
        if (highestPriceBike != null) {
            System.out.println("Bike with the highest price: " + highestPriceBike);
        } else {
            System.out.println("No bikes found.");
        }

        scanner.close();
    }
}
