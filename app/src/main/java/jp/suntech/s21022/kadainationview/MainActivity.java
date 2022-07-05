package jp.suntech.s21022.kadainationview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView cList = findViewById(R.id.countrylist);
        cList.setOnItemClickListener(new ListItemClickLister());
    }

    private class ListItemClickLister implements AdapterView.OnItemClickListener{

        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            TextView c_label = findViewById(R.id.countrylabel);
            TextView select = (TextView) view;
            String select_label = select.getText().toString();

            c_label.setText(select_label);

        }
    }
}