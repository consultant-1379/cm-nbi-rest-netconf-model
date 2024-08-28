package com.ericsson.oss.services.cm.nbi.netconf;
/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2021
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/

import java.util.HashMap;
import java.util.Map;

import com.ericsson.oss.itpf.datalayer.dps.modeling.annotation.OnReadWrite;
import com.ericsson.oss.itpf.datalayer.dps.modeling.annotation.PrimaryTypeAttribute;
import com.ericsson.oss.itpf.datalayer.dps.modeling.annotation.PrimaryTypeDefinition;
import com.ericsson.oss.itpf.datalayer.dps.modeling.annotation.ReadBehavior;
import com.ericsson.oss.itpf.datalayer.dps.modeling.annotation.WriteBehavior;
import com.ericsson.oss.itpf.modeling.annotation.EModel;
import com.ericsson.oss.itpf.modeling.annotation.EModelAttribute;
import com.ericsson.oss.itpf.modeling.annotation.constraints.NotNull;

@EModel(description = "This PO stores information related to CM NBI Netconf Payload request", name = "CmNbiNetconfPayloadRequest", namespace = "OSS_CM_NBI", version = "1.0.0")
@PrimaryTypeDefinition
@OnReadWrite(onRead = ReadBehavior.READ_FROM_PERSISTENT_STORAGE, onWrite = WriteBehavior.WRITE_TO_PERSISTENT_STORAGE_ONLY)
public class CmNbiNetconfPayloadRequest {

    @PrimaryTypeAttribute
    @EModelAttribute(description = "network element name on which netconf payload has to be applied", immutable = true, mandatory = true)
    @NotNull
    private String nodeAddress;

    @PrimaryTypeAttribute
    @EModelAttribute(description = "Identifier for ongoing Netconf payload request", immutable = true, mandatory = true)
    @NotNull
    private String requestId;

    @PrimaryTypeAttribute
    @EModelAttribute(description = "Will hold current status of netconf payload request")
    private NetconfPayloadRequestStatus status;

    @PrimaryTypeAttribute
    @EModelAttribute(description = "Will hold the result of netconf payload request")
    private NetconfPayloadRequestResult result;

    @PrimaryTypeAttribute
    @EModelAttribute(description = "Holds additional information of netconf payload execution i.e, data recived from node, error details, get-config file path etc.")
    private Map<String, Object> additionalInfo = new HashMap<String, Object>();

}
