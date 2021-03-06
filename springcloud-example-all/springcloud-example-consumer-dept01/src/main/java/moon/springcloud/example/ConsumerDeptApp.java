package moon.springcloud.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

import moon.springcloud.ribbon.rule.MyRibbonRule;

/** 
* @author 作者 moonlight 
* @version 创建时间：2018年8月21日 下午9:48:21 
* 类说明 :
*/

@SpringBootApplication
@EnableEurekaClient
// 自定义负载均衡的实现
@RibbonClient(name = "SPRINGCLOUD-EXAMPLE-PROVIER",configuration = MyRibbonRule.class)
public class ConsumerDeptApp {

	
	public static void main(String[] args) {
		SpringApplication.run(ConsumerDeptApp.class, args);
	}
}
