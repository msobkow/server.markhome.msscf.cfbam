
// Description: Java 11 Default Factory implementation for Int32Type.

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
	 *	CFBamInt32TypeFactory implementation for Int32Type
	 */
public class CFBamInt32TypeDefaultFactory
	implements ICFBamInt32TypeFactory
{
	public CFBamInt32TypeDefaultFactory() {
	}

	public CFBamInt32TypeBySchemaIdxKey newSchemaIdxKey() {
		CFBamInt32TypeBySchemaIdxKey key =
			new CFBamInt32TypeBySchemaIdxKey();
		return( key );
	}

	public CFBamInt32TypeBuff newBuff() {
		CFBamInt32TypeBuff buff =
			new CFBamInt32TypeBuff();
		return( buff );
	}

	public CFBamInt32TypeHBuff newHBuff() {
		CFBamInt32TypeHBuff hbuff =
			new CFBamInt32TypeHBuff();
		return( hbuff );
	}
}
