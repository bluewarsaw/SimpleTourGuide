package pl.sebastianczarnecki.simpletourguide;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class EastAdapter extends ArrayAdapter<East> {

    private static final String LOG_TAG = EastAdapter.class.getSimpleName();

    public EastAdapter(Context context, ArrayList<East> east ){
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, east);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        // Get the Albums object located at this position in the list

        // Check if the existing view is being reused, otherwise inflate the view
        View gridItemViewEast = convertView;
        if(gridItemViewEast == null){
            gridItemViewEast = LayoutInflater.from(getContext()).inflate(R.layout.east_layout_details, parent, false);
        }


        East currentEast = getItem(position);

        TextView EastTitle = (TextView) gridItemViewEast.findViewById(R.id.east_title);
        // Get the name from the current Album object and set this text on the name TextView
        EastTitle.setText(currentEast.getEastTitle());


        ImageView imageView = (ImageView) gridItemViewEast.findViewById(R.id.east_image);
        imageView.setImageResource(currentEast.getEastImage());


        TextView EastDescription = (TextView) gridItemViewEast.findViewById(R.id.east_description);
        EastDescription.setText(currentEast.getEastDescription());

        return gridItemViewEast;

    }

}
