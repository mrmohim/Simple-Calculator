package ap1.testbox.sooryagangarajk.com.workshopcalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //SGK Calculator

    public int num, res, flag;
    public String symbol;

    public Button btn__0 ;
    public Button btn__1 ;
    public Button btn__2 ;
    public Button btn__3 ;
    public Button btn__4 ;
    public Button btn__5 ;
    public Button btn__6 ;
    public Button btn__7 ;
    public Button btn__8 ;
    public Button btn__9 ;
    public Button btn__plus ;
    public Button btn__multi ;
    public Button btn__div ;
    public Button btn__minus ;
    public Button btn__eq ;
    public Button btn_00 ;
    public TextView tv ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num=0;
        flag=0;
        res=0;

        btn__0 = (Button) findViewById(R.id.btnz);
        btn__1 = (Button) findViewById(R.id.btn1);
        btn__2 = (Button) findViewById(R.id.btn2);
        btn__3 = (Button) findViewById(R.id.btn3);
        btn__4 = (Button) findViewById(R.id.btn4);
        btn__5 = (Button) findViewById(R.id.btn5);
        btn__6 = (Button) findViewById(R.id.btn6);
        btn__7 = (Button) findViewById(R.id.btn7);
        btn__8 = (Button) findViewById(R.id.btn8);
        btn__9 = (Button) findViewById(R.id.btn9);
        btn__plus = (Button) findViewById(R.id.btnpls);
        btn__multi = (Button) findViewById(R.id.btnmult);
        btn__div = (Button) findViewById(R.id.btndiv);
        btn__minus = (Button) findViewById(R.id.btnmin);
        btn__eq = (Button) findViewById(R.id.btneq);
        btn_00 = (Button) findViewById(R.id.btnzz);
        tv = (TextView) findViewById(R.id.textView3);


        btn__1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num = num * 10 + 1;
                tv.setText("" +num);




            }
        });
        btn__2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num = num * 10 + 2;
                tv.setText("" +num);


            }
        });
        btn__3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                num = num * 10 + 3;
                tv.setText("" +num);


            }
        });
        btn__4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                num = num * 10 + 4;
                tv.setText("" +num);


            }
        });
        btn__5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num = num * 10 + 5;
                tv.setText("" + num);


            }
        });
        btn__6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num = num * 10 + 6;
                tv.setText("" +num);


            }
        });
        btn__7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num = num * 10 + 7;
                tv.setText("" +num);


            }
        });
        btn__8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                num = num * 10 + 8;
                tv.setText("" +num);


            }
        });
        btn__9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                num = num * 10 + 9;
                tv.setText("" +num);

            }
        });
        btn__0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num = num * 10;
                tv.setText("" +num);


            }
        });


        btn__plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag==0) {
                    flag = 1;
                    res = num;
                    num = 0;
                    tv.setText("0");
                    symbol = "+";
                }

            }
        });
        btn__multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(flag==0) {
                    res = num;
                    num = 0;
                    tv.setText("0");
                    symbol = "*";
                }

            }
        });
        btn__minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    if(flag==0) {
                        res = num;
                        num = 0;
                        tv.setText("0");
                        symbol = "-";
                    }

            }
        });
        btn__div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(flag==0) {
                    res = num;
                    num = 0;
                    tv.setText("0");
                    symbol = "/";
                }

            }
        });


        btn__eq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switch (symbol) {

                    case "+":
                        res = res + num;
                        break;

                    case "-":
                        res = res - num;
                        break;

                    case "/":
                        res = res / num;
                        break;

                    case "*":
                        res = res * num;
                        break;

                }


                tv.setText("" +res);


            }


        });


        btn_00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    res = 0;
                    num = 0;
                    tv.setText("0");
                    flag=0;


            }
        });
    }
}
