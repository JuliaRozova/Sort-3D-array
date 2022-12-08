package ThreeDecimalArray2;

public class App {
    public static void main(String[] args) {
        ThreeDecimalArray array = new ThreeDecimalArray(5, 4, 4);
        array.createArray();
        System.out.println("Origin arrays: ");
        array.printArray();
        array.sortArray();
        System.out.println();
        System.out.println("Sorted arrays: ");
        array.printArray();
    }
}
