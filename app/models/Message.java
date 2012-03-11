package models;

import javax.persistence.Entity;
import javax.persistence.Table;

import play.db.jpa.Model;

@Entity
public class Message extends Model {

    public String message;

    public Message(String message) {
        this.message = message;
    }

}
