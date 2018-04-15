package org.weibeld.example.tabs;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import org.weibeld.example.R;

/* Fragment used as page 3 */
public class Page3Fragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_page3, container, false);
        String[] day3array = {
                "Hello"

        };
        ListView lv3 = (ListView)rootView.findViewById(R.id.day3list);
        ArrayAdapter<String> lvc = new ArrayAdapter<String>(
                getActivity(), android.R.layout.simple_list_item_1, day3array);
        lv3.setAdapter(lvc);
        return rootView;
    }
}
