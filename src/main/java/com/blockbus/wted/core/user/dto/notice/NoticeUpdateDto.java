package com.blockbus.wted.core.user.dto.notice;

import com.blockbus.wted.core.user.dto.BaseDto;
import lombok.Data;


@Data
public class NoticeUpdateDto implements BaseDto {

    private String id;
    private String title;
    private Integer status;
    private String content;


}
