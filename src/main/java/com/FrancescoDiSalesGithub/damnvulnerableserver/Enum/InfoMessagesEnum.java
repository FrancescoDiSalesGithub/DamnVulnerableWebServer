package com.FrancescoDiSalesGithub.damnvulnerableserver.Enum;

public enum InfoMessagesEnum
{
    NullValue("please insert a value"),
    NotFoundValue("value not found... try harder"),
    FoundValue("value found congratulations"),
    NullObject("request not valid");


    private String message;

    public String getMessage()
    {
        return message;
    }

    private InfoMessagesEnum(String message)
    {
        this.message=message;
    }
}
