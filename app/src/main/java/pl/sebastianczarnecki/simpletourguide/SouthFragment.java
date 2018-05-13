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
        tourguideEast.add(new East("Crossroads", R.drawable.south_3_placnarozdrozu, "It is a \"crossroads square\" and not without reason. A multi-level interchange node located next to the Chancellery of the Prime Minister, Lazienki Park and many embassies. When you take a look around, you can not spot  any closure of the square. Only on one side we have the opportunity to see modernist, concave blocks. They appear to open some kind of a gate to the North Middletown. It is worth taking a rest near a lonely fountain in the middle of the roundabout itself. Use underground passages - they are decorated with tiles from the 60s and filled with a small art galleries."));
        tourguideEast.add(new East("National Library", R.drawable.south_4_bibliotekanarodowa, "The written history of National Library building could accommodate a small library by itself. The winning project was announced in 1963, although the construction was completed over thirteen years later. In recent years it was heavily involved in numerous renovations and digitization of its resources.\n" +
                "Library does not interfere with the green and recreational space of Pole Mokotowskie and discretely fits int from the Wawelska avenue on the north. Come in and read a good book. Or a bad book. Don’t let other people tell you what to do. Registration costs only 20 PLN"));
        tourguideEast.add(new East("X", R.drawable.south_6_x, "The blocks built in 1971-1973 are a great example of how to delineate thought-out lines of perspectives using balconies. The characteristic curvature of the buildings laid out on the X pattern generates a lot of curvatures of falling chiaroscuro.\n" + "Project: Jan Zdanowicz"));

        //set up adapter:
        EastAdapter eastAdapter = new EastAdapter(getActivity(),tourguideEast);

        View view = inflater.inflate(R.layout.east_layout, container, false);
        GridView gridView = (GridView) view.findViewById(R.id.east_gridview);

        gridView.setAdapter(eastAdapter);

        return view;
    }
}
