package Controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;

import java.io.IOException;

public class mainController {
    @FXML
    private StackPane mainPane;

    private void setMainPane(String fxml){
        try {
            Node node = FXMLLoader.load(getClass().getResource(fxml));
            AnchorPane.setTopAnchor(node, 0.0);
            AnchorPane.setBottomAnchor(node, 0.0);
            AnchorPane.setLeftAnchor(node, 0.0);
            AnchorPane.setRightAnchor(node, 0.0);
            mainPane.getChildren().setAll(node);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void memberAct(ActionEvent actionEvent) {
        setMainPane("../fxml/Membership.fxml");
    }

    public void aboutAct(ActionEvent actionEvent) {
        setMainPane("../fxml/About.fxml");
    }

    public void priceAct(ActionEvent actionEvent) {
    }

    public void contactAct(ActionEvent actionEvent) {
    }

    public void mainAct(ActionEvent actionEvent) {
        setMainPane("../fxml/Main.fxml");
    }
}
