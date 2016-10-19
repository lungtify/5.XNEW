package cn.lungtify.a5xnewcharacteristics;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.graphics.Palette;
import android.support.v7.widget.Toolbar;

/**
 * @author lungtify
 * @Time 2016/10/19 17:25
 * @Describe
 */
public class PaletteActivity extends Activity {
    private Toolbar toolbar;

    private void assignViews() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palette);
        assignViews();
        final Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.palette);
        //创建palette对象
        new Palette.Builder(bitmap).generate(new Palette.PaletteAsyncListener() {
            @Override
            public void onGenerated(Palette palette) {
                //通过palette获取对应的色调
                Palette.Swatch vibrant = palette.getDarkVibrantSwatch();

                //将颜色设置给相应的组件
                toolbar.setBackgroundDrawable(new ColorDrawable(vibrant.getRgb()));
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    getWindow().setStatusBarColor(vibrant.getRgb());
                }
                bitmap.recycle();
            }
        });

    }
}
