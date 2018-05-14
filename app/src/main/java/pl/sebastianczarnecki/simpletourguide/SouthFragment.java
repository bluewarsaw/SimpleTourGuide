package pl.sebastianczarnecki.simpletourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import java.util.ArrayList;

public class SouthFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        ArrayList<East> tourguideEast = new ArrayList<East>();
        tourguideEast.add(new East(getString(R.string.south_title_1), R.drawable.south_3_placnarozdrozu, getString(R.string.south_1)));
        tourguideEast.add(new East(getString(R.string.south_title_2), R.drawable.south_4_bibliotekanarodowa, getString(R.string.south_2) ));
        tourguideEast.add(new East(getString(R.string.south_title_3), R.drawable.south_6_x, getString(R.string.south_3)));

        //set up adapter:
        EastAdapter eastAdapter = new EastAdapter(getActivity(),tourguideEast);

        View view = inflater.inflate(R.layout.east_layout, container, false);
        GridView gridView = (GridView) view.findViewById(R.id.east_gridview);

        gridView.setAdapter(eastAdapter);

        return view;
    }
}
