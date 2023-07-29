package ru.yandex.lesson10;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import ru.yandex.lesson9.PredictResponse;

public class Main {

    public static void main(String[] args) {
//        YandexPredictorSyncApiImpl api = new YandexPredictorSyncApiImpl();
//
//        List<String> langs = api.getLangs();
//        PredictResponse response = api.complete("Hello", "en", 4);
        YandexPredictorAsyncApiImpl api = new YandexPredictorAsyncApiImpl();

        api.onGetLangs(new Callback<>() {
            @Override
            public void onResponse(Call<List<String>> call, Response<List<String>> response) {
                System.out.println(response.body());

            }

            @Override
            public void onFailure(Call<List<String>> call, Throwable throwable) {
                System.err.println(throwable.getMessage());
            }
        });

        api.onComplete("Hello", "eng", 4, new Callback<>() {
            @Override
            public void onResponse(Call<PredictResponse> call, Response<PredictResponse> response) {
                System.out.println(response.body());
            }

            @Override
            public void onFailure(Call<PredictResponse> call, Throwable throwable) {
                System.err.println(throwable.getMessage());
            }
        });

        System.out.println();
    }
}
