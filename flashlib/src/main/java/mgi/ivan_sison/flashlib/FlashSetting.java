package mgi.ivan_sison.flashlib;

import android.support.v4.app.Fragment;

public class FlashSetting {

    private static final String TAG = "FlashScreenLib";

    int time = 1400;

    int frameLayout;
    Fragment flashFrag, mainFrag;

    void setTime(int time) {
        this.time = time;
    }

    int getTime() {
        return time;
    }

    void setFlashFrag(Fragment frag) {
        flashFrag = frag;
    }

    void setMainFrag(Fragment frag) {
        mainFrag = frag;
    }

    void setFrameLayout(int frameLayout) {
        this.frameLayout = frameLayout;
    }

    Fragment getFlashFrag() {
        return flashFrag;
    }

    Fragment getMainFrag() {
        return mainFrag;
    }

    int getFrameLayout() {
        return frameLayout;
    }
}
