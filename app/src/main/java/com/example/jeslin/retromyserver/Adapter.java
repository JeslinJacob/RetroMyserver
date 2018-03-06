package com.example.jeslin.retromyserver;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by JeSLiN on 17-11-2017.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.SubClass> {
     ArrayList<Student> Slist=new ArrayList<Student>();
    Context context;

    public Adapter(Context context, ArrayList<Student> Slist) {
        this.context = context;
        this.Slist =Slist;
    }


    @Override
    public Adapter.SubClass onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapterpage, parent, false);
        return new SubClass(view,context,Slist);
    }

    @Override
    public void onBindViewHolder(Adapter.SubClass holder, int position) {

        Student student = Slist.get(position);

        holder.nametext.setText(""+student.getSname());
        holder.marktext.setText(""+student.getSphone());

    }

    @Override
    public int getItemCount() {
        return Slist.size();
    }

    public class SubClass extends RecyclerView.ViewHolder{

        protected TextView nametext, marktext;
        ArrayList<Student> studentlist=new ArrayList<Student>();
        Context  ctx;
        public SubClass(View view , final Context ctx , final ArrayList<Student> studentlist) {
            super(view);
            this.studentlist=studentlist;
            this.ctx=ctx;
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int pos=getAdapterPosition();

                    Student student=studentlist.get(pos);
                    Intent intent=new Intent(view.getContext(),Main2Activity.class);
                    intent.putExtra("name",student.getSname());
                    intent.putExtra("ph",student.getSphone());
                    intent.putExtra("class",student.getClass_());
                    view.getContext().startActivity(intent);
                }
            });
            this.nametext = (TextView) view.findViewById(R.id.nametxt);
            this.marktext = (TextView) view.findViewById(R.id.marktxt);
//            this.tvNewsDate = (TextView) view.findViewById(R.id.date);
        }


    }
}
