package com.bardese.anti_fake.beans;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author Tao
 * @Date 2020/8/19
 * @Time 14:17
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("ActivationCode")
public class ActivationCode {
    @TableId
    private String qRCode;  //
    private String code;  //
    private Date createDate;  //
    private String userName;  //
    private String addr;  //
    private int scanCount;  //
    private String qRCode2;  //
    private String webAddr;  //
}
