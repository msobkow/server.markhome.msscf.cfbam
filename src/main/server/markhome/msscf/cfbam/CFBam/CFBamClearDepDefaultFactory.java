
// Description: Java 11 Default Factory implementation for ClearDep.

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
	 *	CFBamClearDepFactory implementation for ClearDep
	 */
public class CFBamClearDepDefaultFactory
	implements ICFBamClearDepFactory
{
	public CFBamClearDepDefaultFactory() {
	}

	public CFBamClearDepByClearDepIdxKey newClearDepIdxKey() {
		CFBamClearDepByClearDepIdxKey key =
			new CFBamClearDepByClearDepIdxKey();
		return( key );
	}

	public CFBamClearDepByDefSchemaIdxKey newDefSchemaIdxKey() {
		CFBamClearDepByDefSchemaIdxKey key =
			new CFBamClearDepByDefSchemaIdxKey();
		return( key );
	}

	public CFBamClearDepBuff newBuff() {
		CFBamClearDepBuff buff =
			new CFBamClearDepBuff();
		return( buff );
	}

	public CFBamClearDepHBuff newHBuff() {
		CFBamClearDepHBuff hbuff =
			new CFBamClearDepHBuff();
		return( hbuff );
	}
}
