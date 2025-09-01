
// Description: Java 11 Default Factory implementation for DateType.

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
	 *	CFBamDateTypeFactory implementation for DateType
	 */
public class CFBamDateTypeDefaultFactory
	implements ICFBamDateTypeFactory
{
	public CFBamDateTypeDefaultFactory() {
	}

	public CFBamDateTypeBySchemaIdxKey newSchemaIdxKey() {
		CFBamDateTypeBySchemaIdxKey key =
			new CFBamDateTypeBySchemaIdxKey();
		return( key );
	}

	public CFBamDateTypeBuff newBuff() {
		CFBamDateTypeBuff buff =
			new CFBamDateTypeBuff();
		return( buff );
	}

	public CFBamDateTypeHBuff newHBuff() {
		CFBamDateTypeHBuff hbuff =
			new CFBamDateTypeHBuff();
		return( hbuff );
	}
}
