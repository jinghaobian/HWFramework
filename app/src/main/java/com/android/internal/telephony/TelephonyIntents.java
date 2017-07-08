package com.android.internal.telephony;

public class TelephonyIntents extends AbstractTelephonyIntents {
    public static final String ACTION_ANY_DATA_CONNECTION_STATE_CHANGED = "android.intent.action.ANY_DATA_STATE";
    public static final String ACTION_CARRIER_SETUP = "android.intent.action.ACTION_CARRIER_SETUP";
    public static final String ACTION_DATA_CONNECTION_FAILED = "android.intent.action.DATA_CONNECTION_FAILED";
    public static final String ACTION_DATA_CONNECTION_REDIRECTED = "android.intent.action.REDIRECTION_DETECTED";
    public static final String ACTION_DEFAULT_DATA_SUBSCRIPTION_CHANGED = "android.intent.action.ACTION_DEFAULT_DATA_SUBSCRIPTION_CHANGED";
    public static final String ACTION_DEFAULT_SMS_SUBSCRIPTION_CHANGED = "android.intent.action.ACTION_DEFAULT_SMS_SUBSCRIPTION_CHANGED";
    public static final String ACTION_DEFAULT_SUBSCRIPTION_CHANGED = "android.intent.action.ACTION_DEFAULT_SUBSCRIPTION_CHANGED";
    public static final String ACTION_DEFAULT_VOICE_SUBSCRIPTION_CHANGED = "android.intent.action.ACTION_DEFAULT_VOICE_SUBSCRIPTION_CHANGED";
    public static final String ACTION_EMERGENCY_CALLBACK_MODE_CHANGED = "android.intent.action.EMERGENCY_CALLBACK_MODE_CHANGED";
    public static final String ACTION_EMERGENCY_CALL_STATE_CHANGED = "android.intent.action.EMERGENCY_CALL_STATE_CHANGED";
    public static final String ACTION_FORBIDDEN_NO_SERVICE_AUTHORIZATION = "android.intent.action.ACTION_FORBIDDEN_NO_SERVICE_AUTHORIZATION";
    public static final String ACTION_NETWORK_SET_TIME = "android.intent.action.NETWORK_SET_TIME";
    public static final String ACTION_NETWORK_SET_TIMEZONE = "android.intent.action.NETWORK_SET_TIMEZONE";
    public static final String ACTION_RADIO_TECHNOLOGY_CHANGED = "android.intent.action.RADIO_TECHNOLOGY";
    public static final String ACTION_REQUEST_NETWORK_FAILED = "android.intent.action.REQUEST_NETWORK_FAILED";
    public static final String ACTION_REQUEST_OMADM_CONFIGURATION_UPDATE = "com.android.omadm.service.CONFIGURATION_UPDATE";
    public static final String ACTION_SERVICE_STATE_CHANGED = "android.intent.action.SERVICE_STATE";
    public static final String ACTION_SET_RADIO_CAPABILITY_DONE = "android.intent.action.ACTION_SET_RADIO_CAPABILITY_DONE";
    public static final String ACTION_SET_RADIO_CAPABILITY_FAILED = "android.intent.action.ACTION_SET_RADIO_CAPABILITY_FAILED";
    public static final String ACTION_SHOW_NOTICE_ECM_BLOCK_OTHERS = "android.intent.action.ACTION_SHOW_NOTICE_ECM_BLOCK_OTHERS";
    public static final String ACTION_SIGNAL_STRENGTH_CHANGED = "android.intent.action.SIG_STR";
    public static final String ACTION_SIM_STATE_CHANGED = "android.intent.action.SIM_STATE_CHANGED";
    public static final String ACTION_SUBINFO_CONTENT_CHANGE = "android.intent.action.ACTION_SUBINFO_CONTENT_CHANGE";
    public static final String ACTION_SUBINFO_RECORD_UPDATED = "android.intent.action.ACTION_SUBINFO_RECORD_UPDATED";
    public static final String ACTION_SUBSCRIPTION_SET_UICC_RESULT = "android.intent.action.ACTION_SUBSCRIPTION_SET_UICC_RESULT";
    public static final String EXTRA_COLUMN_NAME = "columnName";
    public static final String EXTRA_DATA_SPN = "spnData";
    public static final String EXTRA_INT_CONTENT = "intContent";
    public static final String EXTRA_NEW_SUB_STATE = "newSubState";
    public static final String EXTRA_PLMN = "plmn";
    public static final String EXTRA_RADIO_ACCESS_FAMILY = "rafs";
    public static final String EXTRA_RESULT = "operationResult";
    public static final String EXTRA_SHOW_PLMN = "showPlmn";
    public static final String EXTRA_SHOW_SPN = "showSpn";
    public static final String EXTRA_SPN = "spn";
    public static final String SECRET_CODE_ACTION = "android.provider.Telephony.SECRET_CODE";
    public static final String SPN_STRINGS_UPDATED_ACTION = "android.provider.Telephony.SPN_STRINGS_UPDATED";
}