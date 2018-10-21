package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * RetrieveEbranchOperationsIssues
 */
public class RetrieveEbranchOperationsIssues   {
  private String eBranchServiceReference = null;

  private String eBranchOperatingSessionReference = null;

  private String eBranchServiceIssueReference = null;

  private String employeeBusinessUnitReference = null;

  private String customerContactRecordReference = null;

  private String productionIssueType = null;

  private String productionIssueDescription = null;

  private String productionIssueDiagnosis = null;

  private String productionIssueResolutionTask = null;

  private Object productionIssueRecord = null;

  private String productionIssueStatus = null;


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
   * @return eBranchServiceIssueReference
  **/
  @JsonProperty("eBranchServiceIssueReference")
  public String getEBranchServiceIssueReference() {
    return eBranchServiceIssueReference;
  }

  public void setEBranchServiceIssueReference(String eBranchServiceIssueReference) {
    this.eBranchServiceIssueReference = eBranchServiceIssueReference;
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
   * @return productionIssueType
  **/

  public String getProductionIssueType() {
    return productionIssueType;
  }

  public void setProductionIssueType(String productionIssueType) {
    this.productionIssueType = productionIssueType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return productionIssueDescription
  **/

  public String getProductionIssueDescription() {
    return productionIssueDescription;
  }

  public void setProductionIssueDescription(String productionIssueDescription) {
    this.productionIssueDescription = productionIssueDescription;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return productionIssueDiagnosis
  **/

  public String getProductionIssueDiagnosis() {
    return productionIssueDiagnosis;
  }

  public void setProductionIssueDiagnosis(String productionIssueDiagnosis) {
    this.productionIssueDiagnosis = productionIssueDiagnosis;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return productionIssueResolutionTask
  **/

  public String getProductionIssueResolutionTask() {
    return productionIssueResolutionTask;
  }

  public void setProductionIssueResolutionTask(String productionIssueResolutionTask) {
    this.productionIssueResolutionTask = productionIssueResolutionTask;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary 
   * @return productionIssueRecord
  **/

  public Object getProductionIssueRecord() {
    return productionIssueRecord;
  }

  public void setProductionIssueRecord(Object productionIssueRecord) {
    this.productionIssueRecord = productionIssueRecord;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return productionIssueStatus
  **/

  public String getProductionIssueStatus() {
    return productionIssueStatus;
  }

  public void setProductionIssueStatus(String productionIssueStatus) {
    this.productionIssueStatus = productionIssueStatus;
  }


}

