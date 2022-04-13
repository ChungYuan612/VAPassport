package work.sivs.vapassportpart1.other;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import work.sivs.vapassportpart1.R;

public class other_QRScan_Adapter extends RecyclerView.Adapter<QRScan_ViewHolder> {

    /**
     * <h2>實作列表的一格的 {@link R.layout#qrscan_recyclerview_item layout>qrscan_recyclerview_item}</h2>
     */
    @NonNull
    @Override
    public QRScan_ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        QRScan_ViewHolder viewHolder = new QRScan_ViewHolder(
                LayoutInflater.from(parent.getContext()).inflate(R.layout.qrscan_recyclerview_item,parent,false)
        );
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull QRScan_ViewHolder holder, int position) {
        /* CODE */
    }

    @Override
    public int getItemCount() {
        return 0;
    }
}

class QRScan_ViewHolder extends RecyclerView.ViewHolder{
    View itemView;
    public QRScan_ViewHolder(@NonNull View itemView) {
        super(itemView);
        this.itemView = itemView;
    }
}
