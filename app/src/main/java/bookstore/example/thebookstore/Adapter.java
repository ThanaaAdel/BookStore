package bookstore.example.thebookstore;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    private LayoutInflater layoutInflater;
    private List<String> data;
    Adapter(Context context,List<String> data){
    this.layoutInflater = LayoutInflater.from(context);
    this.data = data;

}
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
    View view = layoutInflater.inflate(R.layout.custome,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int i) {
     String title = data.get(i);
     holder.textTitle.setText(title);

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
            TextView textTitle,textDescription;
        public ViewHolder(@NonNull View itemView) {

            super(itemView);
            textTitle = itemView.findViewById(R.id.textView1);
            textDescription = itemView.findViewById(R.id.textView2);

        }
    }
}
