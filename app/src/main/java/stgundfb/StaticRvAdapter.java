package stgundfb;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fhbtimetbale.R;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class StaticRvAdapter extends RecyclerView.Adapter<StaticRvAdapter.StaticRVViewHolder> {

    private ArrayList<StativRvModel> items;
    int row_index = -1;

    public StaticRvAdapter(ArrayList<StativRvModel> items) {
        this.items = items;
    }

    @NonNull
    @NotNull
    @Override
    public StaticRVViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.stativ_rv_item,parent,false);
        StaticRVViewHolder staticRVViewHolder = new StaticRVViewHolder(view);
        return staticRVViewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull StaticRVViewHolder holder, int position) {
        StativRvModel currentItem = items.get(position);
        holder.imageView.setImageResource(currentItem.getImage());
        holder.textView.setText(currentItem.getText());

        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                row_index = position;
                notifyDataSetChanged();


            }
        });

        if(row_index == position ){
            holder.linearLayout.setBackgroundResource(R.drawable.static_rv_selected_bg);
        }
        else{
            holder.linearLayout.setBackgroundResource(R.drawable.static_rv_bg);
        }

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public static class StaticRVViewHolder extends RecyclerView.ViewHolder{

        TextView textView;
        ImageView imageView;
        LinearLayout linearLayout;


        public StaticRVViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.image);
            textView = itemView.findViewById(R.id.text);
            linearLayout = itemView.findViewById(R.id.linearlayout);
        }
    }
}
