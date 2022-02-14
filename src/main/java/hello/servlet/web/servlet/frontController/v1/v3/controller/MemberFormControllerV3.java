package hello.servlet.web.servlet.frontController.v1.v3.controller;

import hello.servlet.web.servlet.frontController.v1.ModelView;
import hello.servlet.web.servlet.frontController.v1.v3.ControllerV3;

import java.util.Map;

public class MemberFormControllerV3 implements ControllerV3 {
    @Override
    public ModelView process(Map<String, String> paramMap) {
        return new ModelView("new-form");
    }
}
