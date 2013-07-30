package de.jensd.fx.fontawesome;

import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.Labeled;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.TreeItem;
import javafx.scene.text.Font;

/**
 *
 * @author Jens Deters
 */
public class AwesomeDude {

    public final static String FONT_AWESOME_TTF_PATH = "/font/fontawesome-webfont.ttf";
    public final static String DEFAULT_ICON_SIZE = "16.0";
    public final static String DEFAULT_FONT_SIZE = "1em";

    static {
        Font.loadFont(AwesomeDude.class.getResource(FONT_AWESOME_TTF_PATH).toExternalForm(), 10.0);
    }

    public static Label createIconLabel(AwesomeIcon icon, String iconSize) {
        Label label = new Label(icon.toString());
        label.getStyleClass().add("awesome");
        label.setStyle("-fx-font-family: FontAwesome; -fx-font-size: " + iconSize + ";");
        return label;
    }

    public static Button createIconButton(AwesomeIcon icon) {
        return createIconButton(icon, "");
    }

    public static Button createIconButton(AwesomeIcon icon, String text) {
        Label label = createIconLabel(icon, DEFAULT_ICON_SIZE);
        Button button = new Button(text);
        button.setGraphic(label);
        return button;
    }

    public static Button createIconButton(AwesomeIcon icon, String text, String iconSize, String fontSize, ContentDisplay contentDisplay) {
        Label label = createIconLabel(icon, iconSize);
        Button button = new Button(text);
        button.setStyle("-fx-font-size: " + fontSize);
        button.setGraphic(label);
        button.setContentDisplay(contentDisplay);
        return button;
    }

    public static ToggleButton createIconToggleButton(AwesomeIcon icon, String text, String iconSize, ContentDisplay contentDisplay) {
        return createIconToggleButton(icon, text, iconSize, DEFAULT_FONT_SIZE, contentDisplay);
    }

    public static ToggleButton createIconToggleButton(AwesomeIcon icon, String text, String iconSize, String fontSize, ContentDisplay contentDisplay) {
        Label label = createIconLabel(icon, iconSize);
        ToggleButton button = new ToggleButton(text);
        button.setStyle("-fx-font-size: " + fontSize);
        button.setGraphic(label);
        button.setContentDisplay(contentDisplay);
        return button;
    }

    public static Label createIconLabel(AwesomeIcon icon) {
        return createIconLabel(icon, DEFAULT_ICON_SIZE);
    }
    
    /*
     * 
     * 
     * 
     */

    public static void setIcon(Labeled labeled, AwesomeIcon icon) {
        setIcon(labeled, icon, DEFAULT_ICON_SIZE);
    }

    public static void setIcon(Labeled labeled, AwesomeIcon icon, ContentDisplay contentDisplay) {
        setIcon(labeled, icon, DEFAULT_ICON_SIZE, contentDisplay);
    }

    public static void setIcon(Labeled labeled, AwesomeIcon icon, String iconSize) {
        setIcon(labeled, icon, iconSize, ContentDisplay.LEFT);
    }

    public static void setIcon(Labeled labeled, AwesomeIcon icon, String iconSize, ContentDisplay contentDisplay) {
        labeled.setGraphic(createIconLabel(icon));
        labeled.setContentDisplay(contentDisplay);
        labeled.getStyleClass().add("awesome");
        labeled.setStyle("-fx-font-family: FontAwesome; -fx-font-size: " + iconSize + ";");
    }

    public static void setIcon(MenuItem menuItem, AwesomeIcon icon) {
        setIcon(menuItem, icon, DEFAULT_FONT_SIZE, DEFAULT_ICON_SIZE);
    }

    public static void setIcon(MenuItem menuItem, AwesomeIcon icon, String fontSize, String iconSize) {
        Label label = createIconLabel(icon, iconSize);
        menuItem.setStyle("-fx-font-size: " + fontSize);
        menuItem.setGraphic(label);
    }
    
}
