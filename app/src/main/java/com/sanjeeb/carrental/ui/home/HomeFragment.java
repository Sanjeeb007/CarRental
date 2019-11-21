package com.sanjeeb.carrental.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.sanjeeb.carrental.R;
import com.sanjeeb.carrental.adpter.ContactsAdapters;

import java.util.ArrayList;
import java.util.List;

import model.Contacts;

public class HomeFragment extends Fragment {
    private RecyclerView recyclerView;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_home, container, false);
        recyclerView=root.findViewById(R.id.recyclerView);
        List<Contacts> contactsList = new ArrayList<>();
        contactsList.add(new Contacts("AntMan","014710839",R.drawable.antman));
        contactsList.add(new Contacts("BadMan","014710840",R.drawable.badman));
        contactsList.add(new Contacts("SuperMan","014710841",R.drawable.superman));
        contactsList.add(new Contacts("Hulk","014710842",R.drawable.hulk));
        contactsList.add(new Contacts("IronMan","014710843",R.drawable.ironman));
        contactsList.add(new Contacts("SpiderMan","014710844",R.drawable.spiderman));
        contactsList.add(new Contacts("BlackPanther","014710845",R.drawable.blackpanther));
        contactsList.add(new Contacts("BadMan","014710846",R.drawable.badman));
        contactsList.add(new Contacts("SuperMan","014710847",R.drawable.superman));
        contactsList.add(new Contacts("Hulk","014710848",R.drawable.hulk));
        contactsList.add(new Contacts("IronMan","014710849",R.drawable.ironman));
        contactsList.add(new Contacts("SpiderMan","014710850",R.drawable.spiderman));
        contactsList.add(new Contacts("BlackPanther","014710851",R.drawable.blackpanther));
        ContactsAdapters contactsAdapter = new ContactsAdapters(getActivity(),contactsList);
        recyclerView.setAdapter(contactsAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        return root;
    }
}