package pimpecht.chatchai.testdiece;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView image1;
    private  Button BackButton, RandomButton, DiceButton;
    private int intdic = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image1 = (ImageView) findViewById(R.id.imageView);

        bindWidget();
        BackController();
        RandomController();
        DiceController();
        changeplay();


    } //bindWidget

    private void changeplay() {


        switch (intdic) {
            case 1:
                image1.setImageResource(R.drawable.dice1);
                break;
            case 2:
                image1.setImageResource(R.drawable.dice2);
                break;
            case 3:
                image1.setImageResource(R.drawable.dice3);
                break;
            case 4:
                image1.setImageResource(R.drawable.dice4);
                break;
            case 5:
                image1.setImageResource(R.drawable.dice5);
                break;
            case 6:
                image1.setImageResource(R.drawable.dice6);
                break;
        }
    }


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

                myRandomPicture(1);
                intdic -= 1;
                if (intdic == 0) {
                    intdic = 6;
                }
                changeplay();



            }
        });
    }

    private void myRandomPicture(int i) {

    }

    private void bindWidget() {
        image1 = (ImageView) findViewById(R.id.imageView);
        BackButton = (Button) findViewById(R.id.BackButton);
        RandomButton = (Button) findViewById(R.id.RandomButton);
        DiceButton = (Button) findViewById(R.id.DiceButton);

    }


}
