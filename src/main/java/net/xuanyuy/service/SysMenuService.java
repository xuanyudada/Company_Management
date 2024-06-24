package net.xuanyuy.service;

import net.xuanyuy.entity.SysMenu;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @description 针对表【sys_menu】的数据库操作Service
*/
public interface SysMenuService extends IService<SysMenu> {

    List<SysMenu> buildTreeMenu(List<SysMenu> sysMenuList);
}
