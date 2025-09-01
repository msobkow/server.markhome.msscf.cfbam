
// Description: Java 11 Default Factory implementation for SecGroup.

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
	 *	CFBamSecGroupFactory implementation for SecGroup
	 */
public class CFBamSecGroupDefaultFactory
	extends CFSecSecGroupDefaultFactory
	implements ICFBamSecGroupFactory
{
	public CFBamSecGroupDefaultFactory() {
		super();
	}

	public CFSecSecGroupPKey newPKey() {
		CFSecSecGroupPKey pkey =
			new CFSecSecGroupPKey();
		return( pkey );
	}

	public CFSecSecGroupHPKey newHPKey() {
		CFSecSecGroupHPKey hpkey =
			new CFSecSecGroupHPKey();
		return( hpkey );
	}

	public CFSecSecGroupByClusterIdxKey newClusterIdxKey() {
		CFSecSecGroupByClusterIdxKey key =
			new CFSecSecGroupByClusterIdxKey();
		return( key );
	}

	public CFSecSecGroupByClusterVisIdxKey newClusterVisIdxKey() {
		CFSecSecGroupByClusterVisIdxKey key =
			new CFSecSecGroupByClusterVisIdxKey();
		return( key );
	}

	public CFSecSecGroupByUNameIdxKey newUNameIdxKey() {
		CFSecSecGroupByUNameIdxKey key =
			new CFSecSecGroupByUNameIdxKey();
		return( key );
	}

	public CFSecSecGroupBuff newBuff() {
		CFSecSecGroupBuff buff =
			new CFSecSecGroupBuff();
		return( buff );
	}

	public CFSecSecGroupHBuff newHBuff() {
		CFSecSecGroupHBuff hbuff =
			new CFSecSecGroupHBuff();
		return( hbuff );
	}
}
