package com.sanjeeb.carrental;


import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.sanjeeb.carrental.implement.InterfaceClassIMPL;
import com.sanjeeb.carrental.implement.TabLayoutInterface;
import com.sanjeeb.carrental.model.Datacenter;


/**
 * A simple {@link Fragment} subclass.
 */
public class LoginFragment extends Fragment {
    EditText loginNmae, LoginPasssword;
    Button btnlogin;


    public LoginFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_login, container, false);
        loginNmae = view.findViewById(R.id.loginName);
        LoginPasssword = view.findViewById(R.id.loginPass);
        btnlogin = view.findViewById(R.id.btnLogin);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DataStore();
            }
        });

        return view;
    }

    public void DataStore() {
        Datacenter datacenter = new Datacenter();
        String name = "", password = "";
        if (!TextUtils.isEmpty(loginNmae.getText().toString())) {
            name = loginNmae.getText().toString();

            if (!TextUtils.isEmpty(LoginPasssword.getText().toString())) {
                password = LoginPasssword.getText().toString();

            } else {
                LoginPasssword.setError("enter password");
                return;
            }
        } else {
            loginNmae.setError("enter  name");
            return;
        }
        TabLayoutInterface impl = new InterfaceClassIMPL();
        if (impl.Checkuser(name,password)) {
            Toast.makeText(getActivity(), "Welcome " + name, Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(getActivity(),NavMain.class);
            //intent.putExtra("names",name);
            startActivity(intent);
        }else{
            Toast.makeText(getActivity(), "Login failed\nplease check ! " , Toast.LENGTH_SHORT).show();

        }


    }
}
