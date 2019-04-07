/**
 * Date:     2019/4/717:22
 * AUTHOR:   Administrator
 *//*

package com.zhou.springmybatis.user;

import com.zhou.springmybatis.dao.UserMapper;
import com.zhou.springmybatis.entity.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

*/
/**
 * 2019/4/7  17:22
 * created by zhoumb
 *//*

public class UserTest {
    @Test
    public void testInsert() throws FileNotFoundException {
        String resource = "D:\\Users\\Administrator\\IdeaProjects\\spring-cloud\\spring-mybatis\\src\\main\\resources\\mybatis-config.xml";
        InputStream inputStream = new FileInputStream(new File(resource));
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        int insert = userMapper.insert(new User("zhou","与干嘛",26));
        System.out.println(insert);
    }
}
*/
