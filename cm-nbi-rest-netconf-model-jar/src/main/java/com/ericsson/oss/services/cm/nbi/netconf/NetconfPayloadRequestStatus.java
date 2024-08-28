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
package com.ericsson.oss.services.cm.nbi.netconf;

import com.ericsson.oss.itpf.modeling.annotation.EModel;
import com.ericsson.oss.itpf.modeling.annotation.edt.EdtDefinition;
import com.ericsson.oss.itpf.modeling.annotation.edt.EdtMember;

@EModel(namespace = "OSS_CM_NBI", name = "NetconfPayloadRequestStatus", version = "1.0.0", description = "ENUM for showing status of netconf payload execution")
@EdtDefinition
public enum NetconfPayloadRequestStatus {

    @EdtMember(description = "Holds initiated status", value = 1)
    INITIATED,

    @EdtMember(description = "Holds netconf payload parsing status", value = 2)
    PARSING,

    @EdtMember(description = "Holds inprogress status", value = 3)
    IN_PROGRESS,

    @EdtMember(description = "Holds completed status", value = 4)
    COMPLETED

}