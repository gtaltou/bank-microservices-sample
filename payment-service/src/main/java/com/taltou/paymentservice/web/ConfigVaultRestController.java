package com.taltou.paymentservice.web;

import com.taltou.paymentservice.config.DataSourceParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RefreshScope
public class ConfigVaultRestController {
    @Autowired
    private DataSourceParams dataSourceParams;
    @Value("${user.otp}")
    private long otp;
    @GetMapping("/secretDataSourceParams")
    public DataSourceParams dataSourceParams(){
        return dataSourceParams;
    }
    @GetMapping("/secretOtpParams")
    public Map<String, Object> otpParams(){
        return Map.of("otp",otp);
    }
}
