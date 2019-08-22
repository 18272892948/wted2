package com.blockbus.wted.config.sys;

import lombok.Data;

@Data
public class UpdateParam<W,S>{
    private W where;
    private S set;

    public UpdateParam(W w, S s) {
        this.where = w;
        this.set = s;
    }

    public UpdateParam() {
    }
}
