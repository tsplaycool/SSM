package cn.wpstan.ssm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.wpstan.ssm.dao.UserMapper;
import cn.wpstan.ssm.models.User;
import cn.wpstan.ssm.service.IUserService;

@Service("userService")
public class UserServiceImpl  implements IUserService{

	@Resource
	private UserMapper userMapper;
	
	public List<User> getUsers() {
		List<User> list = userMapper.selectByExample(null);
		return list;
	}

}
