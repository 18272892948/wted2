package com.blockbus.wted.core.user.dto.notice;

import com.blockbus.wted.config.sys.CommonParam;
import com.blockbus.wted.core.user.dto.BaseDto;
import lombok.Data;

@Data
public class NoticeQueryDto extends CommonParam implements BaseDto {
    private String id;
    private String title;
    private Integer status;
    private String noticeId;
}
