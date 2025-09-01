
// Description: Java 11 Default Factory implementation for DoubleType.

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
	 *	CFBamDoubleTypeFactory implementation for DoubleType
	 */
public class CFBamDoubleTypeDefaultFactory
	implements ICFBamDoubleTypeFactory
{
	public CFBamDoubleTypeDefaultFactory() {
	}

	public CFBamDoubleTypeBySchemaIdxKey newSchemaIdxKey() {
		CFBamDoubleTypeBySchemaIdxKey key =
			new CFBamDoubleTypeBySchemaIdxKey();
		return( key );
	}

	public CFBamDoubleTypeBuff newBuff() {
		CFBamDoubleTypeBuff buff =
			new CFBamDoubleTypeBuff();
		return( buff );
	}

	public CFBamDoubleTypeHBuff newHBuff() {
		CFBamDoubleTypeHBuff hbuff =
			new CFBamDoubleTypeHBuff();
		return( hbuff );
	}
}
