import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputGet = new Scanner(System.in);
        System.out.println("Enter rows dim");
        int rows = 8;//inputGet.nextInt();
        System.out.println("Enter cols dim");
        int cols = 8;//inputGet.nextInt();
        System.out.println("Enter 3rd dim");
        int height = 5;//inputGet.nextInt();

        Board board = new Board(height,rows,cols);
        board.setEmpty();

        RookHandler rooks = new RookHandler(board);
        //rooks.placeRook(1,1,1);
        //board.printBoard();

        //System.out.println("\n\n\tWith Queen overwriting rook");
        QueenHandler queens = new QueenHandler(board);
        queens.placeQueen(2,2,2);
        board.printBoard();

    }
}
