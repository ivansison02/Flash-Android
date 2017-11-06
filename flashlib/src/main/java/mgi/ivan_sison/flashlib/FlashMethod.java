package mgi.ivan_sison.flashlib;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

/**
 * Created by MGI-Ivan on 06/11/2017.
 */

public class FlashMethod {

    private static final String TAG = "FlashScreenLib";

    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;

    public FlashMethod(FragmentManager fragmentManager) {
        this.fragmentManager = fragmentManager;
    }

    public void initTransact() {
        fragmentTransaction = fragmentManager.beginTransaction();
    }

    public void showFragment(int layout, Fragment fragment) {
        initTransact();

        fragmentTransaction.replace(layout, fragment);
        fragmentTransaction.commit();
    }
}
