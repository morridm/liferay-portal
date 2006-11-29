/**
 * Copyright (c) 2000-2006 Liferay, Inc. All rights reserved.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.liferay.portlet.shopping.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * <a href="ShoppingOrderSoap.java.html"><b><i>View Source</i></b></a>
 *
 * @author  Brian Wing Shun Chan
 *
 */
public class ShoppingOrderSoap implements Serializable {
	public static ShoppingOrderSoap toSoapModel(ShoppingOrder model) {
		ShoppingOrderSoap soapModel = new ShoppingOrderSoap();
		soapModel.setOrderId(model.getOrderId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setTax(model.getTax());
		soapModel.setShipping(model.getShipping());
		soapModel.setAltShipping(model.getAltShipping());
		soapModel.setRequiresShipping(model.getRequiresShipping());
		soapModel.setInsure(model.getInsure());
		soapModel.setInsurance(model.getInsurance());
		soapModel.setCouponIds(model.getCouponIds());
		soapModel.setCouponDiscount(model.getCouponDiscount());
		soapModel.setBillingFirstName(model.getBillingFirstName());
		soapModel.setBillingLastName(model.getBillingLastName());
		soapModel.setBillingEmailAddress(model.getBillingEmailAddress());
		soapModel.setBillingCompany(model.getBillingCompany());
		soapModel.setBillingStreet(model.getBillingStreet());
		soapModel.setBillingCity(model.getBillingCity());
		soapModel.setBillingState(model.getBillingState());
		soapModel.setBillingZip(model.getBillingZip());
		soapModel.setBillingCountry(model.getBillingCountry());
		soapModel.setBillingPhone(model.getBillingPhone());
		soapModel.setShipToBilling(model.getShipToBilling());
		soapModel.setShippingFirstName(model.getShippingFirstName());
		soapModel.setShippingLastName(model.getShippingLastName());
		soapModel.setShippingEmailAddress(model.getShippingEmailAddress());
		soapModel.setShippingCompany(model.getShippingCompany());
		soapModel.setShippingStreet(model.getShippingStreet());
		soapModel.setShippingCity(model.getShippingCity());
		soapModel.setShippingState(model.getShippingState());
		soapModel.setShippingZip(model.getShippingZip());
		soapModel.setShippingCountry(model.getShippingCountry());
		soapModel.setShippingPhone(model.getShippingPhone());
		soapModel.setCcName(model.getCcName());
		soapModel.setCcType(model.getCcType());
		soapModel.setCcNumber(model.getCcNumber());
		soapModel.setCcExpMonth(model.getCcExpMonth());
		soapModel.setCcExpYear(model.getCcExpYear());
		soapModel.setCcVerNumber(model.getCcVerNumber());
		soapModel.setComments(model.getComments());
		soapModel.setPpTxnId(model.getPpTxnId());
		soapModel.setPpPaymentStatus(model.getPpPaymentStatus());
		soapModel.setPpPaymentGross(model.getPpPaymentGross());
		soapModel.setPpReceiverEmail(model.getPpReceiverEmail());
		soapModel.setPpPayerEmail(model.getPpPayerEmail());
		soapModel.setSendOrderEmail(model.getSendOrderEmail());
		soapModel.setSendShippingEmail(model.getSendShippingEmail());

		return soapModel;
	}

	public static ShoppingOrderSoap[] toSoapModels(List models) {
		List soapModels = new ArrayList(models.size());

		for (int i = 0; i < models.size(); i++) {
			ShoppingOrder model = (ShoppingOrder)models.get(i);
			soapModels.add(toSoapModel(model));
		}

		return (ShoppingOrderSoap[])soapModels.toArray(new ShoppingOrderSoap[0]);
	}

	public ShoppingOrderSoap() {
	}

	public String getPrimaryKey() {
		return _orderId;
	}

	public void setPrimaryKey(String pk) {
		setOrderId(pk);
	}

	public String getOrderId() {
		return _orderId;
	}

	public void setOrderId(String orderId) {
		_orderId = orderId;
	}

	public String getGroupId() {
		return _groupId;
	}

	public void setGroupId(String groupId) {
		_groupId = groupId;
	}

	public String getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(String companyId) {
		_companyId = companyId;
	}

	public String getUserId() {
		return _userId;
	}

	public void setUserId(String userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public double getTax() {
		return _tax;
	}

	public void setTax(double tax) {
		_tax = tax;
	}

	public double getShipping() {
		return _shipping;
	}

	public void setShipping(double shipping) {
		_shipping = shipping;
	}

	public String getAltShipping() {
		return _altShipping;
	}

	public void setAltShipping(String altShipping) {
		_altShipping = altShipping;
	}

	public boolean getRequiresShipping() {
		return _requiresShipping;
	}

	public boolean isRequiresShipping() {
		return _requiresShipping;
	}

	public void setRequiresShipping(boolean requiresShipping) {
		_requiresShipping = requiresShipping;
	}

	public boolean getInsure() {
		return _insure;
	}

	public boolean isInsure() {
		return _insure;
	}

	public void setInsure(boolean insure) {
		_insure = insure;
	}

	public double getInsurance() {
		return _insurance;
	}

	public void setInsurance(double insurance) {
		_insurance = insurance;
	}

	public String getCouponIds() {
		return _couponIds;
	}

	public void setCouponIds(String couponIds) {
		_couponIds = couponIds;
	}

	public double getCouponDiscount() {
		return _couponDiscount;
	}

	public void setCouponDiscount(double couponDiscount) {
		_couponDiscount = couponDiscount;
	}

	public String getBillingFirstName() {
		return _billingFirstName;
	}

	public void setBillingFirstName(String billingFirstName) {
		_billingFirstName = billingFirstName;
	}

	public String getBillingLastName() {
		return _billingLastName;
	}

	public void setBillingLastName(String billingLastName) {
		_billingLastName = billingLastName;
	}

	public String getBillingEmailAddress() {
		return _billingEmailAddress;
	}

	public void setBillingEmailAddress(String billingEmailAddress) {
		_billingEmailAddress = billingEmailAddress;
	}

	public String getBillingCompany() {
		return _billingCompany;
	}

	public void setBillingCompany(String billingCompany) {
		_billingCompany = billingCompany;
	}

	public String getBillingStreet() {
		return _billingStreet;
	}

	public void setBillingStreet(String billingStreet) {
		_billingStreet = billingStreet;
	}

	public String getBillingCity() {
		return _billingCity;
	}

	public void setBillingCity(String billingCity) {
		_billingCity = billingCity;
	}

	public String getBillingState() {
		return _billingState;
	}

	public void setBillingState(String billingState) {
		_billingState = billingState;
	}

	public String getBillingZip() {
		return _billingZip;
	}

	public void setBillingZip(String billingZip) {
		_billingZip = billingZip;
	}

	public String getBillingCountry() {
		return _billingCountry;
	}

	public void setBillingCountry(String billingCountry) {
		_billingCountry = billingCountry;
	}

	public String getBillingPhone() {
		return _billingPhone;
	}

	public void setBillingPhone(String billingPhone) {
		_billingPhone = billingPhone;
	}

	public boolean getShipToBilling() {
		return _shipToBilling;
	}

	public boolean isShipToBilling() {
		return _shipToBilling;
	}

	public void setShipToBilling(boolean shipToBilling) {
		_shipToBilling = shipToBilling;
	}

	public String getShippingFirstName() {
		return _shippingFirstName;
	}

	public void setShippingFirstName(String shippingFirstName) {
		_shippingFirstName = shippingFirstName;
	}

	public String getShippingLastName() {
		return _shippingLastName;
	}

	public void setShippingLastName(String shippingLastName) {
		_shippingLastName = shippingLastName;
	}

	public String getShippingEmailAddress() {
		return _shippingEmailAddress;
	}

	public void setShippingEmailAddress(String shippingEmailAddress) {
		_shippingEmailAddress = shippingEmailAddress;
	}

	public String getShippingCompany() {
		return _shippingCompany;
	}

	public void setShippingCompany(String shippingCompany) {
		_shippingCompany = shippingCompany;
	}

	public String getShippingStreet() {
		return _shippingStreet;
	}

	public void setShippingStreet(String shippingStreet) {
		_shippingStreet = shippingStreet;
	}

	public String getShippingCity() {
		return _shippingCity;
	}

	public void setShippingCity(String shippingCity) {
		_shippingCity = shippingCity;
	}

	public String getShippingState() {
		return _shippingState;
	}

	public void setShippingState(String shippingState) {
		_shippingState = shippingState;
	}

	public String getShippingZip() {
		return _shippingZip;
	}

	public void setShippingZip(String shippingZip) {
		_shippingZip = shippingZip;
	}

	public String getShippingCountry() {
		return _shippingCountry;
	}

	public void setShippingCountry(String shippingCountry) {
		_shippingCountry = shippingCountry;
	}

	public String getShippingPhone() {
		return _shippingPhone;
	}

	public void setShippingPhone(String shippingPhone) {
		_shippingPhone = shippingPhone;
	}

	public String getCcName() {
		return _ccName;
	}

	public void setCcName(String ccName) {
		_ccName = ccName;
	}

	public String getCcType() {
		return _ccType;
	}

	public void setCcType(String ccType) {
		_ccType = ccType;
	}

	public String getCcNumber() {
		return _ccNumber;
	}

	public void setCcNumber(String ccNumber) {
		_ccNumber = ccNumber;
	}

	public int getCcExpMonth() {
		return _ccExpMonth;
	}

	public void setCcExpMonth(int ccExpMonth) {
		_ccExpMonth = ccExpMonth;
	}

	public int getCcExpYear() {
		return _ccExpYear;
	}

	public void setCcExpYear(int ccExpYear) {
		_ccExpYear = ccExpYear;
	}

	public String getCcVerNumber() {
		return _ccVerNumber;
	}

	public void setCcVerNumber(String ccVerNumber) {
		_ccVerNumber = ccVerNumber;
	}

	public String getComments() {
		return _comments;
	}

	public void setComments(String comments) {
		_comments = comments;
	}

	public String getPpTxnId() {
		return _ppTxnId;
	}

	public void setPpTxnId(String ppTxnId) {
		_ppTxnId = ppTxnId;
	}

	public String getPpPaymentStatus() {
		return _ppPaymentStatus;
	}

	public void setPpPaymentStatus(String ppPaymentStatus) {
		_ppPaymentStatus = ppPaymentStatus;
	}

	public double getPpPaymentGross() {
		return _ppPaymentGross;
	}

	public void setPpPaymentGross(double ppPaymentGross) {
		_ppPaymentGross = ppPaymentGross;
	}

	public String getPpReceiverEmail() {
		return _ppReceiverEmail;
	}

	public void setPpReceiverEmail(String ppReceiverEmail) {
		_ppReceiverEmail = ppReceiverEmail;
	}

	public String getPpPayerEmail() {
		return _ppPayerEmail;
	}

	public void setPpPayerEmail(String ppPayerEmail) {
		_ppPayerEmail = ppPayerEmail;
	}

	public boolean getSendOrderEmail() {
		return _sendOrderEmail;
	}

	public boolean isSendOrderEmail() {
		return _sendOrderEmail;
	}

	public void setSendOrderEmail(boolean sendOrderEmail) {
		_sendOrderEmail = sendOrderEmail;
	}

	public boolean getSendShippingEmail() {
		return _sendShippingEmail;
	}

	public boolean isSendShippingEmail() {
		return _sendShippingEmail;
	}

	public void setSendShippingEmail(boolean sendShippingEmail) {
		_sendShippingEmail = sendShippingEmail;
	}

	private String _orderId;
	private String _groupId;
	private String _companyId;
	private String _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private double _tax;
	private double _shipping;
	private String _altShipping;
	private boolean _requiresShipping;
	private boolean _insure;
	private double _insurance;
	private String _couponIds;
	private double _couponDiscount;
	private String _billingFirstName;
	private String _billingLastName;
	private String _billingEmailAddress;
	private String _billingCompany;
	private String _billingStreet;
	private String _billingCity;
	private String _billingState;
	private String _billingZip;
	private String _billingCountry;
	private String _billingPhone;
	private boolean _shipToBilling;
	private String _shippingFirstName;
	private String _shippingLastName;
	private String _shippingEmailAddress;
	private String _shippingCompany;
	private String _shippingStreet;
	private String _shippingCity;
	private String _shippingState;
	private String _shippingZip;
	private String _shippingCountry;
	private String _shippingPhone;
	private String _ccName;
	private String _ccType;
	private String _ccNumber;
	private int _ccExpMonth;
	private int _ccExpYear;
	private String _ccVerNumber;
	private String _comments;
	private String _ppTxnId;
	private String _ppPaymentStatus;
	private double _ppPaymentGross;
	private String _ppReceiverEmail;
	private String _ppPayerEmail;
	private boolean _sendOrderEmail;
	private boolean _sendShippingEmail;
}