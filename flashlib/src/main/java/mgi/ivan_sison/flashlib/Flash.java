package mgi.ivan_sison.flashlib;

import android.content.Context;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.util.Log;

/**
 * Created by MGI-Ivan on 06/11/2017.
 */

public class Flash {

    private static final String TAG = "FlashScreenLib";

    private Context context;

    FlashSetting flashSetting;
    FlashMethod flashMethod;

    public Flash(Context context) {
        this.context = context;

        getRefClass();
    }

    private FragmentActivity getFragmentActivity() {
        return (FragmentActivity) context;
    }

    private void getRefClass() {
        flashSetting = new FlashSetting();
        flashMethod = new FlashMethod(getFragmentActivity().getSupportFragmentManager());
    }

    private void showFlash() {
        flashMethod.showFragment(flashSetting.getFrameLayout(), flashSetting.getFlashFrag());
    }

    private void showMain() {
        flashMethod.showFragment(flashSetting.getFrameLayout(), flashSetting.getMainFrag());
    }

    public void setFlashTime(int time) {
        flashSetting.setTime(time);
    }

    public int getFlashTime() {
        return flashSetting.getTime();
    }

    public void setFragments(int frameLayout, Fragment flashFrag, Fragment mainFrag) {
        flashSetting.setFrameLayout(frameLayout);
        flashSetting.setFlashFrag(flashFrag);
        flashSetting.setMainFrag(mainFrag);
    }

    public void startFlashing() {
        showFlash();

        Handler handler = new Handler();
        handler.postDelayed(
                new Runnable() {
                    public void run() {
                        try {
                            showMain();
                        } catch (Exception e) {
                            Log.e(TAG, e.toString());
                        }
                    }
                }, flashSetting.getTime());
    }
}
