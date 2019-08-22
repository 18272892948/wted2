package com.blockbus.wted.config.sys;

public interface UpdateFunction<W,S> {
    UpdateParam<W,S> creteUpdateParam(W w, S s);
}
