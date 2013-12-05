package org.apache.usergrid.persistence.collection.mvcc.stage.impl.delete;


import java.util.UUID;

import org.apache.usergrid.persistence.collection.EntityCollection;
import org.apache.usergrid.persistence.collection.mvcc.stage.CollectionEvent;
import org.apache.usergrid.persistence.collection.mvcc.stage.Result;


/** @author tnine */
public class DeleteStart extends CollectionEvent<UUID> {

    public DeleteStart( final EntityCollection context, final UUID data, final Result result ) {
        super( context, data, result );
    }
}