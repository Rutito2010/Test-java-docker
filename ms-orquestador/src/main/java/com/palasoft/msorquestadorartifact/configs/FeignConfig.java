package com.palasoft.msorquestadorartifact.configs;

import org.springframework.cloud.openfeign.FeignFormatterRegistrar;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.datetime.DateFormatter;


@Configuration
public class FeignConfig implements FeignFormatterRegistrar {

    @Override
    public void registerFormatters(FormatterRegistry formatterRegistry){
        DateFormatter dateFormatter = new DateFormatter();
        dateFormatter.setIso(DateTimeFormat.ISO.DATE_TIME);
        formatterRegistry.addFormatter(dateFormatter);
    }

}
