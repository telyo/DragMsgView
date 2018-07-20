package com.telyo.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.telyo.dragmsgview.DragMsgView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rv;
    private List<String> date = new ArrayList<>();
    private DragMsgView mDragBall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDragBall = new DragMsgView(this);

        initRecycler();
    }

    private void initRecycler() {
        for (int i = 0; i < 33; i++) {
            date.add("item" + i);
        }
        rv = findViewById(R.id.rv);

        rv.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        rv.setAdapter(new RecyclerView.Adapter<MyHolder>() {

            @Override
            public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
                View itemView = LayoutInflater.from(MainActivity.this).inflate(R.layout.recycler, parent,
                        false);
                return new MyHolder(itemView);
            }


            @Override
            public void onBindViewHolder(MyHolder holder, int position) {
                TextView tv = holder.itemView.findViewById(R.id.tv);
                tv.setText(date.get(position));
                final TextView dmv = holder.itemView.findViewById(R.id.dmv);
                dmv.setText("99+");
                mDragBall.bingTargetView(dmv, "99+");

            }

            @Override
            public int getItemCount() {
                return date.size();
            }
        });
    }

    class MyHolder extends RecyclerView.ViewHolder {
        public MyHolder(View itemView) {
            super(itemView);
        }
    }
}
