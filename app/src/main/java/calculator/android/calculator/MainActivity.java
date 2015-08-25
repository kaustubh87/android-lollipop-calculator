package calculator.android.calculator;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    EditText operand1, operand2;
    Button add, subtract, divide, multiply,clear;
    TextView result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        operand1 = (EditText)findViewById(R.id.first_number);
        operand2 = (EditText)findViewById(R.id.second_number);

        add = (Button)findViewById(R.id.add_button);
        subtract = (Button)findViewById(R.id.sub_button);
        divide = (Button)findViewById(R.id.divide_button);
        multiply = (Button)findViewById(R.id.multiply_button);
        clear =(Button)findViewById(R.id.clear);

        result = (TextView)findViewById(R.id.answer);

        add.setOnClickListener(new View.OnClickListener() {
              public void onClick(View v) {

                float num1 = Float.parseFloat(operand1.getText().toString());
                float num2 = Float.parseFloat(operand2.getText().toString());

                float answer = num1+num2;
                result.setText(Float.toString(answer));

            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                float num1 = Float.parseFloat(operand1.getText().toString());
                float num2 = Float.parseFloat(operand2.getText().toString());

                if(num1 < num2)
                {

                    Toast.makeText(MainActivity.this,"Number 1 should be greater than Number 2",Toast.LENGTH_SHORT).show();

                }
                else {

                    float answer = num1 - num2;
                    result.setText(Float.toString(answer));
                }


            }
        });


        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                float num1 = Float.parseFloat(operand1.getText().toString());
                float num2 = Float.parseFloat(operand2.getText().toString());

                float answer = num1*num2;
                result.setText(Float.toString(answer));

            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                float num1 = Float.parseFloat(operand1.getText().toString());
                float num2 = Float.parseFloat(operand2.getText().toString());

                float answer = num1/num2;
                result.setText(Float.toString(answer));


            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                operand1.setText("");
                operand2.setText("");
                result.setText("0.00");
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
