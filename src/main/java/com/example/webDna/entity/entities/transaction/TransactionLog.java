package com.example.webDna.entity.entities.transaction;


import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;

@Data
@Entity
@Table(name = "transaction_log")
public class TransactionLog {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	// ISO Message Fields
	@Column(length = 4)
	private String messageTypeIndicator;
	@Column(length = 19)
	private String primaryAccountNumber;
	@Column(length = 6)
	private String processingCode;
	@Column(length = 12)
	private Double transactionAmount;
	@Column(length = 12)
	private Double settlementAmount;
	@Column(length = 12)
	private Double cardholderBillingAmount;
	@Column(length = 10)
	private String transmissionDateTime;
	@Column(length = 8)
	private Double cardholderBillingFeeAmount;
	@Column(length = 8)
	private Double settlementConversionRate;
	@Column(length = 8)
	private Double cardholderBillingConversionRate;
	@Column(length = 6)
	private String systemTraceAuditNumber;
	@Column(length = 6)
	private String localTransactionTime;
	@Column(length = 4)
	private String localTransactionDate;
	@Column(length = 4)
	private String expirationDate;
	@Column(length = 4)
	private String settlementDate;
	@Column(length = 4)
	private String conversionDate;
	@Column(length = 4)
	private String captureDate;
	@Column(length = 4)
	private String merchantsType;
	@Column(length = 3)
	private String acquiringInstitutionCountryCode;
	@Column(length = 3)
	private String panExtendedCountryCode;
	@Column(length = 3)
	private String forwardingInstitutionCountryCode;
	@Column(length = 3)
	private String pointOfServiceEntryMode;
	@Column(length = 3)
	private String cardSequenceNumber;
	@Column(length = 3)
	private String networkInternationalIdentifier;
	@Column(length = 2)
	private String pointOfServiceConditionCode;
	@Column(length = 2)
	private String pointOfServicePINCaptureCode;
	@Column(length = 1)
	private String authorizationIdentificationResponseLength;
	@Column(length = 8)
	private Double transactionFeeAmount;
	@Column(length = 8)
	private Double settlementFeeAmount;
	@Column(length = 8)
	private Double transactionProcessingFeeAmount;
	@Column(length = 8)
	private Double settlementProcessingFeeAmount;
	@Column(length = 11)
	private String acquiringInstitutionIdentificationCode;
	@Column(length = 11)
	private String forwardingInstitutionIdentificationCode;
	@Column(length = 28)
	private String panExtended;
	@Column(length = 37)
	private String track2Data;
	@Column(length = 104)
	private String track3Data;
	@Column(length = 12)
	private String retrievalReferenceNumber;
	@Column(length = 6)
	private String authorizationIdentificationResponse;
	@Column(length = 2)
	private String responseCode;
	@Column(length = 3)
	private String serviceRestrictionCode;
	@Column(length = 8)
	private String cardAcceptorTerminalIdentificacion;
	@Column(length = 15)
	private String cardAcceptorIdentificationCode;
	@Column(length = 40)
	private String cardAcceptorNameLocation;
	@Column(length = 25)
	private String additionalResponseData;
	@Column(length = 76)
	private String track1Data;
	@Column(length = 255)
	private String additionalDataISO;
	@Column(length = 255)
	private String additionalDataNational;
	@Column(length = 255)
	private String additionalDataPrivate;
	@Column(length = 3)
	private String transactionCurrencyCode;
	@Column(length = 3)
	private String settlementCurrencyCode;
	@Column(length = 3)
	private String cardholderBillingCurrencyCode;
	@Column(length = 16)
	private String pinData;
	@Column(length = 16)
	private String securityRelatedControlInformation;
	@Column(length = 120)
	private String additionalAmounts;
	@Column(length = 255)
	private String reservedISO1;
	@Column(length = 255)
	private String reservedISO2;
	@Column(length = 255)
	private String reservedNational1;
	@Column(length = 255)
	private String reservedNational2;
	@Column(length = 255)
	private String reservedNational3;
	@Column(length = 255)
	private String reservedPrivate1;
	@Column(length = 255)
	private String reservedPrivate2;
	@Column(length = 255)
	private String reservedPrivate3;
	@Column(length = 255)
	private String reservedPrivate4;
	@Column(length = 8)
	private String messageAuthenticationCodeField;
	@Column(length = 1)
	private String settlementCode;
	@Column(length = 2)
	private String extendedPaymentCode;
	@Column(length = 3)
	private String receivingInstitutionCountryCode;
	@Column(length = 3)
	private String settlementInstitutionCountryCode;
	@Column(length = 3)
	private String networkManagementInformationCode;
	@Column(length = 4)
	private String messageNumber;
	@Column(length = 4)
	private String messageNumberLast;
	@Column(length = 6)
	private String dateAction;
	@Column(length = 10)
	private String creditsNumber;
	@Column(length = 10)
	private String creditsReversalNumber;
	@Column(length = 10)
	private String debitsNumber;
	@Column(length = 10)
	private String debitsReversalNumber;
	@Column(length = 10)
	private String transferNumber;
	@Column(length = 10)
	private String transferReversalNumber;
	@Column(length = 10)
	private String inquiriesNumber;
	@Column(length = 10)
	private String authorizationNumber;
	@Column(length = 12)
	private String processingFeeAmountCredits;
	@Column(length = 12)
	private String transactionFeeAmountCredit;
	@Column(length = 12)
	private String processingFeeAmountDebits;
	@Column(length = 12)
	private String transactionFeeAmountDebits;
	@Column(length = 16)
	private String amountCredits;
	@Column(length = 16)
	private String reversalAmountCredits;
	@Column(length = 16)
	private String amountDebits;
	@Column(length = 16)
	private String reversalAmountDebits;
	@Column(length = 42)
	private String originalDataElements;
	@Column(length = 1)
	private String fileUpdateCode;
	@Column(length = 2)
	private String fileSecurityCode;
	@Column(length = 6)
	private String responseIndicator;
	@Column(length = 7)
	private String serviceIndicator;
	@Column(length = 42)
	private String replacementAmounts;
	@Column(length = 16)
	private String messageSecurityCode;
	@Column(length = 17)
	private String netSettlementAmount;
	@Column(length = 25)
	private String payee;
	@Column(length = 11)
	private String settlementInstitutionIdentificationCode;
	@Column(length = 11)
	private String receivingInstitutionIdentificationCode;
	@Column(length = 17)
	private String fileName;
	@Column(length = 28)
	private String accountIdentification1;
	@Column(length = 28)
	private String accountIdentification2;
	@Column(length = 100)
	private String transactionDescription;
	@Column(length = 255)
	private String reservedISOuse1;
	@Column(length = 255)
	private String reservedISOuse2;
	@Column(length = 255)
	private String reservedISOuse3;
	@Column(length = 255)
	private String reservedISOuse4;
	@Column(length = 255)
	private String reservedISOuse5;
	@Column(length = 255)
	private String reservedISOuse6;
	@Column(length = 255)
	private String reservedISOuse7;
	@Column(length = 255)
	private String reservedNationalUse1;
	@Column(length = 255)
	private String reservedNationalUse2;
	@Column(length = 255)
	private String reservedNationalUse3;
	@Column(length = 255)
	private String reservedNationalUse4;
	@Column(length = 255)
	private String reservedNationalUse5;
	@Column(length = 255)
	private String reservedNationalUse6;
	@Column(length = 255)
	private String reservedNationalUse7;
	@Column(length = 255)
	private String reservedNationalUse8;
	@Column(length = 255)
	private String reservedPrivateUse1;
	@Column(length = 255)
	private String reservedPrivateUse2;
	@Column(length = 255)
	private String reservedPrivateUse3;
	@Column(length = 255)
	private String reservedPrivateUse4;
	@Column(length = 255)
	private String reservedPrivateUse5;
	@Column(length = 255)
	private String reservedPrivateUse6;
	@Column(length = 255)
	private String reservedPrivateUse7;
	@Column(length = 255)
	private String reservedPrivateUse8;
	@Column(length = 8)
	private String mac2;

	// CTM (Cash1 Teller Machine Fields)
	@Column(length = 12)
	private Double CTMTransactionAmount;
	@Column(length = 12)
	private Double CTMFeeAmount;
	@Column(length = 12)
	private Double CTMFEDAmount;
	@Column(length = 1)
	private String CTMTransactionType;
	@Column(length = 255)
	private String transactionType;
	@Column(length = 13)
	private String CTMATMID;

	//@Temporal(TemporalType.TIMESTAMP)
	private Timestamp transactionDateTime;

	//@Temporal(TemporalType.TIMESTAMP)
	private Timestamp responseDateTime;
	
	private boolean isReversed;
	private Long original_transaction_id;

	//@Temporal(TemporalType.TIMESTAMP)
	private Timestamp reversalDateTime;
	
	private Double networkFee;
	private Double networkFeeShare;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMessageTypeIndicator() {
		return messageTypeIndicator;
	}

	public void setMessageTypeIndicator(String messageTypeIndicator) {
		this.messageTypeIndicator = messageTypeIndicator;
	}

	public String getPrimaryAccountNumber() {
		return primaryAccountNumber;
	}

	public void setPrimaryAccountNumber(String primaryAccountNumber) {
		this.primaryAccountNumber = primaryAccountNumber;
	}

	public String getProcessingCode() {
		return processingCode;
	}

	public void setProcessingCode(String processingCode) {
		this.processingCode = processingCode;
	}

	public Double getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(Double transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	public Double getSettlementAmount() {
		return settlementAmount;
	}

	public void setSettlementAmount(Double settlementAmount) {
		this.settlementAmount = settlementAmount;
	}

	public Double getCardholderBillingAmount() {
		return cardholderBillingAmount;
	}

	public void setCardholderBillingAmount(Double cardholderBillingAmount) {
		this.cardholderBillingAmount = cardholderBillingAmount;
	}

	public String getTransmissionDateTime() {
		return transmissionDateTime;
	}

	public void setTransmissionDateTime(String transmissionDateTime) {
		this.transmissionDateTime = transmissionDateTime;
	}

	public Double getCardholderBillingFeeAmount() {
		return cardholderBillingFeeAmount;
	}

	public void setCardholderBillingFeeAmount(Double cardholderBillingFeeAmount) {
		this.cardholderBillingFeeAmount = cardholderBillingFeeAmount;
	}

	public Double getSettlementConversionRate() {
		return settlementConversionRate;
	}

	public void setSettlementConversionRate(Double settlementConversionRate) {
		this.settlementConversionRate = settlementConversionRate;
	}

	public Double getCardholderBillingConversionRate() {
		return cardholderBillingConversionRate;
	}

	public void setCardholderBillingConversionRate(Double cardholderBillingConversionRate) {
		this.cardholderBillingConversionRate = cardholderBillingConversionRate;
	}

	public String getSystemTraceAuditNumber() {
		return systemTraceAuditNumber;
	}

	public void setSystemTraceAuditNumber(String systemTraceAuditNumber) {
		this.systemTraceAuditNumber = systemTraceAuditNumber;
	}

	public String getLocalTransactionTime() {
		return localTransactionTime;
	}

	public void setLocalTransactionTime(String localTransactionTime) {
		this.localTransactionTime = localTransactionTime;
	}

	public String getLocalTransactionDate() {
		return localTransactionDate;
	}

	public void setLocalTransactionDate(String localTransactionDate) {
		this.localTransactionDate = localTransactionDate;
	}

	public String getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}

	public String getSettlementDate() {
		return settlementDate;
	}

	public void setSettlementDate(String settlementDate) {
		this.settlementDate = settlementDate;
	}

	public String getConversionDate() {
		return conversionDate;
	}

	public void setConversionDate(String conversionDate) {
		this.conversionDate = conversionDate;
	}

	public String getCaptureDate() {
		return captureDate;
	}

	public void setCaptureDate(String captureDate) {
		this.captureDate = captureDate;
	}

	public String getMerchantsType() {
		return merchantsType;
	}

	public void setMerchantsType(String merchantsType) {
		this.merchantsType = merchantsType;
	}

	public String getAcquiringInstitutionCountryCode() {
		return acquiringInstitutionCountryCode;
	}

	public void setAcquiringInstitutionCountryCode(String acquiringInstitutionCountryCode) {
		this.acquiringInstitutionCountryCode = acquiringInstitutionCountryCode;
	}

	public String getPanExtendedCountryCode() {
		return panExtendedCountryCode;
	}

	public void setPanExtendedCountryCode(String panExtendedCountryCode) {
		this.panExtendedCountryCode = panExtendedCountryCode;
	}

	public String getForwardingInstitutionCountryCode() {
		return forwardingInstitutionCountryCode;
	}

	public void setForwardingInstitutionCountryCode(String forwardingInstitutionCountryCode) {
		this.forwardingInstitutionCountryCode = forwardingInstitutionCountryCode;
	}

	public String getPointOfServiceEntryMode() {
		return pointOfServiceEntryMode;
	}

	public void setPointOfServiceEntryMode(String pointOfServiceEntryMode) {
		this.pointOfServiceEntryMode = pointOfServiceEntryMode;
	}

	public String getCardSequenceNumber() {
		return cardSequenceNumber;
	}

	public void setCardSequenceNumber(String cardSequenceNumber) {
		this.cardSequenceNumber = cardSequenceNumber;
	}

	public String getNetworkInternationalIdentifier() {
		return networkInternationalIdentifier;
	}

	public void setNetworkInternationalIdentifier(String networkInternationalIdentifier) {
		this.networkInternationalIdentifier = networkInternationalIdentifier;
	}

	public String getPointOfServiceConditionCode() {
		return pointOfServiceConditionCode;
	}

	public void setPointOfServiceConditionCode(String pointOfServiceConditionCode) {
		this.pointOfServiceConditionCode = pointOfServiceConditionCode;
	}

	public String getPointOfServicePINCaptureCode() {
		return pointOfServicePINCaptureCode;
	}

	public void setPointOfServicePINCaptureCode(String pointOfServicePINCaptureCode) {
		this.pointOfServicePINCaptureCode = pointOfServicePINCaptureCode;
	}

	public String getAuthorizationIdentificationResponseLength() {
		return authorizationIdentificationResponseLength;
	}

	public void setAuthorizationIdentificationResponseLength(String authorizationIdentificationResponseLength) {
		this.authorizationIdentificationResponseLength = authorizationIdentificationResponseLength;
	}

	public Double getTransactionFeeAmount() {
		return transactionFeeAmount;
	}

	public void setTransactionFeeAmount(Double transactionFeeAmount) {
		this.transactionFeeAmount = transactionFeeAmount;
	}

	public Double getSettlementFeeAmount() {
		return settlementFeeAmount;
	}

	public void setSettlementFeeAmount(Double settlementFeeAmount) {
		this.settlementFeeAmount = settlementFeeAmount;
	}

	public Double getTransactionProcessingFeeAmount() {
		return transactionProcessingFeeAmount;
	}

	public void setTransactionProcessingFeeAmount(Double transactionProcessingFeeAmount) {
		this.transactionProcessingFeeAmount = transactionProcessingFeeAmount;
	}

	public Double getSettlementProcessingFeeAmount() {
		return settlementProcessingFeeAmount;
	}

	public void setSettlementProcessingFeeAmount(Double settlementProcessingFeeAmount) {
		this.settlementProcessingFeeAmount = settlementProcessingFeeAmount;
	}

	public String getAcquiringInstitutionIdentificationCode() {
		return acquiringInstitutionIdentificationCode;
	}

	public void setAcquiringInstitutionIdentificationCode(String acquiringInstitutionIdentificationCode) {
		this.acquiringInstitutionIdentificationCode = acquiringInstitutionIdentificationCode;
	}

	public String getForwardingInstitutionIdentificationCode() {
		return forwardingInstitutionIdentificationCode;
	}

	public void setForwardingInstitutionIdentificationCode(String forwardingInstitutionIdentificationCode) {
		this.forwardingInstitutionIdentificationCode = forwardingInstitutionIdentificationCode;
	}

	public String getPanExtended() {
		return panExtended;
	}

	public void setPanExtended(String panExtended) {
		this.panExtended = panExtended;
	}

	public String getTrack2Data() {
		return track2Data;
	}

	public void setTrack2Data(String track2Data) {
		this.track2Data = track2Data;
	}

	public String getTrack3Data() {
		return track3Data;
	}

	public void setTrack3Data(String track3Data) {
		this.track3Data = track3Data;
	}

	public String getRetrievalReferenceNumber() {
		return retrievalReferenceNumber;
	}

	public void setRetrievalReferenceNumber(String retrievalReferenceNumber) {
		this.retrievalReferenceNumber = retrievalReferenceNumber;
	}

	public String getAuthorizationIdentificationResponse() {
		return authorizationIdentificationResponse;
	}

	public void setAuthorizationIdentificationResponse(String authorizationIdentificationResponse) {
		this.authorizationIdentificationResponse = authorizationIdentificationResponse;
	}

	public String getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}

	public String getServiceRestrictionCode() {
		return serviceRestrictionCode;
	}

	public void setServiceRestrictionCode(String serviceRestrictionCode) {
		this.serviceRestrictionCode = serviceRestrictionCode;
	}

	public String getCardAcceptorTerminalIdentificacion() {
		return cardAcceptorTerminalIdentificacion;
	}

	public void setCardAcceptorTerminalIdentificacion(String cardAcceptorTerminalIdentificacion) {
		this.cardAcceptorTerminalIdentificacion = cardAcceptorTerminalIdentificacion;
	}

	public String getCardAcceptorIdentificationCode() {
		return cardAcceptorIdentificationCode;
	}

	public void setCardAcceptorIdentificationCode(String cardAcceptorIdentificationCode) {
		this.cardAcceptorIdentificationCode = cardAcceptorIdentificationCode;
	}

	public String getCardAcceptorNameLocation() {
		return cardAcceptorNameLocation;
	}

	public void setCardAcceptorNameLocation(String cardAcceptorNameLocation) {
		this.cardAcceptorNameLocation = cardAcceptorNameLocation;
	}

	public String getAdditionalResponseData() {
		return additionalResponseData;
	}

	public void setAdditionalResponseData(String additionalResponseData) {
		this.additionalResponseData = additionalResponseData;
	}

	public String getTrack1Data() {
		return track1Data;
	}

	public void setTrack1Data(String track1Data) {
		this.track1Data = track1Data;
	}

	public String getAdditionalDataISO() {
		return additionalDataISO;
	}

	public void setAdditionalDataISO(String additionalDataISO) {
		this.additionalDataISO = additionalDataISO;
	}

	public String getAdditionalDataNational() {
		return additionalDataNational;
	}

	public void setAdditionalDataNational(String additionalDataNational) {
		this.additionalDataNational = additionalDataNational;
	}

	public String getAdditionalDataPrivate() {
		return additionalDataPrivate;
	}

	public void setAdditionalDataPrivate(String additionalDataPrivate) {
		this.additionalDataPrivate = additionalDataPrivate;
	}

	public String getTransactionCurrencyCode() {
		return transactionCurrencyCode;
	}

	public void setTransactionCurrencyCode(String transactionCurrencyCode) {
		this.transactionCurrencyCode = transactionCurrencyCode;
	}

	public String getSettlementCurrencyCode() {
		return settlementCurrencyCode;
	}

	public void setSettlementCurrencyCode(String settlementCurrencyCode) {
		this.settlementCurrencyCode = settlementCurrencyCode;
	}

	public String getCardholderBillingCurrencyCode() {
		return cardholderBillingCurrencyCode;
	}

	public void setCardholderBillingCurrencyCode(String cardholderBillingCurrencyCode) {
		this.cardholderBillingCurrencyCode = cardholderBillingCurrencyCode;
	}

	public String getPinData() {
		return pinData;
	}

	public void setPinData(String pinData) {
		this.pinData = pinData;
	}

	public String getSecurityRelatedControlInformation() {
		return securityRelatedControlInformation;
	}

	public void setSecurityRelatedControlInformation(String securityRelatedControlInformation) {
		this.securityRelatedControlInformation = securityRelatedControlInformation;
	}

	public String getAdditionalAmounts() {
		return additionalAmounts;
	}

	public void setAdditionalAmounts(String additionalAmounts) {
		this.additionalAmounts = additionalAmounts;
	}

	public String getReservedISO1() {
		return reservedISO1;
	}

	public void setReservedISO1(String reservedISO1) {
		this.reservedISO1 = reservedISO1;
	}

	public String getReservedISO2() {
		return reservedISO2;
	}

	public void setReservedISO2(String reservedISO2) {
		this.reservedISO2 = reservedISO2;
	}

	public String getReservedNational1() {
		return reservedNational1;
	}

	public void setReservedNational1(String reservedNational1) {
		this.reservedNational1 = reservedNational1;
	}

	public String getReservedNational2() {
		return reservedNational2;
	}

	public void setReservedNational2(String reservedNational2) {
		this.reservedNational2 = reservedNational2;
	}

	public String getReservedNational3() {
		return reservedNational3;
	}

	public void setReservedNational3(String reservedNational3) {
		this.reservedNational3 = reservedNational3;
	}

	public String getReservedPrivate1() {
		return reservedPrivate1;
	}

	public void setReservedPrivate1(String reservedPrivate1) {
		this.reservedPrivate1 = reservedPrivate1;
	}

	public String getReservedPrivate2() {
		return reservedPrivate2;
	}

	public void setReservedPrivate2(String reservedPrivate2) {
		this.reservedPrivate2 = reservedPrivate2;
	}

	public String getReservedPrivate3() {
		return reservedPrivate3;
	}

	public void setReservedPrivate3(String reservedPrivate3) {
		this.reservedPrivate3 = reservedPrivate3;
	}

	public String getReservedPrivate4() {
		return reservedPrivate4;
	}

	public void setReservedPrivate4(String reservedPrivate4) {
		this.reservedPrivate4 = reservedPrivate4;
	}

	public String getMessageAuthenticationCodeField() {
		return messageAuthenticationCodeField;
	}

	public void setMessageAuthenticationCodeField(String messageAuthenticationCodeField) {
		this.messageAuthenticationCodeField = messageAuthenticationCodeField;
	}

	public String getSettlementCode() {
		return settlementCode;
	}

	public void setSettlementCode(String settlementCode) {
		this.settlementCode = settlementCode;
	}

	public String getExtendedPaymentCode() {
		return extendedPaymentCode;
	}

	public void setExtendedPaymentCode(String extendedPaymentCode) {
		this.extendedPaymentCode = extendedPaymentCode;
	}

	public String getReceivingInstitutionCountryCode() {
		return receivingInstitutionCountryCode;
	}

	public void setReceivingInstitutionCountryCode(String receivingInstitutionCountryCode) {
		this.receivingInstitutionCountryCode = receivingInstitutionCountryCode;
	}

	public String getSettlementInstitutionCountryCode() {
		return settlementInstitutionCountryCode;
	}

	public void setSettlementInstitutionCountryCode(String settlementInstitutionCountryCode) {
		this.settlementInstitutionCountryCode = settlementInstitutionCountryCode;
	}

	public String getNetworkManagementInformationCode() {
		return networkManagementInformationCode;
	}

	public void setNetworkManagementInformationCode(String networkManagementInformationCode) {
		this.networkManagementInformationCode = networkManagementInformationCode;
	}

	public String getMessageNumber() {
		return messageNumber;
	}

	public void setMessageNumber(String messageNumber) {
		this.messageNumber = messageNumber;
	}

	public String getMessageNumberLast() {
		return messageNumberLast;
	}

	public void setMessageNumberLast(String messageNumberLast) {
		this.messageNumberLast = messageNumberLast;
	}

	public String getDateAction() {
		return dateAction;
	}

	public void setDateAction(String dateAction) {
		this.dateAction = dateAction;
	}

	public String getCreditsNumber() {
		return creditsNumber;
	}

	public void setCreditsNumber(String creditsNumber) {
		this.creditsNumber = creditsNumber;
	}

	public String getCreditsReversalNumber() {
		return creditsReversalNumber;
	}

	public void setCreditsReversalNumber(String creditsReversalNumber) {
		this.creditsReversalNumber = creditsReversalNumber;
	}

	public String getDebitsNumber() {
		return debitsNumber;
	}

	public void setDebitsNumber(String debitsNumber) {
		this.debitsNumber = debitsNumber;
	}

	public String getDebitsReversalNumber() {
		return debitsReversalNumber;
	}

	public void setDebitsReversalNumber(String debitsReversalNumber) {
		this.debitsReversalNumber = debitsReversalNumber;
	}

	public String getTransferNumber() {
		return transferNumber;
	}

	public void setTransferNumber(String transferNumber) {
		this.transferNumber = transferNumber;
	}

	public String getTransferReversalNumber() {
		return transferReversalNumber;
	}

	public void setTransferReversalNumber(String transferReversalNumber) {
		this.transferReversalNumber = transferReversalNumber;
	}

	public String getInquiriesNumber() {
		return inquiriesNumber;
	}

	public void setInquiriesNumber(String inquiriesNumber) {
		this.inquiriesNumber = inquiriesNumber;
	}

	public String getAuthorizationNumber() {
		return authorizationNumber;
	}

	public void setAuthorizationNumber(String authorizationNumber) {
		this.authorizationNumber = authorizationNumber;
	}

	public String getProcessingFeeAmountCredits() {
		return processingFeeAmountCredits;
	}

	public void setProcessingFeeAmountCredits(String processingFeeAmountCredits) {
		this.processingFeeAmountCredits = processingFeeAmountCredits;
	}

	public String getTransactionFeeAmountCredit() {
		return transactionFeeAmountCredit;
	}

	public void setTransactionFeeAmountCredit(String transactionFeeAmountCredit) {
		this.transactionFeeAmountCredit = transactionFeeAmountCredit;
	}

	public String getProcessingFeeAmountDebits() {
		return processingFeeAmountDebits;
	}

	public void setProcessingFeeAmountDebits(String processingFeeAmountDebits) {
		this.processingFeeAmountDebits = processingFeeAmountDebits;
	}

	public String getTransactionFeeAmountDebits() {
		return transactionFeeAmountDebits;
	}

	public void setTransactionFeeAmountDebits(String transactionFeeAmountDebits) {
		this.transactionFeeAmountDebits = transactionFeeAmountDebits;
	}

	public String getAmountCredits() {
		return amountCredits;
	}

	public void setAmountCredits(String amountCredits) {
		this.amountCredits = amountCredits;
	}

	public String getReversalAmountCredits() {
		return reversalAmountCredits;
	}

	public void setReversalAmountCredits(String reversalAmountCredits) {
		this.reversalAmountCredits = reversalAmountCredits;
	}

	public String getAmountDebits() {
		return amountDebits;
	}

	public void setAmountDebits(String amountDebits) {
		this.amountDebits = amountDebits;
	}

	public String getReversalAmountDebits() {
		return reversalAmountDebits;
	}

	public void setReversalAmountDebits(String reversalAmountDebits) {
		this.reversalAmountDebits = reversalAmountDebits;
	}

	public String getOriginalDataElements() {
		return originalDataElements;
	}

	public void setOriginalDataElements(String originalDataElements) {
		this.originalDataElements = originalDataElements;
	}

	public String getFileUpdateCode() {
		return fileUpdateCode;
	}

	public void setFileUpdateCode(String fileUpdateCode) {
		this.fileUpdateCode = fileUpdateCode;
	}

	public String getFileSecurityCode() {
		return fileSecurityCode;
	}

	public void setFileSecurityCode(String fileSecurityCode) {
		this.fileSecurityCode = fileSecurityCode;
	}

	public String getResponseIndicator() {
		return responseIndicator;
	}

	public void setResponseIndicator(String responseIndicator) {
		this.responseIndicator = responseIndicator;
	}

	public String getServiceIndicator() {
		return serviceIndicator;
	}

	public void setServiceIndicator(String serviceIndicator) {
		this.serviceIndicator = serviceIndicator;
	}

	public String getReplacementAmounts() {
		return replacementAmounts;
	}

	public void setReplacementAmounts(String replacementAmounts) {
		this.replacementAmounts = replacementAmounts;
	}

	public String getMessageSecurityCode() {
		return messageSecurityCode;
	}

	public void setMessageSecurityCode(String messageSecurityCode) {
		this.messageSecurityCode = messageSecurityCode;
	}

	public String getNetSettlementAmount() {
		return netSettlementAmount;
	}

	public void setNetSettlementAmount(String netSettlementAmount) {
		this.netSettlementAmount = netSettlementAmount;
	}

	public String getPayee() {
		return payee;
	}

	public void setPayee(String payee) {
		this.payee = payee;
	}

	public String getSettlementInstitutionIdentificationCode() {
		return settlementInstitutionIdentificationCode;
	}

	public void setSettlementInstitutionIdentificationCode(String settlementInstitutionIdentificationCode) {
		this.settlementInstitutionIdentificationCode = settlementInstitutionIdentificationCode;
	}

	public String getReceivingInstitutionIdentificationCode() {
		return receivingInstitutionIdentificationCode;
	}

	public void setReceivingInstitutionIdentificationCode(String receivingInstitutionIdentificationCode) {
		this.receivingInstitutionIdentificationCode = receivingInstitutionIdentificationCode;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getAccountIdentification1() {
		return accountIdentification1;
	}

	public void setAccountIdentification1(String accountIdentification1) {
		this.accountIdentification1 = accountIdentification1;
	}

	public String getAccountIdentification2() {
		return accountIdentification2;
	}

	public void setAccountIdentification2(String accountIdentification2) {
		this.accountIdentification2 = accountIdentification2;
	}

	public String getTransactionDescription() {
		return transactionDescription;
	}

	public void setTransactionDescription(String transactionDescription) {
		this.transactionDescription = transactionDescription;
	}

	public String getReservedISOuse1() {
		return reservedISOuse1;
	}

	public void setReservedISOuse1(String reservedISOuse1) {
		this.reservedISOuse1 = reservedISOuse1;
	}

	public String getReservedISOuse2() {
		return reservedISOuse2;
	}

	public void setReservedISOuse2(String reservedISOuse2) {
		this.reservedISOuse2 = reservedISOuse2;
	}

	public String getReservedISOuse3() {
		return reservedISOuse3;
	}

	public void setReservedISOuse3(String reservedISOuse3) {
		this.reservedISOuse3 = reservedISOuse3;
	}

	public String getReservedISOuse4() {
		return reservedISOuse4;
	}

	public void setReservedISOuse4(String reservedISOuse4) {
		this.reservedISOuse4 = reservedISOuse4;
	}

	public String getReservedISOuse5() {
		return reservedISOuse5;
	}

	public void setReservedISOuse5(String reservedISOuse5) {
		this.reservedISOuse5 = reservedISOuse5;
	}

	public String getReservedISOuse6() {
		return reservedISOuse6;
	}

	public void setReservedISOuse6(String reservedISOuse6) {
		this.reservedISOuse6 = reservedISOuse6;
	}

	public String getReservedISOuse7() {
		return reservedISOuse7;
	}

	public void setReservedISOuse7(String reservedISOuse7) {
		this.reservedISOuse7 = reservedISOuse7;
	}

	public String getReservedNationalUse1() {
		return reservedNationalUse1;
	}

	public void setReservedNationalUse1(String reservedNationalUse1) {
		this.reservedNationalUse1 = reservedNationalUse1;
	}

	public String getReservedNationalUse2() {
		return reservedNationalUse2;
	}

	public void setReservedNationalUse2(String reservedNationalUse2) {
		this.reservedNationalUse2 = reservedNationalUse2;
	}

	public String getReservedNationalUse3() {
		return reservedNationalUse3;
	}

	public void setReservedNationalUse3(String reservedNationalUse3) {
		this.reservedNationalUse3 = reservedNationalUse3;
	}

	public String getReservedNationalUse4() {
		return reservedNationalUse4;
	}

	public void setReservedNationalUse4(String reservedNationalUse4) {
		this.reservedNationalUse4 = reservedNationalUse4;
	}

	public String getReservedNationalUse5() {
		return reservedNationalUse5;
	}

	public void setReservedNationalUse5(String reservedNationalUse5) {
		this.reservedNationalUse5 = reservedNationalUse5;
	}

	public String getReservedNationalUse6() {
		return reservedNationalUse6;
	}

	public void setReservedNationalUse6(String reservedNationalUse6) {
		this.reservedNationalUse6 = reservedNationalUse6;
	}

	public String getReservedNationalUse7() {
		return reservedNationalUse7;
	}

	public void setReservedNationalUse7(String reservedNationalUse7) {
		this.reservedNationalUse7 = reservedNationalUse7;
	}

	public String getReservedNationalUse8() {
		return reservedNationalUse8;
	}

	public void setReservedNationalUse8(String reservedNationalUse8) {
		this.reservedNationalUse8 = reservedNationalUse8;
	}

	public String getReservedPrivateUse1() {
		return reservedPrivateUse1;
	}

	public void setReservedPrivateUse1(String reservedPrivateUse1) {
		this.reservedPrivateUse1 = reservedPrivateUse1;
	}

	public String getReservedPrivateUse2() {
		return reservedPrivateUse2;
	}

	public void setReservedPrivateUse2(String reservedPrivateUse2) {
		this.reservedPrivateUse2 = reservedPrivateUse2;
	}

	public String getReservedPrivateUse3() {
		return reservedPrivateUse3;
	}

	public void setReservedPrivateUse3(String reservedPrivateUse3) {
		this.reservedPrivateUse3 = reservedPrivateUse3;
	}

	public String getReservedPrivateUse4() {
		return reservedPrivateUse4;
	}

	public void setReservedPrivateUse4(String reservedPrivateUse4) {
		this.reservedPrivateUse4 = reservedPrivateUse4;
	}

	public String getReservedPrivateUse5() {
		return reservedPrivateUse5;
	}

	public void setReservedPrivateUse5(String reservedPrivateUse5) {
		this.reservedPrivateUse5 = reservedPrivateUse5;
	}

	public String getReservedPrivateUse6() {
		return reservedPrivateUse6;
	}

	public void setReservedPrivateUse6(String reservedPrivateUse6) {
		this.reservedPrivateUse6 = reservedPrivateUse6;
	}

	public String getReservedPrivateUse7() {
		return reservedPrivateUse7;
	}

	public void setReservedPrivateUse7(String reservedPrivateUse7) {
		this.reservedPrivateUse7 = reservedPrivateUse7;
	}

	public String getReservedPrivateUse8() {
		return reservedPrivateUse8;
	}

	public void setReservedPrivateUse8(String reservedPrivateUse8) {
		this.reservedPrivateUse8 = reservedPrivateUse8;
	}

	public String getMac2() {
		return mac2;
	}

	public void setMac2(String mac2) {
		this.mac2 = mac2;
	}

	public Double getCTMTransactionAmount() {
		return CTMTransactionAmount;
	}

	public void setCTMTransactionAmount(Double cTMTransactionAmount) {
		CTMTransactionAmount = cTMTransactionAmount;
	}

	public Double getCTMFeeAmount() {
		return CTMFeeAmount;
	}

	public void setCTMFeeAmount(Double cTMFeeAmount) {
		CTMFeeAmount = cTMFeeAmount;
	}

	public Double getCTMFEDAmount() {
		return CTMFEDAmount;
	}

	public void setCTMFEDAmount(Double cTMFEDAmount) {
		CTMFEDAmount = cTMFEDAmount;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public Timestamp getTransactionDateTime() {
		return transactionDateTime;
	}

	public void setTransactionDateTime(Timestamp transactionDateTime) {
		this.transactionDateTime = transactionDateTime;
	}

	public Timestamp getResponseDateTime() {
		return responseDateTime;
	}

	public void setResponseDateTime(Timestamp responseDateTime) {
		this.responseDateTime = responseDateTime;
	}

	public String getCTMTransactionType() {
		return CTMTransactionType;
	}

	public void setCTMTransactionType(String cTMTransactionType) {
		CTMTransactionType = cTMTransactionType;
	}

	public String getCTMATMID() {
		return CTMATMID;
	}

	public void setCTMATMID(String cTMATMID) {
		CTMATMID = cTMATMID;
	}

	public boolean isReversed() {
		return isReversed;
	}

	public void setReversed(boolean isReversed) {
		this.isReversed = isReversed;
	}

	public Long getOriginal_transaction_id() {
		return original_transaction_id;
	}

	public void setOriginal_transaction_id(Long original_transaction_id) {
		this.original_transaction_id = original_transaction_id;
	}

	public Timestamp getReversalDateTime() {
		return reversalDateTime;
	}

	public void setReversalDateTime(Timestamp reversalDateTime) {
		this.reversalDateTime = reversalDateTime;
	}

	public Double getNetworkFee() {
		return networkFee;
	}

	public void setNetworkFee(Double networkFee) {
		this.networkFee = networkFee;
	}

	public Double getNetworkFeeShare() {
		return networkFeeShare;
	}

	public void setNetworkFeeShare(Double networkFeeShare) {
		this.networkFeeShare = networkFeeShare;
	}

}
