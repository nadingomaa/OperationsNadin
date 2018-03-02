package pro.nanosystems.operations;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void div(View view) {
        Intent divIntent=new Intent(this,DivActivity.class);
        startActivity(divIntent);
    }

    public void mul(View view) {
        Intent mulIntent=new Intent(this,MulActivity.class);
        startActivity(mulIntent);
    }

    public void mins(View view) {
        Intent minsIntent=new Intent(this,MinsActivity.class);
        startActivity(minsIntent);
    }

    public void sum(View view) {
        Intent sumIntent=new Intent(this,SumActivity.class);
        startActivity(sumIntent);
    }
}
