package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * RetrieveEbranchOperationsOutbound
 */
public class RetrieveEbranchOperationsOutbound   {
  private String eBranchServiceReference = null;

  private String eBranchOperatingSessionReference = null;

  private String eBranchOutboundConnectionReference = null;

  private String employeeBusinessUnitReference = null;

  private String customerContactRecordReference = null;

  private String customerContactRecord = null;

  private String eBranchCustomerDeviceReference = null;

  private String eBranchOutboundConnectionStartTime = null;

  private String eBranchOutboundConnectionDuration = null;

  private String eBranchServiceSessionStatistics = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return eBranchServiceReference
  **/
  @JsonProperty("eBranchServiceReference")
  public String getEBranchServiceReference() {
    return eBranchServiceReference;
  }

  public void setEBranchServiceReference(String eBranchServiceReference) {
    this.eBranchServiceReference = eBranchServiceReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return eBranchOperatingSessionReference
  **/
  @JsonProperty("eBranchOperatingSessionReference")
  public String getEBranchOperatingSessionReference() {
    return eBranchOperatingSessionReference;
  }

  public void setEBranchOperatingSessionReference(String eBranchOperatingSessionReference) {
    this.eBranchOperatingSessionReference = eBranchOperatingSessionReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return eBranchOutboundConnectionReference
  **/
  @JsonProperty("eBranchOutboundConnectionReference")
  public String getEBranchOutboundConnectionReference() {
    return eBranchOutboundConnectionReference;
  }

  public void setEBranchOutboundConnectionReference(String eBranchOutboundConnectionReference) {
    this.eBranchOutboundConnectionReference = eBranchOutboundConnectionReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return employeeBusinessUnitReference
  **/

  public String getEmployeeBusinessUnitReference() {
    return employeeBusinessUnitReference;
  }

  public void setEmployeeBusinessUnitReference(String employeeBusinessUnitReference) {
    this.employeeBusinessUnitReference = employeeBusinessUnitReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return customerContactRecordReference
  **/

  public String getCustomerContactRecordReference() {
    return customerContactRecordReference;
  }

  public void setCustomerContactRecordReference(String customerContactRecordReference) {
    this.customerContactRecordReference = customerContactRecordReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return customerContactRecord
  **/

  public String getCustomerContactRecord() {
    return customerContactRecord;
  }

  public void setCustomerContactRecord(String customerContactRecord) {
    this.customerContactRecord = customerContactRecord;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return eBranchCustomerDeviceReference
  **/
  @JsonProperty("eBranchCustomerDeviceReference")
  public String getEBranchCustomerDeviceReference() {
    return eBranchCustomerDeviceReference;
  }

  public void setEBranchCustomerDeviceReference(String eBranchCustomerDeviceReference) {
    this.eBranchCustomerDeviceReference = eBranchCustomerDeviceReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime 
   * @return eBranchOutboundConnectionStartTime
  **/
  @JsonProperty("eBranchOutboundConnectionStartTime")
  public String getEBranchOutboundConnectionStartTime() {
    return eBranchOutboundConnectionStartTime;
  }

  public void setEBranchOutboundConnectionStartTime(String eBranchOutboundConnectionStartTime) {
    this.eBranchOutboundConnectionStartTime = eBranchOutboundConnectionStartTime;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Duration 
   * @return eBranchOutboundConnectionDuration
  **/
  @JsonProperty("eBranchOutboundConnectionDuration")
  public String getEBranchOutboundConnectionDuration() {
    return eBranchOutboundConnectionDuration;
  }

  public void setEBranchOutboundConnectionDuration(String eBranchOutboundConnectionDuration) {
    this.eBranchOutboundConnectionDuration = eBranchOutboundConnectionDuration;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return eBranchServiceSessionStatistics
  **/
  @JsonProperty("eBranchServiceSessionStatistics")
  public String getEBranchServiceSessionStatistics() {
    return eBranchServiceSessionStatistics;
  }

  public void setEBranchServiceSessionStatistics(String eBranchServiceSessionStatistics) {
    this.eBranchServiceSessionStatistics = eBranchServiceSessionStatistics;
  }


}

