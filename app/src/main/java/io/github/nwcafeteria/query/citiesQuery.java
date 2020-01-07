package io.github.nwcafeteria.query;

import io.github.nwcafeteria.modal.citiesModal;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface citiesQuery {
    @GET("cities")
    Call<citiesModal> getCities (@Query("api_key") String api_key);
}
