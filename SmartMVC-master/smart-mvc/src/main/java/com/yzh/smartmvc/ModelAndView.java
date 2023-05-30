package com.yzh.smartmvc;

import com.yzh.smartmvc.http.HttpStatus;
import lombok.Data;
import org.springframework.ui.Model;

@Data
public class ModelAndView {
    private Object view;
    private Model model;
    private HttpStatus status;

    public void setViewName(String viewName) {
        this.view = viewName;
    }

    public String getViewName() {
        return (this.view instanceof String ? (String) this.view : null);
    }

}