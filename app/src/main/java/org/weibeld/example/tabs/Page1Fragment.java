package org.weibeld.example.tabs;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.content.Intent;
import android.widget.ArrayAdapter;
import android.widget.AdapterView;
import android.view.ViewGroup;
import android.widget.ListView;


import org.weibeld.example.R;

/* Fragment used as page 1 */
public class Page1Fragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_page1, container, false);
        String[] day1array = {
                "CODEJAM",
                "HACKATHON",
                "ROBOWAR",
                "BUG HUNTER",


        };
        ListView lv1 = (ListView)rootView.findViewById(R.id.day1list);
        ArrayAdapter<String> lva = new ArrayAdapter<String>(
                getActivity(), android.R.layout.simple_list_item_1, day1array);
        lv1.setAdapter(lva);


        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), Codejam.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), Hackathon.class);
                    startActivityForResult(myIntent, 1);
                }

                if(position == 2){
                    Intent myIntent = new Intent(view.getContext(),Robowar.class);
                    startActivityForResult(myIntent,2);
                }
                if(position == 3){
                    Intent myIntent = new Intent(view.getContext(),BugHunter.class);
                    startActivityForResult(myIntent,2);
                }




            }
        });


        return rootView;


    }


}
