package e.y.myapplication;

import android.arch.persistence.room.Room;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    public static FragmentManager fm;
    //FragmentTransaction ft;
    public static UserRoomDataBase user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fm=getSupportFragmentManager();
        user= Room.databaseBuilder(getApplicationContext(),UserRoomDataBase.class,"UserDB").allowMainThreadQueries().build();

        if(findViewById(R.id.Fragment_Container)!=null)
        {
            if(savedInstanceState!=null)
            {
                return;
            }
            fm.beginTransaction().add(R.id.Fragment_Container,new HomeFragment()).commit();

        }
        }
}
