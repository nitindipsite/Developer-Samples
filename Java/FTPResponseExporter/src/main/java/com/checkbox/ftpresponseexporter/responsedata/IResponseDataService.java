
package com.checkbox.ftpresponseexporter.responsedata;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "IResponseDataService", targetNamespace = "http://tempuri.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface IResponseDataService {


    /**
     * 
     * @param authTicket
     * @param surveyId
     * @return
     *     returns com.checkbox.ServiceOperationResultOfResponseSummaryDataVUqw3SxC
     */
    @WebMethod(operationName = "GetSurveyResponseSummary", action = "http://tempuri.org/IResponseDataService/GetSurveyResponseSummary")
    @WebResult(name = "GetSurveyResponseSummaryResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetSurveyResponseSummary", targetNamespace = "http://tempuri.org/", className = "com.checkbox.GetSurveyResponseSummary")
    @ResponseWrapper(localName = "GetSurveyResponseSummaryResponse", targetNamespace = "http://tempuri.org/", className = "com.checkbox.GetSurveyResponseSummaryResponse")
    public ServiceOperationResultOfResponseSummaryDataVUqw3SxC getSurveyResponseSummary(
            @WebParam(name = "authTicket", targetNamespace = "http://tempuri.org/")
            String authTicket,
            @WebParam(name = "surveyId", targetNamespace = "http://tempuri.org/")
            Integer surveyId);

    /**
     * 
     * @param authTicket
     * @param count
     * @param surveyId
     * @return
     *     returns com.checkbox.ServiceOperationResultOfArrayOfResponseDataVUqw3SxC
     */
    @WebMethod(operationName = "ListRecentSurveyResponses", action = "http://tempuri.org/IResponseDataService/ListRecentSurveyResponses")
    @WebResult(name = "ListRecentSurveyResponsesResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "ListRecentSurveyResponses", targetNamespace = "http://tempuri.org/", className = "com.checkbox.ListRecentSurveyResponses")
    @ResponseWrapper(localName = "ListRecentSurveyResponsesResponse", targetNamespace = "http://tempuri.org/", className = "com.checkbox.ListRecentSurveyResponsesResponse")
    public ServiceOperationResultOfArrayOfResponseDataVUqw3SxC listRecentSurveyResponses(
            @WebParam(name = "authTicket", targetNamespace = "http://tempuri.org/")
            String authTicket,
            @WebParam(name = "surveyId", targetNamespace = "http://tempuri.org/")
            Integer surveyId,
            @WebParam(name = "count", targetNamespace = "http://tempuri.org/")
            Integer count);

    /**
     * 
     * @param optionID
     * @param responseId
     * @param answerText
     * @param authToken
     * @param dateCreated
     * @param answerId
     * @param surveyId
     * @return
     *     returns com.checkbox.ServiceOperationResultOfanyType
     */
    @WebMethod(operationName = "UpdateResponseAnswer", action = "http://tempuri.org/IResponseDataService/UpdateResponseAnswer")
    @WebResult(name = "UpdateResponseAnswerResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "UpdateResponseAnswer", targetNamespace = "http://tempuri.org/", className = "com.checkbox.UpdateResponseAnswer")
    @ResponseWrapper(localName = "UpdateResponseAnswerResponse", targetNamespace = "http://tempuri.org/", className = "com.checkbox.UpdateResponseAnswerResponse")
    public ServiceOperationResultOfanyType updateResponseAnswer(
            @WebParam(name = "authToken", targetNamespace = "http://tempuri.org/")
            String authToken,
            @WebParam(name = "surveyId", targetNamespace = "http://tempuri.org/")
            Integer surveyId,
            @WebParam(name = "responseId", targetNamespace = "http://tempuri.org/")
            Long responseId,
            @WebParam(name = "answerId", targetNamespace = "http://tempuri.org/")
            Long answerId,
            @WebParam(name = "answerText", targetNamespace = "http://tempuri.org/")
            String answerText,
            @WebParam(name = "optionID", targetNamespace = "http://tempuri.org/")
            Integer optionID,
            @WebParam(name = "dateCreated", targetNamespace = "http://tempuri.org/")
            XMLGregorianCalendar dateCreated);

    /**
     * 
     * @param authTicket
     * @param sortField
     * @param filterValue
     * @param resultsPerPage
     * @param sortAscending
     * @param filterField
     * @param pageNumber
     * @param surveyId
     * @return
     *     returns com.checkbox.ServiceOperationResultOfPagedListResultOfArrayOfResponseDataVUqw3SxCVUqw3SxC
     */
    @WebMethod(operationName = "ListSurveyResponses", action = "http://tempuri.org/IResponseDataService/ListSurveyResponses")
    @WebResult(name = "ListSurveyResponsesResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "ListSurveyResponses", targetNamespace = "http://tempuri.org/", className = "com.checkbox.ListSurveyResponses")
    @ResponseWrapper(localName = "ListSurveyResponsesResponse", targetNamespace = "http://tempuri.org/", className = "com.checkbox.ListSurveyResponsesResponse")
    public ServiceOperationResultOfPagedListResultOfArrayOfResponseDataVUqw3SxCVUqw3SxC listSurveyResponses(
            @WebParam(name = "authTicket", targetNamespace = "http://tempuri.org/")
            String authTicket,
            @WebParam(name = "surveyId", targetNamespace = "http://tempuri.org/")
            Integer surveyId,
            @WebParam(name = "pageNumber", targetNamespace = "http://tempuri.org/")
            Integer pageNumber,
            @WebParam(name = "resultsPerPage", targetNamespace = "http://tempuri.org/")
            Integer resultsPerPage,
            @WebParam(name = "filterField", targetNamespace = "http://tempuri.org/")
            String filterField,
            @WebParam(name = "filterValue", targetNamespace = "http://tempuri.org/")
            String filterValue,
            @WebParam(name = "sortField", targetNamespace = "http://tempuri.org/")
            String sortField,
            @WebParam(name = "sortAscending", targetNamespace = "http://tempuri.org/")
            Boolean sortAscending);

    /**
     * 
     * @param authTicket
     * @param dateFieldName
     * @param sortField
     * @param filterValue
     * @param resultsPerPage
     * @param sortAscending
     * @param filterField
     * @param pageNumber
     * @param period
     * @param surveyId
     * @return
     *     returns com.checkbox.ServiceOperationResultOfPagedListResultOfArrayOfResponseDataVUqw3SxCVUqw3SxC
     */
    @WebMethod(operationName = "ListSurveyResponsesByPeriod", action = "http://tempuri.org/IResponseDataService/ListSurveyResponsesByPeriod")
    @WebResult(name = "ListSurveyResponsesByPeriodResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "ListSurveyResponsesByPeriod", targetNamespace = "http://tempuri.org/", className = "com.checkbox.ListSurveyResponsesByPeriod")
    @ResponseWrapper(localName = "ListSurveyResponsesByPeriodResponse", targetNamespace = "http://tempuri.org/", className = "com.checkbox.ListSurveyResponsesByPeriodResponse")
    public ServiceOperationResultOfPagedListResultOfArrayOfResponseDataVUqw3SxCVUqw3SxC listSurveyResponsesByPeriod(
            @WebParam(name = "authTicket", targetNamespace = "http://tempuri.org/")
            String authTicket,
            @WebParam(name = "surveyId", targetNamespace = "http://tempuri.org/")
            Integer surveyId,
            @WebParam(name = "pageNumber", targetNamespace = "http://tempuri.org/")
            Integer pageNumber,
            @WebParam(name = "resultsPerPage", targetNamespace = "http://tempuri.org/")
            Integer resultsPerPage,
            @WebParam(name = "filterField", targetNamespace = "http://tempuri.org/")
            String filterField,
            @WebParam(name = "filterValue", targetNamespace = "http://tempuri.org/")
            String filterValue,
            @WebParam(name = "sortField", targetNamespace = "http://tempuri.org/")
            String sortField,
            @WebParam(name = "sortAscending", targetNamespace = "http://tempuri.org/")
            Boolean sortAscending,
            @WebParam(name = "period", targetNamespace = "http://tempuri.org/")
            Integer period,
            @WebParam(name = "dateFieldName", targetNamespace = "http://tempuri.org/")
            String dateFieldName);

    /**
     * 
     * @param authTicket
     * @param responseList
     * @param surveyId
     * @return
     *     returns com.checkbox.ServiceOperationResultOfanyType
     */
    @WebMethod(operationName = "DeleteSurveyResponses", action = "http://tempuri.org/IResponseDataService/DeleteSurveyResponses")
    @WebResult(name = "DeleteSurveyResponsesResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "DeleteSurveyResponses", targetNamespace = "http://tempuri.org/", className = "com.checkbox.DeleteSurveyResponses")
    @ResponseWrapper(localName = "DeleteSurveyResponsesResponse", targetNamespace = "http://tempuri.org/", className = "com.checkbox.DeleteSurveyResponsesResponse")
    public ServiceOperationResultOfanyType deleteSurveyResponses(
            @WebParam(name = "authTicket", targetNamespace = "http://tempuri.org/")
            String authTicket,
            @WebParam(name = "surveyId", targetNamespace = "http://tempuri.org/")
            Integer surveyId,
            @WebParam(name = "responseList", targetNamespace = "http://tempuri.org/")
            ArrayOflong responseList);

    /**
     * 
     * @param authTicket
     * @param surveyId
     * @return
     *     returns com.checkbox.ServiceOperationResultOfanyType
     */
    @WebMethod(operationName = "DeleteAllSurveyResponses", action = "http://tempuri.org/IResponseDataService/DeleteAllSurveyResponses")
    @WebResult(name = "DeleteAllSurveyResponsesResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "DeleteAllSurveyResponses", targetNamespace = "http://tempuri.org/", className = "com.checkbox.DeleteAllSurveyResponses")
    @ResponseWrapper(localName = "DeleteAllSurveyResponsesResponse", targetNamespace = "http://tempuri.org/", className = "com.checkbox.DeleteAllSurveyResponsesResponse")
    public ServiceOperationResultOfanyType deleteAllSurveyResponses(
            @WebParam(name = "authTicket", targetNamespace = "http://tempuri.org/")
            String authTicket,
            @WebParam(name = "surveyId", targetNamespace = "http://tempuri.org/")
            Integer surveyId);

    /**
     * 
     * @param authTicket
     * @param surveyId
     * @return
     *     returns com.checkbox.ServiceOperationResultOfanyType
     */
    @WebMethod(operationName = "DeleteAllSurveyTestResponses", action = "http://tempuri.org/IResponseDataService/DeleteAllSurveyTestResponses")
    @WebResult(name = "DeleteAllSurveyTestResponsesResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "DeleteAllSurveyTestResponses", targetNamespace = "http://tempuri.org/", className = "com.checkbox.DeleteAllSurveyTestResponses")
    @ResponseWrapper(localName = "DeleteAllSurveyTestResponsesResponse", targetNamespace = "http://tempuri.org/", className = "com.checkbox.DeleteAllSurveyTestResponsesResponse")
    public ServiceOperationResultOfanyType deleteAllSurveyTestResponses(
            @WebParam(name = "authTicket", targetNamespace = "http://tempuri.org/")
            String authTicket,
            @WebParam(name = "surveyId", targetNamespace = "http://tempuri.org/")
            Integer surveyId);

    /**
     * 
     * @param authTicket
     * @param searchTerm
     * @return
     *     returns com.checkbox.ServiceOperationResultOfArrayOfGroupedResultOfResponseDataVUqw3SxCVUqw3SxC
     */
    @WebMethod(operationName = "Search", action = "http://tempuri.org/IResponseDataService/Search")
    @WebResult(name = "SearchResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "Search", targetNamespace = "http://tempuri.org/", className = "com.checkbox.Search")
    @ResponseWrapper(localName = "SearchResponse", targetNamespace = "http://tempuri.org/", className = "com.checkbox.SearchResponse")
    public ServiceOperationResultOfArrayOfGroupedResultOfResponseDataVUqw3SxCVUqw3SxC search(
            @WebParam(name = "authTicket", targetNamespace = "http://tempuri.org/")
            String authTicket,
            @WebParam(name = "searchTerm", targetNamespace = "http://tempuri.org/")
            String searchTerm);

    /**
     * 
     * @param authTicket
     * @param surveyId
     * @param numberOfRecentMonths
     * @return
     *     returns com.checkbox.ServiceOperationResultOfstring
     */
    @WebMethod(operationName = "GetLifecycleResponseDataInMonths", action = "http://tempuri.org/IResponseDataService/GetLifecycleResponseDataInMonths")
    @WebResult(name = "GetLifecycleResponseDataInMonthsResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetLifecycleResponseDataInMonths", targetNamespace = "http://tempuri.org/", className = "com.checkbox.GetLifecycleResponseDataInMonths")
    @ResponseWrapper(localName = "GetLifecycleResponseDataInMonthsResponse", targetNamespace = "http://tempuri.org/", className = "com.checkbox.GetLifecycleResponseDataInMonthsResponse")
    public ServiceOperationResultOfstring getLifecycleResponseDataInMonths(
            @WebParam(name = "authTicket", targetNamespace = "http://tempuri.org/")
            String authTicket,
            @WebParam(name = "surveyId", targetNamespace = "http://tempuri.org/")
            Integer surveyId,
            @WebParam(name = "numberOfRecentMonths", targetNamespace = "http://tempuri.org/")
            Integer numberOfRecentMonths);

    /**
     * 
     * @param authTicket
     * @param numberOfPeriods
     * @param periodLengthInDays
     * @param surveyId
     * @return
     *     returns com.checkbox.ServiceOperationResultOfstring
     */
    @WebMethod(operationName = "GetLifecycleResponseDataInDays", action = "http://tempuri.org/IResponseDataService/GetLifecycleResponseDataInDays")
    @WebResult(name = "GetLifecycleResponseDataInDaysResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetLifecycleResponseDataInDays", targetNamespace = "http://tempuri.org/", className = "com.checkbox.GetLifecycleResponseDataInDays")
    @ResponseWrapper(localName = "GetLifecycleResponseDataInDaysResponse", targetNamespace = "http://tempuri.org/", className = "com.checkbox.GetLifecycleResponseDataInDaysResponse")
    public ServiceOperationResultOfstring getLifecycleResponseDataInDays(
            @WebParam(name = "authTicket", targetNamespace = "http://tempuri.org/")
            String authTicket,
            @WebParam(name = "surveyId", targetNamespace = "http://tempuri.org/")
            Integer surveyId,
            @WebParam(name = "periodLengthInDays", targetNamespace = "http://tempuri.org/")
            Integer periodLengthInDays,
            @WebParam(name = "numberOfPeriods", targetNamespace = "http://tempuri.org/")
            Integer numberOfPeriods);

    /**
     * 
     * @param authTicket
     * @param numberOfPeriods
     * @param periodLengthInDays
     * @param surveyId
     * @return
     *     returns com.checkbox.ServiceOperationResultOfResponseAggregatedDataVUqw3SxC
     */
    @WebMethod(operationName = "GetLifecycleAggregatedResponseDataInDays", action = "http://tempuri.org/IResponseDataService/GetLifecycleAggregatedResponseDataInDays")
    @WebResult(name = "GetLifecycleAggregatedResponseDataInDaysResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetLifecycleAggregatedResponseDataInDays", targetNamespace = "http://tempuri.org/", className = "com.checkbox.GetLifecycleAggregatedResponseDataInDays")
    @ResponseWrapper(localName = "GetLifecycleAggregatedResponseDataInDaysResponse", targetNamespace = "http://tempuri.org/", className = "com.checkbox.GetLifecycleAggregatedResponseDataInDaysResponse")
    public ServiceOperationResultOfResponseAggregatedDataVUqw3SxC getLifecycleAggregatedResponseDataInDays(
            @WebParam(name = "authTicket", targetNamespace = "http://tempuri.org/")
            String authTicket,
            @WebParam(name = "surveyId", targetNamespace = "http://tempuri.org/")
            Integer surveyId,
            @WebParam(name = "periodLengthInDays", targetNamespace = "http://tempuri.org/")
            Integer periodLengthInDays,
            @WebParam(name = "numberOfPeriods", targetNamespace = "http://tempuri.org/")
            Integer numberOfPeriods);

    /**
     * 
     * @param authTicket
     * @param languageCode
     * @param responseGuid
     * @param surveyId
     * @return
     *     returns com.checkbox.ServiceOperationResultOfArrayOfResponseItemAnswerDataVUqw3SxC
     */
    @WebMethod(operationName = "GetAnswersForResponseByGuid", action = "http://tempuri.org/IResponseDataService/GetAnswersForResponseByGuid")
    @WebResult(name = "GetAnswersForResponseByGuidResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetAnswersForResponseByGuid", targetNamespace = "http://tempuri.org/", className = "com.checkbox.GetAnswersForResponseByGuid")
    @ResponseWrapper(localName = "GetAnswersForResponseByGuidResponse", targetNamespace = "http://tempuri.org/", className = "com.checkbox.GetAnswersForResponseByGuidResponse")
    public ServiceOperationResultOfArrayOfResponseItemAnswerDataVUqw3SxC getAnswersForResponseByGuid(
            @WebParam(name = "authTicket", targetNamespace = "http://tempuri.org/")
            String authTicket,
            @WebParam(name = "surveyId", targetNamespace = "http://tempuri.org/")
            Integer surveyId,
            @WebParam(name = "languageCode", targetNamespace = "http://tempuri.org/")
            String languageCode,
            @WebParam(name = "responseGuid", targetNamespace = "http://tempuri.org/")
            String responseGuid);

    /**
     * 
     * @param filterField
     * @param authToken
     * @param includeOpenEndedResults
     * @param period
     * @param dtEnd
     * @param filterValue
     * @param sortField
     * @param dtStart
     * @param includeAliases
     * @param resultsPerPage
     * @param sortAscending
     * @param pageNumber
     * @param includeIncompleteResponses
     * @param detailedUserInfo
     * @param surveyId
     * @param includeHiddenItems
     * @param detailedResponseInfo
     * @param stripHTMLTagsFromAnswers
     * @return
     *     returns com.checkbox.ServiceOperationResultOfPagedListResultOfResponseExportDataVUqw3SxCVUqw3SxC
     */
    @WebMethod(operationName = "ExportResponses", action = "http://tempuri.org/IResponseDataService/ExportResponses")
    @WebResult(name = "ExportResponsesResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "ExportResponses", targetNamespace = "http://tempuri.org/", className = "com.checkbox.ExportResponses")
    @ResponseWrapper(localName = "ExportResponsesResponse", targetNamespace = "http://tempuri.org/", className = "com.checkbox.ExportResponsesResponse")
    public ServiceOperationResultOfPagedListResultOfResponseExportDataVUqw3SxCVUqw3SxC exportResponses(
            @WebParam(name = "authToken", targetNamespace = "http://tempuri.org/")
            String authToken,
            @WebParam(name = "surveyId", targetNamespace = "http://tempuri.org/")
            Integer surveyId,
            @WebParam(name = "pageNumber", targetNamespace = "http://tempuri.org/")
            Integer pageNumber,
            @WebParam(name = "resultsPerPage", targetNamespace = "http://tempuri.org/")
            Integer resultsPerPage,
            @WebParam(name = "filterField", targetNamespace = "http://tempuri.org/")
            String filterField,
            @WebParam(name = "filterValue", targetNamespace = "http://tempuri.org/")
            String filterValue,
            @WebParam(name = "sortField", targetNamespace = "http://tempuri.org/")
            String sortField,
            @WebParam(name = "sortAscending", targetNamespace = "http://tempuri.org/")
            Boolean sortAscending,
            @WebParam(name = "period", targetNamespace = "http://tempuri.org/")
            Integer period,
            @WebParam(name = "dtStart", targetNamespace = "http://tempuri.org/")
            XMLGregorianCalendar dtStart,
            @WebParam(name = "dtEnd", targetNamespace = "http://tempuri.org/")
            XMLGregorianCalendar dtEnd,
            @WebParam(name = "DetailedResponseInfo", targetNamespace = "http://tempuri.org/")
            Boolean detailedResponseInfo,
            @WebParam(name = "DetailedUserInfo", targetNamespace = "http://tempuri.org/")
            Boolean detailedUserInfo,
            @WebParam(name = "IncludeOpenEndedResults", targetNamespace = "http://tempuri.org/")
            Boolean includeOpenEndedResults,
            @WebParam(name = "IncludeAliases", targetNamespace = "http://tempuri.org/")
            Boolean includeAliases,
            @WebParam(name = "IncludeHiddenItems", targetNamespace = "http://tempuri.org/")
            Boolean includeHiddenItems,
            @WebParam(name = "IncludeIncompleteResponses", targetNamespace = "http://tempuri.org/")
            Boolean includeIncompleteResponses,
            @WebParam(name = "StripHTMLTagsFromAnswers", targetNamespace = "http://tempuri.org/")
            Boolean stripHTMLTagsFromAnswers);

    /**
     * 
     * @param filterField
     * @param authToken
     * @param includeOpenEndedResults
     * @param stripHTMLTagsFromQuestions
     * @param period
     * @param dtEnd
     * @param mergeAnswersForSelectMany
     * @param filterValue
     * @param sortField
     * @param dtStart
     * @param includeAliases
     * @param resultsPerPage
     * @param sortAscending
     * @param pageNumber
     * @param includeIncompleteResponses
     * @param detailedUserInfo
     * @param surveyId
     * @param includeHiddenItems
     * @param detailedResponseInfo
     * @param stripHTMLTagsFromAnswers
     * @return
     *     returns com.checkbox.ServiceOperationResultOfPagedListResultOfTabularResponseExportDataVUqw3SxCVUqw3SxC
     */
    @WebMethod(operationName = "ExportResponsesTabular", action = "http://tempuri.org/IResponseDataService/ExportResponsesTabular")
    @WebResult(name = "ExportResponsesTabularResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "ExportResponsesTabular", targetNamespace = "http://tempuri.org/", className = "com.checkbox.ExportResponsesTabular")
    @ResponseWrapper(localName = "ExportResponsesTabularResponse", targetNamespace = "http://tempuri.org/", className = "com.checkbox.ExportResponsesTabularResponse")
    public ServiceOperationResultOfPagedListResultOfTabularResponseExportDataVUqw3SxCVUqw3SxC exportResponsesTabular(
            @WebParam(name = "authToken", targetNamespace = "http://tempuri.org/")
            String authToken,
            @WebParam(name = "surveyId", targetNamespace = "http://tempuri.org/")
            Integer surveyId,
            @WebParam(name = "pageNumber", targetNamespace = "http://tempuri.org/")
            Integer pageNumber,
            @WebParam(name = "resultsPerPage", targetNamespace = "http://tempuri.org/")
            Integer resultsPerPage,
            @WebParam(name = "filterField", targetNamespace = "http://tempuri.org/")
            String filterField,
            @WebParam(name = "filterValue", targetNamespace = "http://tempuri.org/")
            String filterValue,
            @WebParam(name = "sortField", targetNamespace = "http://tempuri.org/")
            String sortField,
            @WebParam(name = "sortAscending", targetNamespace = "http://tempuri.org/")
            Boolean sortAscending,
            @WebParam(name = "period", targetNamespace = "http://tempuri.org/")
            Integer period,
            @WebParam(name = "dtStart", targetNamespace = "http://tempuri.org/")
            XMLGregorianCalendar dtStart,
            @WebParam(name = "dtEnd", targetNamespace = "http://tempuri.org/")
            XMLGregorianCalendar dtEnd,
            @WebParam(name = "DetailedResponseInfo", targetNamespace = "http://tempuri.org/")
            Boolean detailedResponseInfo,
            @WebParam(name = "DetailedUserInfo", targetNamespace = "http://tempuri.org/")
            Boolean detailedUserInfo,
            @WebParam(name = "IncludeOpenEndedResults", targetNamespace = "http://tempuri.org/")
            Boolean includeOpenEndedResults,
            @WebParam(name = "IncludeAliases", targetNamespace = "http://tempuri.org/")
            Boolean includeAliases,
            @WebParam(name = "IncludeHiddenItems", targetNamespace = "http://tempuri.org/")
            Boolean includeHiddenItems,
            @WebParam(name = "IncludeIncompleteResponses", targetNamespace = "http://tempuri.org/")
            Boolean includeIncompleteResponses,
            @WebParam(name = "StripHTMLTagsFromAnswers", targetNamespace = "http://tempuri.org/")
            Boolean stripHTMLTagsFromAnswers,
            @WebParam(name = "StripHTMLTagsFromQuestions", targetNamespace = "http://tempuri.org/")
            Boolean stripHTMLTagsFromQuestions,
            @WebParam(name = "MergeAnswersForSelectMany", targetNamespace = "http://tempuri.org/")
            Boolean mergeAnswersForSelectMany);

}
