package com.ntc.lesson5.cap10.aop;

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
	@Pointcut("execution(public int com.ntc.lesson5.cap10.aop.Calculator.div(int,int))")
	public void pointCut(){}
		
	// 切入表达式"execution(public int com.ntc.lesson5.cap10.aop.Calculator.div(int,int))"
	// execution(public int com.ntc.lesson5.cap10.aop.Calculator.*(..)) (多个)
	
	// @Before代表在目标方法执行前切入，并制定在哪个方法前切入
//	@Before("execution(public int com.ntc.lesson5.cap10.aop.Calculator.div(int,int))")
	@Before("pointCut()")	//将上面的表达式抽出(解耦)
	public void logStart(){
		System.out.println("log切面...logStart...参数列表是:{}");
	}
	
	@After("pointCut()")
	public void logEnd(){
		System.out.println("log切面...logEnd...");
	}
	
	@AfterReturning("pointCut()")
	public void logReturn(){
		System.out.println("log切面...logReturn...运行结果是:{}");
	}
	
	@AfterThrowing("pointCut()")
	public void logException(){
		System.out.println("log切面...logException...异常信息是:{}");
	}
	
	@Around("pointCut()")
	public Object Around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
		System.out.println("log切面...@Around:执行目标方法之前");
		Object proceed = proceedingJoinPoint.proceed();
		System.out.println("log切面...@Around:执行目标方法之后");
		return proceed;		
	}
}
