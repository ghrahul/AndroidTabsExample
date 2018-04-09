package org.weibeld.example.tabs;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import org.weibeld.example.R;

/* Fragment used as page 2 */
public class Page2Fragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_page2, container, false);
        String[] day2array = {
                "Debate",
                "Music",
                "Busketball",
                "Cricket",
                "Football",
                "Badminton"

        };
        ListView lv2 = (ListView)rootView.findViewById(R.id.day2list);
        ArrayAdapter<String> lvb = new ArrayAdapter<String>(
                getActivity(), android.R.layout.simple_list_item_1, day2array);
        lv2.setAdapter(lvb);


        return rootView;
    }

}
