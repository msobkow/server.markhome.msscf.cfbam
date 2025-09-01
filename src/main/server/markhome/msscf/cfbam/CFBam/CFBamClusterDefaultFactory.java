
// Description: Java 11 Default Factory implementation for Cluster.

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
	 *	CFBamClusterFactory implementation for Cluster
	 */
public class CFBamClusterDefaultFactory
	extends CFSecClusterDefaultFactory
	implements ICFBamClusterFactory
{
	public CFBamClusterDefaultFactory() {
		super();
	}

	public CFSecClusterPKey newPKey() {
		CFSecClusterPKey pkey =
			new CFSecClusterPKey();
		return( pkey );
	}

	public CFSecClusterHPKey newHPKey() {
		CFSecClusterHPKey hpkey =
			new CFSecClusterHPKey();
		return( hpkey );
	}

	public CFSecClusterByUDomNameIdxKey newUDomNameIdxKey() {
		CFSecClusterByUDomNameIdxKey key =
			new CFSecClusterByUDomNameIdxKey();
		return( key );
	}

	public CFSecClusterByUDescrIdxKey newUDescrIdxKey() {
		CFSecClusterByUDescrIdxKey key =
			new CFSecClusterByUDescrIdxKey();
		return( key );
	}

	public CFSecClusterBuff newBuff() {
		CFSecClusterBuff buff =
			new CFSecClusterBuff();
		return( buff );
	}

	public CFSecClusterHBuff newHBuff() {
		CFSecClusterHBuff hbuff =
			new CFSecClusterHBuff();
		return( hbuff );
	}
}
