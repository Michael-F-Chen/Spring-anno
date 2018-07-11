package com.ntc.lesson5.cap10.aop;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

// 日志切面类
@Aspect
public class LogAspects {
	
	// 将切入表达式抽出(解耦)
	// 抽取公共切入点表达式
	// 1,如果实在此类中应用，只要@Before("pointCut()")
	// 2,如果是在其他的切面类，需要引用
	@Pointcut("execution(public int com.ntc.lesson5.cap10.aop.Calculator.div(int,int))")
	public void pointCut(){}
		
	// 切入表达式"execution(public int com.ntc.lesson5.cap10.aop.Calculator.div(int,int))"
	// execution(public int com.ntc.lesson5.cap10.aop.Calculator.*(..)) (多个)
	
	// @Before代表在目标方法执行前切入，并制定在哪个方法前切入
//	@Before("execution(public int com.ntc.lesson5.cap10.aop.Calculator.div(int,int))")
	@Before("pointCut()")	//将上面的表达式抽出(解耦)
	public void logStart(JoinPoint joinPoint){
		System.out.println(joinPoint.getSignature().getName() + " log切面...logStart...参数列表是:{ "+ Arrays.asList(joinPoint.getArgs())+" }");
	}
	
	@After("com.ntc.lesson5.cap10.aop.LogAspects.pointCut()")
	public void logEnd(){
		System.out.println("log切面...logEnd...");
	}
	
	@AfterReturning(value = "pointCut()", returning = "result")
	public void logReturn(Object result){
		System.out.println("log切面...logReturn...运行结果是:{"+ result +"}");
	}
	
	@AfterThrowing(value = "pointCut()", throwing = "exception")
	public void logException(Exception exception){
		System.out.println("log切面...logException...异常信息是:{" + exception +"}");
	}
	
	@Around("pointCut()")
	public Object Around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
		System.out.println("log切面...@Around:执行目标方法之前");
		Object proceed = proceedingJoinPoint.proceed();// 手动启动业务方法
		System.out.println("log切面...@Around:执行目标方法之后");
		return proceed;		
	}
}
