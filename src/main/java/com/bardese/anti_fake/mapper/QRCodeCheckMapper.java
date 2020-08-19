package com.bardese.anti_fake.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.bardese.anti_fake.beans.QRCodeCheck;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author Tao
 * @Date 2020/8/19
 * @Time 10:21
 */
@Repository
@Mapper
public interface QRCodeCheckMapper extends BaseMapper<QRCodeCheck> {

}
