
package example.enricobasirico.com.mangaedentest.serverdata;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Manga {

    @SerializedName("a")
    @Expose
    private String name;
    @SerializedName("c")
    @Expose
    private List<String> genere = null;
    @SerializedName("h")
    @Expose
    private Integer h;
    @SerializedName("i")
    @Expose
    private String id;
    @SerializedName("im")
    @Expose
    private String copertina;
    @SerializedName("ld")
    @Expose
    private Double ld;
    @SerializedName("s")
    @Expose
    private Integer s;
    @SerializedName("t")
    @Expose
    private String titolo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getGenere() {
        return genere;
    }

    public void setGenere(List<String> genere) {
        this.genere = genere;
    }

    public Integer getH() {
        return h;
    }

    public void setH(Integer h) {
        this.h = h;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCopertina() {
        return copertina;
    }

    public void setCopertina(String copertina) {
        this.copertina = copertina;
    }

    public Double getLd() {
        return ld;
    }

    public void setLd(Double ld) {
        this.ld = ld;
    }

    public Integer getS() {
        return s;
    }

    public void setS(Integer s) {
        this.s = s;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String t) {
        this.titolo = t;
    }

}
