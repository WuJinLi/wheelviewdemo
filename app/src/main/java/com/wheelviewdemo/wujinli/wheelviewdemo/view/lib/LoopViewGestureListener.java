package com.wheelviewdemo.wujinli.wheelviewdemo.view.lib;

import android.view.MotionEvent;

/**
 * author: WuJinLi
 * time  : 17/6/1
 * desc  :
 */

final class LoopViewGestureListener extends android.view.GestureDetector.SimpleOnGestureListener {

    final WheelView loopView;

    LoopViewGestureListener(WheelView loopview) {
        loopView = loopview;
    }

    @Override
    public final boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        loopView.scrollBy(velocityY);
        return true;
    }
}
