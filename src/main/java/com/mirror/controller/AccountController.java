package com.mirror.controller;

import com.mirror.domain.Account;
import com.mirror.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @Author Mirror
 * @CreateDate 2020/2/28.
 * 账户web层
 */
@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    /**
     * 查询所有数据
     * @param model
     * @return
     */
    @GetMapping("/findAll")
    public String findAll(Model model){
        System.out.println("进入AccountController成功。。。返回list.jsp视图");
        List<Account> list = accountService.findAll();
        model.addAttribute("list",list) ;
    return "list";
    }

    /**
     * 保存账户数据
     * @return
     */
    @PostMapping("/saveAccount")
    public void saveAccount(Account account, HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("进入AccountController成功。。。返回list.jsp视图");
        System.out.println(account);
        accountService.saveAccount(account);
        response.sendRedirect(request.getContextPath()+"/account/findAll");
        return;
    }
}
