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

/* Fragment used as page 3 */
public class Page3Fragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_page3, container, false);
        String[] day3array = {
                "FIFA",
                "COD",
                "CSGO",
                "BATTLEFIELD"

        };
        ListView lv3 = (ListView)rootView.findViewById(R.id.day3list);
        ArrayAdapter<String> lvc = new ArrayAdapter<String>(
                getActivity(), android.R.layout.simple_list_item_1, day3array);

        lv3.setAdapter(lvc);


        lv3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), Fifa.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), COD.class);
                    startActivityForResult(myIntent, 1);
                }

                if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(), CSGO.class);
                    startActivityForResult(myIntent, 2);
                }
                if (position == 3) {
                    Intent myIntent = new Intent(view.getContext(), Battlefield.class);
                    startActivityForResult(myIntent, 3);
                }
            }

        });

        return rootView;
        }


    }