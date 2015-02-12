/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.jensd.weathericons;

import de.jensd.fx.fontawesome.AwesomeDude;
import static de.jensd.fx.fontawesome.AwesomeDude.WEATHER_ICONS_TTF_PATH;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

/**
 *
 * @author Jens Deters (mail@jensd.de)
 */
public class WeatherIcon extends Text {

    static {
        Font.loadFont(AwesomeDude.class.getResource(WEATHER_ICONS_TTF_PATH).toExternalForm(), 10.0);
    }

    public void initialze() {
    }

    public WeatherIcon(WeatherIconEnum icon, String size, String style, String styleClass) {
        setText(icon.asString());
        getStyleClass().add("weather");
        if (styleClass != null && !styleClass.isEmpty()) {
            getStyleClass().add(styleClass);
        }
        size = (size == null || size.isEmpty()) ? "2em" : size;
        String stylePrefix = String.format("-fx-font-family: 'weather icons'; -fx-font-size: %s;", size);
        setStyle(stylePrefix + (style == null ? "" : style));
    }

    public WeatherIcon(String iconName, String size, String style, String styleClass) {
        this(WeatherIconEnum.valueOf(iconName), size, style, styleClass);
    }

    public WeatherIcon(String iconName,String size,String styleClass) {
        this(WeatherIconEnum.valueOf(iconName), size, null, styleClass);
    }

    public WeatherIcon(String iconName, String size) {
        this(WeatherIconEnum.valueOf(iconName), size, null, null);
    }

    public WeatherIcon(String iconName) {
        this(WeatherIconEnum.valueOf(iconName), "2em", null, null);
    }

    public WeatherIcon() {
        this(WeatherIconEnum.UMBRELLA, "2em", null, null);
    }

    private StringProperty size;

    public final StringProperty sizeProperty() {
        if (size == null) {
            size = new SimpleStringProperty("1em");
        }
        return size;
    }

    public final String getSize() {
        return sizeProperty().getValue();
    }

    public final void setSize(String size) {
        size = (size == null || size.isEmpty()) ? "1em" : size;
        setStyle(String.format("-fx-font-family: 'weather icons'; -fx-font-size: %s;", size));
        sizeProperty().setValue(size);
    }

    private StringProperty iconName;

    public final StringProperty iconNameProperty() {
        if (iconName == null) {
            iconName = new SimpleStringProperty(WeatherIconEnum.UMBRELLA.asString());
        }
        return iconName;
    }

    public final String getIconName() {
        return iconNameProperty().getValue();
    }

    public void setIconName(String iconName) {
        setText(WeatherIconEnum.valueOf(iconName).asString());
        iconNameProperty().setValue(iconName);
    }

}
