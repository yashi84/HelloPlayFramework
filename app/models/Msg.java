package models;

import javax.persistence.Entity;
import javax.persistence.Table;

import play.db.jpa.Model;

@Entity
public class Msg extends Model {

    public String message;

    public Msg(String message) {
        this.message = message;
    }

}
