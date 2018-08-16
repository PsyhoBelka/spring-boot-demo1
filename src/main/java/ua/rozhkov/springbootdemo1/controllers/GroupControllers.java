package ua.rozhkov.springbootdemo1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ua.rozhkov.springbootdemo1.services.GroupService;

@Controller
public class GroupControllers {
    @Autowired
    private GroupService groupService;

    public void setGroupService(GroupService groupService) {
        this.groupService = groupService;
    }

    @RequestMapping(value = "/listGroups", method = RequestMethod.POST)
    public String listGroups(Model model) {
        model.addAttribute("groups", groupService.getAll());
        return "listGroup";
    }
}
