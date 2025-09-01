
// Description: Java 11 Default Factory implementation for UInt64Type.

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
	 *	CFBamUInt64TypeFactory implementation for UInt64Type
	 */
public class CFBamUInt64TypeDefaultFactory
	implements ICFBamUInt64TypeFactory
{
	public CFBamUInt64TypeDefaultFactory() {
	}

	public CFBamUInt64TypeBySchemaIdxKey newSchemaIdxKey() {
		CFBamUInt64TypeBySchemaIdxKey key =
			new CFBamUInt64TypeBySchemaIdxKey();
		return( key );
	}

	public CFBamUInt64TypeBuff newBuff() {
		CFBamUInt64TypeBuff buff =
			new CFBamUInt64TypeBuff();
		return( buff );
	}

	public CFBamUInt64TypeHBuff newHBuff() {
		CFBamUInt64TypeHBuff hbuff =
			new CFBamUInt64TypeHBuff();
		return( hbuff );
	}
}
