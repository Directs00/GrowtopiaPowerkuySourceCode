package powerkuy.modmenu;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

public class DebugActivity extends Activity {
    String[] errMessage;
    String[] exceptionType;

    /* access modifiers changed from: protected */
    @Override
    public void onCreate(Bundle bundle) {
        AlertDialog.Builder builder;
        StringBuffer stringBuffer;
        DialogInterface.OnClickListener onClickListener;
        StringBuffer stringBuffer2;
        super.onCreate(bundle);
        Intent intent = getIntent();
        Object obj = "";
        String str = "";
        if (intent != null) {
            String stringExtra = intent.getStringExtra("error");
            String[] split = stringExtra.split("\n");
            int i = 0;
            while (true) {
                try {
                    if (i >= this.exceptionType.length) {
                        break;
                    } else if (split[0].contains(this.exceptionType[i])) {
                        String str2 = this.errMessage[i];
                        int indexOf = split[0].indexOf(this.exceptionType[i]) + this.exceptionType[i].length();
                        new StringBuffer();
                        str = stringBuffer2.append(str2).append(split[0].substring(indexOf, split[0].length())).toString();
                        break;
                    } else {
                        i++;
                    }
                } catch (Exception e) {
                    Exception exc = e;
                }
            }
            if (str.isEmpty()) {
                str = stringExtra;
            }
        }
        new AlertDialog.Builder(this);
        AlertDialog.Builder builder2 = builder;
        AlertDialog.Builder title = builder2.setTitle("Crash Handler\nAn error occured");
        new StringBuffer();
        AlertDialog.Builder message = builder2.setMessage(stringBuffer.append("Report To PowerKuy: \n").append(str).toString());
        new DialogInterface.OnClickListener(this) {
            private final DebugActivity this$0;

            {
                this.this$0 = r6;
            }

            static DebugActivity access$0(AnonymousClass100000000 r4) {
                return r4.this$0;
            }

            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                DialogInterface dialogInterface2 = dialogInterface;
                int i2 = i;
                this.this$0.finish();
            }
        };
        AlertDialog.Builder neutralButton = builder2.setNeutralButton("End Application", onClickListener);
        builder2.create().show();
    }

    public DebugActivity() {
        String[] strArr = new String[5];
        strArr[0] = "";
        String[] strArr2 = strArr;
        strArr2[1] = "";
        String[] strArr3 = strArr2;
        strArr3[2] = "";
        String[] strArr4 = strArr3;
        strArr4[3] = "";
        String[] strArr5 = strArr4;
        strArr5[4] = "";
        this.exceptionType = strArr5;
        String[] strArr6 = new String[5];
        strArr6[0] = "";
        String[] strArr7 = strArr6;
        strArr7[1] = "";
        String[] strArr8 = strArr7;
        strArr8[2] = "";
        String[] strArr9 = strArr8;
        strArr9[3] = "";
        String[] strArr10 = strArr9;
        strArr10[4] = "";
        this.errMessage = strArr10;
    }
}
