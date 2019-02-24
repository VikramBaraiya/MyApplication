package e.y.myapplication;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class AddUserFragment extends Fragment {

    Button save;
    EditText id,name,email;
    public AddUserFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view;
        view= inflater.inflate(R.layout.fragment_add_user, container, false);
       //ave=view.findViewById(R.id.)
         id=view.findViewById(R.id.id);
         name=view.findViewById(R.id.Name);
         email=view.findViewById(R.id.Email);
         save=view.findViewById(R.id.save);

         save.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 int userid=Integer.parseInt(id.getText().toString());
                 String username=name.getText().toString();
                 String useremail=email.getText().toString();
                 User user=new User();
                 user.setId(userid);
                 user.setName(username);
                 user.setEmail(useremail);
                 MainActivity.user.User_Dao().insertUser(user);
                 Toast.makeText(getActivity(),"USer Added Successfully",Toast.LENGTH_SHORT).show();
                 id.setText("");
                 name.setText("");
                 email.setText("");

             }
         });
         return view;
    }

}
