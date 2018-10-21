/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class EBranchOperationsApiServiceImpl implements EBranchOperationsApiService {

	public EbranchOperationsInboundResponse executePostInbounds(String crReferenceId, EbranchOperationsInboundRequest request){
		return JsonReader.read("executePost-EbranchOperationsInboundResponse.json",new TypeReference<EbranchOperationsInboundResponse>(){});
	}
	
	public EbranchOperationsInboundResponse executePutInbounds(String crReferenceId, String bqReferenceId, EbranchOperationsInboundRequest request){
		return JsonReader.read("executePut-EbranchOperationsInboundResponse.json",new TypeReference<EbranchOperationsInboundResponse>(){});
	}
	
	public EbranchOperationsOutboundResponse executePostOutbounds(String crReferenceId, EbranchOperationsOutboundRequest request){
		return JsonReader.read("executePost-EbranchOperationsOutboundResponse.json",new TypeReference<EbranchOperationsOutboundResponse>(){});
	}
	
	public EbranchOperationsOutboundResponse executePutOutbounds(String crReferenceId, String bqReferenceId, EbranchOperationsOutboundRequest request){
		return JsonReader.read("executePut-EbranchOperationsOutboundResponse.json",new TypeReference<EbranchOperationsOutboundResponse>(){});
	}
	
	public EbranchOperationsRecordResponse record(String crReferenceId, EbranchOperationsRecordRequest request){
		return JsonReader.read("record-EbranchOperationsRecordResponse.json",new TypeReference<EbranchOperationsRecordResponse>(){});
	}
	
	public List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public RetrieveEbranchOperatingSession retrieve(String crReferenceId){
		return JsonReader.read("retrieve-RetrieveEbranchOperatingSession.json",new TypeReference<RetrieveEbranchOperatingSession>(){});
	}
	
	public RetrieveEbranchOperationsInbound retrieveInbounds(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-RetrieveEbranchOperationsInbound.json",new TypeReference<RetrieveEbranchOperationsInbound>(){});
	}
	
	public RetrieveEbranchOperationsOutbound retrieveOutbounds(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-RetrieveEbranchOperationsOutbound.json",new TypeReference<RetrieveEbranchOperationsOutbound>(){});
	}
	
	public RetrieveEbranchOperationsReporting retrieveReportings(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-RetrieveEbranchOperationsReporting.json",new TypeReference<RetrieveEbranchOperationsReporting>(){});
	}
	
	public RetrieveEbranchOperationsIssues retrieveIssues(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-RetrieveEbranchOperationsIssues.json",new TypeReference<RetrieveEbranchOperationsIssues>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
}
