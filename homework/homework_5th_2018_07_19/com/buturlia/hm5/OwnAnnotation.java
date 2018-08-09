package com.buturlia.hm5;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface OwnAnnotation {

    public String version ();
    public String codeName ();


}
