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

import com.ericsson.oss.itpf.modeling.annotation.EModel;
import com.ericsson.oss.itpf.modeling.annotation.EModelAttribute;
import com.ericsson.oss.itpf.modeling.annotation.eventtype.EventAttribute;
import com.ericsson.oss.itpf.modeling.annotation.eventtype.EventTypeDefinition;
import com.ericsson.oss.mediation.sdk.event.MediationTaskRequest;

/**
 * Event that is sent to trigger the mediation flow to apply NETCONF configuration on the node.
 */
@EModel(namespace = "OSS_CM_NBI", name = "ApplyNetconfPayloadEvent", version = "1.0.0", description = "Kick off apply NETCONF payload flow in mediation")
@EventTypeDefinition(channelUrn = "//global/ClusteredEventBasedMediationClient")
public class ApplyNetconfPayloadEvent extends MediationTaskRequest {
    private static final long serialVersionUID = 6173101258412000217L;

    @EModelAttribute(mandatory = true, description = "Netconf configuration payload to apply.")
    @EventAttribute(filterable = false)
    private String cmNbiNetconfPayload;

    @EModelAttribute(mandatory = true, description = "Unique identifier for this request.")
    @EventAttribute(filterable = true)
    private String netconfPayloadRequestId;

    @EModelAttribute(mandatory = true, description = "Persistence object id, this is to track the status of netconf payload execution.")
    @EventAttribute(filterable = true)
    private Long netconfPayloadRequestPoId;

    public String getCmNbiNetconfPayload() {
	return cmNbiNetconfPayload;
    }

    public void setCmNbiNetconfPayload(String cmNbiNetconfPayload) {
	this.cmNbiNetconfPayload = cmNbiNetconfPayload;
    }

    public String getNetconfPayloadRequestId() {
	return netconfPayloadRequestId;
    }

    public void setNetconfPayloadRequestId(String netconfPayloadRequestId) {
	this.netconfPayloadRequestId = netconfPayloadRequestId;
    }

    public Long getNetconfPayloadRequestPoId() {
	return netconfPayloadRequestPoId;
    }

    public void setNetconfPayloadRequestPoId(Long netconfPayloadRequestPoId) {
	this.netconfPayloadRequestPoId = netconfPayloadRequestPoId;
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = super.hashCode();
	result = prime * result + ((cmNbiNetconfPayload == null) ? 0 : cmNbiNetconfPayload.hashCode());
	result = prime * result + ((netconfPayloadRequestId == null) ? 0 : netconfPayloadRequestId.hashCode());

	return result;
    }

    @Override
    public boolean equals(final Object obj) {
	if (this == obj) {
	    return true;
	}

	if (!super.equals(obj)) {
	    return false;
	}

	if (getClass() != obj.getClass()) {
	    return false;
	}

	final ApplyNetconfPayloadEvent other = (ApplyNetconfPayloadEvent) obj;
	if (cmNbiNetconfPayload == null) {
	    if (other.cmNbiNetconfPayload != null) {
		return false;
	    }
	} else if (!cmNbiNetconfPayload.equals(other.cmNbiNetconfPayload)) {
	    return false;
	}

	if (netconfPayloadRequestId == null) {
	    if (other.netconfPayloadRequestId != null) {
		return false;
	    }
	} else if (!netconfPayloadRequestId.equals(other.netconfPayloadRequestId)) {
	    return false;
	}

	return true;
    }
}
