package furb.trabalhoweb2;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

@Configuration
@Order(1)
public class SecurityInitializer extends AbstractSecurityWebApplicationInitializer {

}
