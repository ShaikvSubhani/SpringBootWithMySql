package com.example.Sql_Rocks;

import jakarta.persistence.*;

@Entity
@Table(name="library_card")
public class LibraryCard {

    @Id
    private int cardNo;

    private int fine;

    private int bookIssued;

    //child class will have the foreign key of parent class through which
    //it connects with the other table
    @OneToOne // mapping between two entities
    @JoinColumn  //add a foreign key column->define the  column name of the parent class, by default is the primary
    //key of the parent class
    User user;

    @Enumerated(value = EnumType.STRING)  // to store the values in table in string format
    private CardStatus cardStatus;
}
