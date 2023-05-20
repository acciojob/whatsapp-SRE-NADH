package com.driver;

import java.util.Date;
import java.util.Objects;

public class Message implements Comparable<Message> {
    private int id;
    private String content;
    private Date timestamp;

    public Message(int id, String content) {
        this.id = id;
        this.content = content;
        this.timestamp = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Message)) return false;
        Message message = (Message) o;
        return getId() == message.getId() && getContent().equals(message.getContent()) && getTimestamp().equals(message.getTimestamp());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getContent(), getTimestamp());
    }

    @Override
    public int compareTo(Message o) {
        if(this.timestamp.compareTo(o.timestamp)<0) return -1;
        if(this.timestamp.compareTo(o.timestamp)>0) return -1;
        return 0;
    }
}
