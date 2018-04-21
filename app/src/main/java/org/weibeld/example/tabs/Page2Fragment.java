package org.weibeld.example.tabs;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import org.weibeld.example.R;

/* Fragment used as page 2 */
public class Page2Fragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_page2, container, false);
        String[] day2array = {
                "CODE IN EMOJI",
                "DARWIN GAMES",
                "FIRST SEARCHING",
                "CAPTURE THE FLAG"

        };
        ListView lv2 = (ListView)rootView.findViewById(R.id.day2list);
        ArrayAdapter<String> lvb = new ArrayAdapter<String>(
                getActivity(), android.R.layout.simple_list_item_1, day2array);
        lv2.setAdapter(lvb);

        lv2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), CodeInEmoji.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), DarwinGames.class);
                    startActivityForResult(myIntent, 1);
                }

                if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(), FirstSearching.class);
                    startActivityForResult(myIntent, 2);
                }
                if (position == 3) {
                    Intent myIntent = new Intent(view.getContext(), CaptureTheFlag.class);
                    startActivityForResult(myIntent, 3);
                }

            }
        });
        return rootView;
    }

}
