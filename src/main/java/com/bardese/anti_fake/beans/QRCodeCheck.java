package com.bardese.anti_fake.beans;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author Tao
 * @Date 2020/8/19
 * @Time 10:20
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("QRCode_Check")
public class QRCodeCheck {
    @TableId
    private String qRID;
    private String inventory_Id;
    private String inventory_Name;
    private String unit_Weight;
    private String loGo;
    private String packid;
    private String jarNo;
    private Date createDate;
    private String company;
    private String fmodel;
    @TableField(exist = false)
    private String ImageUrl;
}
