package model;

/**
 * Created by liwei.
 */

public class JsonAnnotationData {

    private String nameChangedProperty;
    private String ignoredProperty;
    private String nullIncludeProperty;

    public JsonAnnotationData initialize() {
        nameChangedProperty = "nameChangedPropertyValue";
        ignoredProperty = "ignoredPropertyValue";
        nullIncludeProperty = null;
        return this;
    }

    public String getNameChangedProperty() {
        return nameChangedProperty;
    }

    public void setNameChangedProperty(String nameChangedProperty) {
        this.nameChangedProperty = nameChangedProperty;
    }

    public String getIgnoredProperty() {
        return ignoredProperty;
    }

    public void setIgnoredProperty(String ignoredProperty) {
        this.ignoredProperty = ignoredProperty;
    }

    public String getNullIncludeProperty() {
        return nullIncludeProperty;
    }

    public void setNullIncludeProperty(String nullIncludeProperty) {
        this.nullIncludeProperty = nullIncludeProperty;
    }
}
