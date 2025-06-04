import java.util.*;

public class BogoOffer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from user dynamically
        System.out.println("Enter product prices (comma-separated): ");
        String input = scanner.nextLine();
        String[] tokens = input.split(",");
        List<Integer> prices = new ArrayList<>();

        for (String token : tokens) {
            prices.add(Integer.parseInt(token.trim()));
        }

        // Sort prices in descending order
        prices.sort(Collections.reverseOrder());

        List<Integer> payableItems = new ArrayList<>();
        List<Integer> freeItems = new ArrayList<>();

        // Iterate and form pairs
        for (int i = 0; i < prices.size(); i += 2) {
            payableItems.add(prices.get(i));
            if (i + 1 < prices.size()) {
                freeItems.add(prices.get(i + 1));
            }
        }

        // Display result
        System.out.println("Payable Items: " + payableItems);
        System.out.println("Free Items: " + freeItems);
    }
}
