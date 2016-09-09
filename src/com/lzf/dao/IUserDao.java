package com.lzf.dao;

import com.lzf.bean.User;

public interface IUserDao {
	User select(String username);
}
