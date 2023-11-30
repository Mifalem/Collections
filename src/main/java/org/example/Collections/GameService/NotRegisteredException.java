package org.example.Collections.GameService;

public class NotRegisteredException extends RuntimeException {
    public NotRegisteredException (String name) {
        super("Player " + name + ", not found");
    }
}
