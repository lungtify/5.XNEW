package cn.lungtify.a5xnewcharacteristics;

import android.app.Application;

import com.orhanobut.logger.LogLevel;
import com.orhanobut.logger.Logger;

/**
 * @author lungtify
 * @Time 2016/10/19 17:50
 * @Describe
 */
public class BaseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Logger.init("NEW")               // default tag : PRETTYLOGGER or use just init()
                .setMethodCount(3)            // default 2
                .hideThreadInfo()             // default it is shown
                .setLogLevel(LogLevel.FULL);  // default : LogLevel.FULL
    }
}
