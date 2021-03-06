package com.example.mvp.View;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.mvp.Presenter.Contract;
import com.example.mvp.Presenter.MainPresenter;
import com.example.mvp.R;

//View
public class MainActivity extends AppCompatActivity implements Contract.View {
    private EditText number1;
    private EditText number2;
    private Button sumButton;
    private Contract.Presenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter = new MainPresenter(this);
        init();
    }

    private void init(){
        sumButton = (Button)findViewById(R.id.sum);
        number1 = (EditText)findViewById(R.id.number1);
        number2 = (EditText)findViewById(R.id.number2);
        sumButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.addNum(Integer.parseInt(number1.getText().toString()),
                        Integer.parseInt(number2.getText().toString()));
            }
        });
    }
    @Override
    public void showResult(int answer) {
        ((TextView)findViewById(R.id.result)).setText(Integer.toString(answer));
    }
}
