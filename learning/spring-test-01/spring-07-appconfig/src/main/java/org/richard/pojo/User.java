package org.richard.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class User {
    private String name;

    public String getName() {
        return name;
    }

    @Value("Richard")
    public void setName(String name) {
        this.name = name;
    }
}
