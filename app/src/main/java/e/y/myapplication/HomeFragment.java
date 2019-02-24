package e.y.myapplication;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment implements View.OnClickListener {


    Button add;
    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_home, container, false);
        add=view.findViewById(R.id.adduser);
        add.setOnClickListener(this);
        return view;

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.adduser:
                MainActivity.fm.beginTransaction().replace(R.id.Fragment_Container,new AddUserFragment()).addToBackStack(null).commit();
                break;

        }
    }
}
