
// Description: Java 11 Default Factory implementation for Chain.

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
	 *	CFBamChainFactory implementation for Chain
	 */
public class CFBamChainDefaultFactory
	implements ICFBamChainFactory
{
	public CFBamChainDefaultFactory() {
	}

	public CFBamChainPKey newPKey() {
		CFBamChainPKey pkey =
			new CFBamChainPKey();
		return( pkey );
	}

	public CFBamChainHPKey newHPKey() {
		CFBamChainHPKey hpkey =
			new CFBamChainHPKey();
		return( hpkey );
	}

	public CFBamChainByTenantIdxKey newTenantIdxKey() {
		CFBamChainByTenantIdxKey key =
			new CFBamChainByTenantIdxKey();
		return( key );
	}

	public CFBamChainByChainTableIdxKey newChainTableIdxKey() {
		CFBamChainByChainTableIdxKey key =
			new CFBamChainByChainTableIdxKey();
		return( key );
	}

	public CFBamChainByDefSchemaIdxKey newDefSchemaIdxKey() {
		CFBamChainByDefSchemaIdxKey key =
			new CFBamChainByDefSchemaIdxKey();
		return( key );
	}

	public CFBamChainByUNameIdxKey newUNameIdxKey() {
		CFBamChainByUNameIdxKey key =
			new CFBamChainByUNameIdxKey();
		return( key );
	}

	public CFBamChainByPrevRelIdxKey newPrevRelIdxKey() {
		CFBamChainByPrevRelIdxKey key =
			new CFBamChainByPrevRelIdxKey();
		return( key );
	}

	public CFBamChainByNextRelIdxKey newNextRelIdxKey() {
		CFBamChainByNextRelIdxKey key =
			new CFBamChainByNextRelIdxKey();
		return( key );
	}

	public CFBamChainBuff newBuff() {
		CFBamChainBuff buff =
			new CFBamChainBuff();
		return( buff );
	}

	public CFBamChainHBuff newHBuff() {
		CFBamChainHBuff hbuff =
			new CFBamChainHBuff();
		return( hbuff );
	}
}
