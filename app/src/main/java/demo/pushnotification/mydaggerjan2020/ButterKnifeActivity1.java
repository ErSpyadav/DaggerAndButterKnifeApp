package demo.pushnotification.mydaggerjan2020;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import butterknife.BindColor;
import butterknife.BindDrawable;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ButterKnifeActivity1 extends AppCompatActivity {

    @BindView(R.id.lbl_title)
    TextView header;

    @BindView(R.id.input_name)
    EditText inputTxt;

    @BindView(R.id.information)
    TextView information;

    @BindView(R.id.image)
    ImageView image;

    @BindColor(R.color.colorAccent)
    int myColor;

    @BindString(R.string.app_name)
    String infoStr;

    @BindDrawable(R.drawable.sarayu_icon)
    Drawable drawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_butter_knife);
        ButterKnife.bind(this);

        image.setImageDrawable(drawable);
        information.setText(infoStr);
        information.setTextColor(myColor);

    }

    @OnClick(R.id.btn_enter)
    public void OnClick(View view){
        Toast.makeText(this,"Button is clicked",Toast.LENGTH_LONG).show();
    }

}

