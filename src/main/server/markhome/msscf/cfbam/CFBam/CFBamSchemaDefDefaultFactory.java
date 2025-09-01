
// Description: Java 11 Default Factory implementation for SchemaDef.

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
	 *	CFBamSchemaDefFactory implementation for SchemaDef
	 */
public class CFBamSchemaDefDefaultFactory
	implements ICFBamSchemaDefFactory
{
	public CFBamSchemaDefDefaultFactory() {
	}

	public CFBamSchemaDefByCTenantIdxKey newCTenantIdxKey() {
		CFBamSchemaDefByCTenantIdxKey key =
			new CFBamSchemaDefByCTenantIdxKey();
		return( key );
	}

	public CFBamSchemaDefByMinorVersionIdxKey newMinorVersionIdxKey() {
		CFBamSchemaDefByMinorVersionIdxKey key =
			new CFBamSchemaDefByMinorVersionIdxKey();
		return( key );
	}

	public CFBamSchemaDefByUNameIdxKey newUNameIdxKey() {
		CFBamSchemaDefByUNameIdxKey key =
			new CFBamSchemaDefByUNameIdxKey();
		return( key );
	}

	public CFBamSchemaDefByAuthEMailIdxKey newAuthEMailIdxKey() {
		CFBamSchemaDefByAuthEMailIdxKey key =
			new CFBamSchemaDefByAuthEMailIdxKey();
		return( key );
	}

	public CFBamSchemaDefByProjectURLIdxKey newProjectURLIdxKey() {
		CFBamSchemaDefByProjectURLIdxKey key =
			new CFBamSchemaDefByProjectURLIdxKey();
		return( key );
	}

	public CFBamSchemaDefByPubURIIdxKey newPubURIIdxKey() {
		CFBamSchemaDefByPubURIIdxKey key =
			new CFBamSchemaDefByPubURIIdxKey();
		return( key );
	}

	public CFBamSchemaDefBuff newBuff() {
		CFBamSchemaDefBuff buff =
			new CFBamSchemaDefBuff();
		return( buff );
	}

	public CFBamSchemaDefHBuff newHBuff() {
		CFBamSchemaDefHBuff hbuff =
			new CFBamSchemaDefHBuff();
		return( hbuff );
	}
}
