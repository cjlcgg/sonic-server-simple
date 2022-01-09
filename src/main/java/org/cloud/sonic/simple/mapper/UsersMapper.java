package org.cloud.sonic.simple.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.cloud.sonic.simple.models.domain.Users;
import org.apache.ibatis.annotations.Mapper;

/**
 *  Mapper 接口
 * @author JayWenStar
 * @since 2021-12-17
 */
@Mapper
public interface UsersMapper extends BaseMapper<Users> {

}
