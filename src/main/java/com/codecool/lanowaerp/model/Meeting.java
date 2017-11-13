package com.codecool.lanowaerp.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.validation.constraints.NotNull;
import org.springframework.data.annotation.Id;

@Entity
public class Meeting {

    @Id
    @GeneratedValue
    private Integer id;

    @Column
    @NotNull
    private Date date;


}
