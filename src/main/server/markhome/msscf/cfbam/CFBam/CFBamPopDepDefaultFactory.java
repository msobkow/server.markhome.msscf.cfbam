
// Description: Java 11 Default Factory implementation for PopDep.

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
	 *	CFBamPopDepFactory implementation for PopDep
	 */
public class CFBamPopDepDefaultFactory
	implements ICFBamPopDepFactory
{
	public CFBamPopDepDefaultFactory() {
	}

	public CFBamPopDepByRelationIdxKey newRelationIdxKey() {
		CFBamPopDepByRelationIdxKey key =
			new CFBamPopDepByRelationIdxKey();
		return( key );
	}

	public CFBamPopDepByDefSchemaIdxKey newDefSchemaIdxKey() {
		CFBamPopDepByDefSchemaIdxKey key =
			new CFBamPopDepByDefSchemaIdxKey();
		return( key );
	}

	public CFBamPopDepBuff newBuff() {
		CFBamPopDepBuff buff =
			new CFBamPopDepBuff();
		return( buff );
	}

	public CFBamPopDepHBuff newHBuff() {
		CFBamPopDepHBuff hbuff =
			new CFBamPopDepHBuff();
		return( hbuff );
	}
}
