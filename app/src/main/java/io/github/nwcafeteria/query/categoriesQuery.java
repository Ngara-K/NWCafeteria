package io.github.nwcafeteria.query;

import io.github.nwcafeteria.modal.categoriesModal;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface categoriesQuery {
    @GET("categories")
    Call<categoriesModal> getCategories (@Query("apiKey") String apiKey);
}
