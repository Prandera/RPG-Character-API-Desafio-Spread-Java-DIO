package one.digitalinnovation.RPGCharacterAPI.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Character {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    private Float gold;

    @Column(nullable = false)
    private int level;

    @OneToOne(fetch = FetchType.LAZY)
    private Race race;

    @OneToOne(fetch = FetchType.LAZY)
    private CharClass charClass;

    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    private List<Items> items;
}
