package cubex.mahesh.recyclerview_cardviewtest;

import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.io.File;

public class MyAdapter extends
        RecyclerView.Adapter<MyHolder>{

    String path = "/storage/sdcard0/WhatsApp/Media/WhatsApp Images/";
    File f = new File(path);
    File[ ] files = f.listFiles( );
    MainActivity mActivity;

    MyAdapter(MainActivity mActivity )
    {
            this.mActivity = mActivity;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent,
                                       int viewType) {

        LayoutInflater inflater = LayoutInflater.from(mActivity);

        View v = inflater.inflate(R.layout.indiview,
                        parent,false);

        return new MyHolder(v);
    }
    @Override
    public void onBindViewHolder(@NonNull MyHolder holder,
                                 final int position) {

            holder.iview.setImageURI(Uri.fromFile(files[position]));
            holder.tv1.setText(files[position].getName());
            holder.tv2.setText(String.valueOf(files[position].length()));
            holder.del_view.setOnClickListener(
                                                new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    files[position].delete();
                    files = f.listFiles( );
                    MyAdapter.this.notifyDataSetChanged();
                }
            });

    }
    @Override
    public int getItemCount() {
        return files.length;
    }
}
