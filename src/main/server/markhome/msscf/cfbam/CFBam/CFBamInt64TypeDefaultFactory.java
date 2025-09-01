
// Description: Java 11 Default Factory implementation for Int64Type.

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
	 *	CFBamInt64TypeFactory implementation for Int64Type
	 */
public class CFBamInt64TypeDefaultFactory
	implements ICFBamInt64TypeFactory
{
	public CFBamInt64TypeDefaultFactory() {
	}

	public CFBamInt64TypeBySchemaIdxKey newSchemaIdxKey() {
		CFBamInt64TypeBySchemaIdxKey key =
			new CFBamInt64TypeBySchemaIdxKey();
		return( key );
	}

	public CFBamInt64TypeBuff newBuff() {
		CFBamInt64TypeBuff buff =
			new CFBamInt64TypeBuff();
		return( buff );
	}

	public CFBamInt64TypeHBuff newHBuff() {
		CFBamInt64TypeHBuff hbuff =
			new CFBamInt64TypeHBuff();
		return( hbuff );
	}
}
