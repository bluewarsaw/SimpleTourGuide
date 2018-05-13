package pl.sebastianczarnecki.simpletourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import java.util.ArrayList;

public class MainListFragment extends Fragment{


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        ArrayList<East> tourguideEast = new ArrayList<East>();
        tourguideEast.add(new East("Ursynow", R.drawable.districts_ursynow1, "Built in 70s, Ursynow\\’s design was created with a keynote - “for serving people”. Individual parts of district were formed from small colonies of short and tall buildings, creating their internal courtyards with squares and greenery. Each building had to be a little different, because the diversity was meant be the distinguishing characteristic of every residential.\n" +
                "After the construction the lack of shops, pharmacies, clinics and communication was based on the assumption of the imminent launch of subway (for which the Varsovians had to wait till late 90’)). Residents praise the apartments mostly for their layout, but ask them about  driving a nail through a concrete slab and sit comfortable - prepare for an anger-management-therapy material..\n"));
        tourguideEast.add(new East("Blocks", R.drawable.districts_ursynow2, "Nowadays Ursynow aspires to be an intellectual block - every third inhabitant has an university degree. Well connected with the center of Warsaw, it is a frequent place to look for a flat. Rental or sales offers tend to disappear in a few days!"));
        tourguideEast.add(new East("Trees", R.drawable.districts_ursynow3, "Cwil’s Hill - artificially created hill during the construction of a housing estate. 18 meters high with 3 vertices. Named after one of the engineers working on the construction site. Beautiful skyline of Ursynow Polnocny and Sluzew included."));

        //set up adapter:
        EastAdapter eastAdapter = new EastAdapter(getActivity(),tourguideEast);

        View view = inflater.inflate(R.layout.east_layout, container, false);
        GridView gridView = (GridView) view.findViewById(R.id.east_gridview);

        gridView.setAdapter(eastAdapter);

        return view;
    }
}
