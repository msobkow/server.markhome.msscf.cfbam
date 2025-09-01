
// Description: Java 11 Default Factory implementation for IndexCol.

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
	 *	CFBamIndexColFactory implementation for IndexCol
	 */
public class CFBamIndexColDefaultFactory
	implements ICFBamIndexColFactory
{
	public CFBamIndexColDefaultFactory() {
	}

	public CFBamIndexColPKey newPKey() {
		CFBamIndexColPKey pkey =
			new CFBamIndexColPKey();
		return( pkey );
	}

	public CFBamIndexColHPKey newHPKey() {
		CFBamIndexColHPKey hpkey =
			new CFBamIndexColHPKey();
		return( hpkey );
	}

	public CFBamIndexColByUNameIdxKey newUNameIdxKey() {
		CFBamIndexColByUNameIdxKey key =
			new CFBamIndexColByUNameIdxKey();
		return( key );
	}

	public CFBamIndexColByIdxColTenantIdxKey newIdxColTenantIdxKey() {
		CFBamIndexColByIdxColTenantIdxKey key =
			new CFBamIndexColByIdxColTenantIdxKey();
		return( key );
	}

	public CFBamIndexColByIndexIdxKey newIndexIdxKey() {
		CFBamIndexColByIndexIdxKey key =
			new CFBamIndexColByIndexIdxKey();
		return( key );
	}

	public CFBamIndexColByDefSchemaIdxKey newDefSchemaIdxKey() {
		CFBamIndexColByDefSchemaIdxKey key =
			new CFBamIndexColByDefSchemaIdxKey();
		return( key );
	}

	public CFBamIndexColByColIdxKey newColIdxKey() {
		CFBamIndexColByColIdxKey key =
			new CFBamIndexColByColIdxKey();
		return( key );
	}

	public CFBamIndexColByPrevIdxKey newPrevIdxKey() {
		CFBamIndexColByPrevIdxKey key =
			new CFBamIndexColByPrevIdxKey();
		return( key );
	}

	public CFBamIndexColByNextIdxKey newNextIdxKey() {
		CFBamIndexColByNextIdxKey key =
			new CFBamIndexColByNextIdxKey();
		return( key );
	}

	public CFBamIndexColByIdxPrevIdxKey newIdxPrevIdxKey() {
		CFBamIndexColByIdxPrevIdxKey key =
			new CFBamIndexColByIdxPrevIdxKey();
		return( key );
	}

	public CFBamIndexColByIdxNextIdxKey newIdxNextIdxKey() {
		CFBamIndexColByIdxNextIdxKey key =
			new CFBamIndexColByIdxNextIdxKey();
		return( key );
	}

	public CFBamIndexColBuff newBuff() {
		CFBamIndexColBuff buff =
			new CFBamIndexColBuff();
		return( buff );
	}

	public CFBamIndexColHBuff newHBuff() {
		CFBamIndexColHBuff hbuff =
			new CFBamIndexColHBuff();
		return( hbuff );
	}
}
