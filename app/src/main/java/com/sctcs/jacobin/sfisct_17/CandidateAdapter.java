package com.sctcs.jacobin.sfisct_17;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;


public class CandidateAdapter extends PagerAdapter {

      private ArrayList<Candidates> candidates;
      private Context context;
    private LayoutInflater inflater;





    public CandidateAdapter(Context mcontext)
    {    candidates=Candidates.return_candidates();
        context=mcontext;
        inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }


    @Override
    public int getCount() {
        return candidates.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {

        return (view==(CardView)object);
    }

    @Override
    public Object instantiateItem(final ViewGroup container, int position) {


              if(position==0)
              {
                  View itemview =inflater.inflate(R.layout.frontscreen,container,false);
                  ImageView imageView=itemview.findViewById(R.id.first_image);
                  Picasso.with(context).load(R.drawable.front).fit().into(imageView);
                  ImageView gif=(ImageView)itemview.findViewById(R.id.down) ;
                  Picasso.with(context).load(R.drawable.down).fit().into(gif);



                  container.addView(itemview);
                  return  itemview;
              }


              else if (position==1){

                  View itemview =inflater.inflate(R.layout.secondscreen,container,false);
                  ImageView imageView=itemview.findViewById(R.id.second);
                  Picasso.with(context).load(R.drawable.wall).fit().into(imageView);
                  container.addView(itemview);
                  return  itemview;
              }
              else if (position==24){

                  View itemview =inflater.inflate(R.layout.secondscreen,container,false);
                  ImageView imageView=itemview.findViewById(R.id.second);
                  Picasso.with(context).load(R.drawable.wallb).fit().into(imageView);
                  container.addView(itemview);
                  return  itemview;
              }

              else {

                  View itemview = inflater.inflate(R.layout.activity_card_view, container, false);
                  final ImageView imageView = itemview.findViewById(R.id.candidate_image);
                  TextView name_view = itemview.findViewById(R.id.candidate_name);
                  TextView design_view = itemview.findViewById(R.id.designation);
                  ImageView icon_view=itemview.findViewById(R.id.sfilogo);

                 final ProgressBar bar=(ProgressBar) itemview.findViewById(R.id.progressBar) ;


                  final Candidates candidates1 = candidates.get((position-2));

                  Picasso.with(context).load(candidates1.getImage_url()).fit().into(imageView, new Callback() {
                      @Override
                      public void onSuccess() {
                        bar.setVisibility(View.INVISIBLE);
                      }

                      @Override
                      public void onError() {
                          bar.setVisibility(View.INVISIBLE);
                          Picasso.with(context).load(R.drawable.no).fit().into(imageView);
                          Toast.makeText(context,"Please enable an Internet Connection",Toast.LENGTH_SHORT).show();
                      }
                  });
                  name_view.setText(candidates1.getName());
                  design_view.setText(candidates1.getDesignation());

                  container.addView(itemview);

                  return itemview;
              }

    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((CardView)object);
    }
}
