package ufps.ukulima.domain.model.ErrorMapping;

public class Field {
    String field;
    String msg;

    Field(String field, String msg) {
        this.field = field;
        this.msg = msg;
    }

    public String getField() {
        return this.field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof Field)) {
            return false;
        }
        Field other = (Field) object;
        if ((this.field == null && other.field != null)
                || (this.field != null && !this.field.equals(other.field))) {
            return false;
        }
        return true;
    }
}
