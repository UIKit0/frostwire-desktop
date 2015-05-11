package com.frostwire.ui.views;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

public class AppHeaderView extends HBox {

    private Button buttonMenu;

    public AppHeaderView() {
        Views.load(this, "app_header");

        buttonMenu = (Button) lookup("#buttonMenu");
    }

    public final void setOnMenuAction(EventHandler<ActionEvent> value) {
        buttonMenu.onActionProperty().set(value);
    }

    public final EventHandler<ActionEvent> getOnMenuAction() {
        return buttonMenu.onActionProperty().get();
    }
}
