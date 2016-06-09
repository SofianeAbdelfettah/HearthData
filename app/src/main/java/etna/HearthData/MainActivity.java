package etna.HearthData;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText text;
    String card;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = (EditText)findViewById(R.id.message1);

    }
    public void album(View v) {
        card = text.getText().toString();
        Intent intent = new Intent(MainActivity.this, Display.class);
        intent.putExtra("message",card);
        startActivity(intent);
    }



}








