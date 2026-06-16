package labor11_2;

public class Main {
    static void main(String[] args) {
        long start1 = System.nanoTime();
        Storage s1 = new Storage("data1000.txt");
        int u1 = s1.update("update1000.txt");
        long end1 = System.nanoTime();

        System.out.println("data1000 + update1000");
        System.out.println("Updated: " + u1);
        System.out.println("Time: " + (end1 - start1) / 1_000_000.0 + " ms\n");


        long start2 = System.nanoTime();
        Storage s2 = new Storage("data1000.txt");
        int u2 = s2.update("update1000000.txt");
        long end2 = System.nanoTime();

        System.out.println("data1000 + update1000000");
        System.out.println("Updated: " + u2);
        System.out.println("Time: " + (end2 - start2) / 1_000_000.0 + " ms\n");


        long start3 = System.nanoTime();
        Storage s3 = new Storage("data1000000.txt");
        int u3 = s3.update("update1000.txt");
        long end3 = System.nanoTime();

        System.out.println("data1000000 + update1000");
        System.out.println("Updated: " + u3);
        System.out.println("Time: " + (end3 - start3) / 1_000_000.0 + " ms\n");


        long start4 = System.nanoTime();
        Storage s4 = new Storage("data1000000.txt");
        int u4 = s4.update("update1000000.txt");
        long end4 = System.nanoTime();

        System.out.println("data1000000 + update1000000");
        System.out.println("Updated: " + u4);
        System.out.println("Time: " + (end4 - start4) / 1_000_000.0 + " ms\n");
    }
}
