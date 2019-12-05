package com.util.template.commons;

public enum ErrorCode {
    NotImplemented, NoSuchNumber, MalformedNumber, MalformedEnum, NumberReservationFailed, NumberReleaseFailed, NumberStatusIncorrect, LineAddFailed, LineUpdateFailed, LineIdExists, LineStatusIncorrect, AccountStatusIncorrect, NoSuchLine, NoSuchDevice, NoSuchSimCard, MalformedLineId, MalformedDeviceId, AttributesNotAllowed, AttributesMissing, XfinityWiFiProvisioningFailed, IMSProvisioningFailed, InternalError, RokeUpdateFailed, TrackingCodeAddFailed, NoSuchAccount, AccountIdExists, AccountUpdateFailed, NoSuchAddress, EncryptFailure, MDNExists, NoLinesFound, NotANumber, LineServiceException,
    // getGUIDs
    NoSuchAccountNumber, MalformedCustomerGuid, NoSuchAccountGuid, NoSuchCustomerGuid,
    // eligibility
    MalformedCredentials, MalformedAccessToken,
    // customer information
    MalformedAccountGuid,
    // warnings
    AccountAddFailed, AccountStatusNotActive, NoHSDService, NotAnAppropriateRole, BalancePassedDue, AccountTypeNotResidential,
    // credit check
    NoSuchCustomer,
    // neustar
    CarrierSearchServiceCallFailed,
    // vvm
    VoicemailBoxCreateFailed, InvalidMdn, VoicemailBoxDeleteFailed, VoicemailBoxRestoreFailed, VoicemailBoxRetrieveFailed,
    // aaa
    AAAProvisioningFailed, AAARepositoryFailureInDeregister, CSPRepositoryException, ErrorInPolicyService, MissingPolicyServiceParameters, AAARepositoryExceptionInDeregister,
    // CustomerCareServiceProperties
    CustomerCareServiceException, NoResultsFound,
    // Database exception
    DatabaseException,

    // ESD
    ESDRepositoryCallFailed, ESDRepositoryAddLOBFailed, ESDRepositoryDeactivateLOBFailed, ESDRepositorySuspendLOBFailed, ESDRepositoryCreateLineFailed, ESDRepositoryDeactiveLineFailed, ESDRepositorySuspendLineFailed,
    // IAndCService
    IdentityCredentialServiceException,
    // BearerTokenClient
    BearerTokenCallFailed,
    // locationServiceException
    LocationServiceException,
    // BillingRepository
    BillingRepositoryAddCallFailed, BillingRepositoryRemoveCallFailed,
    // fraud
    FE001, FE002, FE003, FE004, FE005,
    // ATT Route
    ATTRouteRepositoryUpdateFailed, ATTRouteRepositoryCallException, PolicyServiceMissingRequiredFields, PolicyServiceIncorrectCredentials, PolicyServiceRequestError, PolicyServiceNetworkError, PolicyServerBusy,
    // BuyFlow
    BuyFlowStateSaveFailed,
    // IDSP Analytics
    IDAnalyticsException, InvalidInputFields,
    // ILC
    InternalCreditCheckServiceFailed,
    // CallAgentWaitTimeServiecException
    CallbackServiceException, CallbackAddFailed, NoSuchCallbackIdFound, NoExistingCallbacks,
    // ECC
    ExternalCreditCheckServiceFailed,
    // Legal age verification
    LegalAgeVerificationServiceFailed,
    // Prospect
    ProspectAddFailed,
    // DT Activation
    DTAttributePopulationFailed, NoExistingDeviceFound,
    // OMS
    OrderManagementService,
    // Agent Account Verify
    NoSuchComcastAccountNumber, AgentVerifyServiceException, MalformedVerfiyRequest, UNABLE_TO_GET_CIMA_TOKEN_FOR_CSP, UNABLE_TO_GET_CIMA_TOKEN_FOR_CUSTOMER_CARE,
    // Generic System Level Errors
    INVALID_URL_CONFIGURED, UNABLE_TO_CONNECT_TO_REMOTE_HOST, GENERIC_SYSTEM_ERROR,SPC_ACCOUNT_DIVISION_SERVICE_ERROR,CUSTOMER_INFORMATION_ERROR,
    //ZenDeskSecurity Exception

    //TemplateUtility
    TemplateIdMismatch,

    BUYFLOW_INFOMATION_ERROR
    ,ACCOUNT_SECURITY_SERVICE_FAILED, SECURITY_CODE_ALREADY_USED, INVALID_SECURITY_CODE, SECURITY_CODE_LENGTH_DIGITS_ERROR, SECURITY_CODE_REPEATING_DIGITS, SECURITY_CODE_CONSECUTIVE_DIGITS, SECURITY_CODE_MATCHES_PHONENUMBER, SECURITY_CODE_MATCHES_SSN, SECURITY_CODE_MISMATCH;



}
