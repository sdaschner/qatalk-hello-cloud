package com.sebastian_daschner.hello_cloud;

import javax.annotation.Priority;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Interceptor
@FailureToNull
@Priority(Interceptor.Priority.APPLICATION)
public class FailureToNullInterceptor {

    @AroundInvoke
    public Object aroundInvoke(InvocationContext invocationContext) {
        try {
            return invocationContext.proceed();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
