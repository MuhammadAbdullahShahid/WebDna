package com.example.webDna.entity.entities.transaction;//package com.evantagesoft.conexus.entities.transaction;
//
//
//
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
//
//@Entity
//@Table(name = "vw_txnlog2")
//public class TransactionLogView {
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name = "id")
//	public Long id;
//	@Column(name = "STAN", columnDefinition = "varchar(6)")
//	public int sTAN;
//	@Column(name = "Channel_Name", columnDefinition = "varchar(3) NOT NULL")
//	public String channel_Name;
//	@Column(name = "Acq. Institution", columnDefinition = "varchar(11)")
//	public String acqInstitution;
//	@Column(name = "Card Account", columnDefinition = "char(0) NOT NULL")
//	public String cardAccount;
//	@Column(name = "Transaction Amount", columnDefinition = "double NOT NULL")
//	public int transactionAmount;
//	@Column(name = "Roundup Transaction", columnDefinition = "double")
//	public int roundupTransaction;
//	@Column(name = "Cashback", columnDefinition = "double NOT NULL")
//	public int cashback;
//	@Column(name = "WPL Gross Tariff", columnDefinition = "double NOT NULL")
//	public int wPLGrossTariff;
//	@Column(name = "Fee_From_1Link", columnDefinition = "double")
//	public double fee_From_1Link;
//	@Column(name = "1Link Fee", columnDefinition = "double")
//	public double _1LinkFee;
//	@Column(name = "Alliance Location", columnDefinition = "char(25)")
//	public String allianceLocation;
//	@Column(name = "Alliance ID", columnDefinition = "char(15)")
//	public String allianceID;
//	@Column(name = "Response Code", columnDefinition = "char(30)")
//	public String responseCode;
//	@Column(name = "Net Settlement to Alliance", columnDefinition = "double")
//	public String netSettlementToAlliance;
//	@Column(name = "Gross Revenue to WPL", columnDefinition = "double NOT NULL")
//	public double grossRevenueToWPL;
//	@Column(name = "FED_Region_ID", columnDefinition = "char(2)")
//	public String fED_Region_ID;
//	@Column(name = "Applicable Tax Rate", columnDefinition = "char(3) NOT NULL")
//	public String applicableTaxRate;
//	@Column(name = "FED (As Per Regional Tarriff)", columnDefinition = "char(61)")
//	public double fEDAsPerRegionalTarriff;
//	@Column(name = "Refunded to Customer", columnDefinition = "double NOT NULL")
//	public double refundedToCustomer;
//	@Column(name = "Net Revenue", columnDefinition = "double")
//	public String netRevenue;
//
//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}
//
//	public int getsTAN() {
//		return sTAN;
//	}
//
//	public void setsTAN(int sTAN) {
//		this.sTAN = sTAN;
//	}
//
//	public String getChannel_Name() {
//		return channel_Name;
//	}
//
//	public void setChannel_Name(String channel_Name) {
//		this.channel_Name = channel_Name;
//	}
//
//	public String getAcqInstitution() {
//		return acqInstitution;
//	}
//
//	public void setAcqInstitution(String acqInstitution) {
//		this.acqInstitution = acqInstitution;
//	}
//
//	public String getCardAccount() {
//		return cardAccount;
//	}
//
//	public void setCardAccount(String cardAccount) {
//		this.cardAccount = cardAccount;
//	}
//
//	public int getTransactionAmount() {
//		return transactionAmount;
//	}
//
//	public void setTransactionAmount(int transactionAmount) {
//		this.transactionAmount = transactionAmount;
//	}
//
//	public int getRoundupTransaction() {
//		return roundupTransaction;
//	}
//
//	public void setRoundupTransaction(int roundupTransaction) {
//		this.roundupTransaction = roundupTransaction;
//	}
//
//	public int getCashback() {
//		return cashback;
//	}
//
//	public void setCashback(int cashback) {
//		this.cashback = cashback;
//	}
//
//	public int getwPLGrossTariff() {
//		return wPLGrossTariff;
//	}
//
//	public void setwPLGrossTariff(int wPLGrossTariff) {
//		this.wPLGrossTariff = wPLGrossTariff;
//	}
//
//	public double getFee_From_1Link() {
//		return fee_From_1Link;
//	}
//
//	public void setFee_From_1Link(double fee_From_1Link) {
//		this.fee_From_1Link = fee_From_1Link;
//	}
//
//	public double get_1LinkFee() {
//		return _1LinkFee;
//	}
//
//	public void set_1LinkFee(double _1LinkFee) {
//		this._1LinkFee = _1LinkFee;
//	}
//
//	public String getAllianceLocation() {
//		return allianceLocation;
//	}
//
//	public void setAllianceLocation(String allianceLocation) {
//		this.allianceLocation = allianceLocation;
//	}
//
//	public String getAllianceID() {
//		return allianceID;
//	}
//
//	public void setAllianceID(String allianceID) {
//		this.allianceID = allianceID;
//	}
//
//	public String getResponseCode() {
//		return responseCode;
//	}
//
//	public void setResponseCode(String responseCode) {
//		this.responseCode = responseCode;
//	}
//
//	public String getNetSettlementToAlliance() {
//		return netSettlementToAlliance;
//	}
//
//	public void setNetSettlementToAlliance(String netSettlementToAlliance) {
//		this.netSettlementToAlliance = netSettlementToAlliance;
//	}
//
//	public double getGrossRevenueToWPL() {
//		return grossRevenueToWPL;
//	}
//
//	public void setGrossRevenueToWPL(double grossRevenueToWPL) {
//		this.grossRevenueToWPL = grossRevenueToWPL;
//	}
//
//	public String getfED_Region_ID() {
//		return fED_Region_ID;
//	}
//
//	public void setfED_Region_ID(String fED_Region_ID) {
//		this.fED_Region_ID = fED_Region_ID;
//	}
//
//	public String getApplicableTaxRate() {
//		return applicableTaxRate;
//	}
//
//	public void setApplicableTaxRate(String applicableTaxRate) {
//		this.applicableTaxRate = applicableTaxRate;
//	}
//
//	public double getfEDAsPerRegionalTarriff() {
//		return fEDAsPerRegionalTarriff;
//	}
//
//	public void setfEDAsPerRegionalTarriff(double fEDAsPerRegionalTarriff) {
//		this.fEDAsPerRegionalTarriff = fEDAsPerRegionalTarriff;
//	}
//
//	public double getRefundedToCustomer() {
//		return refundedToCustomer;
//	}
//
//	public void setRefundedToCustomer(double refundedToCustomer) {
//		this.refundedToCustomer = refundedToCustomer;
//	}
//
//	public String getNetRevenue() {
//		return netRevenue;
//	}
//
//	public void setNetRevenue(String netRevenue) {
//		this.netRevenue = netRevenue;
//	}
//
//}
