package com.github.jinahya.openfire.event;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import java.util.Map;
import java.util.Objects;

public class UserEventPayloadParameter {

    // -----------------------------------------------------------------------------------------------------------------
    static UserEventPayloadParameter of(final String key, final Object value) {
        if (key == null) {
            throw new NullPointerException("key is null");
        }
        final UserEventPayloadParameter instance = new UserEventPayloadParameter();
        instance.setKey(key);
        instance.setValue(Objects.toString(value));
        return instance;
    }

    static UserEventPayloadParameter of(Map.Entry<String, Object> entry) {
        if (entry == null) {
            throw new NullPointerException("entry is null");
        }
        return of(entry.getKey(), entry.getValue());
    }

    // ------------------------------------------------------------------------------------------------------------- key
    public String getKey() {
        return key;
    }

    void setKey(final String key) {
        this.key = key;
    }

    // ----------------------------------------------------------------------------------------------------------- value
    public String getValue() {
        return value;
    }

    void setValue(final String value) {
        this.value = value;
    }

    // -----------------------------------------------------------------------------------------------------------------
    @XmlAttribute
    private String key;

    @XmlValue
    private String value;
}