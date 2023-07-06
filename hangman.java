public void printBoard() {
    System.out.println("   1 2 3 4 5 6 7 8 9 10");
    for (int i = 0; i < 10; i++) {
        System.out.print((char) ('A' + i) + " ");
        for (int j = 0; j < 10; j++) {
            System.out.print(board[i][j] + " ");
        }
        System.out.println();
    }
}
