
// Description: Java 11 Default Factory implementation for StringType.

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
	 *	CFBamStringTypeFactory implementation for StringType
	 */
public class CFBamStringTypeDefaultFactory
	implements ICFBamStringTypeFactory
{
	public CFBamStringTypeDefaultFactory() {
	}

	public CFBamStringTypeBySchemaIdxKey newSchemaIdxKey() {
		CFBamStringTypeBySchemaIdxKey key =
			new CFBamStringTypeBySchemaIdxKey();
		return( key );
	}

	public CFBamStringTypeBuff newBuff() {
		CFBamStringTypeBuff buff =
			new CFBamStringTypeBuff();
		return( buff );
	}

	public CFBamStringTypeHBuff newHBuff() {
		CFBamStringTypeHBuff hbuff =
			new CFBamStringTypeHBuff();
		return( hbuff );
	}
}
