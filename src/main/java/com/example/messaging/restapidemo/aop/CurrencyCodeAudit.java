package com.example.messaging.restapidemo.aop;

import java.lang.reflect.Parameter;
import java.util.stream.IntStream;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import com.example.messaging.restapidemo.annotation.ToUpper;

@Aspect
@Component
public class CurrencyCodeAudit {
	@Pointcut("execution(* com.example.messaging.restapidemo.services.*Service.*(.., @com.example.messaging.restapidemo.annotation.ToUpper (*),..))")
    public void methodPointcut() {}
	
	@Around("methodPointcut()")
	public Object codeAudit(ProceedingJoinPoint pjp) throws Throwable{
		Object[] args = pjp.getArgs();
		Parameter[]  parameters = ((MethodSignature)pjp.getSignature()).getMethod().getParameters();

		return pjp.proceed(IntStream.range(0, args.length)
				.mapToObj(index -> (parameters[index].isAnnotationPresent(ToUpper.class)) ? (new String(args[index].toString().toUpperCase())) : (args[index]) )
				.toArray());
	}

}
