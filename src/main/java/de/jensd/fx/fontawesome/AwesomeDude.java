/**
 * Copyright (c) 2013,2014 Jens Deters http://www.jensd.de
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 *
 */
package de.jensd.fx.fontawesome;

import de.jensd.weathericons.WeatherIconEnum;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.Labeled;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Tab;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.TreeItem;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

/**
 *
 * @author Jens Deters
 */
public class AwesomeDude {

    public final static String FONT_AWESOME_TTF_PATH = "/font/fontawesome-webfont.ttf";
    public final static String WEATHER_ICONS_TTF_PATH = "/font/weathericons-regular-webfont.ttf";
    public final static String DEFAULT_ICON_SIZE = "16.0";
    public final static String DEFAULT_FONT_SIZE = "1em";

    static {
        Font.loadFont(AwesomeDude.class.getResource(FONT_AWESOME_TTF_PATH).toExternalForm(), 10.0);
        Font.loadFont(AwesomeDude.class.getResource(WEATHER_ICONS_TTF_PATH).toExternalForm(), 10.0);
    }

    /*
     * Weather Icons stuff 
     *
     */
    public static Text createIcon(WeatherIconEnum icon) {
        return AwesomeDude.createIcon(icon, DEFAULT_ICON_SIZE);
    }

    public static Text createIcon(WeatherIconEnum icon, String iconSize) {
        Text text = new Text(icon.asString());
        text.getStyleClass().add("weather");
        text.setStyle("-fx-font-family: 'weather icons'; -fx-font-size: " + iconSize + ";");
        return text;
    }

    /*
     * Font Awesome stuff 
     *
     */
    public static Text createIcon(AwesomeIconEnum icon) {
        return AwesomeDude.createIcon(icon, DEFAULT_ICON_SIZE);
    }

    public static Text createIcon(AwesomeIconEnum icon, String iconSize) {
        Text text = new Text(icon.asString());
        text.getStyleClass().add("awesome");
        text.setStyle("-fx-font-family: FontAwesome; -fx-font-size: " + iconSize + ";");
        return text;
    }

    public static Label createIconLabel(AwesomeIconEnum icon, String text, String iconSize, String fontSize, ContentDisplay contentDisplay) {
        Text iconLabel = AwesomeDude.createIcon(icon, iconSize);
        Label label = new Label(text);
        label.setStyle("-fx-font-size: " + fontSize);
        label.setGraphic(iconLabel);
        label.setContentDisplay(contentDisplay);
        return label;
    }

    public static Button createIconButton(AwesomeIconEnum icon) {
        return createIconButton(icon, "");
    }

    public static Button createIconButton(AwesomeIconEnum icon, String text) {
        Text label = AwesomeDude.createIcon(icon, DEFAULT_ICON_SIZE);
        Button button = new Button(text);
        button.setGraphic(label);
        return button;
    }

    public static Button createIconButton(AwesomeIconEnum icon, String text, String iconSize, String fontSize, ContentDisplay contentDisplay) {
        Text label = AwesomeDude.createIcon(icon, iconSize);
        Button button = new Button(text);
        button.setStyle("-fx-font-size: " + fontSize);
        button.setGraphic(label);
        button.setContentDisplay(contentDisplay);
        return button;
    }

    public static ToggleButton createIconToggleButton(AwesomeIconEnum icon, String text, String iconSize, ContentDisplay contentDisplay) {
        return createIconToggleButton(icon, text, iconSize, DEFAULT_FONT_SIZE, contentDisplay);
    }

    public static ToggleButton createIconToggleButton(AwesomeIconEnum icon, String text, String iconSize, String fontSize, ContentDisplay contentDisplay) {
        Text label = AwesomeDude.createIcon(icon, iconSize);
        ToggleButton button = new ToggleButton(text);
        button.setStyle("-fx-font-size: " + fontSize);
        button.setGraphic(label);
        button.setContentDisplay(contentDisplay);
        return button;
    }


    /*
     * 
     * 
     * 
     */
    public static void setIcon(Tab tab, AwesomeIconEnum icon) {
        setIcon(tab, icon, DEFAULT_ICON_SIZE);
    }

    public static void setIcon(Tab tab, AwesomeIconEnum icon, String iconSize) {
        tab.setGraphic(AwesomeDude.createIcon(icon, iconSize));
    }

    public static void setIcon(Labeled labeled, AwesomeIconEnum icon) {
        setIcon(labeled, icon, DEFAULT_ICON_SIZE);
    }

    public static void setIcon(Labeled labeled, AwesomeIconEnum icon, ContentDisplay contentDisplay) {
        setIcon(labeled, icon, DEFAULT_ICON_SIZE, contentDisplay);
    }

    public static void setIcon(Labeled labeled, AwesomeIconEnum icon, String iconSize) {
        setIcon(labeled, icon, iconSize, ContentDisplay.LEFT);
    }

    public static void setIcon(Labeled labeled, AwesomeIconEnum icon, String iconSize, ContentDisplay contentDisplay) {
        if (labeled == null) {
            throw new IllegalArgumentException("The component must not be 'null'!");
        }
        labeled.setGraphic(AwesomeDude.createIcon(icon, iconSize));
        labeled.setContentDisplay(contentDisplay);
    }

    public static void setIcon(MenuItem menuItem, AwesomeIconEnum icon) {
        setIcon(menuItem, icon, DEFAULT_FONT_SIZE, DEFAULT_ICON_SIZE);
    }

    public static void setIcon(MenuItem menuItem, AwesomeIconEnum icon, String iconSize) {
        setIcon(menuItem, icon, DEFAULT_FONT_SIZE, iconSize);
    }

    public static void setIcon(MenuItem menuItem, AwesomeIconEnum icon, String fontSize, String iconSize) {
        if (menuItem == null) {
            throw new IllegalArgumentException("The menu item must not be 'null'!");
        }
        Text label = AwesomeDude.createIcon(icon, iconSize);
        menuItem.setStyle("-fx-font-size: " + fontSize);
        menuItem.setGraphic(label);
    }

    public static void setIcon(TreeItem treeItem, AwesomeIconEnum icon) {
        setIcon(treeItem, icon, DEFAULT_ICON_SIZE);
    }

    public static void setIcon(TreeItem treeItem, AwesomeIconEnum icon, String iconSize) {
        if (treeItem == null) {
            throw new IllegalArgumentException("The tree item must not be 'null'!");
        }
        Text label = AwesomeDude.createIcon(icon, iconSize);
        treeItem.setGraphic(label);
    }

}
