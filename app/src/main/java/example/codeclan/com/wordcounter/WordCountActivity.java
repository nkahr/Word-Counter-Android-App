package example.codeclan.com.wordcounter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by user on 17/01/2017.
 */

public class WordCountActivity extends AppCompatActivity {

    EditText sentenceText;
    Button countButton;

    Intent intent;
    String sentence;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(getClass().toString(), "called onCreate!");

        sentenceText = (EditText) findViewById(R.id.sentence_text);
        countButton = (Button) findViewById(R.id.count_button);


    }

    public void whenButtonPressed(View button) {
        sentence = sentenceText.getText().toString();
        Log.d(getClass().toString(), sentence);
        Log.d(getClass().toString(), "The sentence entered was '" + sentence + "'");

        intent = new Intent(WordCountActivity.this, ReturnsActivity.class);
        intent.putExtra("sentenceEntered", sentence);

        startActivity(intent);

    }
}
