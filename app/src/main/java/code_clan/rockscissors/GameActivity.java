package code_clan.rockscissors;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class GameActivity extends AppCompatActivity {

    Button buttonRock;
    Button buttonPaper;
    Button buttonScissors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);


        buttonRock = (Button)findViewById(R.id.button_rock);
        buttonPaper = (Button)findViewById(R.id.button_paper);
        buttonScissors = (Button)findViewById(R.id.button_scissors);
    }

    public void onButtonClicked(View Button){
        String scissors = "Scissors";
        scissors = buttonScissors.getText().toString();
        Log.d(getClass().toString(), "Button Scissors has clicked");

    }
}
