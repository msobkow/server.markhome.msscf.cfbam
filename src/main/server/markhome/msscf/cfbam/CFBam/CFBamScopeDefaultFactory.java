
// Description: Java 11 Default Factory implementation for Scope.

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
	 *	CFBamScopeFactory implementation for Scope
	 */
public class CFBamScopeDefaultFactory
	implements ICFBamScopeFactory
{
	public CFBamScopeDefaultFactory() {
	}

	public CFBamScopePKey newPKey() {
		CFBamScopePKey pkey =
			new CFBamScopePKey();
		return( pkey );
	}

	public CFBamScopeHPKey newHPKey() {
		CFBamScopeHPKey hpkey =
			new CFBamScopeHPKey();
		return( hpkey );
	}

	public CFBamScopeByTenantIdxKey newTenantIdxKey() {
		CFBamScopeByTenantIdxKey key =
			new CFBamScopeByTenantIdxKey();
		return( key );
	}

	public CFBamScopeBuff newBuff() {
		CFBamScopeBuff buff =
			new CFBamScopeBuff();
		return( buff );
	}

	public CFBamScopeHBuff newHBuff() {
		CFBamScopeHBuff hbuff =
			new CFBamScopeHBuff();
		return( hbuff );
	}
}
