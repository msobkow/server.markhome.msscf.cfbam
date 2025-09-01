
// Description: Java 11 Default Factory implementation for SchemaRef.

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
	 *	CFBamSchemaRefFactory implementation for SchemaRef
	 */
public class CFBamSchemaRefDefaultFactory
	implements ICFBamSchemaRefFactory
{
	public CFBamSchemaRefDefaultFactory() {
	}

	public CFBamSchemaRefBySchemaIdxKey newSchemaIdxKey() {
		CFBamSchemaRefBySchemaIdxKey key =
			new CFBamSchemaRefBySchemaIdxKey();
		return( key );
	}

	public CFBamSchemaRefByUNameIdxKey newUNameIdxKey() {
		CFBamSchemaRefByUNameIdxKey key =
			new CFBamSchemaRefByUNameIdxKey();
		return( key );
	}

	public CFBamSchemaRefByRefSchemaIdxKey newRefSchemaIdxKey() {
		CFBamSchemaRefByRefSchemaIdxKey key =
			new CFBamSchemaRefByRefSchemaIdxKey();
		return( key );
	}

	public CFBamSchemaRefByPrevIdxKey newPrevIdxKey() {
		CFBamSchemaRefByPrevIdxKey key =
			new CFBamSchemaRefByPrevIdxKey();
		return( key );
	}

	public CFBamSchemaRefByNextIdxKey newNextIdxKey() {
		CFBamSchemaRefByNextIdxKey key =
			new CFBamSchemaRefByNextIdxKey();
		return( key );
	}

	public CFBamSchemaRefBuff newBuff() {
		CFBamSchemaRefBuff buff =
			new CFBamSchemaRefBuff();
		return( buff );
	}

	public CFBamSchemaRefHBuff newHBuff() {
		CFBamSchemaRefHBuff hbuff =
			new CFBamSchemaRefHBuff();
		return( hbuff );
	}
}
