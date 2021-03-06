package org.androidtown.samplepayco;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by SJSJ on 2016-07-28.
 */
public class TextViewHolder extends RecyclerView.ViewHolder{
    TextView textView;

    public TextViewHolder(View itemView) {
        super(itemView);
        textView = (TextView)itemView.findViewById(R.id.cv_text_message);
    }

    public void setText(String text) {
        textView.setText(text);
    }
}
