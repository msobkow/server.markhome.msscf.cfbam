
// Description: Java 11 Default Factory implementation for HostNode.

/*
 *	server.markhome.msscf.CFBam
 *
 *	Copyright (c) 2020-2025 Mark Stephen Sobkow
 *	
 *
 *	Manufactured by MSS Code Factory 2.13
 */

package server.markhome.msscf.cfbam.CFBam;

import java.lang.reflect.*;
import java.net.*;
import java.rmi.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.cflib.CFLib.*;
import server.markhome.msscf.cfsec.CFSec.*;
import server.markhome.msscf.cfint.CFInt.*;

	/*
	 *	CFBamHostNodeFactory implementation for HostNode
	 */
public class CFBamHostNodeDefaultFactory
	extends CFSecHostNodeDefaultFactory
	implements ICFBamHostNodeFactory
{
	public CFBamHostNodeDefaultFactory() {
		super();
	}

	public CFSecHostNodePKey newPKey() {
		CFSecHostNodePKey pkey =
			new CFSecHostNodePKey();
		return( pkey );
	}

	public CFSecHostNodeHPKey newHPKey() {
		CFSecHostNodeHPKey hpkey =
			new CFSecHostNodeHPKey();
		return( hpkey );
	}

	public CFSecHostNodeByClusterIdxKey newClusterIdxKey() {
		CFSecHostNodeByClusterIdxKey key =
			new CFSecHostNodeByClusterIdxKey();
		return( key );
	}

	public CFSecHostNodeByUDescrIdxKey newUDescrIdxKey() {
		CFSecHostNodeByUDescrIdxKey key =
			new CFSecHostNodeByUDescrIdxKey();
		return( key );
	}

	public CFSecHostNodeByHostNameIdxKey newHostNameIdxKey() {
		CFSecHostNodeByHostNameIdxKey key =
			new CFSecHostNodeByHostNameIdxKey();
		return( key );
	}

	public CFSecHostNodeBuff newBuff() {
		CFSecHostNodeBuff buff =
			new CFSecHostNodeBuff();
		return( buff );
	}

	public CFSecHostNodeHBuff newHBuff() {
		CFSecHostNodeHBuff hbuff =
			new CFSecHostNodeHBuff();
		return( hbuff );
	}
}
