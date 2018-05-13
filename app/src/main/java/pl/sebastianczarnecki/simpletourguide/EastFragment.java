package pl.sebastianczarnecki.simpletourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import java.util.ArrayList;

public class EastFragment extends Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        ArrayList<East> tourguideEast = new ArrayList<East>();
        tourguideEast.add(new East("Daschund", R.drawable.east_2_jamnik, "The numbers are impressive: 508 meters long, 43 staircases, 1200 inhabitants, 10 flats per each staircase and two flats per one floor. In the back, 132 almost-underground garages. In the collective consciousness of Varsovians it is not only the longest block in the capital, but probably in the whole world - and visually it certainly is. Close neighbour f of  the East Warsaw Railway Station, welcomes travelers with its monumentality. Why is this monolith standing here? For purely practical reasons as Jaroslaw Trybus, deputy director of the Warsaw Museum said: \"The building was built to cover the view of the old, crumbling buildings on Szmulki. It was meant to serve as a big screen covering what was uncomfortable "));
        tourguideEast.add(new East("Grochow", R.drawable.east_5_przyczolek, ">The longest facility in Warsaw with a hard to comprehend number of 2,330 flats with 5,000 habitants. The complex  consisting of interconnected 23 blocks  covering the area of 11 hectares with total length of 1.5 km was designed by Zofia and Oskar Hansen and founded in 1970. Staircases, corridors and galleries were supposed to give the impression of “space penetrating the buildings”. That is probably the case, especially for someone who gets lost in this maze of walls."));
        tourguideEast.add(new East("Kinowa", R.drawable.east_6_kinowa, "Asymmetrical, square balconies create a dynamic pattern with penetrating forms of chiaroscuro falling from each side. Designed by Bohdan Lewandowski and Maciej Szawerenowski, realized 1960-66."));

        //set up adapter:
        EastAdapter eastAdapter = new EastAdapter(getActivity(),tourguideEast);

        View view = inflater.inflate(R.layout.east_layout, container, false);
        GridView gridView = (GridView) view.findViewById(R.id.east_gridview);

        gridView.setAdapter(eastAdapter);

        return view;
    }
}
