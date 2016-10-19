package cn.lungtify.a5xnewcharacteristics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView palette;

    private void assignViews() {
        palette = (CardView) findViewById(R.id.palette);
        palette.setOnClickListener(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        assignViews();
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.palette:
                intent = new Intent(MainActivity.this, PaletteActivity.class);
                startActivity(intent);
                break;
        }
    }
}
