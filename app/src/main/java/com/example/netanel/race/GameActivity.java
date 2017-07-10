package com.example.netanel.race;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gameplay);

        //Trying to initialize
        GameEngine gameEngine = new GameEngine(2);

        //end of trying

        ImageView imageView = (ImageView) findViewById(R.id.firstCard);
        imageView.setImageResource(R.drawable.twenty_five);
        imageView = (ImageView) findViewById(R.id.secondCard);
        imageView.setImageResource(R.drawable.twenty_five);
        imageView = (ImageView) findViewById(R.id.thirdCard);
        imageView.setImageResource(R.drawable.twenty_five);
        imageView = (ImageView) findViewById(R.id.fourthCard);
        imageView.setImageResource(R.drawable.twenty_five);
        imageView = (ImageView) findViewById(R.id.fifthCard);
        imageView.setImageResource(R.drawable.twenty_five);
        imageView = (ImageView) findViewById(R.id.sixthCard);
        imageView.setImageResource(R.drawable.twenty_five);

        Card firstCard = new Card(Card.TWENTY_FIVE, 0);

        final ImageView firstCardImageView = (ImageView) findViewById(R.id.firstCard);
        firstCardImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textView = (TextView) findViewById(R.id.distance);
                String text = String.valueOf(textView.getText());
                String[] parts = text.split("\\s");
                textView.setText(String.valueOf(Integer.decode(parts[0]) + 25) + " " + parts[1]);

                ImageView stack = (ImageView) findViewById(R.id.speedStack);
                stack.setImageResource(R.drawable.twenty_five);

            }
        });

    }

    public void getUpdate(int viewId, int operation) {


    }
}
