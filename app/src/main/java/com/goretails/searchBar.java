package com.goretails;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class searchBar extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        WebView webView = view.findViewById(R.id.webview);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
//        Bundle bundle = getArguments();
//        String query = bundle.getString("query");
        String query = SharedPrefManager.getInstance(getActivity()).getQuery();
        webView.loadUrl("http://goretails.in/product/"+query+"/");
//        @override fun onActivityCreated(savedInstanceState: Bundle?) {
//            super.onActivityCreated(savedInstanceState)
//
//
//            viewModel.getSearchResults().observe(this, { searchResults->
//                    Log.w("onActivityCreated()", "new search list received :" +searchResults)
//                    mAdapter.updateList(searchResults)
//                    listItemsAdapter.notifyDataSetChanged()
//            });
//
//        }
        return view;
    }
}
