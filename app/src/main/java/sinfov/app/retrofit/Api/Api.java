package sinfov.app.retrofit.Api;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import sinfov.app.retrofit.Model.Hero;

public interface Api {
    String Base_Url="https://simplifiedcoding.net/demos/";

    @GET("marvel")
    Call<List<Hero>> getHeroes();
}
