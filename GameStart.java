import java.util.Scanner;

/**
 * Created by Michael on 12.05.2016.
 */
public class GameStart implements GameState {
    public boolean handle(GameEngine engine) {
        gameContext = engine;
        System.out.println("Game main menu");
        System.out.println("Please type:");
        System.out.println("1. x to quit");
        System.out.println("2. e for editor");
        System.out.println("3. any other key for game start");

        Scanner in = new Scanner(System.in);
        String option = in.next();
        if (option.compareTo("e") == 0)
            gameContext.changeState(new GameDesigner());
        else if (option.compareTo("x") == 0)
            return false;
        else
            gameContext.changeState(new GameRunning());

        return true;
    }


    private GameEngine gameContext;

}
