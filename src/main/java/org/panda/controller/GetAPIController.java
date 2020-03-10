package org.panda.controller;

import org.panda.model.SearchVO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class GetAPIController {

    @RequestMapping(method = RequestMethod.GET, path = "/getRequest")
    public String getRequest() {
        return "this is getRequest";
    }

    @GetMapping("/getRequestParam")
    public String getRequestParam(@RequestParam String name) {
        return "name is " + name + "\n";
    }

    @GetMapping("/getRequestParams")
    public SearchVO getRequestParams(SearchVO searchVO) {
        return searchVO;
    }
}
