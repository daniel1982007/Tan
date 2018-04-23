package SumOfIntegers;

public class SumArrays {
    public static void main(String[] args) {
        int[][] arrays = {{1, 4}, {4, 5, 3}, {29, 8, 87}};

        int sum = 0;
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                sum += arrays[i][j];
            }
        }
        System.out.println(sum);
    }
}
