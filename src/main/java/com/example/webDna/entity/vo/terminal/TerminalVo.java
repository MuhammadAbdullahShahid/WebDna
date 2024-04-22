package com.example.webDna.entity.vo.terminal;

import com.example.webDna.entity.entities.agency.Agency;
import com.example.webDna.entity.entities.channel.Channel;
import com.example.webDna.entity.entities.city.City;
import com.example.webDna.entity.entities.industry.Industry;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.util.Date;

@Data
public class TerminalVo {


    private Long id;
    private Channel channel;
    private Agency acquiredBy;
    private  String legalBusinessName;
    private String brandName;
    private String ownerName;
    private String ownerContact;
    private String ownerEmail;
    private String businessStatus;
    private String businessEmail;
    private String businessType;
    private String marketScope;
    private String businessAddress1;
    private String businessAddress2;
    private City businessAddress3;
    private Double noOfOutlets;
    private Date businessStartDate;
    private Double ntnNo;
    private String businessContactPerson;
    private String contact;
    private String email;
    private String designation;
    private Industry businessIndustry;
    private Double noOfCheckouts;
    private Double noOfAvailablePos;
    private  Double perDayCardTransaction;
    private Double perDayCardVolume;
    private Double averageTransactionSizeOnCard;
    private Double noOfCtmsRequired;
    private Double expectedDailyTransactions;
    private String bankName;
    private  String ibanAccountNumber;
    private String accountTitle;
    private  String bankImd;
    private String bestAvailableInternetService;
    private String availableInternetServices;
    private  String docsSubmitted;
    private Date dateOfEmployment;
    private Double securityDeposit;
    private String posSerial;
    private Date posStartDate;
    private Double tid;
    private Double rbsChannelCode;
    private Double rbsMerchantCategoryCode;
    private Double rbsSequentialCode;
    private Double machineId;
    private Double merchantId;
    private Double taxZone;
    private String status;
    private Date statusDate;
    private Double movementReference;
    private Double chargesSchema;
    private Double applicableChargeValue;
    private Double chargesFloor;
    private String dailySettlementVoucher;

}
