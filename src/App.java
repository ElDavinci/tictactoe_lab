import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        tictactoe game = new tictactoe();
        System.out.println("Hello, World! this is tictactoe mf lets get it ONNNNN !!!!!");

        while(true){
            System.out.print(game);
            System.out.println("\nIt's " + game.currentPlayer + "'s turn. Where would you like to go? eg: 1 2");
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (game.checkSpace(x-1, y-1)){
                game.set(x-1, y-1, game.currentPlayer);
            }
            else{
                System.out.println("Invalid move. Try again.");
                continue;
            }
            game.switchTurn();
            clearTerminal();
            if (game.checkWin() == 'X') {
                System.out.println("X wins!");
                break;
            }
            else if (game.checkWin() == 'O') {
                System.out.println("O wins!");
                break;
            }
        }
        sc.close();
    }

    private static void clearTerminal() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
