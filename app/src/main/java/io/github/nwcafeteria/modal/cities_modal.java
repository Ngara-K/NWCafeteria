package io.github.nwcafeteria.modal;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public abstract class cities_modal {

    @Expose
    @SerializedName("state_code")
    private String state_code;
    @Expose
    @SerializedName("state_name")
    private String state_name;
    @Expose
    @SerializedName("state_id")
    private String state_id;
    @Expose
    @SerializedName("is_state")
    private String is_state;
    @Expose
    @SerializedName("country_name")
    private String country_name;
    @Expose
    @SerializedName("country_id")
    private String country_id;
    @Expose
    @SerializedName("name")
    private String name;
    @Expose
    @SerializedName("id")
    private String id;

    public cities_modal(String state_code, String state_name, String state_id, String is_state, String country_name, String country_id, String name, String id) {
        this.state_code = state_code;
        this.state_name = state_name;
        this.state_id = state_id;
        this.is_state = is_state;
        this.country_name = country_name;
        this.country_id = country_id;
        this.name = name;
        this.id = id;
    }

    public String getState_code() {
        return state_code;
    }

    public void setState_code(String state_code) {
        this.state_code = state_code;
    }

    public String getState_name() {
        return state_name;
    }

    public void setState_name(String state_name) {
        this.state_name = state_name;
    }

    public String getState_id() {
        return state_id;
    }

    public void setState_id(String state_id) {
        this.state_id = state_id;
    }

    public String getIs_state() {
        return is_state;
    }

    public void setIs_state(String is_state) {
        this.is_state = is_state;
    }

    public String getCountry_name() {
        return country_name;
    }

    public void setCountry_name(String country_name) {
        this.country_name = country_name;
    }

    public String getCountry_id() {
        return country_id;
    }

    public void setCountry_id(String country_id) {
        this.country_id = country_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
