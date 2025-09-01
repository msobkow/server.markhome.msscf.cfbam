
// Description: Java 11 Default Factory implementation for Tld.

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
	 *	CFBamTldFactory implementation for Tld
	 */
public class CFBamTldDefaultFactory
	extends CFIntTldDefaultFactory
	implements ICFBamTldFactory
{
	public CFBamTldDefaultFactory() {
		super();
	}

	public CFIntTldPKey newPKey() {
		CFIntTldPKey pkey =
			new CFIntTldPKey();
		return( pkey );
	}

	public CFIntTldHPKey newHPKey() {
		CFIntTldHPKey hpkey =
			new CFIntTldHPKey();
		return( hpkey );
	}

	public CFIntTldByTenantIdxKey newTenantIdxKey() {
		CFIntTldByTenantIdxKey key =
			new CFIntTldByTenantIdxKey();
		return( key );
	}

	public CFIntTldByNameIdxKey newNameIdxKey() {
		CFIntTldByNameIdxKey key =
			new CFIntTldByNameIdxKey();
		return( key );
	}

	public CFIntTldBuff newBuff() {
		CFIntTldBuff buff =
			new CFIntTldBuff();
		return( buff );
	}

	public CFIntTldHBuff newHBuff() {
		CFIntTldHBuff hbuff =
			new CFIntTldHBuff();
		return( hbuff );
	}
}
