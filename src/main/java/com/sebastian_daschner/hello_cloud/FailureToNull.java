package com.sebastian_daschner.hello_cloud;

import javax.interceptor.InterceptorBinding;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@InterceptorBinding
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface FailureToNull {
}
