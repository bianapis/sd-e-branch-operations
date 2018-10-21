package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * RetrieveEbranchOperationsReporting
 */
public class RetrieveEbranchOperationsReporting   {
  private String eBranchOperatingSessionReference = null;

  private String eBranchServiceSessionReportReference = null;

  private String eBranchServiceSessionReportType = null;

  private Object eBranchServiceSessionStatistics = null;

  private String eBranchServiceConfigurationParameter = null;

  private String eBranchServiceSessionReport = null;


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
   * @return eBranchServiceSessionReportReference
  **/
  @JsonProperty("eBranchServiceSessionReportReference")
  public String getEBranchServiceSessionReportReference() {
    return eBranchServiceSessionReportReference;
  }

  public void setEBranchServiceSessionReportReference(String eBranchServiceSessionReportReference) {
    this.eBranchServiceSessionReportReference = eBranchServiceSessionReportReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return eBranchServiceSessionReportType
  **/
  @JsonProperty("eBranchServiceSessionReportType")
  public String getEBranchServiceSessionReportType() {
    return eBranchServiceSessionReportType;
  }

  public void setEBranchServiceSessionReportType(String eBranchServiceSessionReportType) {
    this.eBranchServiceSessionReportType = eBranchServiceSessionReportType;
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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return eBranchServiceSessionReport
  **/
  @JsonProperty("eBranchServiceSessionReport")
  public String getEBranchServiceSessionReport() {
    return eBranchServiceSessionReport;
  }

  public void setEBranchServiceSessionReport(String eBranchServiceSessionReport) {
    this.eBranchServiceSessionReport = eBranchServiceSessionReport;
  }


}

