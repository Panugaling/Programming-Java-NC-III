package Array;

public class Arraysum {
    private int[] numbers;

    public Arraysum(int[] numbers) {
        this.numbers = numbers;
    }

    public int calculateSum() {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] values = {5, 10, 15, 20, 25};
        Arraysum arraySum = new Arraysum(values);
        int result = arraySum.calculateSum();
        System.out.println("Sum of elements: " + result);
    }
}
