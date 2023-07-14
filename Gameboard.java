package Schiffeversenken;

public class Gameboard {

private char[][] board;

public Gameboard() {
board = new char[10][10];
for (int i = 0; i < 10; i++) {
for (int j = 0; j < 10; j++) {
board[i][j] = 'O';
}
}
}

public void printBoard() {
System.out.println(" 1 2 3 4 5 6 7 8 9 10");
for (int i = 0; i < 10; i++) {
System.out.print((char) ('A' + i) + " ");
for (int j = 0; j < 10; j++) {
System.out.print(board[i][j] + " ");
}
System.out.println();
}
}

public void placeGameSchiff(Schiff schiff) {
for (Coordinate coordinate : schiff.getCoordinates()) {
int x = coordinate.getX();
int y = coordinate.getY();
board[x][y]= 'x';
}
}
}






public void placeGameSchiff(Schiff schiff) {
    for (Coordinate coordinate : schiff.getCoordinates()) {
        int x = coordinate.getX();
        int y = coordinate.getY();
        if (isWithinBounds(x, y)) {
            board[x][y] = 'x';
        } else {
            System.out.println("Invalid coordinate: (" + x + ", " + y + ")");
        }
    }
}

private boolean isWithinBounds(int x, int y) {
    return x >= 0 && x < 10 && y >= 0 && y < 10;
}
