public class QueenHandler {
    public static int numOfQueens;
    public static Board board; //a single queen handler can only handle 1 board
    private int zDim;
    private int iDim;
    private int jDim;

    public QueenHandler(Board board) {
        this.board = board;
        String[][][] temp = board.getBoard();
        zDim = temp.length;
        iDim = temp[0].length;
        jDim = temp[0][0].length;
    }

    public void placeQueen(int z, int i, int j) {
        if (board.get(z,i,j).equals("0")) {
            board.set(z,i,j,"Q");
            diagnols(z, i, j);
            allStraights(z, i, j);
        }
    }

    public void diagnols(int z, int i, int j) {
        //2 dimsensioal first (i and j)
        int iCount = i;
        int jCount = j;
        while (iCount>0 && jCount>0) { //find corner
            iCount--;
            jCount--;
        }
        while (iCount < iDim && jCount < jDim) { //top left to bottom right
            if (board.get(z,iCount,jCount).equals("0")) {
                board.set(z,iCount,jCount,"x");
            }
            iCount++;
            jCount++;
        }
        iCount = i;
        jCount = j;
        while (iCount>0 && jCount<jDim) { //find corner
            iCount--;
            jCount++;
        }
        while (iCount < iDim && jCount >= 0) { //top right to bottom left
            if (board.get(z,iCount,jCount).equals("0")) {
                board.set(z,iCount,jCount,"x");
            }
            iCount++;
            jCount--;
        }
    if (zDim > 1) {
        //3 dimensional (z and i)
        int zCount = z;
        iCount = i;
        while (iCount > 0 && zCount > 0) { //find corner
            iCount--;
            zCount--;
        }
        while (iCount < iDim && zCount < zDim) { //top left to bottom right
            if (board.get(zCount, iCount, j).equals("0")) {
                board.set(zCount, iCount, j, "x");
            }
            iCount++;
            zCount++;
        }
        iCount = i;
        zCount = z;
        while (iCount > 0 && zCount < zDim) { //find corner
            iCount--;
            zCount++;
        }
        while (iCount < iDim && zCount >= 0) { //top right to bottom left
            if (board.get(zCount, iCount, j).equals("0")) {
                board.set(zCount, iCount, j, "x");
            }
            iCount++;
            zCount--;
        }

        //3 dimensional (z and j)
        zCount = z;
        jCount = j;
        while (zCount > 0 && jCount > 0) { //find corner
            zCount--;
            jCount--;
        }
        while (zCount < zDim && jCount < jDim) { //top left to bottom right
            if (board.get(zCount, i, jCount).equals("0")) {
                board.set(zCount, i, jCount, "x");
            }
            zCount++;
            jCount++;
        }
        zCount = z;
        jCount = j;
        while (zCount > 0 && jCount < jDim) { //find corner
            zCount--;
            jCount++;
        }
        while (zCount < zDim && jCount >= 0) { //top right to bottom left
            if (board.get(zCount, i, jCount).equals("0")) {
                board.set(zCount, i, jCount, "x");
            }
            zCount++;
            jCount--;
        }
    }
    }

    public void allStraights(int z, int i, int j) {
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
