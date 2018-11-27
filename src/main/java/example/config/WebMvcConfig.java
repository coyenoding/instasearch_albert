package example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

// DispatcherServlet용 설정 클래스
@Configuration
@EnableWebMvc
@ComponentScan("example.app")
public class WebMvcConfig extends WebMvcConfigurerAdapter {

}
