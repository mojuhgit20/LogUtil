package logutil.scratchlabs.android.logutil;

import android.util.Log;

public class LogDebug {

    private static final String TAG = "SUPER_AWESOME_APP";

    public static void d(String message)
    {
        Log.d(TAG, message);
    }

}
