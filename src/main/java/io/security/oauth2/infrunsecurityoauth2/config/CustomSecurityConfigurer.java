//package io.security.oauth2.infrunsecurityoauth2.config;
//
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
//
//@Slf4j
//public class CustomSecurityConfigurer extends AbstractHttpConfigurer<CustomSecurityConfigurer, HttpSecurity> {
//
//    private boolean isSecure;
//
//    @Override
//    public void init(HttpSecurity builder) throws Exception {
//        log.warn("init method started...");
//        super.init(builder);
//    }
//
//    @Override
//    public void configure(HttpSecurity builder) throws Exception {
//        log.warn("config method started...");
//        super.configure(builder);
//        if (isSecure) {
//            log.warn("https is required");
//        } else {
//            log.warn("https is optional");
//        }
//    }
//
//    public CustomSecurityConfigurer setFlag(boolean isSecure) {
//        this.isSecure = isSecure;
//        return this;
//    }
//}
