package bonc.com.cn.config;

import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

// @Configuration
public class RedisConfig {

    @SuppressWarnings("deprecation")
    @Bean
    public RedisConnectionFactory getJedisConnectionFactory() {
        JedisConnectionFactory jedisConnectionFactory = new JedisConnectionFactory();
        jedisConnectionFactory.setHostName("192.168.43.37");
        jedisConnectionFactory.setDatabase(0);
        jedisConnectionFactory.setPort(6380);
        return jedisConnectionFactory;

    }

    @SuppressWarnings("deprecation")
    @Bean
    public RedisConnectionFactory getLettuceConnectionFactory() {
        LettuceConnectionFactory lettuceConnectionFactory = new LettuceConnectionFactory();
        lettuceConnectionFactory.setHostName("192.168.43.37");
        lettuceConnectionFactory.setDatabase(0);
        lettuceConnectionFactory.setPort(6380);
        return lettuceConnectionFactory;
    }

    /* @SuppressWarnings("deprecation")
    @Bean
    public RedisConnectionFactory getJredisConnectionFactory () {
        JredisConnectionFactory  jredisConnectionFactory  = new JredisConnectionFactory ();
        jredisConnectionFactory.setHostName("192.168.43.37");
        jredisConnectionFactory.setDatabase(0);
        jredisConnectionFactory.setPort(6380);
        return jredisConnectionFactory;
    }*/
    /*@SuppressWarnings("deprecation")
    @Bean
    public RedisConnectionFactory getSrpConnectionFactory() {
        SrpConnectionFactory srpConnectionFactory = new SrpConnectionFactory();
        srpConnectionFactory.setHostName("192.168.43.37");
        srpConnectionFactory.setDatabase(0);
        srpConnectionFactory.setPort(6380);
        return srpConnectionFactory;
    }
    */
    @Bean
    public RedisConnection getRedisConfig(RedisConnectionFactory connRedisConnectionFactory) {
        RedisConnection connection = connRedisConnectionFactory.getConnection();
        System.out.println(connection.get("bbb".getBytes()));
        return connection;
    }

    @Bean
    public RedisTemplate<String, Object> functionDomainRedisTemplate(RedisConnectionFactory factory) {
        RedisTemplate<String, Object> redisTemplate = new RedisTemplate<>();
        redisTemplate.setConnectionFactory(factory);
        // redisTemplate.opsForList().rightPush(key, value)
        // redisTemplate.setKeySerializer(RedisSerializer<?> serializer);
        // redisTemplate.setValueSerializer(RedisSerializer<?> serializer);
        return redisTemplate;
    }

    @Bean
    public StringRedisTemplate functionDomainStringRedisTemplate(RedisConnectionFactory factory) {
        return new StringRedisTemplate(factory);
    }

}
