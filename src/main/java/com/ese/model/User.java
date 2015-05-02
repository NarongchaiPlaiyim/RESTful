package com.ese.model;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@Getter
@Setter
public class User {

    private Integer id;
    private String personId;
    private String userName;
    private String name;
    private String password;
    private String email;
    private String facebook;
    private String department;
    private String role;
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

