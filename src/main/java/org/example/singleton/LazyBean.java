package org.example.singleton;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class LazyBean {
    public LazyBean() {
        System.out.println("LazyBean initialized!");
    }

    @PostConstruct
    public void init() {
        System.out.println("LazyBean is ready!");
    }
}
