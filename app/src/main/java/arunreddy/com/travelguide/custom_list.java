package arunreddy.com.travelguide;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.*;

public class custom_list extends ArrayAdapter<String> {
    private final Activity context;
    private  final String[] names;
    private final Integer[] images;
    public List<detailview> hotelDetails;
    public custom_list(Activity context,String[] names,Integer[] images,List<detailview> hotelDetails){
        super(context,R.layout.activity_custom_list,names);
        this.context=context;
        this.names=names;
        this.images=images;
        this.hotelDetails=hotelDetails;
    }
    @Override
    public View getView(final int position, View view, ViewGroup parent){
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.activity_custom_list,null,true);
        TextView txtTitle=(TextView) rowView.findViewById(R.id.textview);
        ImageView imageView=(ImageView) rowView.findViewById(R.id.imageview);
        txtTitle.setText(names[position]);
        imageView.setImageResource(images[position]);
        rowView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context,detailview.class);
                intent.putExtra("title",hotelDetails.get(position).nam);
                intent.putExtra("image",hotelDetails.get(position).img);
                intent.putExtra("time",hotelDetails.get(position).tim);
                intent.putExtra("desc",hotelDetails.get(position).des);
                intent.putExtra("address",hotelDetails.get(position).add);
                context.startActivity(intent);
            }
        });
        return rowView;
    }

    /*@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_custom_list);
    }*/
}