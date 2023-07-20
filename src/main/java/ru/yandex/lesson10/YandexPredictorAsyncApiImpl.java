package ru.yandex.lesson10;

import java.util.List;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import ru.yandex.lesson9.PredictResponse;

public class YandexPredictorAsyncApiImpl {

    private final String key;
    private final YandexPredictorApi api;

    public YandexPredictorAsyncApiImpl() {

        key = "pdct.1.1.20230717T161439Z.4297dca4a67e5bba.6c132f98961586decf6536026a6442c4c1d32d4f";

        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor(System.out::println);
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://predictor.yandex.net/api/v1/predict.json/")
                .addConverterFactory(JacksonConverterFactory.create())
                .client(client)
                .build();

        api = retrofit.create(YandexPredictorApi.class);
    }


    public void onGetLangs(Callback<List<String>> callback) {
        api.getLangs(key).enqueue(callback);
    }

    public void onComplete(String query, String lang, Integer limit, Callback<PredictResponse> callback) {
        api.complete(key, query, lang, limit).enqueue(callback);
    }

}
