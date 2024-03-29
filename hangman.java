import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Board {
    private char[][] board;

    public Board() {
        board = new char[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                board[i][j] = 'O';
            }
        }
    }

    public void printBoard() {
        System.out.println("   A B C D E F G H I J");
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < 10; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void placeShip(Ship ship) {
        for (Coordinate coordinate : ship.getCoordinates()) {
            int x = coordinate.getX();
            int y = coordinate.getY();
            board[x][y] = 'X';
        }
    }
}

class Ship {
    private int size;
    private List<Coordinate> coordinates;

    public Ship(int size) {
        this.size = size;
        coordinates = new ArrayList<>();
    }

    public List<Coordinate> getCoordinates() {
        return coordinates;
    }

    public void generateCoordinates() {
        Random random = new Random();
        int x = random.nextInt(10);
        int y = random.nextInt(10);
        String[] directions = { "horizontal", "vertical" };
        String direction = directions[random.nextInt(2)];

        if (direction.equals("horizontal") && y + size <= 10) {
            for (int i = 0; i < size; i++) {
                coordinates.add(new Coordinate(x, y + i));
            }
        } else if (direction.equals("vertical") && x + size <= 10) {
            for (int i = 0; i < size; i++) {
                coordinates.add(new Coordinate(x + i, y));
            }
        } else {
            generateCoordinates();
        }
    }
}

class Coordinate {
    private int x;
    private int y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

public class BattleshipGame {
    public static void main(String[] args) {
        Board board = new Board();
        Ship ship = new Ship(3);
        ship.generateCoordinates();
        board.placeShip(ship);
        board.printBoard();
    }
}
