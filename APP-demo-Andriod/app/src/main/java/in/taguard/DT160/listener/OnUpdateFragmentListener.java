package in.taguard.DT160.listener;

import android.nfc.Tag;

/**
 * Created by wyj on 2018/7/4.
 */
public interface OnUpdateFragmentListener {
    void shouwId(String uid);
    void tagData(Tag tag);
}
