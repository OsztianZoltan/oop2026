
package oop.labor02;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        /*BankAccount account1 = new BankAccount("BT1");
        System.out.println(account1.getAccountNumber()+ " : "+ account1.getBalance());
        account1.deposit(1000);
        System.out.println(account1.getAccountNumber()+ " : "+account1.getBalance());
        account1.withdraw(500);
        System.out.println(account1.getAccountNumber()+ " : "+account1.getBalance());
       if( account1.withdraw(1000)) {
           System.out.println(account1.getAccountNumber() + " : " + account1.getBalance());
       }
       else System.out.println("Sikertelen levetel");
        BankAccount account2 = new BankAccount("OTP00002");
        System.out.println(account2.getAccountNumber()+ " : "+account2.getBalance());
        account2.deposit(2000);
        System.out.println(account2.getAccountNumber()+ " : "+account2.getBalance());

        Rectangle rectangle1 = new Rectangle(-5,0);
        System.out.println("Length: " + rectangle1.getLength() + " Width: " + rectangle1.getWidth() + " Area: " + rectangle1.area() + " Perimeter : " + rectangle1.perimeter());
        Rectangle[] rectangles= new Rectangle[10];
        for(int i = 0; i < rectangles.length; i++){
            //System.out.println(rectangles[i]);
        }

        // use a random generator
        Random rand = new Random();
        //generate positive random numbers less than a bound
        double arees = 0;
        for(int i = 0; i < rectangles.length; i++){
            double length = 1 + rand.nextInt(10);
            double width = 1 + rand.nextInt(10) ;
            rectangles[ i ] = new Rectangle(length, width);
            System.out.println("Length: " + rectangles[i].getLength() + " Width: " + rectangles[i].getWidth() + " Area: " + rectangles[i].area() + " Perimeter : " + rectangles[i].perimeter());
            arees+=rectangles[i].area();
        }
        System.out.println(arees);
        */
        System.out.println(DateUtil.isValidDate(2000,2, 29));
        System.out.println(DateUtil.isValidDate(2000,2, 30) );
        System.out.println(DateUtil.isValidDate(1900,2, 29) );
        System.out.println(DateUtil.isValidDate(1900,2, 28) );
        System.out.println(DateUtil.isValidDate(-1900,2, 28) );
        System.out.println(DateUtil.isValidDate(0,2, 28) );
        System.out.println(DateUtil.isValidDate(2021,2, 29));
        System.out.println(DateUtil.isValidDate(2020,2, 29) );
        System.out.println(DateUtil.isValidDate(2020,1, 32));
        System.out.println(DateUtil.isValidDate(2020,1, 0));
        System.out.println(DateUtil.isValidDate(2020,0, 0) );
        System.out.println(DateUtil.isValidDate(2020,4, 31));
        System.out.println(DateUtil.isValidDate(2020,1, 31));
/*

        try (Scanner scanner = new Scanner(new File(fileName))) {

            while (scanner.hasNextLine()) {

                String line = scanner.nextLine();

                if (line.isEmpty()) {
                    continue;
                }

                String[] items = line.split(",");

                String firstName = items[0].trim();
                String lastName = items[1].trim();
                int birthYear = Integer.parseInt(items[2].trim());

                persons.add(new Person(firstName, lastName, birthYear));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }*/

    }
}
