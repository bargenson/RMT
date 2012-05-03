package com.supinfo.rmt.validation.constraints.impl;

import com.supinfo.rmt.validation.constraints.SecuredPassword;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.annotation.Annotation;
import java.util.regex.Pattern;

/**
 * Created with IntelliJ IDEA.
 * User: bargenson
 * Date: 5/3/12
 * Time: 12:50 PM
 */
public class SecuredPasswordValidator implements ConstraintValidator<SecuredPassword, String> {

    private static final String PASSWORD_PATTERN = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).*)";

    private SecuredPassword securedPassword;
    private Pattern pattern;

    @Override
    public void initialize(SecuredPassword securedPassword) {
        this.securedPassword = securedPassword;
        pattern = Pattern.compile(PASSWORD_PATTERN);
    }

    @Override
    public boolean isValid(String password, ConstraintValidatorContext constraintValidatorContext) {
        return pattern.matcher(password).matches();
    }

}
