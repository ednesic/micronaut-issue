package com.example;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0017J \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\t\u001a\u00020\u0005H\u0017\u00a8\u0006\n"}, d2 = {"Lcom/example/TestController;", "", "()V", "bar", "Lio/micronaut/http/HttpResponse;", "", "authentication", "Lio/micronaut/security/authentication/Authentication;", "foo", "string", "demo"})
@io.micronaut.http.annotation.Controller(value = "asd")
@io.micronaut.security.annotation.Secured(value = {"isAuthenticated()"})
@io.micronaut.core.version.annotation.Version(value = "2")
@io.micronaut.validation.Validated()
public class TestController {
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Put()
    public io.micronaut.http.HttpResponse<java.lang.String> foo(@org.jetbrains.annotations.NotNull()
    io.micronaut.security.authentication.Authentication authentication, @org.jetbrains.annotations.NotNull()
    @javax.validation.Valid()
    @io.micronaut.http.annotation.Body()
    java.lang.String string) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Get()
    public io.micronaut.http.HttpResponse<java.lang.String> bar(@org.jetbrains.annotations.NotNull()
    io.micronaut.security.authentication.Authentication authentication) {
        return null;
    }
    
    public TestController() {
        super();
    }
}