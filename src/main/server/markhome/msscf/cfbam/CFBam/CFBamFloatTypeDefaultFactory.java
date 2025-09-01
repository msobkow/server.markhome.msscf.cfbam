
// Description: Java 11 Default Factory implementation for FloatType.

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
	 *	CFBamFloatTypeFactory implementation for FloatType
	 */
public class CFBamFloatTypeDefaultFactory
	implements ICFBamFloatTypeFactory
{
	public CFBamFloatTypeDefaultFactory() {
	}

	public CFBamFloatTypeBySchemaIdxKey newSchemaIdxKey() {
		CFBamFloatTypeBySchemaIdxKey key =
			new CFBamFloatTypeBySchemaIdxKey();
		return( key );
	}

	public CFBamFloatTypeBuff newBuff() {
		CFBamFloatTypeBuff buff =
			new CFBamFloatTypeBuff();
		return( buff );
	}

	public CFBamFloatTypeHBuff newHBuff() {
		CFBamFloatTypeHBuff hbuff =
			new CFBamFloatTypeHBuff();
		return( hbuff );
	}
}
