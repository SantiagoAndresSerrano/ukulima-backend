package ufps.ukulima.domain.model.ErrorMapping;

import java.util.*;

import org.json.JSONObject;
import org.springframework.validation.FieldError;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ErrorMapping {
    String msg;
    HashSet<Field> fields;

    public ErrorMapping(List<FieldError> fields) {
        this.fields = new HashSet<Field>();
        this.msg = "";

        for (int i = 0; i < fields.size(); i++) {
            FieldError campo = fields.get(i);
            String fieldStr = campo.getField();
            Field field = new Field(fieldStr, campo.getDefaultMessage());

            if (this.fields.add(field)) {
                this.msg += campo.getDefaultMessage() + ",";
            }
        }

    }

    public String getMsg() {
        return this.msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public HashSet<Field> getFields() {
        return this.fields;
    }

    public void setFields(HashSet<Field> fields) {
        this.fields = fields;
    }

}
