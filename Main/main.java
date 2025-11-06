package Main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Date;

public class main extends Application {

    class Pelanggan{
        private String nama;
        private Date tanggal;
        private String status;

        public Pelanggan(String nama, Date tanggal, String status) {
            this.nama = nama;
            this.tanggal = tanggal;
            this.status = status;
        }

        public String getNama() {
            return nama;
        }
        public void setNama(String nama) {
            this.nama = nama;
        }

    }

    @Override
    public void start(Stage pStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("../fxml/MainMenu.fxml"));
        Scene scene = new Scene(root);
        pStage.setTitle("Latihan JavaFX");
        pStage.setScene(scene);
        pStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
