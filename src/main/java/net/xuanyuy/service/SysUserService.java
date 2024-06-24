package net.xuanyuy.service;

import net.xuanyuy.entity.SysUser;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @description 针对表【sys_user】的数据库操作Service
*/
public interface SysUserService extends IService<SysUser> {


    SysUser getByUsername(String username);

    String getUserAuthorityInfo(Long userId);
}
