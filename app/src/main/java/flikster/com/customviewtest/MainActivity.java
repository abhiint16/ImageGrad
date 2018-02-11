package flikster.com.customviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import flikster.com.imagegrad.ImageGrad;

public class MainActivity extends AppCompatActivity {

    ImageGrad imageGrad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageGrad=(ImageGrad)findViewById(R.id.testimage);

        imageGrad.setUrlImage("https://img1.etsystatic.com/002/0/6449624/il_fullxfull.382134677_so6e.jpg",R.drawable.introscreentwo,
                R.drawable.introscreentwo, ImageView.ScaleType.CENTER_CROP);
//        gradient.setDrawableImage(R.drawable.me,R.drawable.weather,R.drawable.weather,
//                ImageView.ScaleType.CENTER_CROP);
    }
}
