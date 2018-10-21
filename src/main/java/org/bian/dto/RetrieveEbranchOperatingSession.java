package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * RetrieveEbranchOperatingSession
 */
public class RetrieveEbranchOperatingSession   {
  private String eBranchOperatingSessionReference = null;

  private String eBranchServiceConfigurationParameterType = null;

  private String eBranchServiceConfigurationParameter = null;

  private String eBranchCustomerMenuReference = null;

  private String eBranchCustomerMenuDefinition = null;


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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return eBranchServiceConfigurationParameterType
  **/
  @JsonProperty("eBranchServiceConfigurationParameterType")
  public String getEBranchServiceConfigurationParameterType() {
    return eBranchServiceConfigurationParameterType;
  }

  public void setEBranchServiceConfigurationParameterType(String eBranchServiceConfigurationParameterType) {
    this.eBranchServiceConfigurationParameterType = eBranchServiceConfigurationParameterType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return eBranchServiceConfigurationParameter
  **/
  @JsonProperty("eBranchServiceConfigurationParameter")
  public String getEBranchServiceConfigurationParameter() {
    return eBranchServiceConfigurationParameter;
  }

  public void setEBranchServiceConfigurationParameter(String eBranchServiceConfigurationParameter) {
    this.eBranchServiceConfigurationParameter = eBranchServiceConfigurationParameter;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return eBranchCustomerMenuReference
  **/
  @JsonProperty("eBranchCustomerMenuReference")
  public String getEBranchCustomerMenuReference() {
    return eBranchCustomerMenuReference;
  }

  public void setEBranchCustomerMenuReference(String eBranchCustomerMenuReference) {
    this.eBranchCustomerMenuReference = eBranchCustomerMenuReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return eBranchCustomerMenuDefinition
  **/
  @JsonProperty("eBranchCustomerMenuDefinition")
  public String getEBranchCustomerMenuDefinition() {
    return eBranchCustomerMenuDefinition;
  }

  public void setEBranchCustomerMenuDefinition(String eBranchCustomerMenuDefinition) {
    this.eBranchCustomerMenuDefinition = eBranchCustomerMenuDefinition;
  }


}

