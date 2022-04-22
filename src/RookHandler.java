public class RookHandler {
    private static int numOfRooks;
    private static Board board; //a single queen handler can only handle 1 board
    private int zDim;
    private int iDim;
    private int jDim;


    public RookHandler(Board board) {
        this.board = board;
        String[][][] temp = board.getBoard();
        zDim = temp.length;
        iDim = temp[0].length;
        jDim = temp[0][0].length;
    }

    public void placeRook(int z, int i, int j) {
        if (board.get(z,i,j).equals("0")) {
            board.set(z,i,j,"R");
            allStraights(z,i,j);
        }
    }

    public void allStraights(int z, int i, int j) {
        System.out.println("zDim is " + zDim);
        for (int counter = 0; counter < zDim; counter++) {
            if (board.get(counter,i,j).equals("0")) {
                board.set(counter,i,j,"x");
            }
        }

        for (int counter = 0; counter < iDim; counter++) {
            if (board.get(z,counter,j).equals("0")) {
                board.set(z,counter,j,"x");
            }
        }

        for (int counter = 0; counter < jDim; counter++) {
            if (board.get(z,i,counter).equals("0")) {
                board.set(z,i,counter,"x");
            }
        }

    }
}
