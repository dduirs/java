public class Main {
    public static void main(String[] args) {
        System.out.print("Hello!");

        double sum = 0.0;
        int i;
        //byte n = 0b101010;
        for (i = 0; i < 10; i++) sum += 0.1;
        if (Math.abs(1.0-sum) <= 0.000000000000001) {
            System.out.print(" All G!\n");
        } else System.out.print(sum);
    }
}
