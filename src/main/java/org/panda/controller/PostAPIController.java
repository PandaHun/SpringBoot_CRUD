package org.panda.controller;

import org.panda.model.SearchVO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PostAPIController {

    //http 통신 때, Post는 body에 데이터를 넣는다
    @RequestMapping(method = RequestMethod.POST, path = "/postRequest")
    public SearchVO postRequset(@RequestBody SearchVO searchVO) {
        return searchVO;
    }

    @PostMapping(value = "/postMapping")
    public SearchVO postMapping(@RequestBody SearchVO searchVO) {
        return searchVO;
    }
}
