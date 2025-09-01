
// Description: Java 11 Default Factory implementation for DelDep.

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
	 *	CFBamDelDepFactory implementation for DelDep
	 */
public class CFBamDelDepDefaultFactory
	implements ICFBamDelDepFactory
{
	public CFBamDelDepDefaultFactory() {
	}

	public CFBamDelDepByDefSchemaIdxKey newDefSchemaIdxKey() {
		CFBamDelDepByDefSchemaIdxKey key =
			new CFBamDelDepByDefSchemaIdxKey();
		return( key );
	}

	public CFBamDelDepByDelDepIdxKey newDelDepIdxKey() {
		CFBamDelDepByDelDepIdxKey key =
			new CFBamDelDepByDelDepIdxKey();
		return( key );
	}

	public CFBamDelDepBuff newBuff() {
		CFBamDelDepBuff buff =
			new CFBamDelDepBuff();
		return( buff );
	}

	public CFBamDelDepHBuff newHBuff() {
		CFBamDelDepHBuff hbuff =
			new CFBamDelDepHBuff();
		return( hbuff );
	}
}
