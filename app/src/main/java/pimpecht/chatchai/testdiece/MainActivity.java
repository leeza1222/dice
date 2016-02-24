package pimpecht.chatchai.testdiece;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private  Button BackButton, RandomButton, DiceButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindWidget();
        BackController();
        RandomController();
        DiceController();


    } //bindWidget

    private void DiceController() {
        DiceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    private void RandomController() {
        RandomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    private void BackController() {
        BackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    private void bindWidget() {
        imageView = (ImageView) findViewById(R.id.imageView);
        BackButton = (Button) findViewById(R.id.BackButton);
        RandomButton = (Button) findViewById(R.id.RandomButton);
        DiceButton = (Button) findViewById(R.id.DiceButton);

    }


}
