package cubex.mahesh.recyclerview_cardviewtest;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MyHolder extends
                    RecyclerView.ViewHolder{
    ImageView iview, del_view;
    TextView tv1,tv2;
    public MyHolder(View itemView) {
        super(itemView);
        iview = itemView.findViewById(R.id.iv1);
        del_view = itemView.findViewById(R.id.del);
        tv1 = itemView.findViewById(R.id.tv1);
        tv2 = itemView.findViewById(R.id.tv2);
    }
}
