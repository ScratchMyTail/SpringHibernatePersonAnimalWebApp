package no.hinesna;

import javax.persistence.*;

/**
 * Created by christerhansen on 13.11.14.
 */
@Entity
@Table(name="husdyr")
public class Husdyr {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private int id;
    private String art;
    private String navn;
    private int p_id;

    public Husdyr(String art, String navn) {
        this.art = art;
        this.navn = navn;
    }

    public Husdyr() {
    }

    public String getArt() {
        return art;
    }

    public void setArt(String art) {
        this.art = art;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getP_id() {
        return p_id;
    }

    public void setP_id(int p_id) {
        this.p_id = p_id;
    }
}
