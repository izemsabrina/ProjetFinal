package fr.doranco.projetfinal.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import fr.doranco.projetfinal.R;
import fr.doranco.projetfinal.databinding.FragmentPaysListBinding;


public class PaysListFragment extends Fragment {

    private FragmentPaysListBinding binding;

    public PaysListFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentPaysListBinding.inflate(inflater,container,false);
        return binding.getRoot();
    }
}