package com.roncoo.education.feign.configuration;
import org.springframework.context.annotation.Bean;

import feign.Logger;

//@Configuration
public class RcFeignConfiguration {
	
	@Bean
    public Logger.Level feignLoggerLevel() {
        return feign.Logger.Level.FULL;
	}
	
	/*@Bean
	public Contract feignContract() {
		return new feign.Contract.Default();
	}*/

}
