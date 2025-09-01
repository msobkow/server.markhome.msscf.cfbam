
// Description: Java 11 Default Factory implementation for Index.

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
	 *	CFBamIndexFactory implementation for Index
	 */
public class CFBamIndexDefaultFactory
	implements ICFBamIndexFactory
{
	public CFBamIndexDefaultFactory() {
	}

	public CFBamIndexByUNameIdxKey newUNameIdxKey() {
		CFBamIndexByUNameIdxKey key =
			new CFBamIndexByUNameIdxKey();
		return( key );
	}

	public CFBamIndexByIndexTenantIdxKey newIndexTenantIdxKey() {
		CFBamIndexByIndexTenantIdxKey key =
			new CFBamIndexByIndexTenantIdxKey();
		return( key );
	}

	public CFBamIndexByIdxTableIdxKey newIdxTableIdxKey() {
		CFBamIndexByIdxTableIdxKey key =
			new CFBamIndexByIdxTableIdxKey();
		return( key );
	}

	public CFBamIndexByDefSchemaIdxKey newDefSchemaIdxKey() {
		CFBamIndexByDefSchemaIdxKey key =
			new CFBamIndexByDefSchemaIdxKey();
		return( key );
	}

	public CFBamIndexBuff newBuff() {
		CFBamIndexBuff buff =
			new CFBamIndexBuff();
		return( buff );
	}

	public CFBamIndexHBuff newHBuff() {
		CFBamIndexHBuff hbuff =
			new CFBamIndexHBuff();
		return( hbuff );
	}
}
