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

public class ReturnsActivity extends AppCompatActivity{

    TextView rText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_returns);
        rText = (TextView)findViewById(R.id.returns_text); // <-- added line
        Log.d(getClass().toString(), "called onCreate!");


        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        String sentence = extras.getString("sentenceEntered");

        WordCounter wordCounter = new WordCounter(sentence);
        int numberOfWords = wordCounter.getNumberOfWords();
        String numberOfWordsString;
        if (numberOfWords == 1) {
            numberOfWordsString = "You entered one word";
        } else {
            numberOfWordsString = "You entered " + numberOfWords + " words";
        }

        Log.d(getClass().toString(), numberOfWordsString);

        rText.setText(numberOfWordsString);

    }


}
