
// Description: Java 11 Default Factory implementation for Int16Type.

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
	 *	CFBamInt16TypeFactory implementation for Int16Type
	 */
public class CFBamInt16TypeDefaultFactory
	implements ICFBamInt16TypeFactory
{
	public CFBamInt16TypeDefaultFactory() {
	}

	public CFBamInt16TypeBySchemaIdxKey newSchemaIdxKey() {
		CFBamInt16TypeBySchemaIdxKey key =
			new CFBamInt16TypeBySchemaIdxKey();
		return( key );
	}

	public CFBamInt16TypeBuff newBuff() {
		CFBamInt16TypeBuff buff =
			new CFBamInt16TypeBuff();
		return( buff );
	}

	public CFBamInt16TypeHBuff newHBuff() {
		CFBamInt16TypeHBuff hbuff =
			new CFBamInt16TypeHBuff();
		return( hbuff );
	}
}
