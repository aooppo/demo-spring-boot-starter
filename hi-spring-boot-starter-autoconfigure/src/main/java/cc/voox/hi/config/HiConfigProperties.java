package cc.voox.hi.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "cc.voox.hi")
@Data
public class HiConfigProperties {
    String name;
    Integer age;
}
