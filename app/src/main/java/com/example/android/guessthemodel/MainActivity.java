package com.example.android.guessthemodel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    //Variable to record the score of the user
    int score = 0;


    //Checks whether right RadioButton is clicked for merc model
     public void mercCheck(View view) {
         RadioButton merc = (RadioButton) findViewById(R.id.merc_e63);
         if (merc.isChecked())
             score++;
     }


      //Checks whether right RadioButton is clicked for audi model
      public void audiCheck(View view) {
          RadioButton audi = (RadioButton) findViewById(R.id.audi_rs7);
          if (audi.isChecked())
              score++;
      }


      //Checks whether right RadioButton is clicked for merc model
      public void bmwCheck(View view) {
          RadioButton bmw = (RadioButton) findViewById(R.id.bmw_m4);
          if (bmw.isChecked())
              score++;
      }


      //Checks whether right RadioButton is clicked for merc model
      public void jagCheck(View view){
            RadioButton jag = (RadioButton) findViewById(R.id.jag_xfr);
            if(jag.isChecked())
               score++;
      }


    //Gets player name
    public String playerName(){
        EditText user = (EditText) findViewById(R.id.player_name);
        String UserName = user.getText().toString();
        return UserName;
    }

    //Checks whether to display the Toast message
    public void isSubmitCheckBoxClicked(View view){
        CheckBox submit = (CheckBox) findViewById(R.id.submit_or_not);
        if(submit.isChecked()){
            displayToast();
        }
    }


    //Displays the Toast message
    public void displayToast() {
        String getUserName = playerName();
        Toast.makeText(this,getUserName+" scored "+score+" points !",Toast.LENGTH_LONG).show();
    }


    //Reset the game
    public void resetEverything(View view){
        score = 0;

        //Resetting every button
        RadioButton merc1 = (RadioButton) findViewById(R.id.merc_e63);
        merc1.setChecked(false);

        RadioButton audi1 = (RadioButton) findViewById(R.id.audi_rs7);
        audi1.setChecked(false);

        RadioButton bmw1 = (RadioButton) findViewById(R.id.bmw_m4);
        bmw1.setChecked(false);

        RadioButton jag1 = (RadioButton) findViewById(R.id.jag_xfr);
        jag1.setChecked(false);

        CheckBox submit1 = (CheckBox) findViewById(R.id.submit_or_not);
        submit1.setChecked(false);





    }


}
