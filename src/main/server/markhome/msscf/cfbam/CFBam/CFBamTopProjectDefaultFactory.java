
// Description: Java 11 Default Factory implementation for TopProject.

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
	 *	CFBamTopProjectFactory implementation for TopProject
	 */
public class CFBamTopProjectDefaultFactory
	extends CFIntTopProjectDefaultFactory
	implements ICFBamTopProjectFactory
{
	public CFBamTopProjectDefaultFactory() {
		super();
	}

	public CFIntTopProjectPKey newPKey() {
		CFIntTopProjectPKey pkey =
			new CFIntTopProjectPKey();
		return( pkey );
	}

	public CFIntTopProjectHPKey newHPKey() {
		CFIntTopProjectHPKey hpkey =
			new CFIntTopProjectHPKey();
		return( hpkey );
	}

	public CFIntTopProjectByTenantIdxKey newTenantIdxKey() {
		CFIntTopProjectByTenantIdxKey key =
			new CFIntTopProjectByTenantIdxKey();
		return( key );
	}

	public CFIntTopProjectByTopDomainIdxKey newTopDomainIdxKey() {
		CFIntTopProjectByTopDomainIdxKey key =
			new CFIntTopProjectByTopDomainIdxKey();
		return( key );
	}

	public CFIntTopProjectByNameIdxKey newNameIdxKey() {
		CFIntTopProjectByNameIdxKey key =
			new CFIntTopProjectByNameIdxKey();
		return( key );
	}

	public CFIntTopProjectBuff newBuff() {
		CFIntTopProjectBuff buff =
			new CFIntTopProjectBuff();
		return( buff );
	}

	public CFIntTopProjectHBuff newHBuff() {
		CFIntTopProjectHBuff hbuff =
			new CFIntTopProjectHBuff();
		return( hbuff );
	}
}
