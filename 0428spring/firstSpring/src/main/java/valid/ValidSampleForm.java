package valid;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;

public class ValidSampleForm {

    @NotEmpty
    private String name;
    @NotNull
    @Range(min=1, max=120, message="{0}の値は、{min}から{max}までの値で入力してください。")
    private Integer age;
    @NotEmpty
    @Email(message="メールアドレスの形式が不正です。")
    private String mail;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}