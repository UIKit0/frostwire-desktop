package com.frostwire.ui.views;

import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

public class AppHeaderView extends HBox {

    private Button buttonMenu;

    public AppHeaderView() {
        Views.load(this, "app_header");

        buttonMenu = (Button) lookup("#buttonMenu");

        buttonMenu.setOnAction(e -> System.out.println("Hello"));
    }
}
