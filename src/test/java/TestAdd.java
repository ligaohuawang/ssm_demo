import com.lgh.entity.User;
import com.lgh.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.UUID;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class TestAdd {
    @Autowired
    private IUserService iUserService;

    @Test
    public void testAdd(){
        User user = new User();
        user.setNicknane("888");
        user.setUbirthday(new Date());
        user.setUcard(UUID.randomUUID().toString());
        user.setUcity("深圳");
        user.setUemail("156453241@qq.com");
        user.setUid(9);
        user.setUname("李高华HUA");
        user.setUpassword("888");
        user.setUphone("888");
        user.setUsex(1);
        user.setUpicture("ssssss");
        iUserService.testAdd(user);
    }
}
