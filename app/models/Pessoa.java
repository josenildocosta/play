package models;

import io.ebean.Finder;
import io.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pessoa extends Model {
    @Id
    private Long id;
    private String nome;

    public static final Finder<Long, Pessoa> find = new Finder<>(Pessoa.class);
}
