package com.frostwire.ui;

import com.frostwire.ui.views.AppView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        AppView app = new AppView();

        Scene scene = new Scene(app);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
