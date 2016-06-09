package etna.HearthData;


import java.util.List;

import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Headers;
import retrofit.http.Path;

/**
 * Created by MSI on 08/06/2016.
 */

public interface Api {
    @Headers("x-mashape-key : rEGdRfdV70mshZfE7oAisRzgFDkwp1rv2qljsn7DJy9wW4HEVb")
    @GET("cards/search/{card}")
    Call<List<Repo>> getStudentDetails(@Path("card") String card);
}
