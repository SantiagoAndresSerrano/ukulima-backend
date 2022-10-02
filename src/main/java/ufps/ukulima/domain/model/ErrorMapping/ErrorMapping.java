package ufps.ukulima.domain.model.ErrorMapping;

import java.util.*;

import org.springframework.validation.FieldError;

public class ErrorMapping {
    String msg;
    HashSet<String> fields;

    public ErrorMapping(List<FieldError> fields) {
        this.fields = new HashSet<>();
        this.msg = "";
        for (int i = 0; i < fields.size(); i++) {
            FieldError campo = fields.get(i);
            String field = campo.getField();
            if (this.fields.add(field))
                this.msg += campo.getDefaultMessage() + ",";
        }

    }

    public String getMsg() {
        return this.msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public HashSet<String> getFields() {
        return this.fields;
    }

    public void setFields(HashSet<String> fields) {
        this.fields = fields;
    }

}
