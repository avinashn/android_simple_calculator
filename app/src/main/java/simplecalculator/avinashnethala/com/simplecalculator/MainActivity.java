package simplecalculator.avinashnethala.com.simplecalculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText first = (EditText) findViewById(R.id.firstNum);
        final EditText second = (EditText) findViewById(R.id.secondNum);
        final TextView res = (TextView) findViewById(R.id.res);
        Button sum = (Button) findViewById(R.id.add);
        Button sub = (Button) findViewById(R.id.sub);
        Button mul = (Button) findViewById(R.id.mul);
        Button div = (Button) findViewById(R.id.div);
        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((first.length() == 0) || (second.length() == 0))
                    Toast.makeText(MainActivity.this, "Please fill both the fields ", Toast.LENGTH_LONG).show();
                else {
                    Double fNum = Double.valueOf(first.getText().toString());
                    Double sNum = Double.valueOf(second.getText().toString());
                    res.setText(String.valueOf(fNum + sNum));
                }
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((first.length() == 0) || (second.length() == 0))
                    Toast.makeText(MainActivity.this, "Please fill both the fields ", Toast.LENGTH_LONG).show();
                else {
                    Double fNum = Double.valueOf(first.getText().toString());
                    Double sNum = Double.valueOf(second.getText().toString());
                    res.setText(String.valueOf(fNum - sNum));
                }
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((first.length() == 0) || (second.length() == 0))
                    Toast.makeText(MainActivity.this, "Please fill both the fields ", Toast.LENGTH_LONG).show();
                else {
                    Double fNum = Double.valueOf(first.getText().toString());
                    Double sNum = Double.valueOf(second.getText().toString());
                    res.setText(String.valueOf(fNum * sNum));
                }
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((first.length() == 0) || (second.length() == 0))
                    Toast.makeText(MainActivity.this, "Please fill both the fields ", Toast.LENGTH_LONG).show();
                else {
                    Double fNum = Double.valueOf(first.getText().toString());
                    Double sNum = Double.valueOf(second.getText().toString());
                    res.setText(String.valueOf(fNum / sNum));
                }
            }
        });
    }
}
