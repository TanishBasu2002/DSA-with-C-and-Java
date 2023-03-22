import java.util.Scanner;

class MyArray {
    private int totalSize;
    private int usedSize;
    private int[] arr;

    public void createArray(int tSize, int uSize) {
        totalSize = tSize;
        usedSize = uSize;
        arr = new int[tSize];
    }

    public void show() {
        for (int i = 0; i < usedSize; i++) {
            System.out.println(arr[i]);
        }
    }

    public void setVal() {
        Scanner scanner = new Scanner(System.in);
        int n;
        for (int i = 0; i < usedSize; i++) {
            System.out.printf("Enter element %d: ", i);
            n = scanner.nextInt();
            arr[i] = n;
        }
        scanner.close();
    }
}

public class Array1 {
    public static void main(String[] args) {
        MyArray marks = new MyArray();
        marks.createArray(10, 2);
        System.out.println("We are running setVal now");
        marks.setVal();
        System.out.println("We are running show now");
        marks.show();
    }
}