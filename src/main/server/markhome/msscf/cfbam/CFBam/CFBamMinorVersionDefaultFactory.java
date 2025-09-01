
// Description: Java 11 Default Factory implementation for MinorVersion.

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
	 *	CFBamMinorVersionFactory implementation for MinorVersion
	 */
public class CFBamMinorVersionDefaultFactory
	extends CFIntMinorVersionDefaultFactory
	implements ICFBamMinorVersionFactory
{
	public CFBamMinorVersionDefaultFactory() {
		super();
	}

	public CFIntMinorVersionPKey newPKey() {
		CFIntMinorVersionPKey pkey =
			new CFIntMinorVersionPKey();
		return( pkey );
	}

	public CFIntMinorVersionHPKey newHPKey() {
		CFIntMinorVersionHPKey hpkey =
			new CFIntMinorVersionHPKey();
		return( hpkey );
	}

	public CFIntMinorVersionByTenantIdxKey newTenantIdxKey() {
		CFIntMinorVersionByTenantIdxKey key =
			new CFIntMinorVersionByTenantIdxKey();
		return( key );
	}

	public CFIntMinorVersionByMajorVerIdxKey newMajorVerIdxKey() {
		CFIntMinorVersionByMajorVerIdxKey key =
			new CFIntMinorVersionByMajorVerIdxKey();
		return( key );
	}

	public CFIntMinorVersionByNameIdxKey newNameIdxKey() {
		CFIntMinorVersionByNameIdxKey key =
			new CFIntMinorVersionByNameIdxKey();
		return( key );
	}

	public CFIntMinorVersionBuff newBuff() {
		CFIntMinorVersionBuff buff =
			new CFIntMinorVersionBuff();
		return( buff );
	}

	public CFIntMinorVersionHBuff newHBuff() {
		CFIntMinorVersionHBuff hbuff =
			new CFIntMinorVersionHBuff();
		return( hbuff );
	}
}
