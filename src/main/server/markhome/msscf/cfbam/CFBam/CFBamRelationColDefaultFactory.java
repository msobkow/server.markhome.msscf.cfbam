
// Description: Java 11 Default Factory implementation for RelationCol.

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
	 *	CFBamRelationColFactory implementation for RelationCol
	 */
public class CFBamRelationColDefaultFactory
	implements ICFBamRelationColFactory
{
	public CFBamRelationColDefaultFactory() {
	}

	public CFBamRelationColPKey newPKey() {
		CFBamRelationColPKey pkey =
			new CFBamRelationColPKey();
		return( pkey );
	}

	public CFBamRelationColHPKey newHPKey() {
		CFBamRelationColHPKey hpkey =
			new CFBamRelationColHPKey();
		return( hpkey );
	}

	public CFBamRelationColByUNameIdxKey newUNameIdxKey() {
		CFBamRelationColByUNameIdxKey key =
			new CFBamRelationColByUNameIdxKey();
		return( key );
	}

	public CFBamRelationColByRelColTenantIdxKey newRelColTenantIdxKey() {
		CFBamRelationColByRelColTenantIdxKey key =
			new CFBamRelationColByRelColTenantIdxKey();
		return( key );
	}

	public CFBamRelationColByRelationIdxKey newRelationIdxKey() {
		CFBamRelationColByRelationIdxKey key =
			new CFBamRelationColByRelationIdxKey();
		return( key );
	}

	public CFBamRelationColByDefSchemaIdxKey newDefSchemaIdxKey() {
		CFBamRelationColByDefSchemaIdxKey key =
			new CFBamRelationColByDefSchemaIdxKey();
		return( key );
	}

	public CFBamRelationColByFromColIdxKey newFromColIdxKey() {
		CFBamRelationColByFromColIdxKey key =
			new CFBamRelationColByFromColIdxKey();
		return( key );
	}

	public CFBamRelationColByToColIdxKey newToColIdxKey() {
		CFBamRelationColByToColIdxKey key =
			new CFBamRelationColByToColIdxKey();
		return( key );
	}

	public CFBamRelationColByPrevIdxKey newPrevIdxKey() {
		CFBamRelationColByPrevIdxKey key =
			new CFBamRelationColByPrevIdxKey();
		return( key );
	}

	public CFBamRelationColByNextIdxKey newNextIdxKey() {
		CFBamRelationColByNextIdxKey key =
			new CFBamRelationColByNextIdxKey();
		return( key );
	}

	public CFBamRelationColByRelPrevIdxKey newRelPrevIdxKey() {
		CFBamRelationColByRelPrevIdxKey key =
			new CFBamRelationColByRelPrevIdxKey();
		return( key );
	}

	public CFBamRelationColByRelNextIdxKey newRelNextIdxKey() {
		CFBamRelationColByRelNextIdxKey key =
			new CFBamRelationColByRelNextIdxKey();
		return( key );
	}

	public CFBamRelationColBuff newBuff() {
		CFBamRelationColBuff buff =
			new CFBamRelationColBuff();
		return( buff );
	}

	public CFBamRelationColHBuff newHBuff() {
		CFBamRelationColHBuff hbuff =
			new CFBamRelationColHBuff();
		return( hbuff );
	}
}
