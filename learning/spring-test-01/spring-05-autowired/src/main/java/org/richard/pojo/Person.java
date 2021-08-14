package org.richard.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name;

    @Autowired
    @Qualifier("dog")
    private Dog dog;

    @Autowired
    @Qualifier("cat")
    private Cat cat;

    public String getName() {
        return name;
    }


    public Dog getDog() {
        return dog;
    }


    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", dog=" + dog +
                ", cat=" + cat +
                '}';
    }
}
