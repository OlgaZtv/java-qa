package ru.yandex.lesson10;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

import ru.yandex.lesson9.PredictResponse;

public interface YandexPredictorApi {

    @GET("getLangs")
    Call<List<String>> getLangs(@Query("key") String key);

    @GET("complete")
    Call<PredictResponse> complete(
            @Query("key") String key,
            @Query("q") String query,
            @Query("lang") String lang,
            @Query("limit") Integer limit
    );

}
