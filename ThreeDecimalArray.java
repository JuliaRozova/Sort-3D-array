package ThreeDecimalArray2;

import java.util.Random;

public class ThreeDecimalArray {
    int x;
    int y;
    int z;
    int[][][] array;

    public ThreeDecimalArray(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
        array = new int[x][y][z];
    }

    public void createArray(){
        Random random = new Random();
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                for (int k = 0; k < z; k++) {
                    array[i][j][k] = random.nextInt(0,9);
                }
            }
        }
    }
    public void printArray(){
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                for (int k = 0; k < z; k++) {
                    System.out.print(array[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.printf("Arithmetic mean of sum of elements of edge " + (i + 1) + " is %.3f\n", average(array[i]));
            System.out.println();
        }
    }

    public static float average(int[][] array){
        float sum = 0;
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
                counter += 1;
            }
        }
        return sum / counter;
    }

    public void sortArray(){
        int[][] buffer = null;
        boolean unSorted = true;

        while (unSorted){
            unSorted = false;

            for (int i = 0; i < x - 1; i++) {
                for (int j = 0; j < y; j++) {
                    for (int k = 0; k < z; k++) {
                        if(average(array[i]) > average(array[i + 1])){
                            buffer = array[i];
                            array[i] = array[i + 1];
                            array[i + 1] = buffer;
                            unSorted = true;
                        }
                    }
                }
            }
        }
    }
}


