package com.frostwire.ui.views;

import javafx.scene.layout.VBox;

public class AppView extends VBox {

    public AppView() {
        Views.load(this, "view_app");
    }
}
