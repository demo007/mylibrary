package me.yugy.app.common.view;

import android.os.SystemClock;
import android.view.View;

@SuppressWarnings("unused")
public abstract class OnViewClickListener implements View.OnClickListener {
    private static final long INTERVAL = 200;
    private long t = 0l;

    @Override
    public void onClick(View v) {
        if (SystemClock.elapsedRealtime() - t < INTERVAL) {
            return;
        }
        t = SystemClock.elapsedRealtime();
        onViewClick(v);
    }
    protected abstract void onViewClick(View v);
}
