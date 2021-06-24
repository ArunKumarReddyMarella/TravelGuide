package arunreddy.com.travelguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Locale;

public class detailview extends AppCompatActivity {
    ImageView image;
    TextView name,time,desc;
    Button loc;
    Integer img;
    String nam,tim,des,add;
    public  detailview(){};
    public detailview(Integer img, String name, String time, String desc,String address){
        this.img=img;
        this.nam=name;
        this.tim=time;
        this.des=desc;
        this.add=address;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailview);
        image=findViewById(R.id.detail_image);
        name=findViewById(R.id.detail_name);
        time=findViewById(R.id.timing);
        desc=findViewById(R.id.description);
        loc=findViewById(R.id.location);
        Bundle bundle=getIntent().getExtras();
        if(bundle!=null){
            image.setImageResource(bundle.getInt("image"));
            name.setText(bundle.getString("title"));
            time.setText(bundle.getString("time"));
            desc.setText(bundle.getString("desc"));
            add=bundle.getString("address").toString();
        }
        loc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/search/?api=1&query="+add;
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
                /*String uri = String.format(Locale.ENGLISH, "geo:%f,%f",28.595335, 77.168856);
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                startActivity(intent);*/
            }
        });
    }
}