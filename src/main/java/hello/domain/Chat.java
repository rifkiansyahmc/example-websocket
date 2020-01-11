package hello.domain;

import java.time.ZonedDateTime;

import static java.time.ZonedDateTime.now;

public class Chat {

    private Long id;

    private String name;

    private String message;

    private ZonedDateTime createdAt;

    private boolean read;

    public Chat() {
    }

    public Chat(String name, String message, boolean read) {
        this.name = name;
        this.message = message;
        this.createdAt = now();
        this.read = read;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ZonedDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public boolean isRead() {
        return read;
    }

    public void setRead(boolean read) {
        this.read = read;
    }
}
