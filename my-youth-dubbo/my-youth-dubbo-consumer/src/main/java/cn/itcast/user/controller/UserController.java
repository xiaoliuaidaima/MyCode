package cn.itcast.user.controller;

import cn.itcast.cloud.douboo.api.UserService;
import cn.itcast.cloud.douboo.domain.User;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 十三叔
 * @date 2023/3/1
 * @apiNote
 */
@Slf4j
@RestController
@RequestMapping("user")
public class UserController {

    //dubbo的注入方式  项目启动就会订阅服务等待推送
    @DubboReference
    private UserService userService;

    /**
     * 路径： /user/110
     * @param id 用户id
     * @return 用户
     */
    @GetMapping("/{id}")
    public User queryById(@PathVariable("id") Long id) {
        return userService.queryById(id);
    }
}
