import java.util.Arrays;

public class Program {
    public static void main(String[] args) {

        int [][] arr = new int [6][7];
        int max = 0;
        for (int i = 0; i < 6; i++) {
            System.out.println();
            for (int j = 0; j < 7; j++) {
               arr[i][j] += Math.random() * 10;
            }
        }
        for (int i = arr.length -1; i >=0 ; i--) {
            for (int j = 0; j < arr[i].length - 1; j++) {
                if (arr[i][j] > max){
                    max = arr[i][j];
                }
            }
            arr[i][0] = max;
        }
        for (int i = arr.length - 1; i >=0; i--) {
            System.out.println();
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%d ",arr[i][j]);
            }

        }

    }
}
