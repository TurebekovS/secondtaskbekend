package org.example.singleton;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class EagerBean {
    public EagerBean() {
        System.out.println("EagerBean initialized!");
    }

    @PostConstruct
    public void init() {
        System.out.println("EagerBean is ready!");
    }
}
