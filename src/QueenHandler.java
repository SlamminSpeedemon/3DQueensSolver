public class QueenHandler {
    public static int numOfQueens;
    public static Board board; //a single queen handler can only handle 1 board

    public QueenHandler(Board board) {
        this.board = board;
    }

    public void placeQueen(int z, int i, int j) {
        if (board.get(z,i,j).equals("0")) {
            board.set(z,i,j,"Q");
        }
    }

    public void diagnols(int i, int j, int k) {
        //2 dimsensioal first
        String[][][] temp = board.getBoard();
    }

    public void allStriaghts() {

    }
}
