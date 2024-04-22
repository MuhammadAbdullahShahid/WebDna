package com.example.webDna.entity.entities.terminal;


import com.example.webDna.entity.entities.agency.Agency;
import com.example.webDna.entity.entities.channel.Channel;
import com.example.webDna.entity.entities.city.City;
import com.example.webDna.entity.entities.industry.Industry;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name="terminal")
public class Terminal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn (name = "channel",referencedColumnName = "id")
    private Channel channel;

    @ManyToOne
    @JoinColumn(name = "AcquiredBy",referencedColumnName = "id")
    private Agency acquiredBy;

    @Column(name = "LegalBusinessName")
    private  String legalBusinessName;

    @Column(name = "brandName")
    private String brandName;

    @Column(name = "ownerName")
    private String ownerName;

    @Column(name = "ownerContact")
    private String ownerContact;

    @Column(name = "ownerEmail")
    private String ownerEmail;

    @Column(name = "businessStaus")
    private String businessStatus;

    @Column(name = "businessEmail")
    private String businessEmail;

    @Column(name = "businessType")
    private String businessType;

    @Column(name = "marketScope")
    private String marketScope;

    @Column(name = "businessAddress1")
    private String businessAddress1;

    @Column(name = "businessAddress2")
    private String businessAddress2;

    @ManyToOne
    @JoinColumn(name = "businessAddress3",referencedColumnName = "id")
    private City businessAddress3;

    @Column(name = "No_Of_Outlets")
    private Double noOfOutlets;

    @Column(name = "businessStartDate")
    private Date businessStartDate;

    @Column(name = "NTN_NO")
    private Double ntnNo;

    @Column(name = "businessContactPerson")
    private String businessContactPerson;

    @Column(name = "Contact")
    private String contact;

    @Column(name = "email")
    private String email;

    @Column(name = "designation")
    private String designation;

   @ManyToOne
    @JoinColumn (name = "businessIndustry",referencedColumnName = "id")
    private Industry businessIndustry;

    @Column(name = "No_Of_Checkouts")
    private Double noOfCheckouts;

    @Column(name = "No_Of_Available_Pos")
    private Double noOfAvailablePos;

    @Column(name = "PerDayCardTransaction")
    private  Double perDayCardTransaction;

    @Column(name = "PerDayCardVolume")
    private Double perDayCardVolume;

    @Column(name = "AverageTransactionSizeOnCard")
    private Double averageTransactionSizeOnCard;

    @Column(name = "No_of_CTMS_Required")
    private Double noOfCtmsRequired;

    @Column(name = "expectedDailyTransactions")
    private Double expectedDailyTransactions;

    @Column(name = "bankName")
    private String bankName;

    @Column(name = "IbanAccountNumber")
    private  String ibanAccountNumber;

    @Column(name = "accountTitle")
    private String accountTitle;

    @Column(name = "bankIMD")
    private  String bankImd;

    @Column(name = "best_Available_Internet_Service")
    private String bestAvailableInternetService;

    @Column(name = "availableInternetServices")
    private String availableInternetServices;

    @Column(name = "docsSubmitted")
    private  String docsSubmitted;

    @Column(name = "dateOfEmployment")
    private Date dateOfEmployment;

    @Column(name = "securityDeposit")
    private Double securityDeposit;

    @Column(name = "POS_Serial")
    private String posSerial;

    @Column(name = "POS_StartDate")
    private Date posStartDate;

    @Column(name = "TID")
    private Double tid;

    @Column(name = "RBS_ChannelCode")
    private Double rbsChannelCode;

    @Column(name = "RBS_MerchantCategoryCode")
    private Double rbsMerchantCategoryCode;

    @Column(name = "RBS_SequentialCode")
    private Double rbsSequentialCode;

    @Column(name = "machineId")
    private Double machineId;

    @Column(name = "merchantId")
    private Double merchantId;

    @Column(name = "taxZone")
    private Double taxZone;

    @Column(name = "status")
    private String status;

    @Column(name = "statusDate")
    private Date statusDate;

    @Column(name = "movementReference")
    private Double movementReference;

    @Column(name ="chargesSchema")
    private Double chargesSchema;

    @Column(name = "applicableChargeValue")
    private Double applicableChargeValue;

    @Column(name = "chargesFloor")
    private Double chargesFloor;

    @Column(name = "dailySettlementVoucher")
    private String dailySettlementVoucher;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Channel getChannel() {
        return channel;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    public Agency getAcquiredBy() {
        return acquiredBy;
    }

    public void setAcquiredBy(Agency acquiredBy) {
        this.acquiredBy = acquiredBy;
    }

    public String getLegalBusinessName() {
        return legalBusinessName;
    }

    public void setLegalBusinessName(String legalBusinessName) {
        this.legalBusinessName = legalBusinessName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerContact() {
        return ownerContact;
    }

    public void setOwnerContact(String ownerContact) {
        this.ownerContact = ownerContact;
    }

    public String getOwnerEmail() {
        return ownerEmail;
    }

    public void setOwnerEmail(String ownerEmail) {
        this.ownerEmail = ownerEmail;
    }

    public String getBusinessStatus() {
        return businessStatus;
    }

    public void setBusinessStatus(String businessStatus) {
        this.businessStatus = businessStatus;
    }

    public String getBusinessEmail() {
        return businessEmail;
    }

    public void setBusinessEmail(String businessEmail) {
        this.businessEmail = businessEmail;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public String getMarketScope() {
        return marketScope;
    }

    public void setMarketScope(String marketScope) {
        this.marketScope = marketScope;
    }

    public String getBusinessAddress1() {
        return businessAddress1;
    }

    public void setBusinessAddress1(String businessAddress1) {
        this.businessAddress1 = businessAddress1;
    }

    public String getBusinessAddress2() {
        return businessAddress2;
    }

    public void setBusinessAddress2(String businessAddress2) {
        this.businessAddress2 = businessAddress2;
    }

    public City getBusinessAddress3() {
        return businessAddress3;
    }

    public void setBusinessAddress3(City businessAddress3) {
        this.businessAddress3 = businessAddress3;
    }

    public Double getNoOfOutlets() {
        return noOfOutlets;
    }

    public void setNoOfOutlets(Double noOfOutlets) {
        this.noOfOutlets = noOfOutlets;
    }

    public Date getBusinessStartDate() {
        return businessStartDate;
    }

    public void setBusinessStartDate(Date businessStartDate) {
        this.businessStartDate = businessStartDate;
    }

    public Double getNtnNo() {
        return ntnNo;
    }

    public void setNtnNo(Double ntnNo) {
        this.ntnNo = ntnNo;
    }

    public String getBusinessContactPerson() {
        return businessContactPerson;
    }

    public void setBusinessContactPerson(String businessContactPerson) {
        this.businessContactPerson = businessContactPerson;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Industry getBusinessIndustry() {
        return businessIndustry;
    }

    public void setBusinessIndustry(Industry businessIndustry) {
        this.businessIndustry = businessIndustry;
    }

    public Double getNoOfCheckouts() {
        return noOfCheckouts;
    }

    public void setNoOfCheckouts(Double noOfCheckouts) {
        this.noOfCheckouts = noOfCheckouts;
    }

    public Double getNoOfAvailablePos() {
        return noOfAvailablePos;
    }

    public void setNoOfAvailablePos(Double noOfAvailablePos) {
        this.noOfAvailablePos = noOfAvailablePos;
    }

    public Double getPerDayCardTransaction() {
        return perDayCardTransaction;
    }

    public void setPerDayCardTransaction(Double perDayCardTransaction) {
        this.perDayCardTransaction = perDayCardTransaction;
    }

    public Double getPerDayCardVolume() {
        return perDayCardVolume;
    }

    public void setPerDayCardVolume(Double perDayCardVolume) {
        this.perDayCardVolume = perDayCardVolume;
    }

    public Double getAverageTransactionSizeOnCard() {
        return averageTransactionSizeOnCard;
    }

    public void setAverageTransactionSizeOnCard(Double averageTransactionSizeOnCard) {
        this.averageTransactionSizeOnCard = averageTransactionSizeOnCard;
    }

    public Double getNoOfCtmsRequired() {
        return noOfCtmsRequired;
    }

    public void setNoOfCtmsRequired(Double noOfCtmsRequired) {
        this.noOfCtmsRequired = noOfCtmsRequired;
    }

    public Double getExpectedDailyTransactions() {
        return expectedDailyTransactions;
    }

    public void setExpectedDailyTransactions(Double expectedDailyTransactions) {
        this.expectedDailyTransactions = expectedDailyTransactions;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getIbanAccountNumber() {
        return ibanAccountNumber;
    }

    public void setIbanAccountNumber(String ibanAccountNumber) {
        this.ibanAccountNumber = ibanAccountNumber;
    }

    public String getAccountTitle() {
        return accountTitle;
    }

    public void setAccountTitle(String accountTitle) {
        this.accountTitle = accountTitle;
    }

    public String getBankImd() {
        return bankImd;
    }

    public void setBankImd(String bankImd) {
        this.bankImd = bankImd;
    }

    public String getBestAvailableInternetService() {
        return bestAvailableInternetService;
    }

    public void setBestAvailableInternetService(String bestAvailableInternetService) {
        this.bestAvailableInternetService = bestAvailableInternetService;
    }

    public String getAvailableInternetServices() {
        return availableInternetServices;
    }

    public void setAvailableInternetServices(String availableInternetServices) {
        this.availableInternetServices = availableInternetServices;
    }

    public String getDocsSubmitted() {
        return docsSubmitted;
    }

    public void setDocsSubmitted(String docsSubmitted) {
        this.docsSubmitted = docsSubmitted;
    }

    public Date getDateOfEmployment() {
        return dateOfEmployment;
    }

    public void setDateOfEmployment(Date dateOfEmployment) {
        this.dateOfEmployment = dateOfEmployment;
    }

    public Double getSecurityDeposit() {
        return securityDeposit;
    }

    public void setSecurityDeposit(Double securityDeposit) {
        this.securityDeposit = securityDeposit;
    }

    public String getPosSerial() {
        return posSerial;
    }

    public void setPosSerial(String posSerial) {
        this.posSerial = posSerial;
    }

    public Date getPosStartDate() {
        return posStartDate;
    }

    public void setPosStartDate(Date posStartDate) {
        this.posStartDate = posStartDate;
    }

    public Double getTid() {
        return tid;
    }

    public void setTid(Double tid) {
        this.tid = tid;
    }

    public Double getRbsChannelCode() {
        return rbsChannelCode;
    }

    public void setRbsChannelCode(Double rbsChannelCode) {
        this.rbsChannelCode = rbsChannelCode;
    }

    public Double getRbsMerchantCategoryCode() {
        return rbsMerchantCategoryCode;
    }

    public void setRbsMerchantCategoryCode(Double rbsMerchantCategoryCode) {
        this.rbsMerchantCategoryCode = rbsMerchantCategoryCode;
    }

    public Double getRbsSequentialCode() {
        return rbsSequentialCode;
    }

    public void setRbsSequentialCode(Double rbsSequentialCode) {
        this.rbsSequentialCode = rbsSequentialCode;
    }

    public Double getMachineId() {
        return machineId;
    }

    public void setMachineId(Double machineId) {
        this.machineId = machineId;
    }

    public Double getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(Double merchantId) {
        this.merchantId = merchantId;
    }

    public Double getTaxZone() {
        return taxZone;
    }

    public void setTaxZone(Double taxZone) {
        this.taxZone = taxZone;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getStatusDate() {
        return statusDate;
    }

    public void setStatusDate(Date statusDate) {
        this.statusDate = statusDate;
    }

    public Double getMovementReference() {
        return movementReference;
    }

    public void setMovementReference(Double movementReference) {
        this.movementReference = movementReference;
    }

    public Double getChargesSchema() {
        return chargesSchema;
    }

    public void setChargesSchema(Double chargesSchema) {
        this.chargesSchema = chargesSchema;
    }

    public Double getApplicableChargeValue() {
        return applicableChargeValue;
    }

    public void setApplicableChargeValue(Double applicableChargeValue) {
        this.applicableChargeValue = applicableChargeValue;
    }

    public Double getChargesFloor() {
        return chargesFloor;
    }

    public void setChargesFloor(Double chargesFloor) {
        this.chargesFloor = chargesFloor;
    }

    public String getDailySettlementVoucher() {
        return dailySettlementVoucher;
    }

    public void setDailySettlementVoucher(String dailySettlementVoucher) {
        this.dailySettlementVoucher = dailySettlementVoucher;
    }
}
