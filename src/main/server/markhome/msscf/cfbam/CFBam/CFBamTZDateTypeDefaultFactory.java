
// Description: Java 11 Default Factory implementation for TZDateType.

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
	 *	CFBamTZDateTypeFactory implementation for TZDateType
	 */
public class CFBamTZDateTypeDefaultFactory
	implements ICFBamTZDateTypeFactory
{
	public CFBamTZDateTypeDefaultFactory() {
	}

	public CFBamTZDateTypeBySchemaIdxKey newSchemaIdxKey() {
		CFBamTZDateTypeBySchemaIdxKey key =
			new CFBamTZDateTypeBySchemaIdxKey();
		return( key );
	}

	public CFBamTZDateTypeBuff newBuff() {
		CFBamTZDateTypeBuff buff =
			new CFBamTZDateTypeBuff();
		return( buff );
	}

	public CFBamTZDateTypeHBuff newHBuff() {
		CFBamTZDateTypeHBuff hbuff =
			new CFBamTZDateTypeHBuff();
		return( hbuff );
	}
}
