package com.frostwire.ui.views;

import javafx.animation.Animation;
import javafx.animation.Transition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.BorderPane;
import javafx.util.Duration;

public class AppView extends BorderPane {

    private AppHeaderView header;
    private AppMenuView menu;

    public AppView() {
        Views.load(this, "app");

        header = (AppHeaderView) lookup("#header");
        menu = (AppMenuView) lookup("#menu");

        final int expandedWidth = 200;

        header.setOnMenuAction(e -> {
            // create an animation to hide sidebar.
            final Animation hideSidebar = new Transition() {
                {
                    setCycleDuration(Duration.millis(250));
                }

                protected void interpolate(double frac) {
                    final double curWidth = expandedWidth * (1.0 - frac);
                    menu.setPrefWidth(curWidth);
                    menu.setTranslateX(-expandedWidth + curWidth);
                }
            };
            hideSidebar.onFinishedProperty().set(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent actionEvent) {
                    menu.setVisible(false);
                }
            });

            // create an animation to show a sidebar.
            final Animation showSidebar = new Transition() {
                {
                    setCycleDuration(Duration.millis(250));
                }

                protected void interpolate(double frac) {
                    final double curWidth = expandedWidth * frac;
                    menu.setPrefWidth(curWidth);
                    menu.setTranslateX(-expandedWidth + curWidth);
                }
            };

            if (showSidebar.statusProperty().get() == Animation.Status.STOPPED && hideSidebar.statusProperty().get() == Animation.Status.STOPPED) {
                if (menu.isVisible()) {
                    hideSidebar.play();
                } else {
                    menu.setVisible(true);
                    showSidebar.play();
                }
            }
        });
    }
}
