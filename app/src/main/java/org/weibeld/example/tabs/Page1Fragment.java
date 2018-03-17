package org.weibeld.example.tabs;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.content.Intent;
import android.widget.ArrayAdapter;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.ViewGroup;
import android.widget.ListView;
import android.view.View.OnClickListener;
import android.widget.Toast;


import org.weibeld.example.R;

/* Fragment used as page 1 */
public class Page1Fragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_page1, container, false);
        String[] day1array = {
          "Debate",
           "Music",
            "Busketball",
             "Cricket"

        };
        ListView lv1 = (ListView)rootView.findViewById(R.id.day1list);
        ArrayAdapter<String> lva = new ArrayAdapter<String>(
                getActivity(), android.R.layout.simple_list_item_1, day1array);
        lv1.setAdapter(lva);

        return rootView;
    }
}
