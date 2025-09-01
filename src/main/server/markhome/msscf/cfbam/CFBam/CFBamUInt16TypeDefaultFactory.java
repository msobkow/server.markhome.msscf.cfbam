
// Description: Java 11 Default Factory implementation for UInt16Type.

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
	 *	CFBamUInt16TypeFactory implementation for UInt16Type
	 */
public class CFBamUInt16TypeDefaultFactory
	implements ICFBamUInt16TypeFactory
{
	public CFBamUInt16TypeDefaultFactory() {
	}

	public CFBamUInt16TypeBySchemaIdxKey newSchemaIdxKey() {
		CFBamUInt16TypeBySchemaIdxKey key =
			new CFBamUInt16TypeBySchemaIdxKey();
		return( key );
	}

	public CFBamUInt16TypeBuff newBuff() {
		CFBamUInt16TypeBuff buff =
			new CFBamUInt16TypeBuff();
		return( buff );
	}

	public CFBamUInt16TypeHBuff newHBuff() {
		CFBamUInt16TypeHBuff hbuff =
			new CFBamUInt16TypeHBuff();
		return( hbuff );
	}
}
