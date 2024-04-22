package com.example.webDna.entity.vo.customerTypes;

import com.example.webDna.entity.vo.Status.StatusVo;
import com.example.webDna.entity.vo.userVo.UserVo;

public class CustomerTypesVo {

    private Long id;
    private String shortName;
    private String description;
    private String isActive;
    private String type;
    private String code;
    private StatusVo status;
    private String createDate;
    private UserVo createBy;
    private String updateDate;
    private UserVo updateBy;


    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public StatusVo getStatus() {
        return status;
    }
    public void setStatus(StatusVo status) {
        this.status = status;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getShortName() {
        return shortName;
    }
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getIsActive() {
        return isActive;
    }
    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }
    public String getCreateDate() {
        return createDate;
    }
    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }
    public UserVo getCreateBy() {
        return createBy;
    }
    public void setCreateBy(UserVo createBy) {
        this.createBy = createBy;
    }
    public String getUpdateDate() {
        return updateDate;
    }
    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }
    public UserVo getUpdateBy() {
        return updateBy;
    }
    public void setUpdateBy(UserVo updateBy) {
        this.updateBy = updateBy;
    }


//    public static CustomerTypesVo getCustomerTypes(CustomerTypes customerTypes) {
//
//        CustomerTypesVo customerTypesVo = null;
//        if (customerTypes != null) {
//            customerTypesVo = new CustomerTypesVo();
//            customerTypesVo.setDescription(customerTypes.getDescription());
//            customerTypesVo.setId(customerTypes.getId());
//            customerTypesVo.setIsActive(customerTypes.getIsActive());
//            customerTypesVo.setShortName(customerTypes.getShortName());
//            customerTypesVo.setCode(customerTypes.getCode());
//            customerTypesVo.setType(customerTypes.getType());
//            customerTypesVo.setStatus(StatusVo.getStatusVo(customerTypes.getStatus()));
//            customerTypesVo.setUpdateDate(DateUtil.dateToStr(customerTypes.getUpdateDate(), "dd-MM-yyyy"));
//            customerTypesVo.setCreateDate(DateUtil.dateToStr(customerTypes.getCreateDate(), "dd-MM-yyyy"));
//            customerTypesVo.setUpdateBy(UserVo.getUser(customerTypes.getUpdateBy()));
//            customerTypesVo.setCreateBy(UserVo.getUser(customerTypes.getCreateBy()));
//
//
//        }
//        return customerTypesVo;
//    }
//
//
//    public static CustomerTypes setCustomerTypes(CustomerTypesVo customerTypesVo) {
//
//        CustomerTypes customerTypes = null;
//        if (customerTypesVo != null) {
//            customerTypes = new CustomerTypes();
//
//
//            customerTypes.setDescription(customerTypesVo.getDescription());
//            customerTypes.setId(customerTypesVo.getId());
//            customerTypes.setIsActive(customerTypesVo.getIsActive());
//            customerTypes.setShortName(customerTypesVo.getShortName());
//            customerTypes.setCode(customerTypesVo.getCode());
//            customerTypes.setType(customerTypesVo.getType());
//            customerTypes.setStatus(StatusVo.setStatus(customerTypesVo.getStatus()));
//            if(customerTypesVo.getId() != null) {
//                customerTypes.setCreateDate(DateUtil.getDate(customerTypesVo.getCreateDate(), "dd-MM-yyyy"));
//                customerTypes.setUpdateDate(new Date());
//                customerTypes.setUpdateBy(UserVo.getUser(customerTypesVo.getUpdateBy()));
//                customerTypes.setUpdateBy(UserVo.class.);
//            }else {
//                customerTypes.setCreateDate(new Date());
//                customerTypes.setCreateBy(UserVo.getUser(customerTypesVo.getCreateBy()));
//            }
//
//
//        }
//        return customerTypes;
//    }
}
