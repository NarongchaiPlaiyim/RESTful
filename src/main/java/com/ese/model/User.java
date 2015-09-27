package com.ese.model;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Getter
@Setter
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
public class User {
    @XmlElement
    private Integer id;
    @XmlElement
    private String personId;
    @XmlElement
    private String userName;
    @XmlElement
    private String name;
    @XmlElement
    private String password;
    @XmlElement
    private String email;
    @XmlElement
    private String facebook;
    @XmlElement
    private String department;
    @XmlElement
    private String role;
    @XmlElement
    private Integer active;

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
                .append("id", id)
                .append("personId", personId)
                .append("userName", userName)
                .append("name", name)
                .append("password", password)
                .append("email", email)
                .append("facebook", facebook)
                .append("department", department)
                .append("role", role)
                .append("active", active)
                .toString();
    }
}

