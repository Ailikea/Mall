package com.example.tesk.ui.personal;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.example.tesk.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * 用户中心
 */
public class PersonalFragment extends Fragment {

    private PersonalViewModel mViewModel;

    public static PersonalFragment newInstance() {
        return new PersonalFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.personal_fragment, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(PersonalViewModel.class);
        // TODO: Use the ViewModel
    }

    @OnClick({R.id.ll_opinion,R.id.ll_address})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.ll_opinion:
                NavController navController = Navigation.findNavController(getActivity(), R.id.nav_host_fragment);
                navController.navigate(R.id.action_navigation_personal_to_feedbackFragment);
                break;
            case R.id.ll_address:
                NavController navController2 = Navigation.findNavController(getActivity(), R.id.nav_host_fragment);
                navController2.navigate(R.id.action_navigation_personal_to_addressDetailFragment);
                break;
        }
    }
}