package com.FrancescoDiSalesGithub.damnvulnerableserver.Controller;

import com.FrancescoDiSalesGithub.damnvulnerableserver.Model.PostModel;
import com.FrancescoDiSalesGithub.damnvulnerableserver.Service.GetService;
import com.FrancescoDiSalesGithub.damnvulnerableserver.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

@RestController
public class ValueFuzzingController
{

    @Autowired
    private PostService postService;

    @Autowired
    private GetService getService;

    @GetMapping("/{value]")
    public String getHiddenValuePath(@PathVariable String value)
    {

        return getService.getHiddenValue(value);

    }

    @GetMapping("/")
    public String getHiddenValueVariable(@RequestParam String value)
    {
        return getService.getHiddenValue(value);
    }

    @PostMapping("/")
    public String getHiddenValuePost(@RequestBody PostModel postModel)
    {
        return postService.getHiddenValue(postModel);
    }




}
