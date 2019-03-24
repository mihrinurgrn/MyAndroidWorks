package com.mihrinurgrn.gelecegiyazankadnlarfirstweek;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private StudentAdapter studentAdapter;
    private ListView ListView ;

    private ArrayList<Student> students = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView = findViewById(R.id.listview);
        students.add(new Student("a","b",20));
        students.add(new Student("dd","kcks",20));
        students.add(new Student("vfnfm","yuı",20));
        students.add(new Student("fghj","gch",20));
        students.add(new Student("dfghj","vdksvj",20));

        ListView=findViewById(R.id.listview);

        studentAdapter=new StudentAdapter(this,students);

        ListView.setAdapter(studentAdapter);

        ListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,students.get(position).getFullname(),Toast.LENGTH_LONG).show();

            }
        });


    }
}
