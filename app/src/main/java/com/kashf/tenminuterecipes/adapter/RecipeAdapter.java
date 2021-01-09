package com.kashf.tenminuterecipes.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;

import com.kashf.tenminuterecipes.R;
import com.kashf.tenminuterecipes.activity.detailpage;
import com.kashf.tenminuterecipes.model.constant;

import java.util.List;

public class RecipeAdapter extends BaseAdapter {
    Context context;
    List<constant>constantList;

    public RecipeAdapter(Context context, List<constant> constantList) {
        this.context = context;
        this.constantList = constantList;
    }

    @Override
    public int getCount() {
        return constantList.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View views, ViewGroup viewgroup) {
    views= LayoutInflater.from(context).inflate(R.layout.listitem,viewgroup,false);
        ImageView imageView=(ImageView)views.findViewById(R.id.recipethumbnail);
        TextView textView=(TextView)views.findViewById(R.id.recipe_title);
        CardView cardView=(CardView)views.findViewById(R.id.cardview);

        final String title=constantList.get(position).getTitle();
        final String ejza=constantList.get(position).getEjza();
        final String tarqeeb=constantList.get(position).getTarqeeb();
        final int img=constantList.get(position).getImage();


        imageView.setImageResource(img);
        textView.setText(title);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, detailpage.class);
                intent.putExtra("image",img);
                intent.putExtra("title",title);
                intent.putExtra("ejza",ejza);
                intent.putExtra("tarqeeb",tarqeeb);
                  context.startActivity(intent);
            }
        });



        return views;
    }
}
