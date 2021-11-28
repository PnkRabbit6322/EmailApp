package com.example.emailapp;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class ItemAdapter extends BaseAdapter {

    List<itemModel> items;

    public ItemAdapter(List<itemModel> items) {
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int i) {
        return items.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @SuppressLint({"InflateParams", "ViewHolder"})
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.custom_item_layout, null);

        TextView avatar = view.findViewById(R.id.avatar);
        TextView name = view.findViewById(R.id.name);
        TextView subject = view.findViewById(R.id.subject);
        TextView content = view.findViewById(R.id.content);
        TextView time = view.findViewById(R.id.time);

        itemModel item = items.get(i);
        avatar.setText(item.getFirstChar());
        name.setText(item.getName());
        subject.setText(item.getTitle());
        content.setText(item.getContent());
        time.setText(item.getTime());

        return view;
    }
}
