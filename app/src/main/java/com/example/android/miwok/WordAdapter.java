package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

class WordAdapter extends ArrayAdapter<Word> {

    private int mResourcecolorId;
    public WordAdapter(Activity context,  List<Word> objects,int ResourcecolorId) {
        super(context, 0, objects);
        mResourcecolorId = ResourcecolorId;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.listitem, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Word currentWOrd = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwokTranslation);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView



        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.defaultTransaltion);

        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        miwokTextView.setText(currentWOrd.getMeoq_word());
        defaultTextView.setText(currentWOrd.getEnglish_Word());
        boolean x = currentWOrd.isImage();
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.image_view);
        if (x == true) {

            // Find the ImageView in the list_item.xml layout with the ID list_item_icon

            // Get the image resource ID from the current AndroidFlavor object and
            // set the image to iconView
            iconView.setImageResource(currentWOrd.getmImageResourceId());

        }

        else{
            iconView.setVisibility(View.GONE);
        }
        View textContainer =listItemView.findViewById(R.id.Listi);

        textContainer.setBackgroundColor(mResourcecolorId);
        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
