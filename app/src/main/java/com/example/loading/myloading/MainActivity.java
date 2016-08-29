package com.example.loading.myloading;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
    private LoadingView loadingView;
    private Button mBtn;
    private  int height;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadingView = (LoadingView) findViewById(R.id.loadingview);
        mBtn = (Button) findViewById(R.id.but);
        Bitmap bitmap = BitmapFactory.decodeResource(this.getResources(), R.drawable.loading_0000);
        height = bitmap.getHeight();
        mBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (height>0) {
                    height--;
                    loadingView.updateView(height);
                }
            }

        });
    }

}
