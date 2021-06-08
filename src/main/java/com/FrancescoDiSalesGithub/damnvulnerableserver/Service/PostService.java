package com.FrancescoDiSalesGithub.damnvulnerableserver.Service;

import com.FrancescoDiSalesGithub.damnvulnerableserver.Model.PostModel;
import com.FrancescoDiSalesGithub.damnvulnerableserver.Enum.InfoMessagesEnum;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class PostService
{

    @Value("${fuzzing.value}")
    private String secretValue;

    public String getHiddenValue(PostModel postModel)
    {
        if(postModel == null || postModel.getValue() == null)
            return InfoMessagesEnum.NullObject.getMessage();

        if(postModel.getValue().equals(secretValue))
            return InfoMessagesEnum.FoundValue.getMessage();

        return InfoMessagesEnum.NotFoundValue.getMessage();
    }

}
