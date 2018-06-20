
package example.enricobasirico.com.mangaedentest.serverdata;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Manga_ {

    @SerializedName("a")
    @Expose
    private String a;
    @SerializedName("c")
    @Expose
    private List<String> c = null;
    @SerializedName("h")
    @Expose
    private Integer h;
    @SerializedName("i")
    @Expose
    private String i;
    @SerializedName("im")
    @Expose
    private String im;
    @SerializedName("ld")
    @Expose
    private Double ld;
    @SerializedName("s")
    @Expose
    private Integer s;
    @SerializedName("t")
    @Expose
    private String t;

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public List<String> getC() {
        return c;
    }

    public void setC(List<String> c) {
        this.c = c;
    }

    public Integer getH() {
        return h;
    }

    public void setH(Integer h) {
        this.h = h;
    }

    public String getI() {
        return i;
    }

    public void setI(String i) {
        this.i = i;
    }

    public String getIm() {
        return im;
    }

    public void setIm(String im) {
        this.im = im;
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

    public String getT() {
        return t;
    }

    public void setT(String t) {
        this.t = t;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("a", a).append("c", c).append("h", h).append("i", i).append("im", im).append("ld", ld).append("s", s).append("t", t).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(t).append(s).append(ld).append(c).append(a).append(im).append(h).append(i).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Manga_) == false) {
            return false;
        }
        Manga_ rhs = ((Manga_) other);
        return new EqualsBuilder().append(t, rhs.t).append(s, rhs.s).append(ld, rhs.ld).append(c, rhs.c).append(a, rhs.a).append(im, rhs.im).append(h, rhs.h).append(i, rhs.i).isEquals();
    }

}
