package Schiffeversenken;


import java.util.*;

public class Schiff {

private int size;
private ArrayList coordinates;

public Schiff(int size) {
this.size = size;
coordinates = new ArrayList<>();
}


public ArrayList<Coordinate> getCoordinates() {
return coordinates;
}

public void generateCoordinates() {
Random random = new Random();
int x = random.nextInt(10);
int y = random.nextInt(10);
String[] directions = { "horizontal", "vertikal" };
String direction = directions[random.nextInt(2)];

if (direction.equals("horizontal") && y + size <= 10) {
for (int i = 0; i < size; i++) {
coordinates.add(new Coordinate(x + i, y));
}
}
if (direction.equals("vertikal") && x + size <= 10) {
for (int i = 0; i < size; i++) {
coordinates.add(new Coordinate(x + i, y));
}
}
else {
generateCoordinates();
}
}
}