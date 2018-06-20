
package example.enricobasirico.com.mangaedentest.serverdata;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Manga {

    @SerializedName("end")
    @Expose
    private Integer end;
    @SerializedName("manga")
    @Expose
    private List<Manga_> manga = null;
    @SerializedName("page")
    @Expose
    private Integer page;
    @SerializedName("start")
    @Expose
    private Integer start;
    @SerializedName("total")
    @Expose
    private Integer total;

    public Integer getEnd() {
        return end;
    }

    public void setEnd(Integer end) {
        this.end = end;
    }

    public List<Manga_> getManga() {
        return manga;
    }

    public void setManga(List<Manga_> manga) {
        this.manga = manga;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("end", end).append("manga", manga).append("page", page).append("start", start).append("total", total).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(total).append(start).append(page).append(manga).append(end).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Manga) == false) {
            return false;
        }
        Manga rhs = ((Manga) other);
        return new EqualsBuilder().append(total, rhs.total).append(start, rhs.start).append(page, rhs.page).append(manga, rhs.manga).append(end, rhs.end).isEquals();
    }

}
