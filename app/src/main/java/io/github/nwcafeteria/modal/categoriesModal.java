package io.github.nwcafeteria.modal;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public abstract class categoriesModal {

    @Expose
    @SerializedName("category_name")
    private String category_name;
    @Expose
    @SerializedName("category_id")
    private String category_id;

    public categoriesModal(String category_name, String category_id) {
        this.category_name = category_name;
        this.category_id = category_id;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    public String getCategory_id() {
        return category_id;
    }

    public void setCategory_id(String category_id) {
        this.category_id = category_id;
    }
}
