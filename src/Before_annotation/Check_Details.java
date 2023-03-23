package Before_annotation;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Check_Details{  
  @Pointcut("execution(* Customer.*(..))")  
  public void  k(){}
  
  @Before("k()")
  public void mycus(JoinPoint jp){
	  
	 System.out.println("customer info"); 
  }
}  
 