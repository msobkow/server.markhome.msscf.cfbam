
// Description: Java 11 Default Factory implementation for UInt32Type.

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
	 *	CFBamUInt32TypeFactory implementation for UInt32Type
	 */
public class CFBamUInt32TypeDefaultFactory
	implements ICFBamUInt32TypeFactory
{
	public CFBamUInt32TypeDefaultFactory() {
	}

	public CFBamUInt32TypeBySchemaIdxKey newSchemaIdxKey() {
		CFBamUInt32TypeBySchemaIdxKey key =
			new CFBamUInt32TypeBySchemaIdxKey();
		return( key );
	}

	public CFBamUInt32TypeBuff newBuff() {
		CFBamUInt32TypeBuff buff =
			new CFBamUInt32TypeBuff();
		return( buff );
	}

	public CFBamUInt32TypeHBuff newHBuff() {
		CFBamUInt32TypeHBuff hbuff =
			new CFBamUInt32TypeHBuff();
		return( hbuff );
	}
}
