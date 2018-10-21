package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * EbranchOperationsInboundRequest
 */
public class EbranchOperationsInboundRequest   {
  private String eBranchDeviceReference = null;

  private String eBranchDevicePropertyValue = null;

  private String eBranchInboundConnectionStartTime = null;

  private String eBranchInboundConnectionDuration = null;

  private String eBranchInboundConnectionContactRecordReference = null;

  private Object eBranchServiceSessionStatistics = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return eBranchDeviceReference
  **/
  @JsonProperty("eBranchDeviceReference")
  public String getEBranchDeviceReference() {
    return eBranchDeviceReference;
  }

  public void setEBranchDeviceReference(String eBranchDeviceReference) {
    this.eBranchDeviceReference = eBranchDeviceReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return eBranchDevicePropertyValue
  **/
  @JsonProperty("eBranchDevicePropertyValue")
  public String getEBranchDevicePropertyValue() {
    return eBranchDevicePropertyValue;
  }

  public void setEBranchDevicePropertyValue(String eBranchDevicePropertyValue) {
    this.eBranchDevicePropertyValue = eBranchDevicePropertyValue;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime 
   * @return eBranchInboundConnectionStartTime
  **/
  @JsonProperty("eBranchInboundConnectionStartTime")
  public String getEBranchInboundConnectionStartTime() {
    return eBranchInboundConnectionStartTime;
  }

  public void setEBranchInboundConnectionStartTime(String eBranchInboundConnectionStartTime) {
    this.eBranchInboundConnectionStartTime = eBranchInboundConnectionStartTime;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Duration 
   * @return eBranchInboundConnectionDuration
  **/
  @JsonProperty("eBranchInboundConnectionDuration")
  public String getEBranchInboundConnectionDuration() {
    return eBranchInboundConnectionDuration;
  }

  public void setEBranchInboundConnectionDuration(String eBranchInboundConnectionDuration) {
    this.eBranchInboundConnectionDuration = eBranchInboundConnectionDuration;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return eBranchInboundConnectionContactRecordReference
  **/
  @JsonProperty("eBranchInboundConnectionContactRecordReference")
  public String getEBranchInboundConnectionContactRecordReference() {
    return eBranchInboundConnectionContactRecordReference;
  }

  public void setEBranchInboundConnectionContactRecordReference(String eBranchInboundConnectionContactRecordReference) {
    this.eBranchInboundConnectionContactRecordReference = eBranchInboundConnectionContactRecordReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary 
   * @return eBranchServiceSessionStatistics
  **/
  @JsonProperty("eBranchServiceSessionStatistics")
  public Object getEBranchServiceSessionStatistics() {
    return eBranchServiceSessionStatistics;
  }

  public void setEBranchServiceSessionStatistics(Object eBranchServiceSessionStatistics) {
    this.eBranchServiceSessionStatistics = eBranchServiceSessionStatistics;
  }


}

