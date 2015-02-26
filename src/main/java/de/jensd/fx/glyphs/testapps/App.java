/**
 * Copyright (c) 2015 Jens Deters http://www.jensd.de
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.
 *
 */
package de.jensd.fx.glyphs.testapps;

import de.jensd.fx.glyphs.GlyphsBuilder;
import de.jensd.fx.glyphs.GlyphsDude;
import de.jensd.fx.glyphs.GlyphsStack;
import de.jensd.fx.glyphs.GlyphsStyle;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcons;
import de.jensd.fx.glyphs.weathericons.WeatherIcon;
import de.jensd.fx.glyphs.weathericons.WeatherIcons;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Jens Deters
 */
public class App extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        VBox root = new VBox();
        root.setSpacing(10.0);

        Button testButton = new Button();
        testButton.getStyleClass().setAll("exit-button");
        GlyphsDude.setIcon(testButton, FontAwesomeIcons.POWER_OFF, "6em");

        Button testButton2 = new Button();
        testButton2.getStyleClass().add("alien-button");
        GlyphsDude.setIcon(testButton2, WeatherIcons.ALIEN, "6em");

        FontAwesomeIcon fontAwesomeIcon = new FontAwesomeIcon();
        fontAwesomeIcon.setStyleClass("blue-icon");
        fontAwesomeIcon.setSize("4em");
 
        WeatherIcon weatherIcon = new WeatherIcon();
        weatherIcon.setStyleClass("green-icon");
        weatherIcon.setSize("4em");

        Text githubLabel = GlyphsDude.createIcon(FontAwesomeIcons.GITHUB);
        Text ambulanceLabel = GlyphsDude.createIcon(FontAwesomeIcons.PLUS_SQUARE_ALT, "60.0");
        Button starButton = GlyphsDude.createIconButton(FontAwesomeIcons.STAR, "Nice!", "48.0", "20.0", ContentDisplay.TOP);
        Button cloudButton = GlyphsDude.createIconButton(FontAwesomeIcons.CLOUD, "Download");
        ToggleButton toggleButton = GlyphsDude.createIconToggleButton(FontAwesomeIcons.LOCK, "Lock", "60.0", ContentDisplay.TOP);
        Region stackedIcon1 = GlyphsStack.create().add(GlyphsBuilder.create(FontAwesomeIcon.class).icon(FontAwesomeIcons.AMBULANCE).build());

        Region stackedIcon2 = GlyphsStack.create()
                .add(GlyphsBuilder.create(FontAwesomeIcon.class)
                        .icon(FontAwesomeIcons.SQUARE)
                        .size("3em")
                        .styleClass("stack-base")
                        .build()
                )
                .add(GlyphsBuilder.create(FontAwesomeIcon.class)
                        .icon(FontAwesomeIcons.STAR)
                        .size("2em")
                        .styleClass("stack-top")
                        .build()
                );

        Region stackedIcon3 = GlyphsStack.create()
                .add(GlyphsBuilder.create(FontAwesomeIcon.class)
                        .icon(FontAwesomeIcons.SQUARE)
                        .style("-fx-font-size: 4em; -fx-fill: yellowgreen;")
                        .build()
                )
                .add(GlyphsBuilder.create(FontAwesomeIcon.class)
                        .icon(FontAwesomeIcons.APPLE)
                        .style("-fx-font-size: 3em; -fx-fill: white;")
                        .build()
                );

        Region stackedIcon4 = GlyphsStack.create()
                .add(GlyphsBuilder.create(FontAwesomeIcon.class)
                        .icon(FontAwesomeIcons.SQUARE)
                        .style("-fx-font-size: 4em; -fx-fill: yellowgreen;")
                        .build()
                )
                .add(GlyphsBuilder.create(FontAwesomeIcon.class)
                        .icon(FontAwesomeIcons.APPLE)
                        .style("-fx-font-size: 3em; -fx-fill: black;")
                        .build()
                );

        Region stackedIcon5 = GlyphsStack.create()
                .add(GlyphsBuilder.create(FontAwesomeIcon.class)
                        .icon(FontAwesomeIcons.BUG)
                        .style("-fx-font-size: 2em; -fx-fill: black;")
                        .build()
                )
                .add(GlyphsBuilder.create(FontAwesomeIcon.class)
                        .icon(FontAwesomeIcons.BAN)
                        .style("-fx-font-size: 4em; -fx-fill: red; -fx-opacity: 0.5;")
                        .build()
                );

        Region stackedIcon6 = GlyphsStack.create()
                .add(GlyphsBuilder.create(FontAwesomeIcon.class)
                        .icon(FontAwesomeIcons.CIRCLE)
                        .style("-fx-font-size: 8em; -fx-fill: linear-gradient(#70b4e5 0%, #247cbc 70%, #2c85c1 85%);")
                        .build()
                )
                .add(GlyphsBuilder.create(FontAwesomeIcon.class)
                        .icon(FontAwesomeIcons.TWITTER)
                        .style("-fx-font-size: 4em; -fx-fill: white;")
                        .build()
                );

        Region stackedIcon7 = GlyphsStack.create()
                .add(GlyphsBuilder.create(FontAwesomeIcon.class)
                        .icon(FontAwesomeIcons.CIRCLE)
                        .style("-fx-font-size: 12em; -fx-fill: linear-gradient(#70b4e5 0%, #247cbc 70%, #2c85c1 85%);")
                        .build()
                )
                .add(GlyphsBuilder.create(FontAwesomeIcon.class)
                        .icon(FontAwesomeIcons.BITBUCKET)
                        .style("-fx-font-size: 6em; "
                                + "-fx-fill: linear-gradient(#ffffff, #d2d2d2); "
                                + "-fx-effect: dropshadow( one-pass-box , rgba(0,0,0,0.8) , 4 , 0.0 , 1 , 1 );")
                        .build()
                );
        HBox stackIconBox1 = new HBox();
        stackIconBox1.setSpacing(5.0);
        stackIconBox1.setPadding(new Insets(10.0));
        stackIconBox1.getChildren().addAll(stackedIcon1, stackedIcon2, stackedIcon3, stackedIcon4, stackedIcon5, stackedIcon6, stackedIcon7);

        Region iconStack1 = GlyphsStack.create()
                .add(GlyphsBuilder.create(FontAwesomeIcon.class)
                        .icon(FontAwesomeIcons.CIRCLE)
                        .style("-fx-font-size: 12em; -fx-fill: linear-gradient(#70b4e5 0%, #247cbc 70%, #2c85c1 85%);")
                        .build()
                )
                .add(GlyphsBuilder.create(FontAwesomeIcon.class)
                        .icon(FontAwesomeIcons.BITBUCKET)
                        .style("-fx-font-size: 6em; "
                                + "-fx-fill: linear-gradient(#ffffff 0%, #d2d2d2); "
                                + "-fx-effect: dropshadow( one-pass-box , rgba(0,0,0,0.8) , 4 , 0.0 , 1 , 1 );")
                        .build()
                )
                .add(GlyphsBuilder.create(FontAwesomeIcon.class)
                        .icon(FontAwesomeIcons.BAN)
                        .style("-fx-font-size: 12em; -fx-fill: red; -fx-opacity: 0.5;")
                        .build()
                );

        Region iconStack3 = GlyphsStack.create()
                .add(GlyphsBuilder.create(FontAwesomeIcon.class)
                        .icon(FontAwesomeIcons.CIRCLE)
                        .size("12em")
                        .style("-fx-fill: linear-gradient(#70b4e5 0%, #247cbc 70%, #2c85c1 85%);")
                        .build()
                )
                .add(GlyphsBuilder.create(WeatherIcon.class)
                        .icon(WeatherIcons.RAIN)
                        .size("4em")
                        .style("-fx-fill: linear-gradient(#ffffff 0%, #d2d2d2); "
                                + "-fx-effect: dropshadow( one-pass-box , rgba(0,0,0,0.8) , 4 , 0.0 , 1 , 1 );")
                        .build()
                )
                .add(GlyphsBuilder.create(FontAwesomeIcon.class)
                        .icon(FontAwesomeIcons.BAN)
                        .size("12em")
                        .style("-fx-fill: red; -fx-opacity: 0.5;")
                        .build()
                );

        HBox stackIconBox2 = new HBox();
        stackIconBox2.setSpacing(5.0);
        stackIconBox2.setPadding(new Insets(10.0));
        stackIconBox2.getChildren().addAll(iconStack1, iconStack3);

        HBox basicIconBox = new HBox();
        basicIconBox.setAlignment(Pos.CENTER);
        basicIconBox.setSpacing(20.0);
        basicIconBox.getChildren().addAll(fontAwesomeIcon, weatherIcon, testButton, testButton2, githubLabel, ambulanceLabel);
        
        root.getChildren().addAll(createMenubar(), basicIconBox, starButton, cloudButton, toggleButton, stackIconBox1, stackIconBox2);

        Scene scene = new Scene(root, 500, 800);
        scene.getStylesheets().addAll(GlyphsStyle.DEFAULT.getStylePath());

        primaryStage.setScene(scene);
        primaryStage.setTitle("FontAwesomeFX demo");
        primaryStage.show();

    }

    private MenuBar createMenubar() {

        MenuBar menuBar = new MenuBar();

        MenuItem openItem = new MenuItem("Open");
        GlyphsDude.setIcon(openItem, FontAwesomeIcons.FILE);
        MenuItem saveItem = new MenuItem("Save");
        GlyphsDude.setIcon(saveItem, FontAwesomeIcons.DOWNLOAD);
        MenuItem saveAsItem = new MenuItem("Save As...");
        GlyphsDude.setIcon(saveAsItem, FontAwesomeIcons.DOWNLOAD);
        MenuItem exitItem = new MenuItem("Exit");
        GlyphsDude.setIcon(exitItem, FontAwesomeIcons.SIGN_OUT);

        Menu menuFile = new Menu("File");
        menuFile.getItems().add(openItem);
        menuFile.getItems().add(saveItem);
        menuFile.getItems().add(saveAsItem);
        menuFile.getItems().add(new SeparatorMenuItem());
        menuFile.getItems().add(exitItem);

        Menu menuEdit = new Menu("Edit");
        Menu menuView = new Menu("View");

        menuBar.getMenus().addAll(menuFile, menuEdit, menuView);

        return menuBar;
    }

    public static void main(String[] args) {
        System.setProperty("prism.lcdtext", "false");
        launch(args);
    }
}
