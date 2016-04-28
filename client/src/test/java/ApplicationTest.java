import com.yimei.Application;
import com.yimei.Foo;
import com.yimei.HelloService;
import com.yimei.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.time.LocalDate;

import static org.assertj.core.api.BDDAssertions.then;

@IntegrationTest
@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = {Application.class,TestConfig.class})
public class ApplicationTest {

    @Autowired
    private HelloService helloClient;


    @Autowired
    private UserService userService;


    @Test
    public void shouldSayHello() {

        //when
        String message = helloClient.sayHello();

        then(message)
                .isNotEmpty()
                .isEqualTo("Hello World");
    }


    @Test
    public void testLocalDate() {
        //when
        LocalDate message = userService.getTime();
        then(message).isInstanceOf(LocalDate.class) ;
        System.out.println(message);
    }

    @Test
    public void testtestLocalDateTime() {
        //when
        java.time.LocalDateTime message = userService.getJava8LocalDate();
        then(message).isInstanceOf(java.time.LocalDateTime.class) ;
        System.out.println(message);
    }

    @Test
    public void shouldSayUserHello() {

        //when
        String message = userService.sayHello();

        then(message)
                .isNotEmpty()
                .isEqualTo("UserServiceImpl.hello");
    }

    @Test
    public void shouldReceiveFoo() {

        //when
        Foo foo = helloClient.foo();

        then(foo.getName())
                .isEqualTo("foo");
    }

}
