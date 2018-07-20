package com.telyo.dragmsgview;

import android.animation.TypeEvaluator;
import android.graphics.PointF;

/**
 * Created by tanghuan on 2018/7/20.
 * Supported By 甜瓜移动.
 * Official Website: www.melonmobile.cn.
 *
 * @author tanghuan
 */
public class PointFEvaluator implements TypeEvaluator<PointF> {

    @Override
    public PointF evaluate(float fraction, PointF startPointF, PointF endPointF) {
        float x = startPointF.x + fraction * (endPointF.x - startPointF.x);
        float y = startPointF.y + fraction * (endPointF.y - startPointF.y);
        return new PointF(x, y);
    }
}