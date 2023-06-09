package com.example.polytechsacco;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.example.polytechsacco.R;
import com.example.polytechsacco.Adapter.LoanAdapter;
import com.example.polytechsacco.models.Chat;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link LoanFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class LoanFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public LoanFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment LoanFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static LoanFragment newInstance(String param1, String param2) {
        LoanFragment fragment = new LoanFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);


        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_loan,container,false);

       LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getContext());
        LoanAdapter loanAdapter=new LoanAdapter(this.getchats());
        RecyclerView recyclerView = view.findViewById(R.id.Loans_recyclerview);
        recyclerView.setAdapter(loanAdapter);
        recyclerView.setLayoutManager(linearLayoutManager);
       //loanAdapter.notifyDataSetChanged();

        return view;
    }


    public   List<Chat> getchats() {
        List<Chat> chats = new ArrayList<>();
      chats.add(new Chat("BLN001","NORMAL","20000"));
      chats.add(new Chat("BLN0021","School FEES","10000"));
        chats.add(new Chat("BLN001","NORMAL","5500"));
        chats.add(new Chat("BLN0021","School FEES","60000"));
        chats.add(new Chat("BLN001","NORMAL","20000"));
        chats.add(new Chat("BLN0021","School FEES","10000"));
        chats.add(new Chat("BLN001","NORMAL","5500"));
        chats.add(new Chat("BLN0021","School FEES","60000"));
        chats.add(new Chat("BLN001","NORMAL","20000"));
        chats.add(new Chat("BLN0021","School FEES","10000"));
        chats.add(new Chat("BLN001","NORMAL","5500"));
        chats.add(new Chat("BLN0021","School FEES","60000"));
        chats.add(new Chat("BLN001","NORMAL","20000"));
        chats.add(new Chat("BLN0021","School FEES","10000"));
        chats.add(new Chat("BLN001","NORMAL","5500"));
        chats.add(new Chat("BLN0021","School FEES","60000"));
        chats.add(new Chat("BLN001","NORMAL","20000"));
        chats.add(new Chat("BLN0021","School FEES","10000"));
        chats.add(new Chat("BLN001","NORMAL","5500"));
        chats.add(new Chat("BLN0021","School FEES","60000"));
        chats.add(new Chat("BLN001","NORMAL","20000"));
        chats.add(new Chat("BLN0021","School FEES","10000"));
        chats.add(new Chat("BLN001","NORMAL","5500"));
        chats.add(new Chat("BLN0021","School FEES","60000"));
        chats.add(new Chat("BLN001","NORMAL","20000"));
        chats.add(new Chat("BLN0021","School FEES","10000"));
        chats.add(new Chat("BLN001","NORMAL","5500"));
        chats.add(new Chat("BLN0021","School FEES","60000"));
        chats.add(new Chat("BLN001","NORMAL","20000"));
        chats.add(new Chat("BLN0021","School FEES","10000"));
        chats.add(new Chat("BLN001","NORMAL","5500"));
        chats.add(new Chat("BLN0021","School FEES","60000"));
        chats.add(new Chat("BLN001","NORMAL","20000"));
        chats.add(new Chat("BLN0021","School FEES","10000"));
        chats.add(new Chat("BLN001","NORMAL","5500"));
        chats.add(new Chat("BLN0021","School FEES","60000"));
        chats.add(new Chat("BLN001","NORMAL","20000"));
        chats.add(new Chat("BLN0021","School FEES","10000"));
        chats.add(new Chat("BLN001","NORMAL","5500"));
        chats.add(new Chat("BLN0021","School FEES","60000"));
        chats.add(new Chat("BLN001","NORMAL","20000"));
        chats.add(new Chat("BLN0021","School FEES","10000"));
        chats.add(new Chat("BLN001","NORMAL","5500"));
        chats.add(new Chat("BLN0021","School FEES","60000"));
        chats.add(new Chat("BLN001","NORMAL","20000"));
        chats.add(new Chat("BLN0021","School FEES","10000"));
        chats.add(new Chat("BLN001","NORMAL","5500"));
        chats.add(new Chat("BLN0021","School FEES","60000"));
        chats.add(new Chat("BLN001","NORMAL","20000"));
        chats.add(new Chat("BLN0021","School FEES","10000"));
        chats.add(new Chat("BLN001","NORMAL","5500"));
        chats.add(new Chat("BLN0021","School FEES","60000"));
        chats.add(new Chat("BLN001","NORMAL","20000"));
        chats.add(new Chat("BLN0021","School FEES","10000"));
        chats.add(new Chat("BLN001","NORMAL","5500"));
        chats.add(new Chat("BLN0021","School FEES","60000"));
        chats.add(new Chat("BLN001","NORMAL","20000"));
        chats.add(new Chat("BLN0021","School FEES","10000"));
        chats.add(new Chat("BLN001","NORMAL","5500"));
        chats.add(new Chat("BLN0021","School FEES","60000"));





        return chats;
          }
}