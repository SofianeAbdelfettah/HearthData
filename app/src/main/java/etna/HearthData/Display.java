package etna.HearthData;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

import retrofit.Call;
import retrofit.Callback;
import retrofit.GsonConverterFactory;
import retrofit.Response;
import retrofit.Retrofit;

public class Display extends AppCompatActivity {
    String url = "https://omgvamp-hearthstone-v1.p.mashape.com/";
    TextView text_id_1, text_name_1, text_marks_1 ;
    TextView text_id_2, text_name_2, text_marks_2 ;
    ImageView img_id_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        text_id_1 = (TextView) findViewById(R.id.text_id_1);
        text_name_1 = (TextView) findViewById(R.id.text_name_1);
        text_marks_1 = (TextView) findViewById(R.id.text_marks_1);
        text_id_2 = (TextView) findViewById(R.id.text_id_2);
        text_name_2 = (TextView) findViewById(R.id.text_name_2);
        text_marks_2 = (TextView) findViewById(R.id.text_marks_2);
        img_id_1 = (ImageView) findViewById(R.id.img_id_1);
        Bundle bundle = getIntent().getExtras();
        String card = bundle.getString("message");
        getRetrofitArray(card);
    }


    void getRetrofitArray(String card) {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        Api service = retrofit.create(Api.class);

        Call<List<Repo>> call = service.getStudentDetails(card);

        call.enqueue(new Callback<List<Repo>>() {
            @Override
            public void onResponse(Response<List<Repo>> response, Retrofit retrofit) {

                try {

                    List<Repo> StudentData = response.body();

                    for (int i = 0; i < StudentData.size(); i++) {
                        if (i == 0) {
                            text_id_1.setText("StudentId  :  " + StudentData.get(i).getCardId());
                            text_name_1.setText("StudentName  :  " + StudentData.get(i).getName());
                            text_marks_1.setText("StudentMarks  : " + StudentData.get(i).getCardSet());
                            Glide.with(getApplicationContext()).load(StudentData.get(i).getImgGold()).asBitmap().into(img_id_1);
                        } else if (i == 1) {
                            text_id_2.setText("StudentId  :  " + StudentData.get(i).getCardId());
                            text_name_2.setText("StudentName  :  " + StudentData.get(i).getName());
                            text_marks_2.setText("StudentMarks  : " + StudentData.get(i).getCardSet());
                        }
                    }


                } catch (Exception e) {
                    Log.d("onResponse", "There is an error");
                    e.printStackTrace();
                }

            }

            @Override
            public void onFailure(Throwable t) {
                Log.d("onFailure", t.toString());
            }
        });
    }
}