package com.ansikt.springit.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
@Data
@NoArgsConstructor
public class Vote extends Auditable {
    @Id
    @GeneratedValue
    private Long id;
    private int vote;

//    private User user;
//    private Link link;
}
