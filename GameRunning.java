import java.util.Scanner;

/**
 * Created by Michael on 12.05.2016.
 */
public class GameRunning implements GameState {
    public boolean handle(GameEngine gameContext) {
        this.gameContext = gameContext;
        System.out.println("Game running");
        System.out.println("Type e to go back to main menu or any other key to continue playing");
        Scanner in = new Scanner(System.in);
        String option = in.next();
        if (option.compareTo("e") == 0)
            gameContext.changeState(new GameStart());

        return true;
    }

    private GameEngine gameContext;
}
