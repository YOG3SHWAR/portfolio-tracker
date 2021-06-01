package com.portfolio.entity;

import java.time.LocalDateTime;

public class Transictions {
	private int tId;
	private String email;
	private LocalDateTime dateTime;
	private double receivedQty;
	private String receivedCurrency;
	private double sendQty;
	private String sendCrrency;
	private double feeAmount;
	private String feeCurrency;
	private String remarks;

	public Transictions() {

	}

	public Transictions(int tId, String email, LocalDateTime dateTime, double receivedQty, String receivedCurrency,
			double sendQty, String sendCrrency, double feeAmount, String feeCurrency, String remarks) {
		super();
		this.tId = tId;
		this.email = email;
		this.dateTime = dateTime;
		this.receivedQty = receivedQty;
		this.receivedCurrency = receivedCurrency;
		this.sendQty = sendQty;
		this.sendCrrency = sendCrrency;
		this.feeAmount = feeAmount;
		this.feeCurrency = feeCurrency;
		this.remarks = remarks;
	}

	public int gettId() {
		return tId;
	}

	public void settId(int tId) {
		this.tId = tId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

	public double getReceivedQty() {
		return receivedQty;
	}

	public void setReceivedQty(double receivedQty) {
		this.receivedQty = receivedQty;
	}

	public String getReceivedCurrency() {
		return receivedCurrency;
	}

	public void setReceivedCurrency(String receivedCurrency) {
		this.receivedCurrency = receivedCurrency;
	}

	public double getSendQty() {
		return sendQty;
	}

	public void setSendQty(double sendQty) {
		this.sendQty = sendQty;
	}

	public String getSendCrrency() {
		return sendCrrency;
	}

	public void setSendCrrency(String sendCrrency) {
		this.sendCrrency = sendCrrency;
	}

	public double getFeeAmount() {
		return feeAmount;
	}

	public void setFeeAmount(double feeAmount) {
		this.feeAmount = feeAmount;
	}

	public String getFeeCurrency() {
		return feeCurrency;
	}

	public void setFeeCurrency(String feeCurrency) {
		this.feeCurrency = feeCurrency;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	@Override
	public String toString() {
		return "Transictions [tId=" + tId + ", email=" + email + ", dateTime=" + dateTime + ", receivedQty="
				+ receivedQty + ", receivedCurrency=" + receivedCurrency + ", sendQty=" + sendQty + ", sendCrrency="
				+ sendCrrency + ", feeAmount=" + feeAmount + ", feeCurrency=" + feeCurrency + ", remarks=" + remarks
				+ "]";
	}

}
