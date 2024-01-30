package com.dsi;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;

@Entity
@Component
public class Lists {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String userName;
    private String listTitle;
    private String listDescription;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {

        this.userName = userName;
    }

    public void setListTitle(String listTitle) {
        this.listTitle = listTitle;
    }

    public String getListTitle() {
        return listTitle;
    }

    public String getListDescription() {
        return listDescription;
    }

    public void setListDescription(String listDescription) {

        this.listDescription = listDescription;
    }

    public void updateDescription(String noteDescription) {
        this.listDescription = noteDescription;
    }
    public String toString()
    {
        return " "+userName+" "+listTitle+" "+listDescription;
    }
}
