package sample;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView redMark;

    @FXML
    private ImageView greenMark;

    @FXML
    private AnchorPane panelQuatersFinal;

    @FXML
    private TextField qfPlayer1BlueCommand1;

    @FXML
    private TextField qfPlayer2BlueCommand1;

    @FXML
    private TextField qfPlayer1RedCommand1;

    @FXML
    private TextField qfPlayer2RedCommand1;

    @FXML
    private TextField qfPlayer1BlueCommand2;

    @FXML
    private TextField qfPlayer2BlueCommand2;

    @FXML
    private TextField qfPlayer1RedCommand2;

    @FXML
    private TextField qfPlayer2RedCommand2;

    @FXML
    private ImageView qfBattle1;

    @FXML
    private TextField qfPlayer1BlueCommand3;

    @FXML
    private TextField qfPlayer2BlueCommand3;

    @FXML
    private TextField qfPlayer1RedCommand3;

    @FXML
    private TextField qfPlayer2RedCommand3;

    @FXML
    private TextField qfPlayer1BlueCommand4;

    @FXML
    private TextField qfPlayer2BlueCommand4;

    @FXML
    private TextField qfPlayer1RedCommand4;

    @FXML
    private TextField qfPlayer2RedCommand4;

    @FXML
    private ImageView qfBattle2;

    @FXML
    private AnchorPane panelPreFinal;

    @FXML
    private TextField pfPlayer1BlueCommand1;

    @FXML
    private TextField pfPlayer2BlueCommand1;

    @FXML
    private TextField pfPlayer1RedCommand1;

    @FXML
    private TextField pfPlayer2RedCommand1;

    @FXML
    private ImageView pfBattle1;

    @FXML
    private TextField pfPlayer1BlueCommand2;

    @FXML
    private TextField pfPlayer2BlueCommand2;

    @FXML
    private TextField pfPlayer1RedCommand2;

    @FXML
    private TextField pfPlayer2RedCommand2;

    @FXML
    private ImageView pfBattle2;

    @FXML
    private AnchorPane panelFinal;

    @FXML
    private TextField fPlayer1BlueCommand1;

    @FXML
    private TextField fPlayer2BlueCommand1;

    @FXML
    private TextField fPlayer1RedCommand2;

    @FXML
    private TextField fPlayer2RedCommand2;

    @FXML
    private ImageView fBattle;

    @FXML
    private AnchorPane panelWinner;

    @FXML
    private TextField winnerP1;

    @FXML
    private TextField winnerP2;

    @FXML
    private Button mixButton;

    @FXML
    private TextField nickFlied;

    private static TextField nickWriter;

    private static ImageView buttonMixOff;
    private static ImageView buttonMixOn;
    private static ImageView markGreen;
    private static ImageView markRed;

    static {
        Image imgOff = new Image("resources\\mixButton.png");
        buttonMixOff = new ImageView(imgOff);
        Image imgOn = new Image("resources\\mixButtonPressed.png");
        buttonMixOn = new ImageView(imgOn);
    }

    public static TextField getNickWriter() {
        return nickWriter;
    }

    public static ImageView getMarkGreen() {
        return markGreen;
    }

    public static ImageView getMarkRed() {
        return markRed;
    }

    @FXML
    void initialize() {
        mixButton.setGraphic(buttonMixOff);
        nickWriter = nickFlied;
        markGreen = greenMark;
        markRed = redMark;

        nickFlied.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (nickFlied.getText().length() > 0) {
                    if (!TGrid.isFull()) {
                        TGrid.addPlayer(nickFlied.getText());
                    }
                    nickFlied.setText("");
                }

            }
        });

        mixButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                mixButton.setGraphic(buttonMixOff);
            }
        });
        mixButton.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                mixButton.setGraphic(buttonMixOn);
            }
        });
        mixButton.setOnMouseReleased(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                mixButton.setGraphic(buttonMixOff);
            }
        });
    }
}
