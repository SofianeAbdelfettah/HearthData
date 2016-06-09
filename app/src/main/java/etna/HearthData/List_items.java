package etna.HearthData;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class List_items extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_items);
    }

/*
    public void SimpleAdapt()
    {
        // Each row in the list stores country name, currency and flag
        List<HashMap<String, String>> aList = new ArrayList<HashMap<String, String>>();


        // System.out.println("Title Array : ========  "+getList()[0]);
        //System.out.println(getDuration()[0]);


        for (int i = 0; i < getLength(); i++) {
            HashMap<String, String> hm = new HashMap<String, String>();
            hm.put("txt", "Titre : " + getList()[i]);
            hm.put("cur", "Durée : " + getDuration()[i]);
            aList.add(hm);
        }
        // Keys used in Hashmap
        String[] from = {"txt", "cur"};
        // Ids of views in listview_layout
        int[] to = {R.id.txt, R.id.cur};
        // Instantiating an adapter to store each items
        // R.layout.listview_layout defines the layout of each item
        SimpleAdapter adapter = new SimpleAdapter(this, aList, R.layout.activity_test_2, from, to);
        // Getting a reference to listview of main.xml layout file
        ListView listView = (ListView) findViewById(listView2);


        assert listView != null;
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            //@Override
            public void onItemClick(AdapterView<?> adapter, View v, int position, long id) {

                HashMap listItem = (HashMap) adapter.getItemAtPosition(position);
                String ok = (String) listItem.get("txt");

                System.out.println(ok);

                Intent intent = new Intent(Apilist.this , details.class);
                intent.putExtra("test1",ok);
                //based on item add info to intent
                startActivity(intent);

            }


        });

        listView.setAdapter(adapter);

    }
*/
}
