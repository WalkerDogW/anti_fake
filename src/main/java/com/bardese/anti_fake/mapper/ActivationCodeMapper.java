package com.bardese.anti_fake.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.bardese.anti_fake.beans.ActivationCode;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author Tao
 * @Date 2020/8/19
 * @Time 14:21
 */
@Repository
@Mapper
public interface ActivationCodeMapper extends BaseMapper<ActivationCode> {
}
