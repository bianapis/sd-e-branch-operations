/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface EBranchOperationsApiService {

	EbranchOperationsInboundResponse executePostInbounds(String crReferenceId, EbranchOperationsInboundRequest request);
	
	EbranchOperationsInboundResponse executePutInbounds(String crReferenceId, String bqReferenceId, EbranchOperationsInboundRequest request);
	
	EbranchOperationsOutboundResponse executePostOutbounds(String crReferenceId, EbranchOperationsOutboundRequest request);
	
	EbranchOperationsOutboundResponse executePutOutbounds(String crReferenceId, String bqReferenceId, EbranchOperationsOutboundRequest request);
	
	EbranchOperationsRecordResponse record(String crReferenceId, EbranchOperationsRecordRequest request);
	
	List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier);
	
	RetrieveEbranchOperatingSession retrieve(String crReferenceId);
	
	RetrieveEbranchOperationsInbound retrieveInbounds(String crReferenceId, String bqReferenceId);
	
	RetrieveEbranchOperationsOutbound retrieveOutbounds(String crReferenceId, String bqReferenceId);
	
	RetrieveEbranchOperationsReporting retrieveReportings(String crReferenceId, String bqReferenceId);
	
	RetrieveEbranchOperationsIssues retrieveIssues(String crReferenceId, String bqReferenceId);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds();
	
}
