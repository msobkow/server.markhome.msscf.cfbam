
// Description: Java 11 Default Factory implementation for SubProject.

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
	 *	CFBamSubProjectFactory implementation for SubProject
	 */
public class CFBamSubProjectDefaultFactory
	extends CFIntSubProjectDefaultFactory
	implements ICFBamSubProjectFactory
{
	public CFBamSubProjectDefaultFactory() {
		super();
	}

	public CFIntSubProjectPKey newPKey() {
		CFIntSubProjectPKey pkey =
			new CFIntSubProjectPKey();
		return( pkey );
	}

	public CFIntSubProjectHPKey newHPKey() {
		CFIntSubProjectHPKey hpkey =
			new CFIntSubProjectHPKey();
		return( hpkey );
	}

	public CFIntSubProjectByTenantIdxKey newTenantIdxKey() {
		CFIntSubProjectByTenantIdxKey key =
			new CFIntSubProjectByTenantIdxKey();
		return( key );
	}

	public CFIntSubProjectByTopProjectIdxKey newTopProjectIdxKey() {
		CFIntSubProjectByTopProjectIdxKey key =
			new CFIntSubProjectByTopProjectIdxKey();
		return( key );
	}

	public CFIntSubProjectByNameIdxKey newNameIdxKey() {
		CFIntSubProjectByNameIdxKey key =
			new CFIntSubProjectByNameIdxKey();
		return( key );
	}

	public CFIntSubProjectBuff newBuff() {
		CFIntSubProjectBuff buff =
			new CFIntSubProjectBuff();
		return( buff );
	}

	public CFIntSubProjectHBuff newHBuff() {
		CFIntSubProjectHBuff hbuff =
			new CFIntSubProjectHBuff();
		return( hbuff );
	}
}
