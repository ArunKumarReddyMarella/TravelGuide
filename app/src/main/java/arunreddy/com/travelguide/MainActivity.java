package arunreddy.com.travelguide;

import androidx.appcompat.app.AppCompatActivity;

import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {
    Button Hotel,Temple,Beach,Museum,AmusementPark,MovieTheater;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Hotel=findViewById(R.id.hotel);
        Temple=findViewById(R.id.temple);
        Beach=findViewById(R.id.beach);
        Museum=findViewById(R.id.museum);
        AmusementPark=findViewById(R.id.amusementPark);
        MovieTheater=findViewById(R.id.movieTheater);
        Hotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,hotel_list.class);
                startActivity(i);
            }
        });
        Temple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,temple_list.class);
                startActivity(i);
            }
        });
        Beach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,beach_list.class);
                startActivity(i);
            }
        });
        Museum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,museum_list.class);
                startActivity(i);
            }
        });
        MovieTheater.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,movietheater_list.class);
                startActivity(i);
            }
        });
        AmusementPark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,amusementparks_list.class);
                startActivity(i);
            }
        });
        Toolbar toolbar=findViewById(R.id.toolbar);
        if(toolbar!=null){
            setSupportActionBar(toolbar);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return  true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        if(item.getItemId()==R.id.signout){
            FirebaseAuth.getInstance().signOut();
            finish();
        }
        return true;
    }
}