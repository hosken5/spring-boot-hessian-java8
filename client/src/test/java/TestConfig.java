import com.yimei.HelloService;
import com.yimei.UserService;
import kitt.KittHessianProxyFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.caucho.HessianProxyFactoryBean;

@Configuration
public class TestConfig {

    @Bean
    public HessianProxyFactoryBean helloClient() {
        HessianProxyFactoryBean factory = new KittHessianProxyFactoryBean();
        factory.setServiceUrl("http://localhost:8080/HelloService");
        factory.setServiceInterface(HelloService.class);
        return factory;
    }

    @Bean
    public HessianProxyFactoryBean helloClient1() {
        HessianProxyFactoryBean factory = new KittHessianProxyFactoryBean();
        factory.setServiceUrl("http://localhost:8080/UserService");
        factory.setServiceInterface(UserService.class);
        return factory;
    }
}
