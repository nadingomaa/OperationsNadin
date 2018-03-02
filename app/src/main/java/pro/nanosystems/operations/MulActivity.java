package pro.nanosystems.operations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MulActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mul);
    }



    public void result(View view) {
        EditText val1=findViewById(R.id.val1);
        EditText val2 =findViewById(R.id.val2);
        TextView result=findViewById(R.id.result);
        int part1,part2;
        if(val1.getText().toString()!="" ) {

            part1 = Integer.parseInt(val1.getText().toString());
        }
        else{
            part1=0;
        }

        if(val2.getText().toString()!="" ) {

            part2 = Integer.parseInt(val2.getText().toString());
        }
        else {
            part2 = 0;
        }


        int realResult= mul(part1,part2);
        result.setText(""+realResult);

    }

    public int mul(int partA,int partB){
        return partA*partB;
    }
}
