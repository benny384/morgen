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
