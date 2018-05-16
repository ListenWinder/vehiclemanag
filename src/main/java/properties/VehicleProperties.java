package properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author LiuHaoiang
 * @date 2018/5/13 20:25
 */
@Component
@ConfigurationProperties(prefix = "vehicle")
public class VehicleProperties {

}
