/**
 * Author: Salman
 *
 * This class receives an array and has methods that abstract desired information from it.
 */
public class Matrix {

    private int[][] arr; //holds the array

    /**
     * assigns the received array to its field
     * @param arr gets the array
     */
    public Matrix (int[][] arr){
        this.arr = arr;
    }

    /**
     * gets total
     * @return total
     */
    public int getTotal (){
        int tot = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < (arr[i]).length; j++){
                tot += arr[i][j];
            }
        }
        return tot;
    }

    /**
     * gets average
     * @return average
     */
    public int getAverage (){
        int tot = 0;
        int nEntries = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < (arr[i]).length; j++){
                tot += arr[i][j];
                nEntries++;
            }
        }
        return (tot/nEntries);
    }

    /**
     * gets total for a row
     * @param row gets row number
     * @return total of a row
     */
    public int getRowTotal (int row){
        int tot = 0;
        for(int i = 0; i < arr[row].length; i++){
                tot += arr[row][i];
        }
        return tot;
    }

    /**
     * gets total for a column
     * @param col gets column number
     * @return total of a column
     */
    public int getColumnTotal (int col){
        int tot = 0;
        for(int i = 0; i < arr.length; i++){
                tot += arr[i][col];
        }
        return tot;
    }

    /**
     * gets highest number in a row
     * @param row gets a row number
     * @return highest number from a row
     */
    public int getHighestInRow (int row){
        int max = arr[row][0];
        for(int i = 1; i < arr[row].length; i++){
            if (arr[row][i] > max)
                max = arr[row][i];
        }
        return max;
    }

    /**
     * gets lowest number in a row
     * @param row gets a row number
     * @return lowest number from a row
     */
    public int getLowestInRow (int row){
        int min = arr[row][0];
        for(int i = 1; i < arr[row].length; i++){
            if (arr[row][i] < min)
                min = arr[row][i];
        }
        return min;
    }

    /**
     * determines whether an array is a magic square or not
     * @return a true boolean if the array is a magic square; false otherwise
     */
    public boolean isMagicSquare (){
        if (arr.length == 3 && arr[0].length == 3 && arr[1].length == 3  && arr[2].length == 3){
            int one = 0; //holds no. of ones in the square
            int two = 0; //holds no. of twos in the square
            int three = 0; //holds no. of threes in the square
            int four = 0; //holds no. of fours in the square
            int five = 0; //holds no. of fives in the square
            int six = 0; //holds no. of sixes in the square
            int seven = 0; //holds no. of sevens in the square
            int eight = 0; //holds no. of eights in the square
            int nine = 0; //holds no. of nines in the square
            for(int i = 0; i < arr.length; i++){
                for(int j = 0; j < (arr[i]).length; j++){
                    switch (arr[i][j]){
                        case 1:
                            one++;
                            break;
                        case 2:
                            two++;
                            break;
                        case 3:
                            three++;
                            break;
                        case 4:
                            four++;
                            break;
                        case 5:
                            five++;
                            break;
                        case 6:
                            six++;
                            break;
                        case 7:
                            seven++;
                            break;
                        case 8:
                            eight++;
                            break;
                        case 9:
                            nine++;
                            break;
                            default:
                                return false;
                    }
                }
            }
            if (one <= 1 && two <= 1 && three <= 1 && four <= 1 && five <= 1 && six <= 1 && seven <= 1 &&
                    eight <= 1 && nine <= 1){
                for(int i = 0; i < arr.length; i++){
                    for(int j = 0; j < (arr[i]).length; j++){
                        if(getRowTotal(i) != getColumnTotal(j))
                            return false;
                    }
                }
                int sum = getRowTotal(0);
                if(((arr[0][0] + arr [1][1] + arr[2][2]) == sum) && ((arr[2][0] + arr[1][1] + arr[0][2]) == sum)){
                    return true;
                }
            }
        }
        return false;
    }


}
