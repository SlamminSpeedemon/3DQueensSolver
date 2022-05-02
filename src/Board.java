public class Board {
    private String[][][] board;
    private QueenHandler queen;
    public Board(int height, int rows, int cols) {
        board = new String[height][rows][cols];
        System.out.println("Height is " + board.length);
    }

    public void setBoard(String[][][] newBoard) {
        this.board = newBoard;
    }

    public void set(int z, int i, int j, String setter) {
        board[z][i][j] = setter;
    }

    public String[][][] getBoard() {
        return board;
    }

    public String get(int z, int i, int j) {
        return board[z][i][j];
    }

    public void setEmpty() {
        for (int z = 0; z < board.length; z++) {
            for (int i = 0; i < board[z].length; i++) {
                for (int j = 0; j < board[z][i].length; j++) {
                    board[z][i][j] = "0";
                }
            }
        }
    }

    public void printBoard() {
        for (int z = 0; z < board.length; z++) {
            System.out.println(z + " level");
            for (int i = 0; i < board[z].length; i++) {
                for (int j = 0; j < board[z][i].length; j++) {
                    System.out.print(board[z][i][j] + "\t");
                }
                System.out.print("\n");
            }
            System.out.println("");
        }
    }
    public void setQueen(QueenHandler queen) {
        this.queen = queen;
    }

    public void spamQueens() {
        if (queen == null) {
            System.out.println("Please set the queen handler for board");
        }

        for (int z = 0; z < board.length; z++) {
            for (int i = 0; i < board[z].length; i++) {
                for (int j = 0; j < board[z][i].length; j++) {
                    queen.placeQueen(z,i,j);
                }
            }
        }
    }
}
