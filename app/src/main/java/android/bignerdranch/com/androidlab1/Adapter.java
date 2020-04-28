package android.bignerdranch.com.androidlab1;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Random;


public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    protected int counter = 0;
    protected int numberItems;
    private static int viewHolderCount;

    public Adapter(int numberItems)
    {
        this.numberItems = numberItems;
        viewHolderCount = 0;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        int LayoutIdForAdapterItem = R.layout.adapter_item;
        LayoutInflater inflater = LayoutInflater.from(context);

        View view = inflater.inflate(LayoutIdForAdapterItem, parent, false);

        ViewHolder viewHolder = new ViewHolder(view);
        //viewHolder.text.setText(String.valueOf(counter));
        viewHolder.text.setText(ConverterToWords.convert(counter));
        Random rnd = new Random();
        viewHolder.text.setTextColor(Color.rgb(rnd.nextInt(256), rnd.nextInt(256),
                rnd.nextInt(256)));

        counter++;
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bind(position + 1);
        if(position % 2 == 0)
        {
            holder.mContainer.setBackgroundColor(Color.parseColor("#CCCCCC"));
        }
    }

    @Override
    public int getItemCount() {
        return numberItems;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView text;
        public LinearLayout mContainer;
        ImageView image;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            text = itemView.findViewById(R.id.recycler_text);
            image = itemView.findViewById(R.id.recycler_image);
            mContainer = itemView.findViewById(R.id.item_layout);
        }

        public void bind(int number)
        {
            text.setText(ConverterToWords.convert(number));
        }
    }



}
