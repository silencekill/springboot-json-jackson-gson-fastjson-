package org.javaboy.jacksongsonfastjson.config;

import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebJsonConfig {

    // 使用jackson作为json的转化
    // 1.自己定义配置提供一个MappingJackson2HttpMessageConverter
    /*@Bean
    MappingJackson2HttpMessageConverter converter(){
        MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
        ObjectMapper mapper = new ObjectMapper();
        mapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd"));
        converter.setObjectMapper(mapper);
        return converter;
    }*/

    // 使用jackson作为json的转化
    // 2. 自己定义一个ObjectMapper
    /*@Bean
    ObjectMapper objectMapper(){
        ObjectMapper mapper = new ObjectMapper();
        mapper.setDateFormat(new SimpleDateFormat("yyyy/MM/dd"));
        return mapper;
    }*/

    // 使用Gson作为转换
    // 1. 自己定义提供一个GsonHttpMessageConverter
    /*@Bean
    GsonHttpMessageConverter gsonHttpMessageConverter(){
        GsonHttpMessageConverter converter = new GsonHttpMessageConverter();
        converter.setGson(new GsonBuilder().setDateFormat("yyyy-MM-dd").create());
        return converter;
    }*/

    // 使用Gson作为转换
    // 2. 自己定义提供一个Gson
    /*@Bean
    Gson gson(){
        return new GsonBuilder().setDateFormat("yyyy/MM/dd").create();
    }*/

    @Bean
    FastJsonHttpMessageConverter converter(){
        FastJsonHttpMessageConverter converter = new FastJsonHttpMessageConverter();
        FastJsonConfig fastJsonConfig = new FastJsonConfig();
        fastJsonConfig.setDateFormat("yyyy/MM/dd");
        converter.setFastJsonConfig(fastJsonConfig);
        return converter;
    }
}
