package Schiffeversenken;


public class Test {

public static void main(String[] args) {


Gameboard Gameboard = new Gameboard();



Schiff s1 = new Schiff(2);
Schiff s2 = new Schiff(3);
Schiff s3 = new Schiff(4);
Schiff s4 = new Schiff(5);
s1.generateCoordinates();
Gameboard.placeGameSchiff(s1);
s2.generateCoordinates();
Gameboard.placeGameSchiff(s2);
s3.generateCoordinates();
Gameboard.placeGameSchiff(s3);
s4.generateCoordinates();
Gameboard.placeGameSchiff(s4);
Gameboard.printBoard();
}
}