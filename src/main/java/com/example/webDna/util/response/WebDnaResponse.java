package com.example.webDna.util.response;

public enum WebDnaResponse {

    SUCCESS("SUCCESS_00", "Success."),

    FAILED("Failed_01", "Failed."),
    PASSWORD_CHANGED("SUCCESS_00","Password Successfully Changed."),
    USER_CREATED("SUCCESS_00","User Created."),
    BUSINESS_CREATED("SUCCESS_00","Business Created."),
    INVALID_REQUEST_PARAMETER("ERROR_01", "Invalid Request Parameter."),
    REQUIRED_PASSWORD("ERROR_02", "Required Password."),
    REQUIRED_CONFIRM_PASSWORD("ERROR_03", "Required Confirm Password."),
    INVALID_EMAIL("ERROR_04", "Invalid Email."),

    INVALID_WSO2ID("ERROR_05", "Invalid WSO2ID."),
    INVALID_CONTACT("ERROR_06", "Invalid Contact Number."),
    INVALID_ID("ERROR_07", "Invalid ID."),
    INVALID_OTP("ERROR_08", "Invalid OTP."),
    EXPIRED_OTP("ERROR_09", "Expired OTP."),
    VERIFY_OTP("ERROR_10", "Verify Your OTP."),
    INVALID_CREDENTIALS("ERROR_11", "Invalid Login Credentials."),
    INVALID_PASSWORD("ERROR_12", "Invalid Password, Must have at least one numeric character. ," +
            "Must have at least one lowercase character. , " +
            "Must have at least one uppercase character. , " +
            "Must have at least one special symbol among @#$% , " +
            "Password length should be between 8 and 20."),

    USER_NOT_EXIST("ERROR_13", "User Not Exist."),
    BUSINESS_NOT_EXIST("ERROR_13", "Business Not Exist."),
    DATA_NOT_EXIST("ERROR_14", "Data Not Exist."),
    REQUIRED_ADDRESS("ERROR_15", "Required Address."),

    DOCUMENT("ERROR_19", "Customer Document is Empty."),
    REQUIRED_EMAIL("ERROR_20", "Required Email."),
    REQUIRED_CONTACT_NUMBER("ERROR_21", "Required Contact Number."),
    EMAIL_EXIST("ERROR_22", "Email is Already Exist."),
    USER_EMAIL_EXIST("ERROR_23", "Email is Already Exist in User Account."+
            "Use Your Another Email."),
    BUSINESS_EMAIL_EXIST("ERROR_23", "Email is Already Exist in Business Account."+
            "Use Your Another Email."),
    INVALID_STATUS("ERROR_24","Invalid Status."),
    INVALID_BUSINESS_ID("ERROR_25", "Invalid Business."),
    INVALID_API_KEY("ERROR_26", "Invalid Api Key."),
    USER_NOT_CREATED("ERROR_27", "User Not Create."),
    BUSINESS_NOT_CREATED("ERROR_27", "Business Not Create."),
    VERIFICATION_FAILED("ERROR_28", "Verification Failed."),
    INVALID_REQUEST("ERROR_29", "Invalid Request."),
    MATCH_PASSWORD_CONFIRM_PASSWORD("ERROR_30", "Your Required Password and Confirm Password Does Not Match." ),
    REQUIRED_BUSINESS_NAME("ERROR_31", "Required Entity Name."),
    REQUIRED_FIRST_NAME("ERROR_32", "Required First Name."),
    REQUIRED_LAST_NAME("ERROR_33", "Required Last Name."),
    REQUIRED_LEGAL_BUSINESS_NAME("ERROR_34", "Required Legal Entity Name."),
    REQUIRED_WEBSITE("ERROR_35", "Required Website."),
    REQUIRED_NATURE_OF_BUSINESS("ERROR_36", "Required Nature of Business."),
    REQUIRED_TAX_ID("ERROR_37", "Required TAX ID."),
    REQUIRED_NUMBER_OF_EMPLOYEES("ERROR_38", "Required Number Of Employees."),
    REQUIRED_ORGANIZATION_DOCUMENT("ERROR_39", "Required Organization Documents."),
    REQUIRED_ADDRESS_DOCUMENT("ERROR_40", "Required Address Document."),
    REQUIRED_DATE_OF_BIRTH("ERROR_41", "Required Date of Birth."),
    REQUIRED_DOCUMENT_TYPE("ERROR_42", "Required Document Type."),
    REQUIRED_ID_NUMBER("ERROR_43", "Required ID Card Number."),
    REQUIRED_ID_DOCUMENT("ERROR_44", "Required ID Card."),
    REQUIRED_OWNERSHIP_ID("ERROR_45", "Required Ownership ID."),
    REQUIRED_JOB_TITLE("ERROR_46", "Required Job Title."),
    REQUIRED_ZIP_CODE("ERROR_47", "Required Zip Code."),
    REQUIRED_STREET_ADDRESS("ERROR_48", "Required Street Address."),
    REQUIRED_COUNTRY("ERROR_49","Required Country."),
    REQUIRED_STATE("ERROR_50","Required Country."),
    DOCUMENT_VERIFIED("ERROR_51", "Documents Not Verified."),
    EXIST_BUSINESS_NAME("ERROR_52", "Business Name is Already Registered."),
    EXIST_LEGAL_BUSINESS_NAME("ERROR_53", "Legal Business Name is Already Registered."),
    NOT_CREATED("ERROR_54", "Not Created."),
    CONTACT_EXIST("ERROR_55", "Mobile Number Already Exist"),
    PASSWORD_EMPTY("ERROR_56", "Password is Empty"),
    EMAIL_IS_EMPTY("ERROR_57", "Email is Empty"),
    CONTACT_IS_EMPTY("ERROR_58", "Contact is Empty"),
    PIN_NOT_MATCH("ERROR_59", "Password and Confirm Password are not same."),
    DATEOFBIRTH_NOT_EXIST("ERROR_59", "Date of Birth Not Exist."),
    MIDDLENAME_NOT_EXIST("ERROR_60", "Middle Name Not Exist."),
    FIRSTNAME_NOT_EXIST("ERROR_61", "First Name Not Exist."),
    AGE_VALIDATION("ERROR_62", "Age Must be above 16"),
    INVALIDMESSAGE_OTP("ERROR_63", "Not sent OTP message"),
    FIRSTNAME_EXIST("ERROR_65", "First Name is already exist"),
    INVALID_NUMBER("ERROR_68", "Invalid phone number"),
    RESEND_OTP("ERROR_69", "Please resend otp"),
    TEMP_ACTOR_SIGNUP("ERROR_70","Please enter valid input for registration"),
    INVALID_USERNAME("ERROR_71", "Invalid user"),
    INVALID_FIRSTNAME("ERROR_73", "Please enter valid firstname"),
    INVALID_LASTNAME("ERROR_73", "Please enter valid lastname"),
    INVALID_PIN("ERROR_73", "Please enter valid pin"),
    REQUIRED_POSTAL_CODE("ERROR_74","Required postal code."),
    REQUIRED_POSTAL_TOWN("ERROR_75","Required postal town."),
    MODULAR_PAYMENT_ERROR("ERROR_76","Modular Payment Not Proceed."),
    INSUFFICIENT_PAYMENT_ERROR("ERROR_77","Insufficient Amount."),
    INTERNAL_SERVER_ERROR("ERROR_98", "internal server error"),
    BENEFICIARY_NOT_CREATED("ERROR_301", "Beneficiary not created please try again"),
    CARD_DETAIL_NOT_CREATED("ERROR_302", "Card detail is not valid please try again"),
    ACCOUNT_DETAIL_NOT_CREATED("ERROR_303", "Account detail is not valid please try again"),
    ACCOUNT_STATUS_NOT_UPDATED("ERROR_304", "Account Status is Not Update"),
    WAIT("ERROR_302", "Some thing wrong in process Please re-try"),
    CITY_IS_EMPTY("ERROR_57", "City should not Empty"),
    NATIONALITY_IS_EMPTY("ERROR_57", "Nationality should not Empty"),
    SOURCE_ACCOUNT_NOT_EXIST("ERROR_303", "Source account detail is not valid please try again"),
    DESTINATION_ACCOUNT_NOT_EXIST("ERROR_303", "Destination account detail is not valid please try again"),
    BUSINESS_NAME_REQUIRED("ERROR_77","Business Name Required"),
    BUSINESS_REGISTRATION_NUMBER_REQUIRED("ERROR_77","Business Registration Number Required"),
    BUSINESS_REGISTRATION_DATE_REQUIRED("ERROR_77","Business Registration Date Required"),
    BUSINESS_TAX_NUMBER_REQUIRED("ERROR_77","Business Tax Number Required"),
    BUSINESS_ADDRESS_REQUIRED("ERROR_77","Business Address Required"),
    BUSINESS_CITY_REQUIRED("ERROR_77","Business City Required"),
    BUSINESS_POSTCODE_REQUIRED("ERROR_77","Business Post Code Required"),
    BUSINESS_COUNTRY_REQUIRED("ERROR_77","Business Country Required"),
    BUSINESS_INDUSTRY_TYPE_REQUIRED("ERROR_77","Business Industry Type Required"),
    BUSINESS_REGISTRATION_TYPE_REQUIRED("ERROR_77","Business Registration Type Required"),
    BUSINESS_DETAILS_EMPTY("ERROR_77","Business Details is Empty"),
    BUSINESS_PARTNERS_DETAILS_EMPTY("ERROR_77","Business Details is Empty"),
    SYSTEM_ERROR("ERROR_99", "System Error."),
    BAD_REQUEST("ERROR_100", "Bad Request"),


    //DayTona
    REQUIRED_PAYOUT_TYPE("ERROR_200", "Required PayoutType."),
    REQUIRED_REFERENCE_NO("ERROR_200", "Required ReferenceNo."),
    REQUIRED_FOREIGN_CURRENCY("ERROR_201", "Required Foreign Currency."),
    REQUIRED_FOREIGN_AMOUNT("ERROR_203", "Required Foreign Amount."),
    REQUIRED_BENEFICIARY_FIRST_NAME("ERROR_205", "Required Beneficiary FirstName."),
    REQUIRED_BRANCH_CODE("ERROR_211", "Required Branch Code."),
    REQUIRED_SENDER_FIRST_NAME("ERROR_214", "Required Sender First Name."),
    REQUIRED_SENDER_LAST_NAME("ERROR_215", "Required Sender Last Name."),
    REQUIRED_SENDER_MSISDN("ERROR_216", "Required Sender MSISDN."),
    REQUIRED_SENDER_ADDRESS("ERROR_217", "Required Sender Address."),
    REQUIRED_SENDER_ADDRESS_STREET("ERROR_218", "Required Sender Address Street."),
    REQUIRED_SENDER_COUNTRY_CODE("ERROR_219", "Required Sender Country Code."),
    REQUIRED_SENDER_ADDRESS_CITY("ERROR_220", "Required Sender Address City."),
    REQUIRED_SENDER_NATIONALITY_COUNTRY_ISO_CODE("ERROR_221", "Required Sender Nationality Country ISO Code."),
    REQUIRED_SENDER_ADDRESS_COUNTRY("ERROR_222", "Required Sender Address Country."),
    REQUIRED_SENDER_CURRENCY("ERROR_223", "Required Sender Currency."),
    REQUIRED_SENDER_COUNTRY("ERROR_224", "Required Sender Country."),
    REQUIRED_SENDER_CITY("ERROR_225", "Required Sender City."),
    REQUIRED_SENDER_ADDRESS_ZIP("ERROR_226", "Required Sender Address ZIP."),
    REQUIRED_SENDER_GENDER("ERROR_227", "Required Sender Gender."),
    REQUIRED_SENDER_PROVINCES_STATE("ERROR_228", "Required Sender Province State"),
    REQUIRED_SUBURB("ERROR_229", "Required Suburb."),
    REQUIRED_STREET_NO("ERROR_230", "Required Street No."),
    REQUIRED_BUILDING_NO("ERROR_231", "Required Building No."),
    REQUIRED_SENDER_ID_COUNTRY_ISO_CODE("ERROR_232", "Required Sender Id Country ISO Code."),
    REQUIRED_SENDER_ID("ERROR_234", "Required Sender Id."),
    REQUIRED_CUSTOMER_DATE_OF_BIRTH("ERROR_235", "Required Customer Date Of Birth."),
    REQUIRED_CUSTOMER_ID_EXPIRY_DATE("ERROR_236", "Required Customer Id Expiry Date."),
    REQUIRED_CUSTOMER_NATIONALITY_CODE("ERROR_236", "Required Customer Nationality Code."),
    REQUIRED_CUSTOMER_ID_ISSUE_DATE("ERROR_237", "Required Customer Id Issue Date."),
    REQUIRED_CUSTOMER_ID_TYPE("ERROR_238", "Required Customer ID Type."),
    REQUIRED_CUSTOMER_ADDRESS_CITY("ERROR_239", "Required Customer Address City."),
    REQUIRED_CUSTOMER_ID_ISSUED_AT("ERROR_240", "Required Customer  Customer Id Issued At."),
    REQUIRED_CUSTOMER_ADDRESS_COUNTRY_CODE("ERROR_241", "Required Address Country Code."),
    REQUIRED_ID_TYPE("ERROR_242", "Required Customer Address Id Type."),
    REQUIRED_PAYOUT_COUNTRY("ERROR_243", "Payout Country."),
    REQUIRED_BRANCH_NAME("ERROR_244", "Required Branch Name."),
    REQUIRED_ACCOUNT_TITLE("ERROR_245", "Required Account Ttile."),
    REQUIRED_ROUTING_CODE("ERROR_246", "Required Routing Code."),
    REQUIRED_BANK_ROUTE("ERROR_247", "Required Bank Route."),
    INVALID_BENEFICIARY("ERROR_247", "Invalid Beneficiary."),
    BENEFICIARY_NATIONALITY_COUNTRY_ISO_CODE("ERROR_247", "Required Bank Route."),
    PIN_NOTMATCH("ERROR_59", "PIN and Confirm PIN are not same."),
    PIN_CODE("ERROR_59", "Pincode must be 6 digits"),

    REQUIRED_USER_ID("ERROR_248", "Required User Id."),
    INVALID_CURRENT_PASSWORD("ERROR_249","Invalid Current Password"),
    FIRST_NAME_EMPTY("ERROR_250", "First Name Empty."),
    EMAIL_ALREADY_EXIST("ERROR_251", "Email Already Exist.");


    private final String code;
    private final String message;

    WebDnaResponse(String code, String message) {
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