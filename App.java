package powerkuy.modmenu;

import android.app.Application;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread;

public class App extends Application {
    private Thread.UncaughtExceptionHandler uncaughtExceptionHandler;

    static String access$1000002(App app, Throwable th) {
        return app.getStackTrace(th);
    }

    static Thread.UncaughtExceptionHandler access$L1000000(App app) {
        return app.uncaughtExceptionHandler;
    }

    static void access$S1000000(App app, Thread.UncaughtExceptionHandler uncaughtExceptionHandler2) {
        app.uncaughtExceptionHandler = uncaughtExceptionHandler2;
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

    private String getStackTrace(Throwable th) {
        Object obj;
        StringWriter stringWriter;
        PrintWriter printWriter;
        Throwable th2 = th;
        new Exception(th2);
        Object obj2 = obj;
        new StringWriter();
        StringWriter stringWriter2 = stringWriter;
        new PrintWriter(stringWriter2);
        PrintWriter printWriter2 = printWriter;
        while (th2 != null) {
            th2.printStackTrace(printWriter2);
            th2 = th2.getCause();
        }
        return stringWriter2.toString();
    }

    public App() {
    }
}
