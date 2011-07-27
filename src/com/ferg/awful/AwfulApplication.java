package com.ferg.awful;

import android.app.Application;
import org.acra.*;
import org.acra.annotation.*;

/**
 * Class originally declared to allowed application-wide access to the global image cache.
 * Now it is also used to do ARCA stuff.
 *
 * @author brosmike
 */

@ReportsCrashes(formKey = "dFBFM1pxcWw0ZUFoU1J4b2FNRFVaTWc6MQ")
public class AwfulApplication extends Application {
	private static String TAG="AwfulApplication";

     @Override
    public void onCreate() {
        // The following line triggers the initialization of ACRA
        ACRA.init(this);
        super.onCreate();
    }
}
