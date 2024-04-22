package com.example.webDna.entity.entities.transaction;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "transaction_report")
public class TransactionReport {

	@Id
	private Long id;
	private String transaction_date_time;
	private String primary_account_number;
	private String card_acceptor_terminal_identification;
	private String message_type_indicator;
	private String transaction_type;
	private String system_trace_audit_number;
	private String channeL_name;
	private String acquiring_institution_identification_code;
	private String card_account;
	private String additional_data_private;
	private Double ctm_transaction_amount;
	private Double transaction_amount;
	private Double cash_back;
	private Double wpl_gross_tariff;
	private Double fee_from_1link;
	private Double fee_1link;
	private String alliance_location;
	private String alliance_id;
	private String response_code;
	private Double net_settlement_to_alliance;
	private Double gross_revenue_to_wpl;
	private String fed_region_id;
	private String applicable_tax_rate;
	private Double fed_per_regional_tariff;
	private Double refunded_to_customer;
	private Double net_revenue;
	private String response_CD;

	public Long getId() {
		return id;
	}

	public String getResponse_CD() {
		return response_CD;
	}

	public void setResponse_CD(String response_CD) {
		this.response_CD = response_CD;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTransaction_date_time() {
		return transaction_date_time;
	}

	public void setTransaction_date_time(String transaction_date_time) {
		this.transaction_date_time = transaction_date_time;
	}

	public String getPrimary_account_number() {
		return primary_account_number;
	}

	public void setPrimary_account_number(String primary_account_number) {
		this.primary_account_number = primary_account_number;
	}

	public String getCard_acceptor_terminal_identification() {
		return card_acceptor_terminal_identification;
	}

	public void setCard_acceptor_terminal_identification(String card_acceptor_terminal_identification) {
		this.card_acceptor_terminal_identification = card_acceptor_terminal_identification;
	}

	public String getMessage_type_indicator() {
		return message_type_indicator;
	}

	public void setMessage_type_indicator(String message_type_indicator) {
		this.message_type_indicator = message_type_indicator;
	}

	public String getTransaction_type() {
		return transaction_type;
	}

	public void setTransaction_type(String transaction_type) {
		this.transaction_type = transaction_type;
	}

	public String getSystem_trace_audit_number() {
		return system_trace_audit_number;
	}

	public void setSystem_trace_audit_number(String system_trace_audit_number) {
		this.system_trace_audit_number = system_trace_audit_number;
	}

	public String getChanneL_name() {
		return channeL_name;
	}

	public void setChanneL_name(String channeL_name) {
		this.channeL_name = channeL_name;
	}

	public String getAcquiring_institution_identification_code() {
		return acquiring_institution_identification_code;
	}

	public void setAcquiring_institution_identification_code(String acquiring_institution_identification_code) {
		this.acquiring_institution_identification_code = acquiring_institution_identification_code;
	}

	public String getCard_account() {
		return card_account;
	}

	public void setCard_account(String card_account) {
		this.card_account = card_account;
	}

	public String getAdditional_data_private() {
		return additional_data_private;
	}

	public void setAdditional_data_private(String additional_data_private) {
		this.additional_data_private = additional_data_private;
	}

	public Double getCtm_transaction_amount() {
		return ctm_transaction_amount;
	}

	public void setCtm_transaction_amount(Double ctm_transaction_amount) {
		this.ctm_transaction_amount = ctm_transaction_amount;
	}

	public Double getTransaction_amount() {
		return transaction_amount;
	}

	public void setTransaction_amount(Double transaction_amount) {
		this.transaction_amount = transaction_amount;
	}

	public Double getCash_back() {
		return cash_back;
	}

	public void setCash_back(Double cash_back) {
		this.cash_back = cash_back;
	}

	public Double getWpl_gross_tariff() {
		return wpl_gross_tariff;
	}

	public void setWpl_gross_tariff(Double wpl_gross_tariff) {
		this.wpl_gross_tariff = wpl_gross_tariff;
	}

	public Double getFee_from_1link() {
		return fee_from_1link;
	}

	public void setFee_from_1link(Double fee_from_1link) {
		this.fee_from_1link = fee_from_1link;
	}

	public Double getFee_1link() {
		return fee_1link;
	}

	public void setFee_1link(Double fee_1link) {
		this.fee_1link = fee_1link;
	}

	public String getAlliance_location() {
		return alliance_location;
	}

	public void setAlliance_location(String alliance_location) {
		this.alliance_location = alliance_location;
	}

	public String getAlliance_id() {
		return alliance_id;
	}

	public void setAlliance_id(String alliance_id) {
		this.alliance_id = alliance_id;
	}

	public String getResponse_code() {
		return response_code;
	}

	public void setResponse_code(String response_code) {
		this.response_code = response_code;
	}

	public Double getNet_settlement_to_alliance() {
		return net_settlement_to_alliance;
	}

	public void setNet_settlement_to_alliance(Double net_settlement_to_alliance) {
		this.net_settlement_to_alliance = net_settlement_to_alliance;
	}

	public Double getGross_revenue_to_wpl() {
		return gross_revenue_to_wpl;
	}

	public void setGross_revenue_to_wpl(Double gross_revenue_to_wpl) {
		this.gross_revenue_to_wpl = gross_revenue_to_wpl;
	}

	public String getFed_region_id() {
		return fed_region_id;
	}

	public void setFed_region_id(String fed_region_id) {
		this.fed_region_id = fed_region_id;
	}

	public String getApplicable_tax_rate() {
		return applicable_tax_rate;
	}

	public void setApplicable_tax_rate(String applicable_tax_rate) {
		this.applicable_tax_rate = applicable_tax_rate;
	}

	public Double getFed_per_regional_tariff() {
		return fed_per_regional_tariff;
	}

	public void setFed_per_regional_tariff(Double fed_per_regional_tariff) {
		this.fed_per_regional_tariff = fed_per_regional_tariff;
	}

	public Double getRefunded_to_customer() {
		return refunded_to_customer;
	}

	public void setRefunded_to_customer(Double refunded_to_customer) {
		this.refunded_to_customer = refunded_to_customer;
	}

	public Double getNet_revenue() {
		return net_revenue;
	}

	public void setNet_revenue(Double net_revenue) {
		this.net_revenue = net_revenue;
	}

}
