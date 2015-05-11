package com.frostwire.ui.views;

import javafx.scene.layout.BorderPane;

public class AppView extends BorderPane {

    public AppView() {
        Views.load(this, "app");
    }
}
