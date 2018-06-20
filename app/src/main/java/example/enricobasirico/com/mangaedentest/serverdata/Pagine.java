
package example.enricobasirico.com.mangaedentest.serverdata;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Pagine {

    @SerializedName("images")
    @Expose
    private List<List<Integer>> images = null;

    public List<List<Integer>> getImages() {
        return images;
    }

    public void setImages(List<List<Integer>> images) {
        this.images = images;
    }

}
