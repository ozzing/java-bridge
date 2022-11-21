package bridge;

public class Application {

    public static void main(String[] args) {
        BridgeGame bridgeGame = new BridgeGame();
        InputView inputView = new InputView();
        OutputView outputView = new OutputView();

        int size = inputView.readBridgeSize();
        bridgeGame.start(size);
        String command = inputView.readMoving();
        bridgeGame.move(command);
    }
}
