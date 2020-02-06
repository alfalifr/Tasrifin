package com.ainlab.tasrifin.ui.home;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.ainlab.tasrifin.R;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        /**
        final TextView textView = root.findViewById(R.id.text_home);
        homeViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
         **/
        //Image View Materi 1
        ImageView mimageView1=(ImageView) root.findViewById(R.id.imageView);
        Bitmap mbitmap1=((BitmapDrawable) getResources().getDrawable(R.drawable.materi1)).getBitmap();
        Bitmap imageRounded1=Bitmap.createBitmap(mbitmap1.getWidth(), mbitmap1.getHeight(), mbitmap1.getConfig());
        Canvas canvas=new Canvas(imageRounded1);
        Paint mpaint=new Paint();
        mpaint.setAntiAlias(true);
        mpaint.setShader(new BitmapShader(mbitmap1, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP));
        canvas.drawRoundRect((new RectF(0, 0, mbitmap1.getWidth(), mbitmap1.getHeight())), 100, 100, mpaint); // Round Image Corner 100 100 100 100
        mimageView1.setImageBitmap(imageRounded1);

        //Image View Materi 2
        ImageView mimageView2=(ImageView) root.findViewById(R.id.imageView1);
        Bitmap mbitmap2=((BitmapDrawable) getResources().getDrawable(R.drawable.materi2)).getBitmap();
        Bitmap imageRounded2=Bitmap.createBitmap(mbitmap2.getWidth(), mbitmap2.getHeight(), mbitmap2.getConfig());
        Canvas canvas1=new Canvas(imageRounded2);
        Paint mpaint1=new Paint();
        mpaint1.setAntiAlias(true);
        mpaint1.setShader(new BitmapShader(mbitmap2, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP));
        canvas1.drawRoundRect((new RectF(0, 0, mbitmap2.getWidth(), mbitmap2.getHeight())), 100, 100, mpaint1); // Round Image Corner 100 100 100 100
        mimageView2.setImageBitmap(imageRounded2);

        //Image View Materi 3
        ImageView mimageView3=(ImageView) root.findViewById(R.id.imageView2);
        Bitmap mbitmap3=((BitmapDrawable) getResources().getDrawable(R.drawable.materi3)).getBitmap();
        Bitmap imageRounded3=Bitmap.createBitmap(mbitmap3.getWidth(), mbitmap3.getHeight(), mbitmap3.getConfig());
        Canvas canvas2=new Canvas(imageRounded3);
        Paint mpaint2=new Paint();
        mpaint2.setAntiAlias(true);
        mpaint2.setShader(new BitmapShader(mbitmap3, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP));
        canvas2.drawRoundRect((new RectF(0, 0, mbitmap3.getWidth(), mbitmap3.getHeight())), 100, 100, mpaint2); // Round Image Corner 100 100 100 100
        mimageView3.setImageBitmap(imageRounded3);

        //Image View Materi 4
        ImageView mimageView4=(ImageView) root.findViewById(R.id.imageView3);
        Bitmap mbitmap4=((BitmapDrawable) getResources().getDrawable(R.drawable.materi4)).getBitmap();
        Bitmap imageRounded4=Bitmap.createBitmap(mbitmap4.getWidth(), mbitmap4.getHeight(), mbitmap4.getConfig());
        Canvas canvas3=new Canvas(imageRounded4);
        Paint mpaint3=new Paint();
        mpaint3.setAntiAlias(true);
        mpaint3.setShader(new BitmapShader(mbitmap4, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP));
        canvas3.drawRoundRect((new RectF(0, 0, mbitmap4.getWidth(), mbitmap4.getHeight())), 100, 100, mpaint3); // Round Image Corner 100 100 100 100
        mimageView4.setImageBitmap(imageRounded4);

        //Image View Kitab 1
        ImageView mimageView5=(ImageView) root.findViewById(R.id.imageView4);
        Bitmap mbitmap5=((BitmapDrawable) getResources().getDrawable(R.drawable.kitab4)).getBitmap();
        Bitmap imageRounded5=Bitmap.createBitmap(mbitmap5.getWidth(), mbitmap5.getHeight(), mbitmap5.getConfig());
        Canvas canvas4=new Canvas(imageRounded5);
        Paint mpaint4=new Paint();
        mpaint4.setAntiAlias(true);
        mpaint4.setShader(new BitmapShader(mbitmap5, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP));
        canvas4.drawRoundRect((new RectF(0, 0, mbitmap5.getWidth(), mbitmap5.getHeight())), 100, 100, mpaint4); // Round Image Corner 100 100 100 100
        mimageView5.setImageBitmap(imageRounded5);

        //Image View Kitab 2
        ImageView mimageView6=(ImageView) root.findViewById(R.id.imageView5);
        Bitmap mbitmap6=((BitmapDrawable) getResources().getDrawable(R.drawable.kitab2)).getBitmap();
        Bitmap imageRounded6=Bitmap.createBitmap(mbitmap6.getWidth(), mbitmap6.getHeight(), mbitmap6.getConfig());
        Canvas canvas5=new Canvas(imageRounded6);
        Paint mpaint5=new Paint();
        mpaint5.setAntiAlias(true);
        mpaint5.setShader(new BitmapShader(mbitmap6, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP));
        canvas5.drawRoundRect((new RectF(0, 0, mbitmap6.getWidth(), mbitmap6.getHeight())), 100, 100, mpaint5); // Round Image Corner 100 100 100 100
        mimageView6.setImageBitmap(imageRounded6);

        //Image View Kitab 3
        ImageView mimageView7=(ImageView) root.findViewById(R.id.imageView6);
        Bitmap mbitmap7=((BitmapDrawable) getResources().getDrawable(R.drawable.kitab3)).getBitmap();
        Bitmap imageRounded7=Bitmap.createBitmap(mbitmap7.getWidth(), mbitmap7.getHeight(), mbitmap7.getConfig());
        Canvas canvas6=new Canvas(imageRounded7);
        Paint mpaint6=new Paint();
        mpaint6.setAntiAlias(true);
        mpaint6.setShader(new BitmapShader(mbitmap7, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP));
        canvas6.drawRoundRect((new RectF(0, 0, mbitmap7.getWidth(), mbitmap7.getHeight())), 100, 100, mpaint6); // Round Image Corner 100 100 100 100
        mimageView7.setImageBitmap(imageRounded7);

        //Image View Kitab 4
        ImageView mimageView8=(ImageView) root.findViewById(R.id.imageView7);
        Bitmap mbitmap8=((BitmapDrawable) getResources().getDrawable(R.drawable.kitab1)).getBitmap();
        Bitmap imageRounded8=Bitmap.createBitmap(mbitmap8.getWidth(), mbitmap8.getHeight(), mbitmap8.getConfig());
        Canvas canvas7=new Canvas(imageRounded8);
        Paint mpaint7=new Paint();
        mpaint7.setAntiAlias(true);
        mpaint7.setShader(new BitmapShader(mbitmap8, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP));
        canvas7.drawRoundRect((new RectF(0, 0, mbitmap8.getWidth(), mbitmap8.getHeight())), 100, 100, mpaint7); // Round Image Corner 100 100 100 100
        mimageView8.setImageBitmap(imageRounded8);


        return root;
    }
}