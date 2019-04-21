package cpwu.ecut.service.inter;

import cpwu.ecut.service.dto.req.StudentRecognizeReq;
import cpwu.ecut.service.dto.req.UserInfoListReq;
import cpwu.ecut.service.dto.req.UserLoginReq;
import cpwu.ecut.service.dto.resp.StudentRecognizeResp;
import cpwu.ecut.service.dto.resp.UserInfoListResp;
import cpwu.ecut.service.dto.resp.UserInfoResp;

import javax.servlet.http.HttpSession;

/**
 * lost-found
 * cpwu.ecut.service
 *
 * @author BlueDriver
 * @email cpwu@foxmail.com
 * @date 2019/04/05 12:20 Friday
 */
public interface UserService {
    /**
     * 认证登录
     */
    StudentRecognizeResp recognizeStudent(StudentRecognizeReq req, HttpSession session) throws Exception;

    /**
     * 激活用户
     */
    String activateUser(String code);

    /**
     * 用户登录
     */
    StudentRecognizeResp loginUser(UserLoginReq req, HttpSession session) throws Exception;

    /**
     * 查询单个用户信息
     */
    UserInfoResp userInfo(String userId) throws Exception;

    /**
     * 用户信息列表
     */
    UserInfoListResp userList(UserInfoListReq req, HttpSession session) throws Exception;

    /**
     * 冻结用户
     */
    void freezeUser(String userId) throws Exception;

    /**
     * 解冻用户
     */
    void unfreezeUser(String userId) throws Exception;
}
