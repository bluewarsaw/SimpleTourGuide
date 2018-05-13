package pl.sebastianczarnecki.simpletourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import java.util.ArrayList;

public class NorthFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        ArrayList<East> tourguideEast = new ArrayList<East>();
        tourguideEast.add(new East("Rotunda", R.drawable.north_1_rotunda, "In the past times ironically called the \"generals hat\", today is  one of the favorite meeting places is located at the intersection of the two most important thoroughfares of the city - Jerozolimskie Avenue and Marszalkowska Street. The true pearl of modernism, decorated with a characteristic roof, slightly inclined towards north-east is a part of the Eastern Wall urban complex.\n" + "In 1979 took place the most tragic accident of post-war Poland. Gas explosion which took place there in 1979 is considered on of the most trafic accidents of post-war Poland. The explosion taking place during rush hours took lives of 49 people. Rotunda was rebuilt after the explosion, however the abandonment of the signature transparent glasses caused loosing a lot from its past charm. The current reconstruction of the modernism wonder brings hope for restoring the assumptions of the original project."));
        tourguideEast.add(new East("Rotunda", R.drawable.north_2_rotundaroz, "\\nCreated during 1960-1966 based on the design of Zbigniew Karpinski."));
        tourguideEast.add(new East("Stadion", R.drawable.north_20_stadion, "The stadium at Marymont is a pearl of structural modernism. Designed by the eminent Polish architect Stanislaw Barylski and built in the 1950s. Stadium creates a sense of intimacy with its gentle, harmonious details. Arched passages made of solid concrete serve as a beautiful complement to the entire facility. This theater was a host and witness of the famous sports stories  with Kazimierz Gorski beginning his coaching career and Zinedine Zidane playing one of his first matches in the French national team among others. Despite its poor condition, stadium is still alive with many minor sport clubs and associations. Recently social actions were risen aimed for restoring the stadium - without results for now."));

        //set up adapter:
        EastAdapter eastAdapter = new EastAdapter(getActivity(),tourguideEast);

        View view = inflater.inflate(R.layout.east_layout, container, false);
        GridView gridView = (GridView) view.findViewById(R.id.east_gridview);

        gridView.setAdapter(eastAdapter);

        return view;
    }

}
