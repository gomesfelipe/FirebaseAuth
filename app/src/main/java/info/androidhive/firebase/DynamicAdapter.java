package info.androidhive.firebase;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;
import org.askerov.dynamicgrid.DynamicGridUtils;


public class DynamicAdapter {
    public DynamicAdapter(Context context, List items, int columnCount) {
        super(context, items, columnCount);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            Context context = this;
            LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);,
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_grid, null);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.build(getContext());
        holder.build(getItem(position).toString());
        return convertView;
    }

    private class ViewHolder {
        private TextView titleText;
        private ImageView image;

        private ViewHolder(View view) {
            titleText = (TextView) view.findViewById(R.id.item_title);
            image = (ImageView) view.findViewById(R.id.item_img);
        }

        void build(String title) {
            titleText.setText(title);
            if (title == " ") {
               // image.setImageResource(R.drawable.ic_launcher);
            }
            else{
              //  image.setImageResource(R.drawable.ic_client);}
        }
    }
}}
