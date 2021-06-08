package com.FrancescoDiSalesGithub.damnvulnerableserver.Service;

import org.springframework.beans.factory.annotation.Value;
import com.FrancescoDiSalesGithub.damnvulnerableserver.Enum.InfoMessagesEnum;
import org.springframework.stereotype.Service;

@Service
public class GetService
{

    @Value("${fuzzing.value}")
    private String secretValue;

    public String getHiddenValue(String value)
    {

        if(value == null)
            return InfoMessagesEnum.NullValue.getMessage();

        if(value.equals(secretValue))
            return InfoMessagesEnum.FoundValue.getMessage();

        return InfoMessagesEnum.NotFoundValue.getMessage();
    }



}
