package labor11_2;

import java.io.File;
import java.util.*;

public class Storage {
    Map<Integer,Product> products = new HashMap<>();

    public Storage(String fileName) {

        try (Scanner sc = new Scanner(new File(fileName))) {

            while (sc.hasNextLine()) {

                String line = sc.nextLine();
                String[] parts = line.split(" ");

                int id = Integer.parseInt(parts[0].trim());
                String name = parts[1].trim();
                int amount = Integer.parseInt(parts[2].trim());
                int price = Integer.parseInt(parts[3].trim());

                Product product = new Product(id, name, amount, price);

                products.put(id, product);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public Product findById(int id) {
        return products.get(id);
    }

    public int update(String fileName) {
        int updatedCount = 0;

        try (Scanner sc = new Scanner(new File(fileName))) {
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] parts = line.split(" ");

                int id = Integer.parseInt(parts[0].trim());
                int newAmount = Integer.parseInt(parts[1].trim());



                if (products.containsKey(id)) {
                    Product p = products.get(id);
                    p.increaseAmount(newAmount);
                    updatedCount++;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return updatedCount;
    }
}
