public class Backtracking26 {
    // public static void changearr(int arr[], int i, int val){
    //     //base case
    //     if(i==arr.length){
    //         printarr(arr);
    //         return;
    //     }


    //     //recursion
    //     arr[i] = val;
    //     changearr(arr, i+1, val+1);
    //     arr[i] = arr[i] - 2;

    // }
    

    // public static void printarr(int arr[]){
    //     for(int i = 0; i < arr.length; i++){
    //         System.out.print(arr[i]+" ");
    //     }
    //     System.out.println();
    // }

    // public static void main(String args[]){
    //     int arr[] = new int[5];
    //     changearr(arr, 0, 1);
    //     printarr(arr);

    // }





    // public static void findsubset(String str, String ans, int i){

    //     if(i == str.length()){
    //         if(ans.length() == 0){
    //             System.out.println("null");
    //         }else{
    //             System.out.println(ans);
    //         }return;
    //     }

    //     //recursion
    //     //yes choice
    //     findsubset( str, ans+str.charAt(i), i+1);

    //     //No choice
    //     findsubset( str, ans, i+1);

    // }


    // public static void main(String args[]){
    //     String str = "abc";
    //     findsubset( str, "", 0);
        

    // }






    // public static void findpermutation( String str, String ans){
    //     if(str.length() == 0){
    //         System.out.println(ans);
    //         return;
    //     }


    //     //recursion          TC = O(n * n!)
    //     for(int i=0; i<str.length(); i++){
    //         char curr = str.charAt(i);
    //         //"abcde" = "ab"+ "de" = "abde"       ( if c ko hata diye )
    //         String NewStr = str.substring(0, i) + str.substring(i + 1);
    //         findpermutation(NewStr, ans+curr);
    //     }
    // }

    // public static void main(String args[]){
    //     String str = "abc";
    //     findpermutation(str, "");

    // }







    // //N QUEENS
    // public static boolean isSafe(char board[][], int row, int col) {
    //     // vertical up
    //     for (int i = row - 1; i >= 0; i--) {
    //         if (board[i][col] == 'Q') {
    //             return false;
    //         }
    //     }

    //     // diagonal left up
    //     for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
    //         if (board[i][j] == 'Q') {
    //             return false;
    //         }
    //     }

    //     // diagonal right up
    //     for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
    //         if (board[i][j] == 'Q') {
    //             return false;
    //         }
    //     }

    //     return true;
    // }



    // public static void nQueens(char[][] board, int row) {
    //     // base case
    //     if (row == board.length) {
    //         printBoard(board);
    //         return;
    //     }



    //     // column loop 
    //     for (int j = 0; j < board.length; j++) {
    //         if (isSafe(board, row, j)) {
    //             board[row][j] = 'Q';
    //             nQueens(board, row + 1); // function call
    //             board[row][j] = 'X';   // backtracking step
    //         }
    //     }
    // }



    // public static void printBoard(char[][] board) {
    //     System.out.println("------------chess board------------");
    //     for (int i = 0; i < board.length; i++) {
    //         for (int j = 0; j < board.length; j++) {
    //             System.out.print(board[i][j] + " ");
    //         }
    //         System.out.println();
    //     }
    // }



    // public static void main(String[] args) {
    //     int n = 4; // Change n to 4 for more meaningful output
    //     char[][] board = new char[n][n];
    //     // initialize
    //     for (int i = 0; i < n; i++) {
    //         for (int j = 0; j < n; j++) {
    //             board[i][j] = 'X';
    //         }
    //     }

    //     nQueens(board, 0); // Start solving the problem from the first row
    // }







    // //N QUEENS no of ways
    // public static boolean isSafe(char board[][], int row, int col) {
    //     // vertical up
    //     for (int i = row - 1; i >= 0; i--) {
    //         if (board[i][col] == 'Q') {
    //             return false;
    //         }
    //     }

    //     // diagonal left up
    //     for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
    //         if (board[i][j] == 'Q') {
    //             return false;
    //         }
    //     }

    //     // diagonal right up
    //     for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
    //         if (board[i][j] == 'Q') {
    //             return false;
    //         }
    //     }

    //     return true;
    // }



    // public static void nQueens(char[][] board, int row) {
    //     // base case
    //     if (row == board.length) {
    //         // printBoard(board);
    //         count++;
    //         return;
    //     }



    //     // column loop 
    //     for (int j = 0; j < board.length; j++) {
    //         if (isSafe(board, row, j)) {
    //             board[row][j] = 'Q';
    //             nQueens(board, row + 1); // function call
    //             board[row][j] = 'X';   // backtracking step
    //         }
    //     }
    // }



    // public static void printBoard(char[][] board) {
    //     System.out.println("------------chess board------------");
    //     for (int i = 0; i < board.length; i++) {
    //         for (int j = 0; j < board.length; j++) {
    //             System.out.print(board[i][j] + " ");
    //         }
    //         System.out.println();
    //     }
    // }


    // static int count = 0;
    // public static void main(String[] args) {
    //     int n = 4; // Change n to 4 for more meaningful output
    //     char[][] board = new char[n][n];
    //     // initialize
    //     for (int i = 0; i < n; i++) {
    //         for (int j = 0; j < n; j++) {
    //             board[i][j] = 'X';
    //         }
    //     }

    //     nQueens(board, 0); // Start solving the problem from the first row
    //     System.out.println("total ways to solve n queens = " + count);
    // }






    
    // //N QUEENS  print only 1 solu..n
    // public static boolean isSafe(char board[][], int row, int col) {
    //     // vertical up
    //     for (int i = row - 1; i >= 0; i--) {
    //         if (board[i][col] == 'Q') {
    //             return false;
    //         }
    //     }

    //     // diagonal left up
    //     for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
    //         if (board[i][j] == 'Q') {
    //             return false;
    //         }
    //     }

    //     // diagonal right up
    //     for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
    //         if (board[i][j] == 'Q') {
    //             return false;
    //         }
    //     }

    //     return true;
    // }

    // public static boolean nQueens(char[][] board, int row) {
    //     // base case
    //     if (row == board.length) {
    //         printBoard(board);
    //         return true;
    //     }

    //     // column loop 
    //     for (int j = 0; j < board.length; j++) {
    //         if (isSafe(board, row, j)) {
    //             board[row][j] = 'Q';
    //             if (nQueens(board, row + 1)) {
    //                 return true;
    //             }
    //             board[row][j] = 'X';   // backtracking step
    //         }
    //     }

    //     return false;
    // }

    // public static void printBoard(char[][] board) {
    //     System.out.println("------------chess board------------");
    //     for (int i = 0; i < board.length; i++) {
    //         for (int j = 0; j < board.length; j++) {
    //             System.out.print(board[i][j] + " ");
    //         }
    //         System.out.println();
    //     }
    // }

    // public static void main(String[] args) {
    //     int n = 4; // Change n to 4 for a meaningful example
    //     char[][] board = new char[n][n];
    //     // initialize
    //     for (int i = 0; i < n; i++) {
    //         for (int j = 0; j < n; j++) {
    //             board[i][j] = 'X';
    //         }
    //     }

    //     if (nQueens(board, 0)) {
    //         System.out.println("Solution is possible");
    //     } else {
    //         System.out.println("Solution is not possible");
    //     }
    // }








    // public static int gridways(int i, int j, int n, int m) {        // (n+m) TC = 2^(n+m)
    //     // base case: reached last cell                             //exponential tC
    //     if (i == n - 1 && j == m - 1) {
    //         return 1;
    //     }

    //     // boundary cross condition
    //     if (i >= n || j >= m) {
    //         return 0;
    //     }

    //     // Move down
    //     int w1 = gridways(i + 1, j, n, m);
    //     // Move right
    //     int w2 = gridways(i, j + 1, n, m);

    //     return w1 + w2;
    // }

    // public static void main(String[] args) {
    //     int n = 3, m = 3;
    //     System.out.println(gridways(0, 0, n, m));  // Expected output: 6
    // }







    // //code with math trick for grid
    // public static int factorial(int num) {
    //     int result = 1;
    //     for (int i = 2; i <= num; i++) {
    //         result *= i;
    //     }
    //     return result;
    // }

    // public static int gridways(int n, int m) {
    //     // Using the formula: (n-1 + m-1)! / ((n-1)! * (m-1)!)
    //     int numerator = factorial(n - 1 + m - 1);
    //     int denominator = factorial(n - 1) * factorial(m - 1);
    //     return numerator / denominator;
    // }

    // public static void main(String[] args) {
    //     int n = 3, m = 3;
    //     System.out.println(gridways(n, m));  // Expected output: 6
    // }






    // SUDOKU
    public static boolean isSafe(int sudoku[][], int row, int col, int digit) {
        // Check the column
        for (int i = 0; i <= 8; i++) {
            if (sudoku[i][col] == digit) {
                return false;
            }
        }

        // Check the row
        for (int j = 0; j <= 8; j++) {
            if (sudoku[row][j] == digit) {
                return false;
            }
        }

        // Check the 3x3 sub-grid
        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (sudoku[i][j] == digit) {
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean sudokuSolver(int sudoku[][], int row, int col) {
        // Base case
        if (row == 9) {
            return true;
        }

        // Move to the next row if column exceeds the boundary
        int nextRow = row, nextCol = col + 1;
        if (col + 1 == 9) {
            nextRow = row + 1;
            nextCol = 0;
        }

        // Skip the filled cells and move to the next
        if (sudoku[row][col] != 0) {
            return sudokuSolver(sudoku, nextRow, nextCol);
        }

        // Try placing digits 1 to 9 in the cell
        for (int digit = 1; digit <= 9; digit++) {
            if (isSafe(sudoku, row, col, digit)) {
                sudoku[row][col] = digit;
                if (sudokuSolver(sudoku, nextRow, nextCol)) { // If solution exists
                    return true;
                }
                sudoku[row][col] = 0; // Backtrack
            }
        }

        return false;
    }

    public static void printSudoku(int sudoku[][]) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int sudoku[][] = {
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        if (sudokuSolver(sudoku, 0, 0)) {
            System.out.println("Solution exists:");
            printSudoku(sudoku);
        } else {
            System.out.println("No solution exists.");
        }
    }




    /*             practise question             */


    //Q1 RAT IN MAZE

    // public static void printSolution(int sol[][]) {
    //     for (int i = 0; i < sol.length; i++) {
    //         for (int j = 0; j < sol.length; j++) {
    //             System.out.print(" " + sol[i][j] + " ");
    //         }
    //         System.out.println();
    //     }
    // }

    // public static boolean isSafe(int maze[][], int x, int y) {
    //     // If (x, y) is within the maze and the cell is not blocked (1 indicates a valid cell)
    //     return (x >= 0 && x < maze.length && y >= 0 && y < maze.length && maze[x][y] == 1);
    // }

    // public static boolean solveMaze(int maze[][]) {
    //     int N = maze.length;
    //     int sol[][] = new int[N][N];

    //     if (solveMazeUtil(maze, 0, 0, sol) == false) {
    //         System.out.print("Solution doesn't exist");
    //         return false;
    //     }
    //     printSolution(sol);
    //     return true;
    // }

    // public static boolean solveMazeUtil(int maze[][], int x, int y, int sol[][]) {
    //     // Base case: If the destination is reached (bottom-right corner)
    //     if (x == maze.length - 1 && y == maze.length - 1 && maze[x][y] == 1) {
    //         sol[x][y] = 1;
    //         return true;
    //     }

    //     // Check if maze[x][y] is valid
    //     if (isSafe(maze, x, y) == true) {
    //         // Mark x, y as part of the solution path
    //         if (sol[x][y] == 1) // if already visited, avoid looping
    //             return false;

    //         sol[x][y] = 1;

    //         // Move forward in the x direction
    //         if (solveMazeUtil(maze, x + 1, y, sol))
    //             return true;

    //         // If moving in x direction doesn't give a solution, move down in the y direction
    //         if (solveMazeUtil(maze, x, y + 1, sol))
    //             return true;

    //         // If none of the above movements work, backtrack
    //         sol[x][y] = 0;
    //         return false;
    //     }

    //     return false;
    // }

    // public static void main(String args[]) {
    //     int maze[][] = { 
    //         { 1, 0, 0, 0 }, 
    //         { 1, 1, 0, 1 }, 
    //         { 0, 1, 0, 0 }, 
    //         { 1, 1, 1, 1 } 
    //     };
    //     solveMaze(maze);
    // }






    //Q2   KEYPAD COMBINATION

    // final static char[][] L = { {}, {}, { 'a', 'b', 'c' }, { 'd', 'e', 'f' }, { 'g', 'h', 'i' }, { 'j', 'k', 'l' },
    //         { 'm', 'n', 'o' }, { 'p', 'q', 'r', 's' }, { 't', 'u', 'v' }, { 'w', 'x', 'y', 'z' } };

    // public static void letterCombinations(String D) {
    //     int len = D.length();
    //     if (len == 0) {
    //         System.out.println("");
    //         return;
    //     }
    //     bfs(0, len, new StringBuilder(), D);
    // }

    // public static void bfs(int pos, int len, StringBuilder sb, String D) {
    //     if (pos == len) {
    //         System.out.println(sb.toString());
    //     } else {
    //         char[] letters = L[Character.getNumericValue(D.charAt(pos))];
    //         for (int i = 0; i < letters.length; i++)
    //             bfs(pos + 1, len, new StringBuilder(sb).append(letters[i]), D);
    //     }
    // }

    // public static void main(String args[]) {
    //     letterCombinations("23");
    // }






    //Q3    KNIGHTS TOUR similar to N Queens

    // static int N = 8;

    // public static boolean isSafe(int x, int y, int sol[][]) {
    //     return (x >= 0 && x < N && y >= 0 && y < N && sol[x][y] == -1);
    // }

    // public static void printSolution(int sol[][]) {
    //     for (int x = 0; x < N; x++) {
    //         for (int y = 0; y < N; y++)
    //             System.out.print(sol[x][y] + " ");
    //         System.out.println();
    //     }
    // }

    // public static boolean solveKT() {
    //     int sol[][] = new int[8][8];

    //     // Initialization of solution matrix
    //     for (int x = 0; x < N; x++)
    //         for (int y = 0; y < N; y++)
    //             sol[x][y] = -1;

    //     // xMove[] and yMove[] define next move of Knight
    //     int xMove[] = { 2, 1, -1, -2, -2, -1, 1, 2 };
    //     int yMove[] = { 1, 2, 2, 1, -1, -2, -2, -1 };

    //     // As the Knight starts from cell(0, 0)
    //     sol[0][0] = 0;

    //     // Start from (0, 0) and explore all tours using solveKTUtil()
    //     if (!solveKTUtil(0, 0, 1, sol, xMove, yMove)) {
    //         System.out.println("Solution does not exist");
    //         return false;
    //     } else
    //         printSolution(sol);

    //     return true;
    // }

    // public static boolean solveKTUtil(int x, int y, int movei, int sol[][], int xMove[], int yMove[]) {
    //     int k, next_x, next_y;
    //     if (movei == N * N)
    //         return true;

    //     // Try all next moves from the current coordinate x, y
    //     for (k = 0; k < 8; k++) {
    //         next_x = x + xMove[k];
    //         next_y = y + yMove[k];
    //         if (isSafe(next_x, next_y, sol)) {
    //             sol[next_x][next_y] = movei;
    //             if (solveKTUtil(next_x, next_y, movei + 1, sol, xMove, yMove))
    //                 return true;
    //             else
    //                 sol[next_x][next_y] = -1; // backtracking
    //         }
    //     }

    //     return false;
    // }

    // public static void main(String args[]) {
    //     solveKT();
    // }





}
