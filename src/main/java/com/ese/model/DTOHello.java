package com.ese.model;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.inject.Inject;

@Getter
@Setter
public class DTOHello {
    private String name;
    private String message;

    @Inject
    public DTOHello() {
        name = "HELLO : ";
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
                .append("name", name)
                .append("message", message)
                .toString();
    }
}
