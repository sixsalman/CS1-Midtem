import java.util.Scanner;

/**
 *  Author: Salman
 *
 *  This program gets an array from user and gives user a list of options to obtain certain results from the array.
 */
public class MatrixDemo {

    /**
     * gets inputs from user and processes them appropriately.
     * @param args is not used
     */
    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);

        System.out.print("Enter no. of rows you want to have in array 1: ");
        int nRows = kbd.nextInt();

        System.out.print("Enter no. of columns you want to have in array 1: ");
        int nCols = kbd.nextInt();

        int[][] arrOne = new int[nRows][nCols];

        for(int i = 0; i < arrOne.length; i++){
            for(int j = 0; j < (arrOne[i]).length; j++){
                System.out.print("Enter an integer to be stored in array 1's row " + i + " column " + j + ": ");
                arrOne[i][j] = kbd.nextInt();
            }
        }

        System.out.println("\nEnter 1 to get total\n2 to get average\n3 to get row total\n4 to get column total\n" +
                "5 to get highest value in a row\n6 to get lowest value in a row\n7 to check array to be" +
                " a magic square");

        Matrix one = new Matrix(arrOne);

        disp(one, kbd.nextInt(), kbd);


        System.out.print("Enter no. of rows you want to have in array 2: ");
        nRows = kbd.nextInt();

        System.out.print("Enter no. of columns you want to have in array 2: ");
        nCols = kbd.nextInt();

        int[][] arrTwo = new int[nRows][nCols];

        for(int i = 0; i < arrTwo.length; i++){
            for(int j = 0; j < (arrTwo[i]).length; j++){
                System.out.print("Enter an integer to be stored in array 2's row " + i + " column " + j + ": ");
                arrTwo[i][j] = kbd.nextInt();
            }
        }

        System.out.println("\nEnter 1 to get total\n2 to get average\n3 to get row total\n4 to get column total\n" +
                "5 to get highest value in a row\n6 to get lowest value in a row\n7 to check array to be" +
                " a magic square");

        Matrix two = new Matrix(arrTwo);

        disp(two, kbd.nextInt(), kbd);

    }

    /**
     * gets user desired result and displays it.
     * @param mat gets a Moatrix type object
     * @param choice gets user's choice
     * @param kbd gets the variable referring scanner so this method could read inputs
     */
    public static void disp(Matrix mat, int choice, Scanner kbd){
        switch (choice){
            case 1:
                System.out.println(mat.getTotal());
                break;
            case 2:
                System.out.println(mat.getAverage());
                break;
            case 3:
                System.out.print("Enter row no.: ");
                System.out.println(mat.getRowTotal(kbd.nextInt()));
                break;
            case 4:
                System.out.print("Enter column no.: ");
                System.out.println(mat.getColumnTotal(kbd.nextInt()));
                break;
            case 5:
                System.out.print("Enter row no.: ");
                System.out.println(mat.getHighestInRow(kbd.nextInt()));
                break;
            case 6:
                System.out.print("Enter row no.: ");
                System.out.println(mat.getLowestInRow(kbd.nextInt()));
                break;
            case 7:
                if (mat.isMagicSquare()){
                    System.out.println("It is a magic square.");
                } else {
                    System.out.println("It is not a magic square.");
                }
                break;
                default:
                    System.out.println("Invalid Entry");
        }
    }

}
