package com.german.registrationsessions.config;

import org.springframework.session.FlushMode;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;


// maxInactiveIntervalInSeconds should not be so big, as if user make actions, then session's expiration time is prolonged
// but if we want our user to be logged in even after much time of inactivity, we should all add rememberMe functionality
// probably I will add it in the next tutorials
@EnableRedisHttpSession(maxInactiveIntervalInSeconds = 900, flushMode = FlushMode.IMMEDIATE)
public class SessionConfig {
}
