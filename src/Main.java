import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] array = new int[4][3];
        Scanner src = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = src.nextInt();
            }
        }
//        for (int j = 0; j < 3; j++) {
//            for (int i = 0; i < 4; i++) {
//                sum += array[i][j];
//            }
//            System.out.println("Сумма в столбец :" + sum);
//            sum = 0;
//        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                sum += array[i][j];
            }
            System.out.println("Сумма в строку : " + sum + "\n" + "Среднеарифметическое по строке : " + sum/3);
            sum = 0;
        }
//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < 3; j++) {
//                if (array[i][j] % 2 == 0)
//                    array[i][j] = 0;
//                else
//                    array[i][j] = 1;
//                System.out.print(array[i][j]);
//            }
//        }
    }
}
//    {1,2,3}
//    {1,2,3}
//    {1,2,3}
//    {1,2,3}
