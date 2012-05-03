package com.supinfo.rmt.validation.constraints;

import com.supinfo.rmt.validation.constraints.impl.SecuredPasswordValidator;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.constraints.Size;
import java.lang.annotation.*;

/**
 * Created with IntelliJ IDEA.
 * User: bargenson
 * Date: 5/3/12
 * Time: 12:46 PM
 */
@NotEmpty
@Size(min = 6, max = 20)
@Target( { ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE } )
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = { SecuredPasswordValidator.class })
@Documented
public @interface SecuredPassword {

    String message() default "{com.supinfo.rmt.constraints.password}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

}
