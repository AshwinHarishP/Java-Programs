import java.util.Scanner;

public class VaccineProduction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Constants
        int marketDemand = 20000;
        double costPerBottle = 20.0;
        double storageCostPerBottle = 10.0;

        // Variables
        int productionQuantity = 0;
        double minCost = Double.MAX_VALUE;

        // Loop to find the optimum production quantity
        for (int quantity = 1; quantity <= marketDemand; quantity++) {
            double totalCost = (quantity * costPerBottle) + ((marketDemand - quantity) * storageCostPerBottle);

            if (totalCost < minCost) {
                minCost = totalCost;
                productionQuantity = quantity;
            }
        }

        // Output the optimum production quantity
        System.out.println("Optimum production quantity: " + productionQuantity);
        System.out.println("Minimum cost: $" + minCost);

        // Close the scanner
        scanner.close();
    }
}
