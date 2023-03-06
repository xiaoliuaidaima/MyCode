package cn.itcast.cloud.douboo.api;


import cn.itcast.cloud.douboo.domain.User;


public interface UserService {

    User queryById(Long id);
}
