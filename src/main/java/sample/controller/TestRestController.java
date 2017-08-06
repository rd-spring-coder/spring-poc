/**
 * 
 */
package sample.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.TypeMismatchException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sample.model.Hello;

/**
 * 
 * <p>
 * </p>
 * @author Ritesh Dharmatti
 * 
 */
@RestController
public class TestRestController {

	@RequestMapping("/hello")
	public ResponseEntity<String> hello(@RequestBody Hello hello, Errors errors){
		if(errors.hasErrors()){
			return new ResponseEntity<String>("error", HttpStatus.BAD_REQUEST);
		}
		System.out.println(hello.getValue());
		return new ResponseEntity<String>("hi",HttpStatus.OK);
	}
	
	@ExceptionHandler(TypeMismatchException.class)
	public String type(Exception ex,HttpServletRequest req){
		return "type";
	}
	
	/*@ResponseStatus(value=HttpStatus.BAD_REQUEST,reason="INV REQ DATA")
	@ExceptionHandler(HttpMessageNotReadableException.class)
	public void notReadable(Exception ex,HttpServletRequest req){
		System.out.println("bad request");
	}
	*/
	/*@ResponseStatus(HttpStatus.OK)
    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ErrorBean handleHttpMessageNotReadableException(HttpMessageNotReadableException e) {
        ErrorBean errorBean = new ErrorBean();
        errorBean.setMessage(e.getMessage());
        return errorBean;
    }

    class ErrorBean {
        private String message;

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
    }*/
}
