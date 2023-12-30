package com.example.listview;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;
public class CustomAdapter extends ArrayAdapter<Contact> {
    private Context context;
    private int resource;
    private List<Contact> objects;
    private LayoutInflater inflater;
    public CustomAdapter( Context context, int resource, List<Contact> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.objects = objects;
        inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = new ViewHolder();
        if(convertView == null) // neu view chua co
        {
            convertView = inflater.inflate(R.layout.item_listview, null);
            holder.tvAvartar = (TextView)convertView.findViewById(R.id.tvAvatar);
            holder.tvName = (TextView)convertView.findViewById(R.id.tvName);
            holder.tvPhone = (TextView)convertView.findViewById(R.id.tvPhone);
            convertView.setTag(holder);
        }
        else {
            holder = (ViewHolder)convertView.getTag();
        }
        Contact contact = objects.get(position);
        holder.tvAvartar.setText(String.valueOf(position)); //lay ve text avatar
        holder.tvAvartar.setBackgroundColor(Color.GREEN);
        holder.tvName.setText(contact.getName());
        holder.tvPhone.setText(contact.getPhone());
        return convertView;
    }

    public class ViewHolder {
        TextView tvAvartar, tvName, tvPhone;
    }
}
