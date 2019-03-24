package com.mihrinurgrn.gelecegiyazankadnlarfirstweek;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.QuickContactBadge;
import android.widget.TextView;

import java.util.ArrayList;

public class StudentAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<Student> students;

    public StudentAdapter(Context context, ArrayList<Student> students) {
        this.context = context;
        this.students = students;
    }

    @Override
    public int getCount() {
        return students.size();
    }

    @Override
    public Object getItem(int position) {

        return students.get(position);
    }

    @Override
    public long getItemId(int position) {
        return students.get(position).getAge();
    }

    @Override
    public View getView(final int position, View convertView, final ViewGroup parent) {

        View view=convertView;
        if(view==null)
        {
            LayoutInflater inflater=(LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            view=inflater.inflate(R.layout.row_item,parent,  false);

        }

        TextView tvName = view.findViewById(R.id.isim);
        TextView tvUSerName=view.findViewById(R.id.soyisim);
        TextView tvAge=view.findViewById(R.id.yas);

        Button buttonRemove=view.findViewById(R.id.buttonRemove);

        buttonRemove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                students.remove(position);
                notifyDataSetChanged();
            }
        });

        Student student=students.get(position);
        tvName.setText(student.getFullname());
        tvUSerName.setText("@"+student.getUsername());
        tvAge.setText(String.valueOf(student.getAge()));


        return view;




    }
}













