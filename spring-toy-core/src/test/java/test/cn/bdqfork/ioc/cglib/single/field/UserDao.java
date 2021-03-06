package test.cn.bdqfork.ioc.cglib.single.field;

import cn.bdqfork.core.annotation.AutoWired;
import cn.bdqfork.core.annotation.Component;

import java.util.Objects;

/**
 * @author bdq
 * @since 2019-07-31
 */
@Component
public class UserDao {
    @AutoWired
    private UserService userService;

    @Override
    public String toString() {
        return "UserDaoImpl{" +
                "userService="  +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserDao userDao = (UserDao) o;
        return Objects.equals(userService, userDao.userService);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userService);
    }
}
