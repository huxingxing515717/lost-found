package cpwu.ecut.service.dto.req;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

/**
 * lost-found
 * cpwu.ecut.service.dto.req
 * 学生认证
 *
 * @author BlueDriver
 * @email cpwu@foxmail.com
 * @date 2019/04/08 15:24 Monday
 */
@Data
@Validated
@NoArgsConstructor
public class StudentRecognizeReq {
    @NotBlank(message = "学校id不能为空")
    private String schoolId;

    @NotBlank(message = "学号不能为空")
    private String username;

    @NotBlank(message = "密码不能为空")
    private String password;

    @NotBlank(message = "邮箱不能为空")
    @Email(message = "邮箱格式不正确")
    private String email;

    @NotBlank(message = "验证码不能为空")
    private String code;
}
