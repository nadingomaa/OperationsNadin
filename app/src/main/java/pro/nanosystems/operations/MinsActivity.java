package pro.nanosystems.operations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MinsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mins);

    }

    public void result(View view) {
        EditText val1=findViewById(R.id.val1);
        EditText val2 =findViewById(R.id.val2);
        TextView result=findViewById(R.id.result);
        int part1,part2;
        if(val1.getText().length()==0) {

            val1.setError("  you didn't enter number");
            part1=0;
        }
        else {
            part1 = Integer.parseInt(val1.getText().toString());
        }



        if(val2.getText().length()==0 )
        {
            val2.setError("you didn't enter number");
            part2=0;
        }

        else {

            part2 = Integer.parseInt(val2.getText().toString());

        }

        int realResult=min(part1,part2);
        result.setText(""+realResult);


    }
    public int min(int partA,int partB){
        return partA-partB;
    }

}
