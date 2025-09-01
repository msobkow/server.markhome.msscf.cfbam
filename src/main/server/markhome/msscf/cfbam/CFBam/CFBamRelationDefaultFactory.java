
// Description: Java 11 Default Factory implementation for Relation.

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
	 *	CFBamRelationFactory implementation for Relation
	 */
public class CFBamRelationDefaultFactory
	implements ICFBamRelationFactory
{
	public CFBamRelationDefaultFactory() {
	}

	public CFBamRelationByUNameIdxKey newUNameIdxKey() {
		CFBamRelationByUNameIdxKey key =
			new CFBamRelationByUNameIdxKey();
		return( key );
	}

	public CFBamRelationByRelnTenantIdxKey newRelnTenantIdxKey() {
		CFBamRelationByRelnTenantIdxKey key =
			new CFBamRelationByRelnTenantIdxKey();
		return( key );
	}

	public CFBamRelationByRelTableIdxKey newRelTableIdxKey() {
		CFBamRelationByRelTableIdxKey key =
			new CFBamRelationByRelTableIdxKey();
		return( key );
	}

	public CFBamRelationByDefSchemaIdxKey newDefSchemaIdxKey() {
		CFBamRelationByDefSchemaIdxKey key =
			new CFBamRelationByDefSchemaIdxKey();
		return( key );
	}

	public CFBamRelationByFromKeyIdxKey newFromKeyIdxKey() {
		CFBamRelationByFromKeyIdxKey key =
			new CFBamRelationByFromKeyIdxKey();
		return( key );
	}

	public CFBamRelationByToTblIdxKey newToTblIdxKey() {
		CFBamRelationByToTblIdxKey key =
			new CFBamRelationByToTblIdxKey();
		return( key );
	}

	public CFBamRelationByToKeyIdxKey newToKeyIdxKey() {
		CFBamRelationByToKeyIdxKey key =
			new CFBamRelationByToKeyIdxKey();
		return( key );
	}

	public CFBamRelationByNarrowedIdxKey newNarrowedIdxKey() {
		CFBamRelationByNarrowedIdxKey key =
			new CFBamRelationByNarrowedIdxKey();
		return( key );
	}

	public CFBamRelationBuff newBuff() {
		CFBamRelationBuff buff =
			new CFBamRelationBuff();
		return( buff );
	}

	public CFBamRelationHBuff newHBuff() {
		CFBamRelationHBuff hbuff =
			new CFBamRelationHBuff();
		return( hbuff );
	}
}
