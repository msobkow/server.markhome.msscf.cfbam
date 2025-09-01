
// Description: Java 11 Default Factory implementation for MajorVersion.

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
	 *	CFBamMajorVersionFactory implementation for MajorVersion
	 */
public class CFBamMajorVersionDefaultFactory
	extends CFIntMajorVersionDefaultFactory
	implements ICFBamMajorVersionFactory
{
	public CFBamMajorVersionDefaultFactory() {
		super();
	}

	public CFIntMajorVersionPKey newPKey() {
		CFIntMajorVersionPKey pkey =
			new CFIntMajorVersionPKey();
		return( pkey );
	}

	public CFIntMajorVersionHPKey newHPKey() {
		CFIntMajorVersionHPKey hpkey =
			new CFIntMajorVersionHPKey();
		return( hpkey );
	}

	public CFIntMajorVersionByTenantIdxKey newTenantIdxKey() {
		CFIntMajorVersionByTenantIdxKey key =
			new CFIntMajorVersionByTenantIdxKey();
		return( key );
	}

	public CFIntMajorVersionBySubProjectIdxKey newSubProjectIdxKey() {
		CFIntMajorVersionBySubProjectIdxKey key =
			new CFIntMajorVersionBySubProjectIdxKey();
		return( key );
	}

	public CFIntMajorVersionByNameIdxKey newNameIdxKey() {
		CFIntMajorVersionByNameIdxKey key =
			new CFIntMajorVersionByNameIdxKey();
		return( key );
	}

	public CFIntMajorVersionBuff newBuff() {
		CFIntMajorVersionBuff buff =
			new CFIntMajorVersionBuff();
		return( buff );
	}

	public CFIntMajorVersionHBuff newHBuff() {
		CFIntMajorVersionHBuff hbuff =
			new CFIntMajorVersionHBuff();
		return( hbuff );
	}
}
