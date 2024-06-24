package net.xuanyuy.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import net.xuanyuy.entity.SysMenu;
import net.xuanyuy.service.SysMenuService;
import net.xuanyuy.mapper.SysMenuMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
* @description 针对表【sys_menu】的数据库操作Service实现
*/
@Service
public class SysMenuServiceImpl extends ServiceImpl<SysMenuMapper, SysMenu>
    implements SysMenuService{

    @Override
    public List<SysMenu> buildTreeMenu(List<SysMenu> sysMenuList) {
        List<SysMenu> resultMenuList=new ArrayList<>();

        for(SysMenu sysMenu:sysMenuList){

            // 寻找子节点
            for(SysMenu e:sysMenuList){
                if(e.getParentId()==sysMenu.getId()){
                    sysMenu.getChildren().add(e);
                }
            }

            if(sysMenu.getParentId()==0L){
                resultMenuList.add(sysMenu);
            }
        }

        return resultMenuList;
    }
}




