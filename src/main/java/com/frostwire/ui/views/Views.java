package com.frostwire.ui.views;

import javafx.fxml.FXMLLoader;

import java.io.IOException;

public final class Views {

    private Views() {
    }

    public static void load(Object v, String name) {

        String fxml = "/com/frostwire/ui/views/" + name + ".fxml";
        FXMLLoader loader = new FXMLLoader(Views.class.getResource(fxml));

        loader.setRoot(v);
        loader.setController(v);

        try {
            loader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
