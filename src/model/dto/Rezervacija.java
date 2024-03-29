package model.dto;

import java.sql.Date;

public class Rezervacija {

    private Integer id;
    private Date termin;
    private Integer idScene;
    private String ime;

    public Rezervacija(Integer id, String ime, Date termin, Integer idScene) {
        this.idScene = idScene;
        this.ime = ime;
        this.termin = termin;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getTermin() {
        return termin;
    }

    public void setTermin(Date termin) {
        this.termin = termin;
    }

    public Integer getIdScene() {
        return idScene;
    }

    public void setIdScene(Integer idScene) {
        this.idScene = idScene;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

}