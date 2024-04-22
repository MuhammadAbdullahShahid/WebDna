package com.example.webDna.util.response;

public enum ResponseEnum {

    INVALID_BODY("ERROR_0", "Invalid Body"),
    SUCCESS("SUCCESS_00", "Success"),
    INVALID_REQUEST_PARAMETER("ERROR_01", "Invalid request parameter"),
    INVALID_EMAIL("ERROR_01", "Invalid Email"),
    INVALID_CREDENTIALS("ERROR_01", "Invalid login credentials"),
    USER_NOT_FOUND("ERROR_04", "User not found"),
    DATA_NOT_FOUND("ERROR_05", "Data not found"),
    EMAIL_IS_EMPTY("ERROR_06", "Email is empty"),
    FIRST_NAME_EMPTY("ERROR_07", "First Name is empty"),
    USER_ROLE_VO_EMPTY("ERROR_08", "User Role Vo Empty is empty"),
    EMAIL_ALREADY_EXIST("ERROR_09", "Email already exist"),
    PHONE_ALREADY_EXIST("ERROR_09", "phone already exist"),
    INVALID_REQUEST("ERROR_97", "Invalid request"),
    BANKID_REQUIRED("ERROR_10", "BankId Required"),
    COUNTRYID_REQUIRED("ERROR_11", "CountryId Required"),
    INTEGRATIONID_REQUIRED("ERROR_12", "IntegrationId Required"),
    CURRENCYID_REQUIRED("ERROR_13","CurrencyID Required"),
    CUSTOMERTYPE_REQUIRED("ERROR_13","CUSTOMERTYPE Required"),
    DOCUMENTID_REQUIRED("ERROR_13","DocumentID Required"),
    BASECURRENCY_REQUIRED("ERROR_13","BaseCurrency Required"),
    EXCHANGECURRENCY_REQUIRED("ERROR_13"," ExchangeCurrency Required"),
    UNKNOWN_ERROR("ERROR_98", "Unknown error"),
    SYSTEM_ERROR("ERROR_99", "System error, Possible data inconsistency");


    private final String code;
    private final String message;

    ResponseEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

}
