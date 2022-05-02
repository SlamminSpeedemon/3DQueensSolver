import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputGet = new Scanner(System.in);
        System.out.println("Enter rows dim");
        int rows = inputGet.nextInt();
        System.out.println("Enter cols dim");
        int cols = inputGet.nextInt();
        System.out.println("Enter 3rd dim");
        int height = inputGet.nextInt();

        Board board = new Board(height,rows,cols);
        board.setEmpty();

        RookHandler rooks = new RookHandler(board);
        //rooks.placeRook(1,1,1);
        //board.printBoard();

        //System.out.println("\n\n\tWith Queen overwriting rook");
        QueenHandler queens = new QueenHandler(board);
        board.setQueen(queens);

        queens.placeQueen(2,2,2);
        board.printBoard();

        board.setEmpty();


        System.out.println("\n\n\t\tBasic queens solve:\n\n");
        board.spamQueens();
        board.printBoard();

    }
}
