package com.example.test.fragments;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.example.test.R;
import com.example.test.adapters.CommonRecycleAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;


public class PostsFragment extends Fragment {

	@BindView(R.id.recyclerView) RecyclerView recyclerView;

	public static Fragment newInstance(Context context) {
		PostsFragment f = new PostsFragment();
		return f;
	}

	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		ViewGroup root = (ViewGroup) inflater.inflate(R.layout.content_main, null);
		setUpView(root);
		return root;
	}

	private void setUpView(ViewGroup root){
		ButterKnife.bind(this, root);
		setUPList();
	}

	private void setUPList(){
		recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
		CommonRecycleAdapter commonRecycleAdapteradapter = new CommonRecycleAdapter(createItemList());
		recyclerView.setAdapter(commonRecycleAdapteradapter);
	}

	private List<String> createItemList() {
		List<String> itemList = new ArrayList<>();
		for(int i=0;i<30;i++) {
			itemList.add("Item "+i);
		}
		return itemList;
	}

}
