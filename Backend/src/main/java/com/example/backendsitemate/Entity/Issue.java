package com.example.backendsitemate.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "sitemate")
@AllArgsConstructor
@NoArgsConstructor
public class Issue {

    @Id
    @Setter
    @Getter
    private String _id;

    @Setter
    @Getter
    private String title;

    @Setter
    @Getter
    private String description;


    @Override
    public String toString(){
        return "Sitemate Issue{" +
                "_id='" + _id + '\'' +
                ", Title='" + title + '\'' +
                ", Description='" + description +
                '}';
    }
}
