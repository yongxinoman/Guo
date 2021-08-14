import org.richard.dao.UserDaoMysqlImpl;
import org.richard.dao.UserDaoOracleImpl;
import org.richard.service.UserService;
import org.richard.service.UserServiceImpl;

public class MyTest {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        //使用oracle
//        userService.setUserDao(new UserDaoOracleImpl());

        //使用mysql
        userService.setUserDao(new UserDaoMysqlImpl());


        userService.getUser();
    }
}
