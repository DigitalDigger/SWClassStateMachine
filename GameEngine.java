/**
 * Created by Michael on 12.05.2016.
 */
public class GameEngine {
    public GameEngine() {
        // initial game state
        state = new GameStart();
    }

    public void run() {
        // main game loop
        while (noExit) {
            noExit = state.handle(this);
        }
    }

    public void changeState(GameState newState) {
        state = newState;
    }

    private GameState state;
    private boolean noExit = true;
}
