package cc.voox.hi.autoconfigure;



import cc.voox.hi.config.HiConfigProperties;
import cc.voox.hi.service.HiService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration(
        proxyBeanMethods = false
)
@EnableConfigurationProperties({HiConfigProperties.class})
public class HiConfiguration {

    @ConditionalOnMissingBean({HiService.class})
    @Bean
    public HiService hiService() {
        return new HiService();
    }

}
