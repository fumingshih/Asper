/*
 * *************************************************************************************
 *  Copyright (C) 2008 EsperTech, Inc. All rights reserved.                            *
 *  http://esper.codehaus.org                                                          *
 *  http://www.espertech.com                                                           *
 *  ---------------------------------------------------------------------------------- *
 *  The software in this package is published under the terms of the GPL license       *
 *  a copy of which has been included with this distribution in the license.txt file.  *
 * *************************************************************************************
 */

package com.espertech.esper.dataflow.ops.epl;

import com.espertech.esper.client.EventBean;
import com.espertech.esper.epl.core.SelectExprProcessorDeliveryCallback;

public class EPLSelectDeliveryCallback implements SelectExprProcessorDeliveryCallback {
    private Object[] delivered;

    public EventBean selected(Object[] result) {
        delivered = result;
        return null;
    }

    public void reset() {
        delivered = null;
    }

    public Object[] getDelivered() {
        return delivered;
    }
}
