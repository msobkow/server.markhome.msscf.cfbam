
// Description: Java 11 Default Factory implementation for TopDomain.

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
	 *	CFBamTopDomainFactory implementation for TopDomain
	 */
public class CFBamTopDomainDefaultFactory
	extends CFIntTopDomainDefaultFactory
	implements ICFBamTopDomainFactory
{
	public CFBamTopDomainDefaultFactory() {
		super();
	}

	public CFIntTopDomainPKey newPKey() {
		CFIntTopDomainPKey pkey =
			new CFIntTopDomainPKey();
		return( pkey );
	}

	public CFIntTopDomainHPKey newHPKey() {
		CFIntTopDomainHPKey hpkey =
			new CFIntTopDomainHPKey();
		return( hpkey );
	}

	public CFIntTopDomainByTenantIdxKey newTenantIdxKey() {
		CFIntTopDomainByTenantIdxKey key =
			new CFIntTopDomainByTenantIdxKey();
		return( key );
	}

	public CFIntTopDomainByTldIdxKey newTldIdxKey() {
		CFIntTopDomainByTldIdxKey key =
			new CFIntTopDomainByTldIdxKey();
		return( key );
	}

	public CFIntTopDomainByNameIdxKey newNameIdxKey() {
		CFIntTopDomainByNameIdxKey key =
			new CFIntTopDomainByNameIdxKey();
		return( key );
	}

	public CFIntTopDomainBuff newBuff() {
		CFIntTopDomainBuff buff =
			new CFIntTopDomainBuff();
		return( buff );
	}

	public CFIntTopDomainHBuff newHBuff() {
		CFIntTopDomainHBuff hbuff =
			new CFIntTopDomainHBuff();
		return( hbuff );
	}
}
