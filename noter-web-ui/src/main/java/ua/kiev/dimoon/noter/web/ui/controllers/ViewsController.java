package ua.kiev.dimoon.noter.web.ui.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lutay.d on 07.10.2016.
 */
@Controller
public class ViewsController {

    @RequestMapping("/notes.do")
    String index(){
        return "notes";
    }
}
