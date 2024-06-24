package net.xuanyuy.controller;

import net.xuanyuy.service.SysUserService;
import net.xuanyuy.entity.R;
import net.xuanyuy.entity.SysUser;
import net.xuanyuy.util.JwtUtils;
import net.xuanyuy.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 测试
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private SysUserService sysUserService;

    @RequestMapping("/user/list")
    // @PreAuthorize("hasRole('ROLE_admin2')")
    @PreAuthorize("hasAuthority('system:user2:list')")
    public R userList(@RequestHeader(required = false)String token){
        if(StringUtil.isNotEmpty(token)){
            Map<String,Object> resutlMap=new HashMap<>();
            List<SysUser> userList = sysUserService.list();
            resutlMap.put("userList",userList);
            return R.ok(resutlMap);
        }else{
            return R.error(401,"没有权限访问");
        }

    }

    @RequestMapping("/login")
    public R login(){
        String token = JwtUtils.genJwtToken("java1234");
        return R.ok().put("token",token);
    }
}
