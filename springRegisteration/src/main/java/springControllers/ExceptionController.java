package springControllers;

import javax.persistence.PersistenceException;

import org.hibernate.exception.ConstraintViolationException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mysql.cj.protocol.x.SyncFlushDeflaterOutputStream;

@ControllerAdvice
public class ExceptionController {
	

	@ExceptionHandler(ConstraintViolationException.class)
	public String voilationEx(Exception ex) {
		System.out.println("The Error is from Persistence Exception");
		System.out.println(ex.getMessage());
		return "err";
	}
	
	@ExceptionHandler(Exception.class)
	public String genericHandler(Exception ex) {
		System.out.println("This is from Generic Exception");
		System.out.println(ex.getMessage());
		return "err";
	}
	
}
